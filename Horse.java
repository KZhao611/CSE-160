package home;

public class Horse {
	private String name;
	private int weight;
	public Horse(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public Horse(String name) {
		this.name = name;
		weight = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public boolean equals(Horse h2) {
		return name.equals(h2.getName())&&weight ==h2.getWeight();
	}
	
}
