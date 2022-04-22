package com.example.slap_api.services;

import com.example.slap_api.entities.UserEntity;
import com.example.slap_api.exceptions.UserAlreadyExistException;
import com.example.slap_api.exceptions.UserNotFoundException;
import com.example.slap_api.models.UserModel;
import com.example.slap_api.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Логика работы с юзером
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    /**
     * Создание пользователя
     * @param user
     */
    public UserEntity registration(UserEntity user) throws UserAlreadyExistException {
        if (userRepo.findByEmail(user.getEmail()) != null){
            throw new UserAlreadyExistException("Пользователь с этим e-mail-ом уже существует");
        }
        return userRepo.save(user);
    }

    /**
     * Получение пользавателя
     * @param email
     * @return юзера
     */
    public UserModel getUser(String email) throws UserNotFoundException {
        UserEntity user = userRepo.findByEmail(email);
        if (user == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return UserModel.toModel(user);
    }

    /**
     * Удаление пользавателя
     * @param email
     * @return почту юзера
     */
    public String delete(String email) {
        userRepo.deleteByEmail(email);
        return email;
    }
}
