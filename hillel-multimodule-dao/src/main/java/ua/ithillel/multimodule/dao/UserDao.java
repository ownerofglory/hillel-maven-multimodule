package ua.ithillel.multimodule.dao;

import ua.ithillel.multimodule.model.User;

public interface UserDao {
    User findById(Long id);
}
