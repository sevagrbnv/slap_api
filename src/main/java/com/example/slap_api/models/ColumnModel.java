package com.example.slap_api.models;

import com.example.slap_api.entities.TaskEntity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Модель колонки, возвращаемая клиенту
 */
public class ColumnModel {
    private Long column_id;
    private String name;
    private Long board_id;

    List<TaskModel> tasks;
}
