import java.util.Scanner;
public class NumratCiftTek{
public static void main(String[]bz){
Scanner sc=new Scanner(System.in);
System.out.println("vlera a");
short a=sc.nextShort();
if(a==0){
System.out.println("a eshte 0");
}
else if(a%2==0){
System.out.println("a eshte cift");
}
else{
System.out.println("a eshte tek");
}
}
}
