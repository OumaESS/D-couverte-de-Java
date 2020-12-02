import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
		    scanner = new Scanner(System.in);

	        System.out.println("Quel est votre nom?");
	        String userName =  scanner.nextLine();
	        System.out.println("Bonjour " + userName);
		}
		finally {
		    if(scanner!=null)
		        scanner.close();
		}
		
		
		  
	}
	


}
