package com.example.slap_api.entities;
import javax.persistence.*;
import java.util.List;

/**
 * Класс представляет собой сущность, связанную с БД
 */
@Entity
@Table(name = "board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="boardid")
    private Long boardid;
    private String name;
    private String color;
    private boolean isgroup;

    @OneToMany(mappedBy = "boardid")
    private List<UserBoardEntity> userBoards;

    @OneToMany(mappedBy = "boardid")
    private List<ColumnEntity> columns;

    public BoardEntity(){
    }

    public Long getBoardid() {
        return boardid;
    }

    public void setBoardid(Long boardid) {
        this.boardid = boardid;
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

    public boolean isIsgroup() {
        return isgroup;
    }

    public void setIsgroup(boolean isgroup) {
        this.isgroup = isgroup;
    }

}
