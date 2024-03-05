package application_crud.service;

import application_crud.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void saveOrUpdate(User user);
    public User getUserById(Long id);
    void deleteUserById(Long id);
}
