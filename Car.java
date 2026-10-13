
public class Car {
	String make,model,color;
	int   year,price,hyw_mpg;
	double tcc_rating;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTcc_rating() {
		return tcc_rating;
	}
	public void setTcc_rating(double tcc_rating) {
		this.tcc_rating = tcc_rating;
	}
	public int getHyw_mpg() {
		return hyw_mpg;
	}
	public void setHyw_mpg(int hyw_mpg) {
		this.hyw_mpg = hyw_mpg;
	}
	
	public Car(String make, String model, String color, int year, int price, double tcc_rating, int hyw_mpg) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
		this.tcc_rating = tcc_rating;
		this.hyw_mpg = hyw_mpg;
	}
	
	public String toString() 
    { 
        return this.make + "| " + this.model + 
                           "| " + this.color +"| "+this.year +"| "+this.price +"| "+ " |" +this.tcc_rating +"| "+ this.hyw_mpg; 
    } 

}
