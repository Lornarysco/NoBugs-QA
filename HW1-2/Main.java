import Student.Student;
import Student.StudentManager;
import Book.Book;
import Book.BookCollenction;


public class Main {
    public static void main(String[] args)
    {
        Student student = new Student("14", "Timyr");
        Student student1 = new Student("23", "Artem");
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student);
        studentManager.addStudent(student1);
        studentManager.printStudents();
        studentManager.removeStudent(student);
        studentManager.removeStudentById("23");
        studentManager.printStudents();



        Book book = new Book();
        book.setName("IGM");
        book.setAuthor("OnlinePortal");
        book.setYear(2000);

        Book book1 = new Book("UnitT", "Author", 2015);


        BookCollenction BCollect = new BookCollenction();
        BCollect.addBook(book);
        BCollect.addBook(book1);
        BCollect.printBooks();
        System.out.print(BCollect.consistBook(book));
        BCollect.removeBook(book1);
        BCollect.printBooks();

    }


}