package parcial1.time;

public class Main {

    public static void main(String[] args) {
    Time time = new Time(2,100,23);
    Time time2 = new Time(0,0,0);
    time.addSecond(40);
    time.addMinute(110);
    time.addHour(0);
    System.out.println(time.toString());

    time2.setTime(12,200,105);
    time2.addSecond(0);
    time2.addMinute(0);
    time2.addHour(5);
    System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());

    }
}
