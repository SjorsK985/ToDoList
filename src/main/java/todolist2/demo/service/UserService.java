package todolist2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolist2.demo.DAO.UserDAO;
import todolist2.demo.model.User;

@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public void saveUser(User user){
        userDAO.save(user);
    }

}
