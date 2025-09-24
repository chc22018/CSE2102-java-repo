package c;

public class CarRunner {
    public static void main(String[] args) {

        HybridVehicle hv1 = new HybridVehicle();
        hv1.setGasCostPerGallon(3.50);
        hv1.setMPG(30.0);
        hv1.setElectricCostPerKWh(0.15);
        hv1.setMilesPerKWh(3.0);

        double miles1 = 120.0;
        System.out.println("=== Example 1 ===");
        System.out.println("Gas trip cost (" + miles1 + " miles): $" + String.format("%.2f", hv1.gasTripCost(miles1)));
        System.out.println("Electric trip cost (" + miles1 + " miles): $" + String.format("%.2f", hv1.electricTripCost(miles1)));
        System.out.println("MPG: " + hv1.getMPG());
        System.out.println("MPGe: " + String.format("%.1f", hv1.getMPGe()));
        System.out.println("Hybrid average MPG: " + String.format("%.1f", hv1.getHybridAverageMPG()));

        // Example 2: Lower MPG, higher MPGe (different starting settings)
        HybridVehicle hv2 = new HybridVehicle();
        hv2.setGasCostPerGallon(3.80);
        hv2.setMPG(25.0);
        hv2.setElectricCostPerKWh(0.12);
        hv2.setMilesPerKWh(4.2);

        double miles2 = 80.0;
        System.out.println("=== Example 2 ===");
        System.out.println("Gas trip cost (" + miles2 + " miles): $" + String.format("%.2f", hv2.gasTripCost(miles2)));
        System.out.println("Electric trip cost (" + miles2 + " miles): $" + String.format("%.2f", hv2.electricTripCost(miles2)));
        System.out.println("MPG: " + hv2.getMPG());
        System.out.println("MPGe: " + String.format("%.1f", hv2.getMPGe()));
        System.out.println("Hybrid average MPG: " + String.format("%.1f", hv2.getHybridAverageMPG()));
    }
}