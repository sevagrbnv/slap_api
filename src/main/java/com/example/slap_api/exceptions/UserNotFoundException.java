package com.example.slap_api.exceptions;

/**
 * Ошибка нахождения пользователя
 */

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
