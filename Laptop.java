package exercise2_4;

public class Laptop {

	String brand, model, color;
	int price, RAM;
    double weight;
    
    
  	 // Create Setter Method
  	  public void setBrand(String brand) {
  	    this.brand = brand;
  	  }
  	  
 	  public void setModel(String model) {
 	    this.model = model;
 	  }
  	  
 	 public void setColor(String color) {
  	    this.color = color;
  	  }
 	 
 	 public void setRAM(int RAM) {
   	    this.RAM = RAM;
   	  }
 	 
 	public void setPrice(int price) {
   	    this.price = price;
   	  }
 	
 	public void setWeight(double weight) {
   	    this.weight = weight;
   	  }
 	
 	 // Create Getter Method
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getModel() {
		  return this.model;
	  }
	  
	  public String getColor() {
		  return this.color;
	  }
	  
	  public int getRAM() {
		  return this.RAM;
	  }
	  
	  public int getPrice() {
		  return this.price;
	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	// Create a fullThrottle() method
		public void fullThrottle() {
			System.out.println("This laptop model is highly recommended by students !");
		}
}
