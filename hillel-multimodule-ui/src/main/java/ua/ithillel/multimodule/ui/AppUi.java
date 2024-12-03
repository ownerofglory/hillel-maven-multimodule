package ua.ithillel.multimodule.ui;

import ua.ithillel.multimodule.dao.UserDao;

public class AppUi {
    private UserDao userDao;

    public AppUi(UserDao userDao) {
        this.userDao = userDao;
    }
}
