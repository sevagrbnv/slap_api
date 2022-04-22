package com.example.slap_api.exceptions;

/**
 * Ошибка, связанная доской
 */

public class BoardException extends Exception{
    public BoardException(String message){
        super(message);
    }
}
