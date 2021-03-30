import java.util.Scanner;
public class DitetEJaves{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Dita :"); 
		
		String dita=sc.nextLine();
		String nrdita;
		String qfardite;
		
		switch(dita){
			case "E Hene" :
			nrdita="Dita e Pare";
			qfardite="Dite pune";
			break;
			case "E Marte" :
			nrdita="Dita e Dyte";
			qfardite="Dite pune";
			break;
			case "E Merkure" :
			nrdita="Dita e Trete";
			qfardite="Dite pune";
			break;
			case "E Enjte" :
			nrdita="Dita e Katert";
			qfardite="Dite pune";
			break;
			case "E Premte" :
			nrdita="Dita e Peste";
			qfardite="Dite pune";
			break;
			case "E Shtune" :
			nrdita="Dita e Gjashte";
			qfardite="Vikend";
			break;
			case "E Diele" :
			nrdita="Dita e Shtate";
			qfardite="Vikend";
			break;
			default:
			nrdita="Dita e dhene eshte gabim!";
			qfardite="Dita e dhene eshte gabimi!";
			break;
		}
		System.out.println(nrdita+ ":"+qfardite);
	}
}