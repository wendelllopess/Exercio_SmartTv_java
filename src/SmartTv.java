public class SmartTv {
    boolean ligada = false;
    int canal = 15;
    int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume = volume + 1;
            System.out.println("Aumentando volume > " + volume);
            System.out.println("--------");
    }

    public void diminuirVolume(){
        volume = volume - 1;
            System.out.println("Diminuindo volume < " + volume);
            System.out.println("--------");

    }

    public void mudaCanal(int novoCanal){
        canal = novoCanal;
            System.out.println("Mudando canal para...: "+ canal);
            System.out.println("--------");
    }

    public void passarCanal(){
        canal = canal+1;
            System.out.println("passando canal um >> " + canal);
            System.out.println("---------------");
    }

    public void voltarCanal(){
        canal = canal - 1;
            System.out.println("Voltando canal um << " + canal);
            System.out.println("--------");

    }

}
