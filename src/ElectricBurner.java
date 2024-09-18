public class ElectricBurner extends Burner {
    private double voltReq;
    private double ampReq;

    public ElectricBurner(double voltReq, double ampReq) {
        super(0, 0, 0); 
        
    }

    public void increaseCurrent() {

    }

    public void decreaseCurrent() {

    }

    public double getVoltReq() {

        return 0.0;
    }
}
