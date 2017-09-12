import java.util.*;

public class Barb extends Basic {
	int lvl;
	String name;
	String r;
	
	public Barb(int Lvl,String Name){
		super(Lvl,Name);
	}
	
	public void b(){
		bas();
		System.out.println("would you like to rage? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("rage");
		}
		else
			System.out.println("alright");
		
	}
	
}