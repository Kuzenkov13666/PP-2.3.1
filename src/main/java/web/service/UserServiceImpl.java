package web.service;

import org.springframework.stereotype.Service;
import web.daoRepository.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void update(Long id, User user) {
        userDao.update(id, user);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
