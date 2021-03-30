import java.util.Scanner;
public class Numrat{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("vlera a :");
		int a=sc.nextInt();
		if(a%2==0 && a<0){
			System.out.println("a eshte cift negativ");
		}
		else if(a%2==0 && a>0){
			System.out.println("a eshte cift pozitiv");
		}
		else if(a%2!=0 && a<0){
			System.out.println("a eshte tek negativ");
		}
		else if(a%2!=0 && a>0){
			System.out.println("a eshte tek pozitiv");
		}
		else if(a==0){
			System.out.println("a eshte 0");
		}
	}
}
		
		