//Kevin Zhao, 114368032
package home;

public class StepTracker {
	public static void main(String[] args) {
		StepTracker tr = new StepTracker(10000);
		System.out.println(tr.activeDays()); 
		System.out.println( tr.averageSteps() );
		tr.addDailySteps(9000);
		tr.addDailySteps(5000);
		System.out.println( tr.activeDays());
		System.out.println( tr.averageSteps() );
		tr.addDailySteps(13000);
		System.out.println( tr.activeDays() );
		System.out.println( tr.averageSteps() );
		tr.addDailySteps(23000);
		tr.addDailySteps(1111);
		System.out.println( tr.activeDays() );
		System.out.println( tr.averageSteps() );
	}
	private int minSteps, days = 0, activeDays = 0, totalSteps = 0;
	public StepTracker(int min) {
		minSteps = min;
	}
	public void addDailySteps(int steps) {
		days ++;
		totalSteps += steps;
		if(steps >= minSteps) {
			activeDays ++;
		}
	}
	public int activeDays() {
		return activeDays;
	}
	public double averageSteps() {
		if(days == 0)
			return 0;
		return (double)(totalSteps)/days;
	}
}
