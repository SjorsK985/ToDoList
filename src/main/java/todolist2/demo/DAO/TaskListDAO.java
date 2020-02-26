package todolist2.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import todolist2.demo.model.TaskList;

public interface TaskListDAO extends JpaRepository<TaskList, Integer> {
    TaskList findTaskListByTaskListID(int taskListID);
}
