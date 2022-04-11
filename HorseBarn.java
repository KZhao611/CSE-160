package home;

public class HorseBarn {
	public static void main(String[] args) {
		HorseBarn  b = new HorseBarn();
		b.add(new Horse("one"));
		b.add(new Horse( "two"));
		b.add(new Horse( "three"));
		b.add(new Horse( "four"));
		b.add(new Horse( "five"));
		b.remove( new Horse( "one"));
		System.out.println(b);
		b.consolidate();
		System.out.println(b);
		System.out.println(b.findHorseSpace("two")); 
	}
	private Horse[] spaces;
	public HorseBarn(Horse[] spaces) {
		this.spaces = spaces;
	}
	public HorseBarn() {
		spaces = new Horse[10];
	}
	public int findHorseSpace(String name) {
		for(int i = 0; i < 10; i++) {
			if(spaces[i].getName().equals(name))
				return i;
		}
		return -1;
	}
	public void add(Horse add) {
		for(int i = 0; i < 10; i++) {
			if(spaces[i] == null) {
				spaces[i] = add;
				return;
			}
		}
		System.out.print("The barn is full");
	}
	public void remove(Horse remove) {
		for(int i = 0; i < 10; i++) {
			if(spaces[i] != null) {
				if(spaces[i].equals(remove)) {
					spaces[i] = null;
					return;
				}
			}
		}
		System.out.println(remove.getName() + " is not in the barn.");
	}
	public Horse[] getSpaces() {
		return spaces;
	}
	public void consolidate() {
		int start = -1;
		for(int i = 0; i < 10; i++) {
			if(spaces[i] == null) {
				if(start == -1)
					start = i;
			}
			if(start != -1 && spaces[i] != null ) {
				for(int j = start; j < i; j++) {
					spaces[j] = spaces[j+i-start];
					spaces[j+i-start] = null;
				}
				i--;
				start = -1;
			}
		}
	}
	public String toString() {
		String ret = "";
		for(Horse e: spaces) {
			if(e == null)
				ret += "null ";
			else
				ret += e.getName() + " ";
		}
		return ret;
	}
}
