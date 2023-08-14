public class FormatarCepException {
    public static void main(String[] args) {
        String cepFormatado;
        try {
            cepFormatado = formatarCep("8704530");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não contem 8 digitos.");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}