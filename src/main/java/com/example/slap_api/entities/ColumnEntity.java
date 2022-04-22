package com.example.slap_api.entities;

import javax.persistence.*;
import java.util.List;


/**
 * Класс представляет собой сущность, связанную с БД
 */
@Entity
@Table(name = "column")
public class ColumnEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long columnid;
    private String name;

    @ManyToOne (targetEntity = BoardEntity.class)
    @JoinColumn(name = "boardid")
    private Long boardid;

    @OneToMany(mappedBy = "columnid")
    private List<TaskEntity> tasks;

    public Long getColumnid() {
        return columnid;
    }

    public void setColumnid(Long columnid) {
        this.columnid = columnid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBoardid() {
        return boardid;
    }

    public void setBoardid(Long boardid) {
        this.boardid = boardid;
    }
}
