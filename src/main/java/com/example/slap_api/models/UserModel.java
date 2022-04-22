package com.example.slap_api.models;

import com.example.slap_api.entities.UserEntity;

/**
 * Модель юзера, возвращаемая клиенту
 */
public class UserModel {

    private Long user_id;
    private String email;
    private String name;
    private String hash_pass;

    public static UserModel toModel(UserEntity entity) {
        UserModel model = new UserModel();
        model.setUser_id(entity.getUser_id());
        model.setEmail(entity.getEmail());
        model.setName(entity.getName());
        model.setHash_pass(entity.getHashPass());
        return model;
    }

    public UserModel(){}

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
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

    public String getHash_pass() {
        return hash_pass;
    }

    public void setHash_pass(String hash_pass) {
        this.hash_pass = hash_pass;
    }
}
