import java.util.Random;

//Escreva um programa em Java que preencha um vetor de 10 posições com valores 
//inteiros (o preenchimento deverá ser feito por um método). Um segundo método deverá ser 
//chamado para calcular e retornar a soma dos elementos armazenados no array. 
public class EX1 {
	public static Random xx = new Random();
	
	public static void main(String[] args) {
		int[] x = new int[10];
		
		x(x);
		xxx(x);
		System.out.println("Total:" + xxxx(x));
	}
	
	public static void xxx(int[] x) {
		for(int xxx = 0; xxx<x.length;xxx++) {
			System.out.println(x[xxx]);
		}
	}
	
	public static void x(int[] x) {
		for(int xxx = 0; xxx<x.length;xxx++) {
			x[xxx] = xx.nextInt(101);
		}
	}
	
	public static int xxxx(int[] x) {
		int xxx =0;
		
		for(int xxxx=0;xxxx<x.length;xxxx++) {
			xxx+= x[xxxx];
		}
		return xxx;
	}
}
