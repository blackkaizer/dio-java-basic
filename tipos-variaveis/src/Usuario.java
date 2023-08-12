public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        System.out.println("A TV esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: A TV esta ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status: A TV esta ligada? " + smartTv.ligada);

        smartTv.mudarCanal(53);
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirVolume();
    }
}
