import java.util.Scanner;
public class Krahasimi{
       public static void main(String[]bz){
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("vlera x :");
		   float x=sc.nextFloat();
		   
		   System.out.println("vlera y :");
		   float y=sc.nextFloat();
		   
		   if(x>y){
			   System.out.println("x eshte me i madh se y");
		   }
		   else if(x<y){
			   System.out.println("x eshte me i vogel se y");
		   }
		   else{
			   System.out.println("x dhe y jane te barabarta");
		   }
	   }
}
		  