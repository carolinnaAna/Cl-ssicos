package Classicos;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			
		int	i,n,ant1=0,ant2=0,atual=1;
		
		    System.out.println("digite um número");
		    n = in.nextInt();
		    
		    for(i=1;i<=n;i++){
		        System.out.print(atual + ", ");
		        ant1 = ant2;
		        ant2 = atual;
		        atual = ant1 + ant2;
		    }
	}

}
