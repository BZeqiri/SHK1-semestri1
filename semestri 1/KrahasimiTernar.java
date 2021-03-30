import java.util.Scanner;
public class KrahasimiTernar{
	public static void main(String[]bz){
	Scanner sc=new Scanner(System.in);
	System.out.println("vlera p :");
	double p=sc.nextDouble();
	System.out.println("vlera q :");
	double q=sc.nextDouble();
	
	double vleraMax=p>q?p:q;
	String variablaMeVlerenMax=p>q?"Variabla p" : "Variabla q";
	
 
	System.out.println("Vlera max :"+ vleraMax);
	System.out.println("Variabla me vleren max eshte :" + variablaMeVlerenMax);
	
	}
}
