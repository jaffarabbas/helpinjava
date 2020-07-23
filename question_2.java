import java.time.*;
import java.util.*;

class HeartRates{
	private String firstName;
	private String LastName;
	private int day;
	private int month;
	private int year;

//setter
	public void setFname(String fname){
		this.firstName = fname;
	}
	public void setLname(String Lname){
		this.LastName = Lname;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setYear(int year){
		this.year = year;
	}
//getter

	public String getFname(){
		return firstName;
	}
	public String getLname(){
		return LastName;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
//constructer
	public HeartRates(String conFname,String conLname, int conDay, int conMon , int conYear){
		setFname(conFname);
		setLname(conLname);
		setDay(conDay);
		setMonth(conMon);
		setYear(conYear);
		System.out.println("First Name :"+getFname()+"\nLast Name : "+getLname());
	}
//return calculate age
	public String calculateAge_in_Year(){
		 LocalDate pdate = LocalDate.of(getYear(),getMonth(),getDay());
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
 
        return "\nAge : "+" "+diff.getYears()+" "+diff.getMonths()+" "+diff.getDays();
	}
//return max heart rate
	  public int getMaxHeartRate()
    {
        int maxHeartRate = 220 - (2020-getYear());
        return maxHeartRate;
    }
   
  //  return target heart rate
    public String getTargetHeartRate()
    {
        double targetHeartRateMin = (50f/100f * getMaxHeartRate());
        double targetHeartRateMax = (85f/100f) * getMaxHeartRate();
        return "Target Heart Rate :  between " + targetHeartRateMin + " and " + targetHeartRateMax + " BPM.";    
    }
}


class question_2{
	public static void main(String[] args) {
		HeartRates obj = new HeartRates("sda","asd",6,1,2000);
		System.out.println(obj.calculateAge_in_Year()+"\nMaximum Heart Rate : "+obj.getMaxHeartRate()+"\n"+obj.getTargetHeartRate());
	}
}