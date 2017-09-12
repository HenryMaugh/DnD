import java.util.*;
public class Warlock extends Basic {
		int lvl;
	String name;
	String r;
	
	public Warlock (int Lvl,String Name){
			super(Lvl,Name);
	}
	
	public void w(){
		bas();
		System.out.println("would you like to cast a spell? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("casting");
		}
		else
			System.out.println("alright");
	
	}
}