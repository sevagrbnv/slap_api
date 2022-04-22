package com.example.slap_api.exceptions;

/**
 * Ошибка, вызываемая в случае попытки повторной привязки почты к новому аккаунту
 */

public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException(String message){
        super(message);
    }
}
