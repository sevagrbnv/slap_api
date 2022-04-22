package com.example.slap_api.repositories;

import com.example.slap_api.entities.BoardEntity;
import com.example.slap_api.entities.UserBoardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Репозиторий для работы с БД, отвечающий за сущность userBoard
 */

public interface UserBoardRepo extends CrudRepository<UserBoardEntity, Long> {

    /**
     * Поиск записи по id
     * @param user_board_id
     * @return запись, связанную с требуемой связью
     */
    UserBoardEntity findByUserboardid(Long user_board_id);

    /**
     * Удаление связи между пользователем и доской по их id
     * @param user_id
     * @param board_id
     * @return id удаленной связи
     */
    Long deleteByBoardidAndUserid(Long user_id, Long board_id);
}
