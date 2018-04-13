/**
 * Created by ASUS on 13.12.2017.
 */
public class TestCalc {
    public static void main(String[] args) {
        Tax t = new Tax(); // creating an instance

        t.grossIncome = 50000;
        t.dependents = 2;
        t.state = "NJ";

        double yourTax = t.calcTax();
        System.out.println("Your tax is: " + yourTax);
    }
}
