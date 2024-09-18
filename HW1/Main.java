import Book.Book;
import Car.Car;
import Clock.Clock;
import Point.Point;
import Student.Student;

public class Main {
    public static void main(String[] args)
    {

        Book BookExample = new Book();
        BookExample.setName("HP1");
        BookExample.setAuthor("JRowling");
        BookExample.setYear(1997);
        BookExample.display();

        Student StudentEx = new Student();
        StudentEx.setName("Barsukov");
        StudentEx.setGradebook(123);
        StudentEx.setAvgScore(4);
        StudentEx.print();

        Point Point = new Point();
        Point.setX(1);
        Point.setY(1);
        Point.moveUp(10);
        Point.moveDown(10);
        Point.moveLeft(10);
        Point.moveRight(10);
        Point.pointCore();

        Clock time = new Clock();
        time.setHours(21);
        time.setMinutes(15);
        time.setSeconds((58));
        time.tick();
        time.readTime();

        Car car = new Car();
        car.setMake("BMW");
        car.setModel("X5");
        car.setYearOfIssue(2018);
        car.start();
        car.drive(10);
        car.stop();
    }


}