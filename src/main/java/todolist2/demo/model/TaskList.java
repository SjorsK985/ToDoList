package todolist2.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TaskList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int taskListID;
    String name;
    @OneToMany
    List<Task> taskList;

    public TaskList(){
        super();
    }

    public TaskList(String name){
        this.name = name;
        this.taskList = new ArrayList<>();
    }

    public int getTaskListID() {
        return taskListID;
    }

    public void setTaskListID(int taskListID) {
        this.taskListID = taskListID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
