package com.example.slap_api.repositories;

import com.example.slap_api.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Репозиторий для работы с БД, отвечающий за сущность user
 */
public interface UserRepo extends CrudRepository<UserEntity, Long> {

    /**
     * Поиск пользователя по e-mail'у
     * @param email - электронная почта пользователя, которую он привязал  к аккаунту
     * @return запись, связанную с указанной почтой
     */
    UserEntity findByEmail(String email);

    /**
     * Удаление пользователя по почте
     * @param email
     * @return id юзера
     */
    Long deleteByEmail(String email);
}
