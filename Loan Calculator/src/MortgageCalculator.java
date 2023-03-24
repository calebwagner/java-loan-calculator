public class MortgageCalculator {

    /**
     * fields
     */
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;
    private int principle;
    private float annualInterest;
    private int years;

    /**
     * constructor
     */
    public MortgageCalculator(int principle, float annualInterest, int years) {
        this.principle = principle;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    /**
     * methods
     */
    public double calculateBalance(short numberOfPaymentsMade) {
        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double balance = principle
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {
        short numberOfPayments = getNumberOfPayments();
        float monthlyInterest = getMonthlyInterest();
        double mortgage = principle
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        return mortgage;
    }

    /**
     * getters
     */
    public double[] getRemainingBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= balances.length; month++) {
            balances[month - 1] = calculateBalance(month);
        };
        return balances;
    }

    private float getMonthlyInterest() { return annualInterest / PERCENT / MONTHS_IN_YEAR;}

    private short getNumberOfPayments() {return (short) (years * MONTHS_IN_YEAR);}

}
