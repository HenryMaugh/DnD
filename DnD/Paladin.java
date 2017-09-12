import java.util.*;
public class Paladin extends Basic {
		int lvl;
	String name;
	String r;
	
	public Paladin(int Lvl,String Name){
			super(Lvl,Name);
	}
	
	public void p(){
		bas();
		System.out.println("would you like to use Divine Sense? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("Divine Sense");
		}
		else
			System.out.println("alright");
	
	}
}