public class OperadoresAula5 {
    public static void main(String[] args) {
        // Operador "Ternário"
        int a, b;

        a = 5;
        b = 6;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        // String resultado = "";
        // if(a==b) // Operador de comparação;
        //     resultado = "verdadeiro";
        // else
        //     resultado = "falso";

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a==b) ? "verdadeiro" : "false";
        System.out.println(resultado);

        //O operador ternário é aplicado para qualquer tipo de valor.
    }
}
