import java.util.Scanner;
public class Stinet{
  public static void main(String[]bz){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("numer nga 1-4 :");
	  int stina=sc.nextInt();
	  if(stina==1){
		  System.out.println("pranvera");
	  }
	  else if(stina==2){
		  System.out.println("vera");
	  }
	  else if(stina==3){
		  System.out.println("vjeshta");
	  }
	  else if(stina==4){
		  System.out.println("dimiri");
	  }
	  else{
		  System.out.println("nuk ekziston");
	  }
  }
}