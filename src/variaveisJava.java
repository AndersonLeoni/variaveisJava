
public class variaveisJava {


	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 30;
		int nota3 = 40;
		int nota4 = 20;

		int media = (nota1 + nota2 + nota3 + nota4)/4;

		if (media >= 50) {
			System.out.println("Aprovado");
		} else if (media >= 30 && media <= 49) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}

	}
}
