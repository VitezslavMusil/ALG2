package competition;
public class Competition {
     
    //data
    //private int nRunners neni nutne si pamatovat, rovnou pouzijeme na vytvoreni pole
    private String name;
    private long commonSTime;
    private Runner[] runners;
    private int currentRunners = 0;

    
    //konstruktor
    public Competition(String name, long commonSTime, int nRunners) {
        this.name = name;
        this.commonSTime = commonSTime;
        runners = new Runner [nRunners];
    }

    public Competition(String name, Runner[] runners) {
        this.name = name;
        this.runners = runners;
    }
    
    
    //getry a setry
    //pole nema smysl vracet
    public String getName() {
        return name;
    }

    public long getCommonSTime() {
        return commonSTime;
    }
    
    public void setRunnerFinishTime(String runnerName, long runnerFinishTime) {
        for(Runner r: runners) {
            if (r.getName().equals(runnerName)) {
                r.setFtime(runnerFinishTime);
                break;
            }
        }
    }
    
    public void setCommonStartTime() {
        for(Runner r: runners) {
            r.setStime(commonSTime);
        }
    }
    
    //metody na pridani zavodnika
    public void addRunner(Runner r) {
        //dostala objekt, pouze priradi
        runners[currentRunners] = r;
        currentRunners++;
    }
    
    public void addRunner(String name) {
        //dostane pouze jmeno, vytvori objek - lepsi
        Runner r = new Runner (name);
        addRunner(r);
    }
    
    
    
    
    //metoda nalezeni vyteze
    public Runner getWinner() {
        long minTime = Long.MAX_VALUE;
        long runnerTime;
        Runner winner = null;
        for(int i = 0; i < runners.length; i++) {
            runnerTime = runners[i].getRunningTime();
            if(runnerTime < minTime) {
                minTime = runnerTime;
                winner = runners[i];
            }
        }
        return winner;
    }
    
    
    //to String
    public String starList() {
        String s = "";
        // for each - v kazdem kroku chci mit v promenne r postupne vsechny objekty z pole
        for(Runner r:runners) {
            s = s + " " + r.getName() + " " + r.getStime();
            //slo by pouzivat toString pro kazdy objekt
        }
        return s;
    }
}
