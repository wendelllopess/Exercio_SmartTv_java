public class Usuario {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("\n========Minha smartTv==========\n\n");

        System.out.println("Status da Tv: " + smartTv.ligada);

        System.out.println("---------------");

        System.out.println("O volume atual é: " + smartTv.volume);

        System.out.println("---------------");


        System.out.println("O canal atual é: " + smartTv.canal);

        System.out.println("---------------");


        smartTv.desligar();
            System.out.println("Atualizando o status da tv->:" + smartTv.ligada);
            System.out.println("---------------");

        smartTv.ligar();
            System.out.println("Status atual de sua TV é: " + smartTv.ligada);
            System.out.println("---------------");

        smartTv.aumentarVolume();

        smartTv.aumentarVolume();

        smartTv.diminuirVolume();


        System.out.println("O volume de sua tv agora e: " + smartTv.volume);
        System.out.println("---------------");


        System.out.println("O canal atual é: " + smartTv.canal);
        System.out.println("---------------");

        smartTv.mudaCanal(12);
            System.out.println("O Canal atual agora é: " + smartTv.canal);
            System.out.println("---------------");


        smartTv.voltarCanal();
            System.out.println("Canal atual e: " + smartTv.canal);
            System.out.println("---------------");

        smartTv.passarCanal();
            System.out.println("Canal atual e: " + smartTv.canal);


        System.out.println("-----BOM PROVEITO-----");

    }
}