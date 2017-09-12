import java.util.*;
public class Monk extends Basic {
		int lvl;
	String name;
	String r;
	
	public Monk(int Lvl,String Name){
		super(Lvl,Name);
	}
	
	public void m(){
		bas();
		System.out.println("would you like to do an unarmed attack? y/n");
		Scanner in = new Scanner(System.in);
		r = in.nextLine();
		if(r.equals("y"))
		{
			System.out.println("unarmed strike");
		}
		else
			System.out.println("alright");
	
	}
}