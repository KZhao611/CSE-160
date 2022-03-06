//Kevin Zhao, 114368032
package home;

public class ChezWolfie {
	public static void main(String[] args) {
		System.out.println(cafeDay(new int[][]{{5, 1, 2, 3}, {2, 5, 0, 4}, {1, 4, 4, 2}}));
		System.out.println(cafeDay(new int[][]{{1, 4, 3, 2}, {0, 0, 0, 10}, {2, 1, 4, 3}}));
	}
	public static double cafeDay(int[][] orders) { 
		double total = 0, membership, large, medium, small, discount = 0;
		if(orders.length == 0)
			return 0;
		for(int[] order : orders) {
			membership = order[0];
			large = order[1];
			medium = order[2];
			small = order[3];
			discount = 0;
			if(order.length != 4 || !(membership == 1 || membership == 2 || membership == 0) || order[1] < 0 || order[2] < 0 || order[3] < 0)
				continue;
			if(membership == 2) { //platinum
				if(large >= 3 || medium >= 4) {
					if(small >= 3)
						small -= 3;
					else
						small = 0;
				}
			}
			else if(membership == 1) { //gold
				if(large + medium + small >= 10)
					discount = .2;
			}
			else { //silver
				discount = .02;
			}
			total += (3.5 * large + 2.5 * medium + 1.25 * small) * (1-discount);
		}
		return total;
	}
}
