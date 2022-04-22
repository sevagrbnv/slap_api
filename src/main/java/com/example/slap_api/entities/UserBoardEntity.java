package com.example.slap_api.entities;

import javax.persistence.*;

/**
 * Класс представляет собой сущность, связанную с БД
 */
@Entity
@Table(name = "userboard")
public class UserBoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userboardid;
    private String role;

    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "userid")
    private Long userid;

    @ManyToOne(targetEntity = BoardEntity.class)
    @JoinColumn(name = "boardid")
    private Long boardid;

    public UserBoardEntity(){
    }

    public Long getUserboardid() {
        return userboardid;
    }

    public void setUserboardid(Long user_board_id) {
        this.userboardid = userboardid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getBoardid() {
        return boardid;
    }

    public void setBoardid(Long boardid) {
        this.boardid = boardid;
    }
}
