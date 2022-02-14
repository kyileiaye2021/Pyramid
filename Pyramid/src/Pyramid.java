import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     System.out.print("Height: ");
     int height = s.nextInt();
     
     String hash = "#";
     for(int i = 0; i < height; i++) {
    	 System.out.println(hash);
    	 hash += "#";
     }
	}

}
