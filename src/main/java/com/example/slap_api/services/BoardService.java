package com.example.slap_api.services;

import com.example.slap_api.entities.BoardEntity;
import com.example.slap_api.exceptions.BoardException;
import com.example.slap_api.models.BoardModel;
import com.example.slap_api.repositories.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Логика работы с досками
 */
@Service
@Transactional
public class BoardService {

    @Autowired
    private BoardRepo boardRepo;

    /**
     * Создание доски
     * @param board
     */
    public BoardEntity createBoard(BoardEntity board) throws BoardException {
        return boardRepo.save(board);
    }

    /**
     * Получение доски
     * @param id
     * @return доску
     */
    public BoardModel getBoard(Long id) throws BoardException {
        BoardEntity board = boardRepo.findByBoardid(id);
        if (board == null) {
            throw new BoardException("Доска не найдена");
        }
        return BoardModel.toModel(board);
    }

    /**
     * Удаление доски
     * @param id
     * @return id
     */
    public Long delete(Long id) {
        boardRepo.deleteByBoardid(id);
        return id;
    }

    /**
     * @deprecated используется только в тестовых целях и в конечном продукте использоваться не будет
     * Поиск доски по имени
     * @param name - название доски
     * @return все доски с указанными именем
     */
    public List<BoardEntity> getAllBoards(String name){
        List<BoardEntity> boards = boardRepo.findAllByName(name);
        return boards;
    }
}
