public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumetarVolume(){
        volume++;
        System.out.println("Aumentando o Volume para: " + volume);
        //volume = volume + 1;
    }
    public void diminuirVolume(){
        volume = volume -1;
        System.out.println("Diminuindo o Volume para: " + volume);
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
