package com.example.slap_api.controllers;

import com.example.slap_api.entities.UserBoardEntity;
import com.example.slap_api.exceptions.BoardException;
import com.example.slap_api.exceptions.UserAlreadyExistException;
import com.example.slap_api.exceptions.UserBoardException;
import com.example.slap_api.services.UserBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Контроллер для работы со связью между доской и юзером
 */
@RestController
@RequestMapping("/conn")
public class UserBoardController {

    @Autowired
    UserBoardService userBoardService;

    /**
     * Метод для создания связи
     * Способ создания:
     * http://{ip-address}:8080/conn
     *      {
     *           "userid" : 1,
     *           "boardid" : 2,
     *           "role" : "master"
     *      }
     */
    @PostMapping
    public ResponseEntity createConnection(@RequestBody UserBoardEntity userBoardEntity){
        try {
            userBoardService.connectUserBoard(userBoardEntity);
            return ResponseEntity.ok("Успешно");
        } catch (UserBoardException e) {
            return ResponseEntity.badRequest().body("FFFFFFFFFF");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
/*
    @DeleteMapping
    public ResponseEntity deleteConnect(@RequestParam(required = true) Long userid,
                                        @RequestParam(required = true) Long boardid) {
        try {
            return ResponseEntity.ok(userBoardService.delete(userid, boardid));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }*/
}
