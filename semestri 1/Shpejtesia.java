import java.util.Scanner;
public class Shpejtesia{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Shpejtesia e vetures:");
		int s=sc.nextInt();
		
		switch(s){
			case 0:
			System.out.println("Vetura eshte e ndalur");
			break;
			case 30:
			System.out.println("Shpejtesia : "+s+" km/h.Vetura ehste duke levizur ngadale.");
			break;
			case 60:
			System.out.println("Shpejtesia : "+s+" km/h.Vetura ehste duke levizur me shpejtesi normale.");
			break;
			case 90:
			System.out.println("Shpejtesia : "+s+" km/h.Vetura ehste duke levizur mbi shpejtesine normale.");
			break;
			case 120:
			System.out.println("Shpejtesia : "+s+" km/h.Vetura ehste duke levizur shume shpejte.");
			break;
			default:
			System.out.println("Shpejtesi e gabuar!");
		}
	}
}
		