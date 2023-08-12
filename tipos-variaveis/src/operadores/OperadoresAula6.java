package operadores;
public class OperadoresAula6 {
    public static void main(String[] args) {
        // Operadores: Relacionais
        /* == Quando desejamos verificar se uma variável é IGUAL A outra.
        != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        < Quando desejamos verificar se uma variável é MENOR QUE outra.
        <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra. */

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual a NumeroDois? " + simNao); //False

        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente de NumeroDois? " + simNao); //True

        simNao = numero1 > numero2;
        System.out.println("NumeroUm é maior que NumeroDois? " + simNao); //False

        simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor que NumeroDois? " + simNao); //True

        simNao = numero1 >= numero2;
        System.out.println("NumeroUm é maior ou igual que NumeroDois? " + simNao); //False

        simNao = numero1 <= numero2;
        System.out.println("NumeroUm é menor ou igual que NumeroDois? " + simNao); //True

        if(numero1 > numero2) {
            System.out.println("Numero 1 maior que numero 2"); // Falso então não é impresso
        }
        if(numero1 < numero2) {
            System.out.println("Numero 1 menor que numero 2"); // Verdadeiro então é impresso
        }
        if(numero1 >= numero2) {
            System.out.println("Numero 1 maior ou igual que numero 2"); // Falso então não é impresso
        }
        if(numero1 <= numero2) {
            System.out.println("Numero 1 menor ou igual que numero 2"); // Verdadeiro então é impresso
        }
        if(numero1 != numero2) {
            System.out.println("Numero 1 é diferente de numero 2"); // Verdadeiro então é impresso
        }

        String nomeUm = "Eliton";
        String nomeDois = "Eliton";
        System.out.println(nomeUm == nomeDois); // True 

        nomeUm = "Eliton";
        nomeDois = new String("Eliton");
        System.out.println(nomeUm == nomeDois); // False
        System.out.println(nomeUm.equals(nomeDois)); // True
    }
}
