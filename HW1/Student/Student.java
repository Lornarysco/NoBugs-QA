package Student;

public class Student implements Printable{
    private String Name;
    private int Gradebook;
    private int avgScore;

    //GET NAME
    public String getName(){
        return this.Name;
    }

    //GET Author
    public int getGradebook(){
        return this.Gradebook;
    }

    //GET YEAR
    public int getAvgScore(){
        return this.avgScore;
    }

    //SET
    public void setName(String StudentName){
        this.Name = StudentName;
    }
    public void setGradebook(int gradebook){
        this.Gradebook = gradebook;
    }
    public void setAvgScore(int avgScore){
        this.avgScore = avgScore;
    }
    @Override
    public void print(){
        System.out.print("\nName: " + this.getName() + '\n' +
                "Gradebook: " + this.getGradebook() + '\n' +
                "AvgScore: " + this.getAvgScore() + '\n');
    }

}
