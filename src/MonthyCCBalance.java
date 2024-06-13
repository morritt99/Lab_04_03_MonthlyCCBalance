
public class MonthyCCBalance {
    public static void main(String[] args) {
        double balance = 5000;
        double interestRate = 0.17 / 12; // Monthly interest rate
        double interestMonth1 = balance * interestRate;
        balance += interestMonth1;
        double interestMonth2 = balance * interestRate;
        System.out.println("The interest due after one month is: $" + interestMonth1);
        System.out.println("The interest due after two month is: $" + (interestMonth1 + interestMonth2));
    }
        }