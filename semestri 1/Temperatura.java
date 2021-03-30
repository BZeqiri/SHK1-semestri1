import java.util.Scanner;
public class Temperatura{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("temperatuara ne celcius : ");
		float c=sc.nextFloat();
		float f=c*9/5+32;
		if(f<-50){
			System.out.println("vlera e temperatures eshte shume e ulet");
			System.out.println("temperatura ne celsius : " + c);
			System.out.println("temperatura ne fahrenhait : " + f);
		}
		else if(f>50){
			System.out.println("vlera e temperatures eshte shume e larte");
			System.out.println("temperatura ne celsius : " + c);
			System.out.println("temperatura ne fahrenhite : " + f);
		}
		else{
			System.out.println("temepratura ne calsius : " + c);
			System.out.println("temperatura ne fahrenhite : " + f);
		}
	}
}
			