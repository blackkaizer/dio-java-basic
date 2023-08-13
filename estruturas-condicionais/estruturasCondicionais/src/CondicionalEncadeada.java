import java.util.Locale;
import java.util.Scanner;

public class CondicionalEncadeada {
    //Exempo de condicional encadeadas:
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
    System.out.println("Informe a nota do aluno: ");
    double nota = scanner.nextDouble();

	if (nota >= 7 && nota <= 10)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else if (nota > 10)
		System.out.println("Nota incorreta");
    else 
        System.out.println("Reprovado");

    /*
    * Vale ressaltar aqui, que no Java, em uma condição**if/else** 
    * às vezes necessitamos adicionar um bloco de { },se a lógica 
    * conter mais de uma linha.
    */
    }
}
