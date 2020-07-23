
class location{
	private double x;
	private double y;

	void setx(double x){
		this.x=x;
	}
	void sety(double y){
		this.y=y;
	}
	double getx(){
		return x;
	}
	double gety(){
		return y;
	}
}

class Shapess extends location{
   location loc = new location();

   public String toString(){
   	  return "Parameter : "+Parameter();
   }

   double Parameter(){
	   double res = getx()*gety();
	   return res;
   }
   
   double Area(){
		double result = getx() * gety();
		return result;
   }
}

class Rectangle extends Shapess{
	double side1;
	double side2;

	Rectangle(double a,double b){
		this.side1 = a;
		this.side2 = b;

		setx(side1);
		sety(side2);

		System.out.println(toString());
	}	
}
// class circle{

// }






class shapes{
	public static void main(String[] args) {
	Rectangle obj = new Rectangle(33, 5);	
	}
}