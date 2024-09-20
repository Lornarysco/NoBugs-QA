package Tasks;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> TaskList= new ArrayList<>();

    public void addTaskManager(Task newTask){
        this.TaskList.add(newTask);
    }

    public void removeTask(Task newTask){
        this.TaskList.remove(newTask);
        }

        public void sortTasks(){
            this.TaskList.sort(Task::compareTo);
        }

    }


