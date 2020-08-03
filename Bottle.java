
public class Bottle {

	public int capacity;
	public String brand;
	public int overflow_limit;
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getOverflow_limit() {
		return overflow_limit;
	}
	public void setOverflow_limit(int overflow_limit) {
		this.overflow_limit = overflow_limit;
	}
	public Bottle(int capacity, String brand, int overflow_limit) {
		super();
		this.capacity = capacity;
		this.brand = brand;
		this.overflow_limit = overflow_limit;
	}
	
	
	public static void main(String[] args)
	{
		BottleService bottle = new BottleService();
		bottle.fillin(18);
		bottle.fillout(5);
		System.out.println("current litres water in bottle "+bottle.waterinBottle());
	}
}
