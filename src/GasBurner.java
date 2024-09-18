public class GasBurner extends Burner {
    private String gasType;
    private boolean spark;

    public GasBurner() {
        super(0, 0, 0);
    }

    public String getGasType() {
        return "";
    }

    public boolean spark() {
        return false;
    }

    public void increaseGasFlow() {

    }

    public void decreaseGasFlow() {
        
    }
}
