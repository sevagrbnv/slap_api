package com.example.slap_api.controllers;

import com.example.slap_api.entities.BoardEntity;
import com.example.slap_api.exceptions.BoardException;
import com.example.slap_api.services.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для работы с досками
 */
@RestController
@RequestMapping("/boards")
public class BoardController {

    @Autowired
    private BoardService boardService;

    /**
     * Метод для создания доски
     * Способ создания:
     * http://{ip-address}:8080/boards
     *      body:
     *          {
     *          "name" : "name",
     *          "color" : "#123456",
     *          "isgroup" : 0
     *          }
     */
    @PostMapping
    public ResponseEntity createBoard(@RequestBody BoardEntity board) {
        try {
            Long board_id = boardService.createBoard(board).getBoardid();
            return ResponseEntity.ok(board_id);
        } catch (BoardException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    /**
     * Метод для получения доски по id
     *      Способ создания:
     *      http://{ip-address}:8080/board?id={id}
     */
    @GetMapping(params = "id")
    public ResponseEntity getBoard(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(boardService.getBoard(id));
        } catch (BoardException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    /**
     * @deprecated используется только в тестовых целях и в конечном продукте использоваться не будет
     * Метод для получения доски по имени
     *      Способ создания:
     *      http://{ip-address}:8080/board?name={name}
     */
    @GetMapping(params = "name")
    public ResponseEntity getAllBoards(@RequestParam String name) {
        try {
            return ResponseEntity.ok(boardService.getAllBoards(name));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    /**
     * Метод для удаления доски
     * Способ создания:
     *      http://{ip-address}:8080/board/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteBoard(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(boardService.delete(id));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
