package com.example.slap_api.models;

import com.example.slap_api.entities.BoardEntity;

/**
 * Модель доски, возвращаемая клиенту
 */
public class BoardModel {
    private Long board_id;
    private String name;
    private String color;
    private boolean is_group;

    /**
     * Конструктор со всеми полями
     */
    public static BoardModel toModel(BoardEntity entity) {
        BoardModel model = new BoardModel();
        model.setBoard_id(entity.getBoardid());
        model.setName(entity.getName());
        model.setColor(entity.getColor());
        model.setIs_group(entity.isIsgroup());
        return model;
    }

    /**
     * Пустой конструктор
     */
    public BoardModel() {}

    public Long getBoard_id() {
        return board_id;
    }

    public void setBoard_id(Long board_id) {
        this.board_id = board_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIs_group() {
        return is_group;
    }

    public void setIs_group(boolean is_group) {
        this.is_group = is_group;
    }
}
