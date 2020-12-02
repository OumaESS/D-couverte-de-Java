import java.util.Scanner;

public class Ex2 {

	
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
		    scanner = new Scanner(System.in);
		    
		    
			System.out.println("Saisir le prix HT");
			Float a=scanner.nextFloat();
			System.out.println("vous souhaitez une remise ");
			String rep = scanner.next();
			double tva=0.2;
			if(rep.equals("yes") || rep.equals("oui")){
				System.out.println("saisir le pourcentage de la remise ");
				Float remise = scanner.nextFloat();
				double prixRemis=a-(a*remise)/100;
				System.out.printf("le prix aprés le remise DH : "+prixRemis);
				double PTTC=prixRemis*(1+tva);
				System.out.printf(" et le prix TTC est DH : "+PTTC);
						
			}
			else{
				System.out.println("Aucune remise n'a été appliquée");
				double PTTC=a*(1+tva);
				System.out.printf(" et le prix TTC est DH : "+PTTC);
				
			}
		    
		    
		}
		finally {
		    if(scanner!=null)
		        scanner.close();
		}
	
		
		
	}

}
