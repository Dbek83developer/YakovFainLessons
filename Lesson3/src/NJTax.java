/**
 * Created by ASUS on 13.12.2017.
 */
public class NJTax extends Tax {
    double adjustForStudents(double stateTax) {
        double adjustedTax = stateTax - 500;
        return adjustedTax;
    }

    @Override
    public double calcTax() {
        return super.calcTax() - 500;
    }
}
