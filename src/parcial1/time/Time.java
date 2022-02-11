package parcial1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    public void setTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void addHour(int delta){
        hour += delta;
        while (hour>23){
            hour-=24;
        }
    }

    public void addMinute(int delta){
        minute += delta;
        while(minute>59){
            hour++;
            minute-=60;
        }
    }

    public void addSecond(int delta){
        second += delta;
        while(second>59){
            minute++;
            second-=60;
        }
    }


    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}
