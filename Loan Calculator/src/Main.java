import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        this is aan example of "Poor Man's Dependency Injection"
//        create a dependency - TaxCalculator2018 - and inject into TaxReport
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show();

        // setter injection
        report.setCalculator(new TaxCalculator2019());
        report.show();
    }
}