package trafficlight;

import java.time.LocalTime;
import java.io.*;
import java.lang.Thread;

public class TrafficLight {
    boolean green;
    boolean yellow;
    boolean red;
    long time;
    
    public TrafficLight(int time){
        this.green = false;
        this.yellow = false;
        this.red = false;
        this.time = time;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
        private void setOnGreen(){
            this.green = true;
            this.yellow = false;
            this.red = false; 
        }
        
        private void setOnYellow(){
            this.green = false;
            this.yellow = true;
            this.red = false;
        }
        
        private void setOnRed(){
            this.green = false;
            this.yellow = false;
            this.red = true;
        }
        
        private void setOff(){
            this.green = false;
            this.yellow = false;
            this.red = false;
        }
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="States">
        private void turnGreen() {
            setOff();
            setOnGreen();
            try {
                Thread.sleep(time*1000);
            } catch (Exception e){}
            setOff();
        }
        
        private void turnYellow(){
            setOff();
            setOnYellow();
            try {
                Thread.sleep(time*1000);
            } catch (Exception e){}
        }
        
        private void turnRed(){
            setOff();
        }
    //</editor-fold>
        
    public static void turnOn(){
        while(true){
            try {
                Thread.sleep(this.time * 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            } 
        }
    }
}
