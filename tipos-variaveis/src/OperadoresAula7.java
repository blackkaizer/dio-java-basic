public class OperadoresAula7 {
    public static void main(String[] args) {
        // Operadores logicos

        /*&& Operador Lógico "E"
        || Operador Lógico "OU" */
        boolean condicao1=true;
        boolean condicao2=false;
        // Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões. 

        //Se Condicao1 "E" Condicao2 forem verdadeiras, executar código.
        if(condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros"); // Não retorna nada, pois so um é verdadeiro.

        //Se condicao1 "OU" condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro"); // Retorna a mesagem pois um deles é verdadeiro.

        int numero1 = 1;
        int numero2 = 1;
        
        if(numero1 == 2 & numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");
        
        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2);
        
        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )

        /*A duplicidade nos operadores lógicos é um recurso conhecido como 
        Operador Abreviado, isso quer dizer que, se a condição1 atender aos 
        critérios, não será necessário validar a condição2.*/
    }
}
