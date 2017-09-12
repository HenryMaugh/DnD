import java.util.*;
public class Bard extends Basic {
		int lvl;
	String name;
	String r;
	
	public Bard(int Lvl,String Name){
		super(Lvl,Name);
	}
	
	public void b(){
		bas();
		System.out.println("would you like to inspire? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("inspire");
		}
		else
			System.out.println("alright");
	
	}
}