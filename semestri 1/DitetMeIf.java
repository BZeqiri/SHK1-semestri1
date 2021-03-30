import java.util.Scanner;
public class DitetMeIf{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Numri :"); 
		
		int dita=sc.nextInt();
		
				if(dita==1){
			System.out.println("Dite pune - E H ene");
		}
		else if(dita==2){
			System.out.println("Dite pune - E Marte");
		}
		else if(dita== 3){
			System.out.println("Dite pune - e Merkure");
		}
	        else if(dita==4){
			System.out.println("Dite pune - E Enjte");
		}
		else if(dita==5){
			System.out.println("Dite pune - E Premte");
		}
		else if(dita==6){
			System.out.println("Vikend - E E Shtune");
		}
		else if(dita==7){
			System.out.println("Vikend - E Diel");
		}
		else{
			System.out.println("Dita e dhene eshte gabim!");
		}
		
	}
}
