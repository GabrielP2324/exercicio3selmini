import java.util.Random;

//Escreva um programa em Java que preencha um vetor de 10 posições com valores 
//inteiros (o preenchimento deverá ser feito por um método). Um segundo método deverá ser 
//chamado para calcular e retornar a soma dos elementos armazenados no array. 
public class EX2 {
	public static Random xx = new Random();

	public static void main(String[] args) {
		int[] x = new int[10];

		xxx(x, x.length-1);
		xxxx(x, x.length-1);
		System.out.println("Total: "+xxxxx(x, 0));
	}

	public static void xxxx(int[] x, int xxx) {
		if (xxx != -1) {
			System.out.println(x[xxx]);
			xxxx(x, xxx-1);
		}
	}

	public static void xxx(int[] x, int xxx) {
		if (xxx != -1) {
			x[xxx]=xx.nextInt(101);
			xxx(x, xxx-1);
		}
	}

	public static int xxxxx(int[] x, int xxx) {
		if (xxx == x.length - 1) {
			return 0;//Acabar o código aqui, quando o índice chegar no seu maior valor
		}

		return xxxxx(x, xxx + 1) + x[xxx + 1];
	}
}
