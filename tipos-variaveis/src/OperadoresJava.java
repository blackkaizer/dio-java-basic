public class OperadoresJava {
    
    public static void main(String[] args) {
    // Operador: 
    /* = Operadore de Atribuição */
        String name = "Eliton";
        name = "Daniel"; // Reeatribuir valor.
        // Mais alguns exemplos:
        // int idade = 22;
        // double peso = 68.5;
        // char sexo = 'M';
        // boolean doadorOrgao = false;
        // Date dataNascimento = new Date();

        System.out.println(name);

        /* Operadores Aritméticos */

        // double soma = 10.5 + 15.7; // Soma
        // int subtracao = 113 - 25; // Subtação
        // int multiplicacao = 20 * 7; // Multiplicação
        int divisao = 15 / 3; // Divisão
        // int modulo = 18 % 3; // Modulo = Verificar resto da divisão
        // double resultado = (10 * 7) + (20 / 4); // Multiplicação + Divisão
        System.out.println(divisao);

        // ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
        // Concatenação:

        String nomeCompleto = "LINGUAGEM" + "JAVA"; // Resultado: LINGUAGEMJAVA
        System.out.println(nomeCompleto);

        // Qual o resultado das expressoes abaixo?
        String concatenacao = "?"; 
        concatenacao = 1+1+1+"1"; // Resultado: 31
        // concatenacao = 1+"1"+1+1; // Resultado: 1111
        // concatenacao = 1+"1"+1+"1"; // Resultado: 1111
        // concatenacao = "1"+1+1+1; // Resultado: 1111
        // concatenacao = "1"+(1+1+1); // Resultado: 13, quando a soma esta entre () ela é realizada primeiro e depois é feito a concatenação.
        // Quando encontra um String ele entende que deve concatenar e não somar.
        System.out.println(concatenacao);

    }

}
