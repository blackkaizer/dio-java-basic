import java.util.Locale;
import java.util.Scanner;

public class condicionalComposta {
        //Exempo de condicional composta:
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
    System.out.println("Informe a nota do aluno: ");
    int nota = scanner.nextInt();

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}
