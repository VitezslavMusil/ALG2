/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package competition;

/**
 *
 * @author Vutuch
 */
public class Runner {
    //data
    private String name;
    private long sTime = 0;
    private long fTime = 0;     //celkovy cas v sekundach, lepsi nez mit string nebo pocet hodin, minut, sekund
    private long runningTime = 0;
    
    
    //konstrukotry
    public Runner (String name) {
        this.name = name;
    }
    
    public Runner (String name, long sTime) {
        this.name = name;
        this.sTime = sTime;
    }
    
    
    //getry
    public String getName() {
        return name;
    }

    public long getStime() {
        return sTime;
    }   
    
    public long getFtime() {
        return fTime;
    }

    public long getRunningTime() {
        return runningTime;
    }
    
    
    //setry
    public void setStime(long sTime) {
        this.sTime = sTime;
    }
    
    public void setFtime(long fTime) {
        this.fTime = fTime;
        this.runningTime = runningTime();   //vypocet probehne pouze pri nastaveni casu na konci
    }
    
    
    //metoda public long runnigTime by pocitala pri kazdem zavolani tridy
    //lepsi udelat private metodu a vypocet provest jen jednou - pri zadani casu v cili
    private long runningTime() {
        return fTime - sTime;
    }
    
    
    //to String
    @Override
    public String toString() {
        return "Runner{" + "name=" + name + ", sTime=" + sTime + ", fTime=" + fTime + ", runningTime=" + runningTime + '}';
    }
    
}
