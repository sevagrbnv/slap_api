package com.example.slap_api.controllers;

import com.example.slap_api.entities.UserEntity;
import com.example.slap_api.exceptions.UserAlreadyExistException;
import com.example.slap_api.exceptions.UserNotFoundException;
import com.example.slap_api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Контроллер для работы с юзером
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Создание пользователя
     * Способ создания:
     * http://{ip-address}:8080/users
     * {
     * "email" : "testmail1gmail.com",
     * "name" : "user1",
     * "hashPass" : "d64a"
     * }
     */
    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userService.registration(user);
            return ResponseEntity.ok("Пользователь сохранен");
        } catch (UserAlreadyExistException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    /**
     * Получение юзера
     * Способ получения:
     * http://{ip-address}:8080/users?email={e-mail}
     */
    @GetMapping
    public ResponseEntity getUser(@RequestParam String email) {
        try {
            return ResponseEntity.ok(userService.getUser(email));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    /**
     * Удаление юзера
     * Способ удаления:
     * http://{ip-address}:8080/users/{e-mail}
     */
    @DeleteMapping("/{email}")
    public ResponseEntity deleteUser(@PathVariable String email) {
        try {
            return ResponseEntity.ok(userService.delete(email));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }
}
