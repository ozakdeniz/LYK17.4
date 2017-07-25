package tr.org.linux.kamp.student;
public class Car {
	
	private int gear;
	private int speed;
	private String brand;
	
	public Car(String brand, int gear, int speed) {
		this.brand = brand;
		this.speed = speed;
		this.gear = gear;
	}	
	
	public Car(String brand) {
		this.brand = brand;
		
	}
	
	public Car(String brand, int gear) {
		this.brand = brand;
		this.gear = gear;
		
	}

	public int getGear() {
		return gear;
		
	}

	public void setGear(int gear) {
		this.gear = gear;
		
	}

	public int getSpeed() {
		return speed;
		
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		
	}

	public String getBrand() {
		return brand;
		
	}

	public void setBrand(String brand) {
		this.brand = brand;
		
	}

	public void speedUp(int inc) {
		if(inc>0) {
		this.speed +=inc;
		
		}
	}
	
	public void speedDown(int dec) {
		if(dec>0) {
		this.speed = speed-dec;
		
		}
	}
	
	public void changeGear(int gear) {
		this.gear = gear;
	
	
	}
}




