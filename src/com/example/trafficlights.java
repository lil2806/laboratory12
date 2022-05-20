package com.example;
import java.security.PublicKey;
public class trafficlights {

    enum Lights{
        RED,YELLOW,GREEN
    }
    class Simulation{

        Lights mm = Lights.RED;
        void ChangeColor(){
            switch (mm){
                case RED :
                    mm=Lights.YELLOW;
                    break;
                case YELLOW :
                    mm=Lights.GREEN;
                    break;
                case GREEN :
                    mm=Lights.RED;
                    break;
            }
        }
        public String toString(){
            return " "+mm;
        }

    }


    public class Trafficlights {
        public static void main(String[] args) {
            Simulation lily = new Simulation();
            for (int i = 0; i < 10; i++) {
                System.out.println(lily);
                lily.ChangeColor();
            }
        }
    }




}
