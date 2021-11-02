package ch6;

public class Ch6_11 {


    public static void main(String[] args){
        System.out.println("Sales Amount\t\tCommission");
        for(double amount = 10000.0; amount <= 100000.0; amount += 5000.0){
            System.out.printf("%.0f\t\t\t\t%.1f\n", amount, computeCommission(amount));
        }
    }

    public static double computeCommission(double salesAmount){
        double commission = 0.0;
        double balance = 0;
        if(salesAmount >= 10000.01)
            commission += (balance = salesAmount - 10000.01) * 0.12;

        if(salesAmount >= 5000.01)
            commission += (balance -= balance - 5000.01) * 0.1;
        if(salesAmount >= 0.01)
            commission += balance * 0.08;

        return commission;
    }
}
