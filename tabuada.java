package Classicos;

public abstract class tabuada {

	public static void main(String[] args) {
		int i=1,n=1,tabuada;
	while(n<=10) {	
		i=1;
		System.out.println(" ");
		do {
			tabuada = n*i;
			System.out.println(n+"X"+i+"="+tabuada);
			i++;
		}while (i<=10);
		n = n+1;
		}
	}

}
