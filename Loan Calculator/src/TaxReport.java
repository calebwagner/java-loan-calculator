// explain of "programming against interfaces" - it's the responsibility
// of another class to pass/inject the concrete implementations
public class TaxReport {
    private TaxCalculator calculator;

//    constructor injection method example
//    this is called "Programming Against Interfaces" - it's the responsibility
//    of the Main class to pass/inject the concrete implementation
    public  TaxReport (TaxCalculator calculator) {
        this.calculator = calculator;
    }

//    REPLACED BY ABOVE CONSTRUCTOR USING CONSTRUCTOR INJECTION DEPENDENCY TYPE
//    public TaxReport() {
//        calculator = new TaxCalculator2018(100_000);
//    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

    public void setCalculator(TaxCalculator calculator) {
        this.calculator = calculator;
    }
}
