import java.util.Scanner;
public class Semestri{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Numri i semestrit :");
		short s=sc.nextShort();
		switch(s){
	case 1 :
		System.out.println("Semestri i pare - Viti i pare");
		break;
	case 2 :
		System.out.println("Semestri i dyte - Viti i pare");
		break;
	case 3 :
		System.out.println("Semestri i trete - Viti i dyte");
		break;
	case 4 :
		System.out.println("Semestri i katert - Viti i dyte");
		break;
	case 5 :
		System.out.println("Semestri i peste - Viti i trete");
		break;
	case 6 :
		System.out.println("Semestri i gjashte - Viti i trete");
		break;
	default :
		System.out.println("Semestri i dhene eshte gabim");
		}
	}
}
		