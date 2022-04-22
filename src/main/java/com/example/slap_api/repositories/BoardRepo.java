package com.example.slap_api.repositories;

import com.example.slap_api.entities.BoardEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Репозиторий для работы с БД, отвечающий за сущность board
 */

public interface BoardRepo extends CrudRepository<BoardEntity, Long> {

    /**
     * Поиск доски по id
     * @param board_id - id доски
     * @return запись с данными по доске
     */
    BoardEntity findByBoardid(Long board_id);

    /**
     * @deprecated используется только в тестовых целях и в конечном продукте использоваться не будет
     * Поиск доски по имени
     * @param name - название доски
     * @return все доски с указанными именем
     */
    List<BoardEntity> findAllByName(String name);

    /**
     * Удаление доски
     * @param board_id - id доски
     * @return id удаленной доски
     */
    Long deleteByBoardid(Long board_id);
}
