package com.example.slap_api.exceptions;

/**
 * Ошибка привязки/отвязки доски с пользователями
 */

public class UserBoardException extends Exception{
    public UserBoardException(String message){
        super(message);
    }
}
