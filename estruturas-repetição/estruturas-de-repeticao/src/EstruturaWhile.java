import java.util.concurrent.ThreadLocalRandom;

public class EstruturaWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
            while(mesada > 0) {
                Double valorDoce = valorAleatorio();
                if(valorDoce > mesada)
                    valorDoce = mesada; //Se o valor do doce for maior que o da mesa transforma o valor do doce no valor da mesada.
    
                System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
                mesada = mesada - valorDoce;
            }
            System.out.println("Mesada:" + mesada);
            System.out.println("Joãozinho gastou toda a sua mesada em doces");
            
            /*
            * Não se preocupe quanto a formatação de valores
            * Iremos explorar os recursos de formatação em breve !!
            */
       }
       private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
       }
}
