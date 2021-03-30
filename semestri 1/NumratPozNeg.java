import java.util.Scanner;
public class NumratPozNeg{
	public static void main(String[]bz){
Scanner sc=new Scanner(System.in);
System.out.println("vlera a :");
byte a=sc.nextByte();
if(a>0){
	System.out.println("a eshte pozitiv");
}
	else if(a<0){
		System.out.println("a eshte negativ");
	}
		else{
			System.out.println("a eshte 0");
		}
	}
}