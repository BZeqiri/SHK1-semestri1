import java.util.Scanner;
public class CilesiaEAjrit{
	
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("Cilesia e ajrit (ICA)");
		int nr=sc.nextInt();
		if (nr<0){
			System.out.println("Vlera ae indexit eshte dhene gabim");
		}
			else if (nr>=0 && nr<=49){
				System.out.println("Indeksi i ulet");
				System.out.println("Mund te vazhdoni me aktivitet e tuaja te zakonshme ne natyr");
			}
			else if (nr>=50 && nr<=74){
				System.out.println("Indeksi i moderuar");
				System.out.println("Reduktoni aktivitet e jashtme");
				System.out.println("Femijet dhe gjithashtu te moshuarit duhet te kene kujdes");
			}
			else if (nr>=75 && nr<=100){
				
				System.out.println("Indeksi i larte");
				System.out.println("Reduktoni aktivitet e jadhtme");
				System.out.println("Femijet dhe gjithashtu te moshuarit duhet te kene kujdes");
			}
			else{
				System.out.println("Indeksi shume i lart");
			System.out.println("Shmangini aktivitet e jashtme");
	System.out.println("Femijet dhe gjithashtu te moshuarit duhet ti shmangin aktivitet e jashtme");
	}
	}
}
			
		
		
		
		
		