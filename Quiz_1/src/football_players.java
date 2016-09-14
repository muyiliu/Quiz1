import java.util.Scanner;

public class football_players {
	public static void main(String[]args){
		double TD;
		double Yards;
		double INT;
		double comp;
		double ATT;
		double a;
		double b;
		double c;
		double d;
		double passer_rating;
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many tochdowns did the player have?");
		TD=input.nextDouble();
		System.out.println("How many yards did they have?");
		Yards=input.nextDouble();
		System.out.println("How many INT did he have?");
		INT=input.nextDouble();
		System.out.println("How many comp did he have?");
		comp=input.nextDouble();
		System.out.println("How many ATT?");
		ATT=input.nextDouble();
		input.close();
		a=((comp/ATT)-0.3)*5;
		System.out.println(a);
		b=((Yards/ATT)-3)*0.25;
		System.out.println(b);
		c=(TD/ATT)*20;
		System.out.println(c);
		d=2.375-((INT/ATT)*25);
		System.out.println(d);
		passer_rating=((a+b+c+d)/6)*100;
		System.out.println(passer_rating);
		}

}
