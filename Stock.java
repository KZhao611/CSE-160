//Kevin Zhao, 114368032
package home;

public class Stock {
	public static void main(String[] args) {
		Stock goog = new Stock("GOOG", "Google Inc.");
		goog.setPreviousClosingPrice(100);
		goog.setCurrentPrice(90);
		System.out.println(goog.changePercent());
		Stock amzn = new Stock("AMZN", "Amazon");
		amzn.setPreviousClosingPrice(3270);
		amzn.setCurrentPrice(3271.2);
		System.out.println(amzn.changePercent());
		Stock fb = new Stock("FB", "Facebook");
		fb.setPreviousClosingPrice(5364);
		fb.setCurrentPrice(5340);
		System.out.println(fb.changePercent());
	}
	private String symbol, name;
	private double previousClosingPrice, currentPrice;
	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public String getName() {
		return name;
	}
	public double getPreviousClosingPrice() {
		return previousClosingPrice;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public double changePercent() {
		return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
	}
}
