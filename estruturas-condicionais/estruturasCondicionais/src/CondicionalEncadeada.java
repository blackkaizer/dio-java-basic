import java.util.Locale;
import java.util.Scanner;

public class CondicionalEncadeada {
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

    /*
    * Vale ressaltar aqui, que no Java, em uma condição**if/else** 
    * às vezes necessitamos adicionar um bloco de { },se a lógica 
    * conter mais de uma linha.
    */
    }
}
