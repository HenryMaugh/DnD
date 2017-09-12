import java.util.*;
public class DnD{
	
	public static void main(String [] args){
		String name = "";
		String hero = "";
		Barb barb = new Barb(1, name);
		Bard bar = new Bard(1, name);
		Druid drd = new Druid(1, name);
		Monk mnk = new Monk(1, name);
		Paladin pal = new Paladin(1, name);
		Ranger rng = new Ranger(1, name);
		Sorcerer src = new Sorcerer(1, name);
		Warlock wrk = new Warlock(1, name);
		Fighter ftr = new Fighter(1, name);
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("what is your characters name.");
		name = in.nextLine();
		System.out.println("What class are you? Barbarian Bard Druid Monk Paladin Ranger Sorcerer Warlock");
		hero = in.nextLine();
		System.out.println("Welcome " + name + " the " + hero);
		switch(hero){
			case "Barbarian":
			barb.b();
			break;
			case "Bard" :
			bar.b();
			break;
			case "Druid" :
			drd.d();
			break;
			case "Monk" :
			mnk.m();
			break;
			case "Paladin":
			pal.p();
			break;
			case "Ranger" :
			rng.r();
			break;
			case "Sorcerer": 
			src.s();
			break;
			case "Warlock":
			wrk.w();
			break;
			case "Fgither":
			ftr.f();
			break;
		}
	}
}