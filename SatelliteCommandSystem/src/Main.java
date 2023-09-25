
public class Main {
    public static void main(String[] args) throws Exception {
        var satellite = new Satellite();
        System.out.println("******-WELCOME TO SATELLITE COMMAND SYSTEM!-*****");
        satellite.rotate("South");
        satellite.activatePanels();
//        satellite.deactivatePanels();
        satellite.collectData();
        satellite.rotate();
        // Display satellite state after executing the command
        System.out.println("Satellite state after command \n" + satellite.getState());
    }
}