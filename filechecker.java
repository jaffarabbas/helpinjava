

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


class filechecker{
	public static void main(String[] args) {
		try{
			String filename = "J:\\Github\\helpinjava\\input.txt";
	  File f1=new File(filename); //Creation of File Descriptor for input file
	  if(f1.createNewFile()){
		System.out.println("File created");
	  }
	  int linecount=0;            //Intializing linecount as zero
        int count10=0;
      FileReader fr=new FileReader(f1);  //Creation of File Reader object
      Scanner sc = new Scanner(fr);    //Creation of File Reader object
      String s;              
      while(sc.hasNext())    //Reading Content from the file line by line
      {
		int currentNumber = sc.nextInt();
        System.out.println(currentNumber);

         if(currentNumber > 10){
            count10++;
         }
         linecount++;               //For each line increment linecount by one          
      }
      
      fr.close();
	  System.out.println("Number of lines in the Files:"+linecount+"\nline have Numbers grater then 10 : "+count10); //Print the line count
	}catch(IOException e){
		System.out.println(e);
	}
	}
}