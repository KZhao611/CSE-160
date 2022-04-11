package home;

public class Time {
	public static void main(String[] args) {
		Time t1 = new Time(1,59,59);
		t1.tick();
		System.out.println(t1);
		t1.tick();
		System.out.println(t1);
		Time t2 = new Time(23,59,59);
		t1.add(t2);
		System.out.println(t1);
	}
	private int hours;
    private int minutes;
    private int seconds;
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
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
	public void tick() {
		seconds++;
		check();
	}
    public void add(Time offset) {
    	seconds += offset.getSeconds();
    	check();
    	minutes += offset.getMinutes();
    	check();
    	hours += offset.getHours();
    	check();
    }
    private void check() {
    	if(seconds >= 60) {
			minutes++;
			seconds -= 60;
    	}
		if(minutes >= 60) {
			hours++;
			minutes -= 60;
		}
		if(hours >= 24)
			hours -= 24;
			
    }
    public String toString() {
    	return hours + ":" + String.format("%02d", minutes)+":" + String.format("%02d", seconds);
    }
}
