package todolist2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolist2.demo.DAO.UserDAO;
import todolist2.demo.model.User;

@Service
public class LoginService {

    @Autowired
    UserDAO userDAO;

    public User getUserByEmail(String email){
        return userDAO.getUserByEmail(email);
    }

    public boolean validatePassword(String passwordField, User user){
        return passwordField.equals(user.getPassword());
    }
}
