public class CondicionalSimples {
    public static void main(String[] args) {
        
        // Exemplo de condição simples: 
        double saldo = 25.0;
        double valorSolicitado = 17.0;
 
        if(valorSolicitado < saldo)
         saldo = saldo - valorSolicitado;
 
         System.out.println(saldo);
         
         /*
          * Vale ressaltar aqui, que no Java, em uma condição**if/else** 
          * às vezes necessitamos adicionar um bloco de { },se a lógica 
          * conter mais de uma linha.
          */
    }
}
