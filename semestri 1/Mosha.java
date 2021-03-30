import java.util.Scanner;
public class Mosha{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Mosha e femijes :");
		
		int m=sc.nextInt();
		
		switch(m){
			case 1 :
			System.out.println("Moshe parashkollore : Nje");
			break;
			case 2 :
			System.out.println("Mosha parashkollore : Dy");
			break;
			case 3 :
			System.out.println("Moshe parashkollore : Tre");
			break;
			case 4 :
			System.out.println("Moshe parashkollore : Kater");
			break;
			case 5 :
			System.out.println("Moshe parashkollore : Pese");
			break;
			case 6 :
			System.out.println("Moshe shkollore - Gjashte");
			break;
			default :
			System.out.println("Mosha e dhene eshte gabim!");
		}
	}
}
		