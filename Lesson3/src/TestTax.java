/**
 * Created by ASUS on 13.12.2017.
 */
public class TestTax {
    public static void main(String[] args) {
        NJTax t = new NJTax();

        t.grossIncome = 50000;
        t.state = "NJ";
        t.dependents = 2;

        double yourTax = t.calcTax();
        System.out.println("Your tax is: " + yourTax);
    }
}
