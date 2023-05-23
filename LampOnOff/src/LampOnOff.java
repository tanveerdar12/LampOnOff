public class LampOnOff {
    public static void main(String[] args) {
        Lamp L1 = new Lamp();
        L1.turnOn();
        L1.printLampState();

        L1.turnOff();
        L1.printLampState();
    }
}
class Lamp{
    boolean isON;

    void turnOn(){
        this.isON=true;
    }

    void turnOff(){
        this.isON= false;
    }

    void printLampState(){
        if(this.isON){
            System.out.println("Lamp is ON");
        }else{
            System.out.println("Lamp is OFF");
        }
    }
}

