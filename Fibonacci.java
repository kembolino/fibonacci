import java.util.Scanner;
public class Fibonacci {
	
	/**
	 * 
	 * @param args
	 */
	public static void main( String args[] ) {
		
		//Objet scanner
		Scanner input = new Scanner(System.in);
		
		//Initialisation des variables 
        int prevNumber = 0;
        int currNumber = 1;
        int sum = 0;
        
        System.out.print("Entrez la valeur maximale: ");
        int total = input.nextInt();

        System.out.print(prevNumber);
                
        for (int i = 1; i < total; i++	) {
          sum = prevNumber + currNumber;
          System.out.print(", " + currNumber);
          prevNumber = currNumber;
          currNumber = sum;          
        }
        System.out.println();
        //System.out.println("Sum " + "= " + sum);

    }
}
