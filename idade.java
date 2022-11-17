package Classicos;
import java.util.Scanner;
public class idade {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1,idade,f1=0,f2=0,f3=0,f4=0,f5=0,p1=0,p2=0,p3=0,p4=0,p5=0;
		
	
		do {
				System.out.println("Digite a idade:");
				idade = in.nextInt();
				if(idade<=15) {
					f1++;
					p1=f1*100/15;
				}else if(idade<=30) {
					f2++;
					p2=f2*100/15;
				}else if(idade<=45) {
					f3++;
					p3=f3*100/15;
				}else if(idade <=60) {
					f4++;
					p4=f4*100/15;
				}else {
					f5++;
					p5=f5*100/15;
				}i++;
		     }while (i<=15);
		System.out.println(f1 + " pessoas na 1� faixa etaria " +p1+ "% de pessoas");
		System.out.println(f2 + " pessoas na 2� faixa etaria " +p2+ "% de pessoas");
		System.out.println(f3 + " pessoas na 3� faixa etaria " +p3+ "% de pessoas");
		System.out.println(f4 + " pessoas na 4� faixa etaria " +p4+ "% de pessoas");
		System.out.println(f5 + " pessoas na 5� faixa etaria " +p5+ "% de pessoas");
		
		
	} 
}
