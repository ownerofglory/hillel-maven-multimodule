package ua.ithillel.multimodule.dao;

import ua.ithillel.multimodule.model.User;

import java.util.List;

public class UserInMemoryDao implements UserDao {
    private List<User> users;

    public UserInMemoryDao(List<User> users) {
        this.users = users;
    }

    @Override
    public User findById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
