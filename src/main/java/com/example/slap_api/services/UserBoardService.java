package com.example.slap_api.services;

import com.example.slap_api.entities.UserBoardEntity;
import com.example.slap_api.exceptions.UserBoardException;
import com.example.slap_api.repositories.BoardRepo;
import com.example.slap_api.repositories.UserBoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Логика работы со связью юзеро и досок
 */
@Service
@Transactional
public class UserBoardService {

    @Autowired
    private UserBoardRepo userBoardRepo;

    /**
     * Связыванеи доски и юзера
     */
    public UserBoardEntity connectUserBoard (UserBoardEntity userBoardEntity) throws UserBoardException {
        return userBoardRepo.save(userBoardEntity);
    }

    /**
     * Удаление связи по id юзера и id доски
     */
    public Long delete(Long user_id, Long board_id) {
        userBoardRepo.deleteByBoardidAndUserid(user_id, board_id);
        return board_id;
    }
}
