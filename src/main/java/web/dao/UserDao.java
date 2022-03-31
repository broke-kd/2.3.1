package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();

    public User showUser(int id);

    public void save(User user);

    public void updateUser(User user);

    public void deleteUser(int id);

}
