import java.util.Scanner;

//Escreva um programa em Java que leia um n�mero representando um n�mero na base 
//bin�ria. O seu programa dever� ter um m�todo para converter e retornar o valor da base bin�ria 
//para decimal. 

public class EX4 {
	public static void main(String[] args) {
		Scanner xx = new Scanner(System.in);

		System.out.print("Digite um valor em bin�rio-> ");
		int x = xx.nextInt();

		System.out.println(xxx(x, 0));
	}

	public static int xxx(int x, int xx) {
		int xxx = x % 10; //pegando o �ltimo d�gito do valor, ou seja o da direita

		if (x == 0 || x == 1) {//quando estivermos no �ltimo n�mero a ser calculado
			return (int) Math.pow(2, xx) * x; //valor do primeiro d�gito (o da esquerda)
		}
		
		return (int) (Math.pow(2, xx) * xxx) + xxx(x / 10, ++xx);

	}

}
