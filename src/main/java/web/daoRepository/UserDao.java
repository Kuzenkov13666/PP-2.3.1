package web.daoRepository;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUser(Long id);
    public void saveUser(User user);
    public void update(Long id, User user);
    public void delete(Long id);
}
