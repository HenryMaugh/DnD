import java.util.*;
public class Ranger  extends Basic {
		int lvl;
	String name;
	String r;
	
	public Ranger (int Lvl,String Name){
			super(Lvl,Name);
	}
	
	public void r(){
		bas();
		System.out.println("would you like to do a ranged attack? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("shooting");
		}
		else
			System.out.println("alright");
	
	}
}