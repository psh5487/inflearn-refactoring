package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query_sol;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public double getProduction() {
//        방법1: return this.adjustments.stream().reduce(0d, (a, b) -> a + b);
//        방법2: return this.adjustments.stream().reduce((double) 0, Double::sum);
        return this.adjustments.stream().mapToDouble(Double::valueOf).sum();
    }
}
