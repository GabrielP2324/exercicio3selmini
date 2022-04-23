import java.util.Scanner;

//Escreva um programa em Java que leia um número representando um número na base 
//binária. O seu programa deverá ter um método para converter e retornar o valor da base binária 
//para decimal. 

public class EX3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.print("Digite um valor em binário");
		int xx = x.nextInt();

		xxx(xx);
	}

	public static void xxx(int x) {
		int xx = 0;
		int xxx = 0;
		while (true) {
			if (x == 0) {
				break;
			} else {
				int xxxx = x % 10;
				xx += xxxx * Math.pow(2, xxx);
				x /= 10;
				xxx++;
			}//test with 11001101
		}
		System.out.println(xx);
	}
}
