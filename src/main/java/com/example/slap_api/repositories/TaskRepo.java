package com.example.slap_api.repositories;

import com.example.slap_api.entities.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Репозиторий для работы с БД, отвечающий за сущность task
 */
//@Repository
public interface TaskRepo extends CrudRepository<TaskEntity, Long>{
    @Query(value = "select * from task join `column` using (column_id)" +
            "\tinner join board using (board_id)" +
            "\tinner join user_board using (board_id)\n" +
            "\twhere user_board.email = 'a';", nativeQuery = true)
    List<TaskEntity> findByNameEndsWith(String chars);
}
