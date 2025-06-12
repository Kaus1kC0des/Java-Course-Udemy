class Stock{
    String companyName;
    String tickerSymbol;
    double currentPrice;
    double fiftyTwoWeekHigh;
    double fiftyTwoWeekLow;
    static String promoterName;

    static{
        promoterName = "Tata Sons";
        System.out.println("Inside static method block of Stock class");
    }


    public Stock(String companyName, String tickerSymbol, double currentPrice, double fiftyTwoWeekHigh, double fiftyTwoWeekLow){
        this.companyName = companyName;
        this.tickerSymbol = tickerSymbol;
        this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
        this.fiftyTwoWeekLow = fiftyTwoWeekLow;
    }
}

public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
//        Stock tcs = new Stock("TCS", "TCS", 2345.0224, 12000.4235, 2355.02453);
        Class.forName("Stock");
    }
}
