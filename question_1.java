
class Rectangle{
	public double Width;
	public double Height;

	public Rectangle(){
            this.Width = 1;
            this.Height = 1;
            System.out.println(toString());
	}
	public Rectangle(double width,double height){
            this.Width = width;
            this.Height = height;
            System.out.println(toString());
	}


    public double GetArea(){
    	return Width*Height;
    }

    public double GetPerameter(){
    	return 2*(Height+Width);
    }

    public String toString(){
    	return "Height : "+this.Height+"\nWidth : "+this.Width+"\nArea : "+GetArea()+"\nPerameter : "+GetPerameter();
    }


}


class test{
	public void RunTestCase(){
		System.out.println("default constructer : ");
		Rectangle test1 = new Rectangle();
		System.out.println("parametraize constructer (Test 1): ");
		Rectangle test2 = new Rectangle(4,40);
		System.out.println("parametraize constructer (Test 2): ");
		Rectangle test3 = new Rectangle(3.5f,35.9f);
	}
}


class question_1{
	public static void main(String[] args) {
		test object = new test();
		object.RunTestCase();
	}
}