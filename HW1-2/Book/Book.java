package Book;

public class Book implements Displayable{
    private String  Name;
    private String Author;
    private int Year;

    public Book(){
        this.Name = "default";
        this.Author = "default";
        this.Year = 0;
    }

    public Book (String Name, String Author, int Year){
        this.Name = Name;
        this.Author = Author;
        this.Year = Year;
    }

    //GET NAME
    public String getName(){
        return this.Name;
    }

    //GET Author
    public String getAuthor(){
        return this.Author;
    }

    //GET YEAR
    public int getYear(){
        return this.Year;
    }

    //SET
    public void setName(String BookName){
        this.Name = BookName;
    }
    public void setAuthor(String BookAuthor){
        this.Author = BookAuthor;
    }
    public void setYear(int BookYear){
        this.Year = BookYear;
    }

    @Override
    public void display() {
        System.out.print("\nName: " + this.getName() + '\n' +
                        "Author: " + this.getAuthor() + '\n' +
                        "Year: " + this.getYear() + '\n');
    }
}
