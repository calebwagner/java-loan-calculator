import java.awt.*;

public class Main {
    public static void main(String[] args) {

        var test = new MortgageCalculator(1,1,1);

        test.getRemainingBalances();
        test.calculateMortgage();
        test.calculateBalance((short) 10);


       UIControl[] controls = {new TextBox(), new CheckBox()};
       for (var control : controls) {
           control.render();
       }
    }

}