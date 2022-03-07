package me.whiteship.refactoring._09_feature_envy.sol;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
        return electricityUsage.getElectricityBill() + gasUsage.getGasBill();
    }
}
