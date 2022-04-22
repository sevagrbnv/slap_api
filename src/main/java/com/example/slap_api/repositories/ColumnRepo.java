package com.example.slap_api.repositories;

import com.example.slap_api.entities.BoardEntity;
import com.example.slap_api.entities.ColumnEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Репозиторий для работы с БД, отвечающий за сущность column
 */

public interface ColumnRepo extends CrudRepository<ColumnEntity, Long> {
    /**
     * Поиск колонки по id
     * @param board_id
     * @return запись с информацией по колонке
     */
    ColumnEntity findByColumnid(Long board_id);

    /**
     * Поиск всех колонок, связанных с доской
     * @param boardid - id доски, к которой относится колонка
     * @return все колонки, связанные с доской
     */
    List<ColumnEntity> findAllByBoardid(Long boardid);

    /**
     * Удаление колонки по id
     * @param board_id
     * @return id удаленной колонки
     */
    Long deleteByColumnid(Long board_id);
}
