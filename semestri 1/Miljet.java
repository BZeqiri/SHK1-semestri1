import java.util.Scanner;
public class Miljet{
public static void main(String[]bz){
	Scanner sc=new Scanner(System.in);
	System.out.println("numri i kilometrave :");
	long km=sc.nextLong();
	double m=km * 0.62137;
	
	if(km<1){
		System.out.println("distanca eshte dhene gabim");
	}
	else{
		System.out.println(km +"km = "+m+" milje ");
	}
		
}
}
		
