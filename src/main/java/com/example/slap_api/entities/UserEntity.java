package com.example.slap_api.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Класс представляет собой сущность, связанную с БД
 */
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;
    private String email;
    private String name;
    private String hashpass;

    @OneToMany(mappedBy = "userid")
    private List<UserBoardEntity> userBoards;

    public UserEntity(){
    }

    public Long getUser_id() {
        return userid;
    }

    public void setUser_id(Long user_id) {
        this.userid = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashPass() {
        return hashpass;
    }

    public void setHashPass(String hashPass) {
        this.hashpass = hashPass;
    }
}
