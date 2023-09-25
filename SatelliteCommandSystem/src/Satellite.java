public class Satellite {

    private Orientation orientation;
    private PanelStatus panelStatus;
    private int dataCollected;

    //Contructor Overloaded to set the Initial State of the Satellite
    public Satellite() {
        this.orientation = Orientation.North;
        this.panelStatus = PanelStatus.Active;
        this.dataCollected = 0;
    }
    public void rotate(Orientation orientation) throws InvalidOrientationException{
        if (orientation == null) throw new InvalidOrientationException("Direction cannot be Empty.");
        this.orientation = getOrientation(orientation);
    }

    // Method overloaded with No orientations.
    public void rotate(){
        System.out.println("No Orientation/Direction is specified. Keeping the current Orientation.");
        getOrientation(this.orientation);
    }

    // Rotate Method is Overloaded with string input parameter to provide a user friendly Interface
    public void rotate(String direction) throws InvalidOrientationException{
        if (!direction.isEmpty()){
            direction = direction.trim().toUpperCase();

            switch (direction) {
                case "NORTH":
                    this.orientation = Orientation.North;
                    break;
                case "SOUTH":
                    this.orientation = Orientation.South;
                    break;
                case "EAST":
                    this.orientation = Orientation.East;
                    break;
                case "WEST":
                    this.orientation = Orientation.West;
                    break;
                default:
                    throw new InvalidOrientationException("Invalid direction. \n" +
                            "Check the INPUT - Please provide a valid direction (NORTH, SOUTH, EAST, WEST).");
            }
        } else{
            throw new InvalidOrientationException("Direction cannot be Empty.");
        }
    }

    public void activatePanels() {
        this.panelStatus = PanelStatus.Active;
    }

    public void deactivatePanels() {
        this.panelStatus = PanelStatus.Inactive;
    }

    public void collectData() throws DataCollectionException{
        if (this.panelStatus == PanelStatus.Inactive) {
            throw new DataCollectionException("Data Collection is not possible as Solar Panels are INACTIVE.");
        }
        this.dataCollected += 10;
    }

    private Orientation getOrientation(Orientation orientation) {
        return orientation;
    }

    public String getState() {
        return "* Orientation: " + orientation +"\n"+
                "* Solar Panels: " + getPanelStatus() +"\n"+
                "* Data Collected: " + dataCollected;
    }

    private PanelStatus getPanelStatus() {
        return panelStatus;
    }
}