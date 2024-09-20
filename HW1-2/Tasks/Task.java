package Tasks;

public class Task implements Comparable<Task> {
    private String Name;
    private int priority;

    public Task(String description, int priority) {
        this.Name = description;
        this.priority = priority;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task newTask){
        return Integer.compare(this.priority, newTask.priority);
    }
}
