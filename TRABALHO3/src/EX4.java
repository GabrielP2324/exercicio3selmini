import java.util.Scanner;

//Escreva um programa em Java que leia um número representando um número na base 
//binária. O seu programa deverá ter um método para converter e retornar o valor da base binária 
//para decimal. 

public class EX4 {
	public static void main(String[] args) {
		Scanner xx = new Scanner(System.in);

		System.out.print("Digite um valor em binário-> ");
		int x = xx.nextInt();

		System.out.println(xxx(x, 0));
	}

	public static int xxx(int x, int xx) {
		int xxx = x % 10; //pegando o último dígito do valor, ou seja o da direita

		if (x == 0 || x == 1) {//quando estivermos no último número a ser calculado
			return (int) Math.pow(2, xx) * x; //valor do primeiro dígito (o da esquerda)
		}
		
		return (int) (Math.pow(2, xx) * xxx) + xxx(x / 10, ++xx);

	}

}
