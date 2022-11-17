package Classicos;
import java.util.Scanner;
public class numPrimo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int i,n, res=0;
		System.out.println("Digite um número");
		n = in.nextInt();
		
		for (i=1;i<=n;i++) {
			if(n%i==0) {
				res = res+1;
			}
		} if(res==2) {
			System.out.println("O número é primo "+n);	
		} else {
			System.out.println("Não é primo " + n);
		}
	}

}
