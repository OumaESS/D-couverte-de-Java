
public class Ex7 {

	//Q1
	public boolean boole() {
		return true;
	}
	
	//Q2
	
	public String str(String n){
		return n;
	}
	
	//Q3
	
	public String str2(String a,String b) {
	return a+b;
    }
	
	
	//Q4
	
	public String Plugrand(int a,int b) {
		
		if(a>b)
			return "le nombre est plus grand que b";
		else if(a<b)
			return "le nombre est plus petit que b";
		else 
			return "les deux nombres sont identiques";
	}
	
	//Q5
	public String Concat(String a,int b) {
		return a+b;
	}
	
	//Q6
	public String Infos(String nom,String prenom,int age) {
		return "Bonjour" + nom + prenom + ", tu as " + age + "ans";
	}
	
	//Q7
	
	public String Majour(String genre,int age) {
		if(genre.equals("homme") && age>18)
			return "Vous êtes un "+genre+" et vous êtes majeur";
		else if(genre.equals("homme") && age<18)
			return "Vous êtes un"+genre+" et vous êtes mineur";
		else if(genre.equals("femme") && age>18)
			return "Vous êtes une "+genre+" et vous êtes majeur";
		else 
			return "Vous êtes une "+genre+" et vous êtes mineur";
		
	}
	
	//Q8
	
	public int somme(int a,int b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Ex7 test=new Ex7();
		System.out.println(test.somme(4, 3, 2));
	}
	

}

 
