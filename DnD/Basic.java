import java.util.*;
public class Basic {
		int lvl;
	String name;
	String r;
	public Basic(int Lvl, String Name){
		this.lvl = Lvl;
		this.name = Name;
	}
	
	public void bas(){
		hide();
		attack();
	}
	
	public void hide(){
		System.out.println("would you like to hide? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("hiding");
		}
		else
			System.out.println("alright");
	
	}
	
	public void attack(){
		System.out.println("would you like to attack? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("attacking");
		}
		else
			System.out.println("alright");
	
	}
}