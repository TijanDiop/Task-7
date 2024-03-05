package application_crud.dao;

import application_crud.model.User;

import java.util.List;

public interface UserDao {

    public List<User> getAllUsers();

    public void saveOrUpdate(User user);

    public User getUserById(Long id);

    void deleteUserById(Long id);

}
