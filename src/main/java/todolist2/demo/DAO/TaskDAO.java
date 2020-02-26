package todolist2.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import todolist2.demo.model.Task;

public interface TaskDAO extends JpaRepository<Task, Integer> {

    Task findTaskByTaskID(int TaskID);
}
