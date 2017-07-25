package tr.org.linux.kamp.student;

public class CarApplication {
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Volvo", 5 , 500 );
		Car car2 = new Car("Mercedes");
		Car car3 = new Car("BMW", 5);
		
		car1.setBrand("Alpha-Romeo");
		car1.setSpeed(450);
		car2.setBrand("Ford");
		car3.setGear(4);
		car3.changeGear(4);
		
		System.out.println(car1.getBrand()+" 's speed is :"+ car1.getSpeed()+" and the gear is :"
				+car1.getGear());
		System.out.println(car2.getBrand()+ "'s speed is :" + car2.getSpeed()+" and the gear is :"
				+car2.getGear());
		System.out.println(car3.getBrand()+ "'s speed is :" + car3.getSpeed()+" and the gear is :"
				+car3.getGear());
		
		
		car3.speedUp(200);
		System.out.println("("+car3.getBrand()+" 's new speed is: "+ car3.getSpeed()+ "and new gear is: "
				+car3.getGear());
		car1.speedDown(100);
		System.out.println(car1.getBrand()+ " 's new speed is: " + car1.getSpeed()+")");
		
	}
}
