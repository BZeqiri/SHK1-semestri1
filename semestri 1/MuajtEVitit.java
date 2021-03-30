import java.util.Scanner;
public class MuajtEVitit{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Numer :"); 
		byte nr = sc.nextByte();
		switch(nr){
			case 1 :
			System.out.println("1-Janar");
			break;
			case 2:
			System.out.println("2-Shkurt");
		    break;
			case 3 :
			System.out.println("3-Mars");
			break;
			case 4 :
			System.out.println("4-Prill");
			break;
			case 5 :
			System.out.println("5-May");
			break;
			case 6 :
			System.out.println("6-Qershor");
			break;
			case 7 :
			System.out.println("7-Korrik");
			break;
			case 8 :
			System.out.println("8-Gusht");
			break;
			case 9 :
			System.out.println("9-Shtator");
			break;
			case 10 :
			System.out.println("10-Tetor");
			break;
			case 11 :
			System.out.println("11-Nentor");
			break;
			case 12 :
			System.out.println("Dhjetor");
			break;
			default:
			System.out.println("GABIM");
		}
	}
}

	


