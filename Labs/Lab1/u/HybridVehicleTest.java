package u;

import c.HybridVehicle;
import org.junit.Test;
import static org.junit.Assert.*;

public class HybridVehicleTest {

    @Test
    public void testGasSettersAndGetters() {
        HybridVehicle hv = new HybridVehicle();
        hv.setGasCostPerGallon(3.5);
        hv.setMPG(30.0);
        assertEquals(3.5, hv.getGasCostPerGallon(), 1e-9);
        assertEquals(30.0, hv.getMPG(), 1e-9);
    }

    @Test
    public void testElectricSettersAndGetters() {
        HybridVehicle hv = new HybridVehicle();
        hv.setElectricCostPerKWh(0.13);
        hv.setMilesPerKWh(4.0);
        assertEquals(0.13, hv.getElectricCostPerKWh(), 1e-9);
        assertEquals(4.0, hv.getMilesPerKWh(), 1e-9);
    }

    @Test
    public void testGasTripCost() {
        HybridVehicle hv = new HybridVehicle();
        hv.setGasCostPerGallon(4.0);
        hv.setMPG(20.0);
        double cost = hv.gasTripCost(100.0); // 100 miles, 20 mpg -> 5 gallons * $4 = $20
        assertEquals(20.0, cost, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGasTripCostInvalidMPG() {
        HybridVehicle hv = new HybridVehicle();
        hv.setGasCostPerGallon(4.0);
        hv.setMPG(0.0);
        hv.gasTripCost(50.0);
    }

    @Test
    public void testElectricTripCost() {
        HybridVehicle hv = new HybridVehicle();
        hv.setElectricCostPerKWh(0.10);
        hv.setMilesPerKWh(5.0);
        double cost = hv.electricTripCost(100.0); // 100 miles, 5 miles/kWh -> 20 kWh * $0.10 = $2.0
        assertEquals(2.0, cost, 1e-9);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testElectricTripCostInvalidMilesPerKWh() {
        HybridVehicle hv = new HybridVehicle();
        hv.setElectricCostPerKWh(0.10);
        hv.setMilesPerKWh(0.0);
        hv.electricTripCost(10.0);
    }

    @Test
    public void testGetMPGeAndHybridAverage() {
        HybridVehicle hv = new HybridVehicle();
        hv.setMilesPerKWh(4.0); // MPGe = 4 * 33.7 = 134.8
        hv.setMPG(30.0);
        assertEquals(134.8, hv.getMPGe(), 1e-9);
        assertEquals((30.0 + 134.8)/2.0, hv.getHybridAverageMPG(), 1e-9);
    }
}
