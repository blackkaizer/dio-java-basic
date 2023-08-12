package javadoc;

/**
 * @author Eliton
 * @version 1.0
 * @since 12/08/2023
 */

public class JavaDoc {
    /**
     * Este método é utilizado para somar dois números inteiros
     * @param numeroUm este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }

    /*
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou  multiplicar
    * dois números
    */
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

    public int somaMultiplicaCorreto (int numero1, int numero2, String multiplica){
        int resultado = 0;
        if (multiplica == "M"){ 
            resultado = numero1 * numero2;
        }else{
            resultado = numero1 + numero2;
        }
        return resultado;
    }
}
