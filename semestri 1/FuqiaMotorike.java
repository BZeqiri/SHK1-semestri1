import java.util.Scanner;
public class FuqiaMotorike{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		System.out.println("fuqia e e motorit ne vat :");
		double w=sc.nextDouble();
		double hp=w/745.7;
		if(w<1){
			System.out.println("fuqia eshte dhene gabim");
		}
		else{
			System.out.println(w+"w = " +hp+ "hp");
		}
	}
}
