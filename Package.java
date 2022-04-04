//Kevin Zhao, 114368032
package home;

public class Package {
	public static void main(String[] args) {
		Package[] packages1 = {new Package("Monmouth", "Appleby", 144), 
		        new Package("Larkinge", "Ballachulish", 65), 
		        new Package("Malrton", "Auchtermuchty", 872), 
		        new Package("Monmouth", "Anghor Thom", 937)};
		int[] costSchedule1 = {10, 16, 37, 49};
		System.out.println(shippingCost(packages1, costSchedule1));
	}
	private String sender;
	private String recipient;
	private int cost = 0;
	private int distance;
	public Package(String sender,  String recipient, int distance) {
        this.sender = sender;
        this.recipient = recipient;
        this.distance = distance;
	}
	public int getDistance() {
  	    return distance;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost; 
    }
    public static int shippingCost(Package[] packages, int[] costSchedule) {
    	int ret = 0;
    	for(Package e: packages) {
    		if(e.getDistance() < 100) {
    			e.setCost(costSchedule[0]);
    			ret+= costSchedule[0]; 
    		}
    		else if(e.getDistance() < 300) {
    			e.setCost(costSchedule[1]);
    			ret += costSchedule[1];
    		}
    		else if(e.getDistance() < 500) {
    			e.setCost(costSchedule[2]);
    			ret += costSchedule[2];
    		}
    		else {
    			e.setCost(costSchedule[3]);
    			ret += costSchedule[3];
    		}
    	}
    	return ret;
    }
}
