package Clock;

public class Clock implements Readble{
    public int hours;
    public int minutes;
    public int seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick(){
        setSeconds(this.seconds + 1);
    }
    @Override
    public void readTime(){
        System.out.println("\nCurrent time: " + getHours() + ":" + getMinutes() + ":"
                            + getSeconds() + "\n");
    }
}
