public class EstruturaForEmArrays {
    public static void main(String[] args) {
        // Todo arrays começa com indice 0;
        String alunos[] = { 
            "FELIPE", 
            "JONAS", 
            "JULIA", 
            "MARCOS" 
        };
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
        /*
         * Observe que, como os arrays começam com índice igual a 0 (zero), 
         * iniciamos a nossa variável x também com valor zero e validamos 
         * a quantidade de repetições, a partir da quantidade de elementos do array.
         */

        //Forma abreviada - fir / each
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
