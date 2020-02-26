package todolist2.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolist2.demo.DAO.TaskDAO;
import todolist2.demo.model.Task;

@Service
public class TaskService {
    @Autowired
    TaskDAO taskDAO;

    public Task findTaskByTaskID(int id){
        return taskDAO.findTaskByTaskID(id);
    }
}
