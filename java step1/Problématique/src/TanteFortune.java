import java.util.Scanner;

public class TanteFortune {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		try {
		    scanner = new Scanner(System.in);
		    int cafe=10;
		    int  Carte=10;
		    int billetTrame=8;
		    
			System.out.println("Combien avez-vous re�u d'argent (MAD) ?");
			Float Prix=scanner.nextFloat();
			
			Float SomeForniture=Prix*3/4;
			
			System.out.println("l'achat de livres et fournitures est :"+SomeForniture+" MAD");
			double sommeAutre=(Prix/4)/3;
		    double nbrcafe=sommeAutre/cafe;
		    double nbrcarte=sommeAutre/Carte;
		    double nbrbiller=sommeAutre/billetTrame;
			int i=(int)nbrcafe;
			int j=(int)nbrcarte;
			int k=(int)nbrbiller;
			System.out.println("Vous pouvez ensuite acheter :");
			System.out.println(i+" caf�s");
			System.out.println(j+" Carte de recharge pr�payer");
			System.out.println(k+" billets de TRAME");
			double rest=(Prix/4)-(i*cafe+j*Carte+k*billetTrame);
			System.out.println("et il vous restera"+ rest+" MAD pour les roses blanches");
			
		}
		finally {
		    if(scanner!=null)
		        scanner.close();
		}
		



		

	}

}
