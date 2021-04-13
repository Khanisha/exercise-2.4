package exercise2_4;

public class Main {

	public static void main(String[] args) {
		Laptop a = new Laptop();
		
		a.setBrand("Acer");
		a.setModel("Aspire 3");
		a.setColor("RED,BLACK,SILVER");
		a.setRAM(8);
		a.setPrice(2900);
		a.setWeight(2.1);
		
		System.out.println("Brand : " + a.getBrand());
		System.out.println("Model : " + a.getModel());
		System.out.println("Color : " + a.getColor());
		System.out.println("RAM : " + a.getRAM() + "GB");
		System.out.println("Price : RM" + a.getPrice());
		System.out.println("Weight : " + a.getWeight() + "KG");
		
		a.fullThrottle();

	}

}
