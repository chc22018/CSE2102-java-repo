package c;

public class HybridVehicle implements Gasoline, Electric {
    private double gasCostPerGallon;
    private double mpg;

    private double electricCostPerKWh;
    private double milesPerKWh;

    // Gasoline
    public void setGasCostPerGallon(double d) { gasCostPerGallon = d; }
    public double getGasCostPerGallon() { return gasCostPerGallon; }
    public void setMPG(double m) { mpg = m; }
    public double getMPG() { return mpg; }

    // Electric
    public void setElectricCostPerKWh(double d) { electricCostPerKWh = d; }
    public double getElectricCostPerKWh() { return electricCostPerKWh; }
    public void setMilesPerKWh(double m) { milesPerKWh = m; }
    public double getMilesPerKWh() { return milesPerKWh; }

   
    public double gasTripCost(double miles) {
        if (mpg <= 0) throw new IllegalArgumentException("MPG must be > 0");
        return (miles / mpg) * gasCostPerGallon;
    }

    public double getMPGe() {
        return milesPerKWh * 33.7;
    }

    public double electricTripCost(double miles) {
        if (milesPerKWh <= 0) throw new IllegalArgumentException("milesPerKWh must be > 0");
        return (miles / milesPerKWh) * electricCostPerKWh;
    }

    public double getHybridAverageMPG() {
        return (mpg + getMPGe()) / 2.0;
    }
}
