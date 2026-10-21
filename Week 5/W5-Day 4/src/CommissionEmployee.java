public class CommissionEmployee extends Employee {

    private double basePay;
    private double salesAmount;
    private double commissionRate;

    public CommissionEmployee(String name, double basePay, double salesAmount, double commissionRate) {
        super(name);
        this.basePay = basePay;
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return basePay + (salesAmount * commissionRate);
    }
}
