
import java.util.Scanner;
class TPS{
	int roll;
	String name;
	String place;


	public int getRoll(){
		return roll;
	}
	public void setRoll(int r){
		roll=r;
	}


	public String getName(){
		return name;
	}
	public void setName(String n){
		name =n;
	}


	public String getPlace(){
		return place;
	}
	public void setPlace(String p){
		place=p;
	}
}
public class Get_Set {
	public static void main(String args[]){
		TPS Detail = new TPS();
		Detail.setRoll(01);
		System.out.println(Detail.getRoll());

		Detail.setName("Sam Bhardwaj");
		System.out.println(Detail.getName());

		Detail.setPlace("Patna");
		System.out.println(Detail.getPlace());




	}
}
