package todolist2.demo.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import todolist2.demo.model.User;

public interface UserDAO extends JpaRepository<User, Integer> {
    User getUserByEmail(String email);
    User getUserByUserID(int userID);
}
