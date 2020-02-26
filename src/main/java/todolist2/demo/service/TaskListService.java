package todolist2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolist2.demo.DAO.TaskListDAO;
import todolist2.demo.model.TaskList;

@Service
public class TaskListService {

    @Autowired
    TaskListDAO taskListDAO;

    public TaskList findTaskListByTaskListID(int taskID){
        return taskListDAO.findTaskListByTaskListID(taskID);
    }
}
