

public class AlarmClock extends Clock{

    private int alarmHours;
    private int alarmMinutes;

    public AlarmClock(){

    }

    public AlarmClock(int h, int m){
        super(h, m, 0);

    }

    public AlarmClock(int h, int m, int s){
         super(h, m, s);
         //isRinging();
    }

    public int getAlarmHours(){
        return alarmHours;
    }

    public int getAlarmMinutes(){
        return alarmMinutes;
    }

    public void setAlarm(int h, int m){
        if(h < 0 || h > 24){
            throw new IllegalArgumentException("invalid alarm hours");
        }
        else
        alarmHours = h;

        if(m < 0 || m > 60){
            throw new IllegalArgumentException("invalid alarm minutes");
        }
        else
        alarmMinutes = m;

    }

    public boolean isRinging(){
    
        if( alarmHours == 7)
        return true;
        else
        return false;
        //&& m == alarmMinutes && s <= 15
    }
//@Override
    public void display(){

    }


}