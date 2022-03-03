package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query_sol;

public class Discount {

    private double discount;

    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
        // assert this.discountedTotal == this.baseTotal - this.discount; // 값이 같지 않다면, 여기서 실패하게 됨
        return this.baseTotal - this.discount;
    }

    public void setDiscount(double number) {
        this.discount = number;
    }
}
