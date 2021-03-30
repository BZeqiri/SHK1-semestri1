import java.util.Scanner;
public class TeDhenat{
	public static void main(String[]bz){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ID : ");
		int id=sc.nextInt();
		
		
		System.out.println("Emri : ");
		String emri=sc.next();
		
		System.out.println("Mbiemri : ");
		String mbiemri=sc.next();
		
		System.out.println("Viti i lindjes : ");
		short viti=sc.nextShort();
		
		System.out.println("Viti i studimit : ");
		byte studimi=sc.nextByte();
		
		System.out.println("ID :" + id);
		System.out.println("Emri :" + emri);
		System.out.println("Mbiemri:" + mbiemri);
		System.out.println("Viti ilindjes :" + viti);
		System.out.println("Viti i studimit :" + studimi);
		
		
		
		
		
}
}