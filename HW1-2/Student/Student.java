package Student;

public class Student {

    private String name;
    private String id;

    public Student() {
        this.id = "unknown";
        this.name = "unknown";
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("StudentId:" + getId() + " " + getName());
    }


}