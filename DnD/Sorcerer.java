import java.util.*;
public class Sorcerer  extends Basic {
		int lvl;
	String name;
	String r;
	
	public Sorcerer (int Lvl,String Name){
		super(Lvl,Name);
	}
	
	public void s(){
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