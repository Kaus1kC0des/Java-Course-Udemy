package Inheritance;

import java.time.LocalDate;

public class PubliclyTradedCompany extends Company {
    // Fields specific to a publicly traded company, now all private
    private String symbolNSE;
    private String symbolBSE;
    private double currentNSEPrice;
    private double currentBSEPrice;
    private double sharePrice;      // Represents the primary current market share price
    // (e.g., if NSE is primary, or an average)
    private double priceOnIPO;
    private long outstandingShares;
    private double revenue; // Latest reported revenue
    private double profit;  // Latest reported profit
    private LocalDate lastMeetingDate; // To track annual shareholder meeting

    // Constructors

    public PubliclyTradedCompany(String name, String ceo, String headOfficeAddress, String industry,
                                 String symbolBSE, String symbolNSE, double priceOnIPO, long outstandingShares) {
        // Call the most comprehensive constructor of the superclass (Company)
        super(name, ceo, headOfficeAddress, industry);

        // Initialize fields specific to PubliclyTradedCompany
        this.symbolBSE = symbolBSE;
        this.symbolNSE = symbolNSE;
        this.priceOnIPO = priceOnIPO;
        this.outstandingShares = outstandingShares;

        // Initialize current prices and sharePrice to IPO price initially
        this.sharePrice = priceOnIPO;
        this.currentBSEPrice = priceOnIPO;
        this.currentNSEPrice = priceOnIPO;

        // Initial financial results are typically 0 or unknown at inception
        this.revenue = 0.0;
        this.profit = 0.0;
    }

    public PubliclyTradedCompany(String name, String ceo, String symbolBSE, String symbolNSE,
                                 double priceOnIPO, long outstandingShares) {

        super(name, ceo);
        this.symbolBSE = symbolBSE;
        this.symbolNSE = symbolNSE;
        this.priceOnIPO = priceOnIPO;
        this.outstandingShares = outstandingShares;
        this.sharePrice = priceOnIPO;
        this.currentBSEPrice = priceOnIPO;
        this.currentNSEPrice = priceOnIPO;
        this.revenue = 0.0;
        this.profit = 0.0;
    }
    // End of Constructors

    // Getters and Setters
    public String getSymbolNSE() {
        return symbolNSE;
    }

    public void setSymbolNSE(String symbolNSE) {
        this.symbolNSE = symbolNSE;
    }

    public String getSymbolBSE() {
        return symbolBSE;
    }

    public void setSymbolBSE(String symbolBSE) {
        this.symbolBSE = symbolBSE;
    }

    // Market Cap is a derived from outstanding shares and current share price.
    public double getMarketCap() {
        return this.outstandingShares * this.sharePrice; // Assuming sharePrice is kept updated
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        // Add validation: share price should not be negative
        if (sharePrice < 0) {
            System.out.println("Share price cannot be negative. Not updated.");
            return;
        }
        this.sharePrice = sharePrice;
        // When sharePrice is updated, current BSE/NSE prices might also be updated implicitly
        // or you might manage them separately if they diverge. For now, let's link them.
        this.currentBSEPrice = sharePrice;
        this.currentNSEPrice = sharePrice;
    }

    public double getPriceOnIPO() {
        return priceOnIPO;
    }

    // Price on IPO should ideally be set only once, during IPO or construction.
    // Making it public for now, but in a more complex model, it might be set internally.
    public void setPriceOnIPO(double priceOnIPO) {
        this.priceOnIPO = priceOnIPO;
    }

    public long getOutstandingShares() {
        return outstandingShares;
    }

    // Outstanding shares are primarily changed by splits, new issues, buybacks
    // Direct setter here, but consider making it more controlled by specific methods.
    public void setOutstandingShares(long outstandingShares) {
        if (outstandingShares < 0) {
            System.out.println("Outstanding shares cannot be negative. Not updated.");
            return;
        }
        this.outstandingShares = outstandingShares;
    }

    public double getCurrentNSEPrice() {
        return currentNSEPrice;
    }

    public void setCurrentNSEPrice(double currentNSEPrice) {
        if (currentNSEPrice < 0) {
            System.out.println("NSE Price cannot be negative. Not updated.");
            return;
        }
        this.currentNSEPrice = currentNSEPrice;
        // Optionally update the primary sharePrice if NSE is the main market you track
        this.sharePrice = currentNSEPrice;
    }

    public double getCurrentBSEPrice() {
        return currentBSEPrice;
    }

    public void setCurrentBSEPrice(double currentBSEPrice) {
        if (currentBSEPrice < 0) {
            System.out.println("BSE Price cannot be negative. Not updated.");
            return;
        }
        this.currentBSEPrice = currentBSEPrice;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        if (revenue < 0) {
            System.out.println("Revenue cannot be negative. Not updated.");
            return;
        }
        this.revenue = revenue;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        // Profit can be negative (loss), so no < 0 check needed here
        this.profit = profit;
    }

    /**
     * Updates the company's latest financial results (revenue and profit).
     * @param newRevenue The latest reported revenue.
     * @param newProfit The latest reported profit.
     */
    public void announceFinancialResults(double newRevenue, double newProfit) {
        if (newRevenue < 0 || newProfit < 0) { // Assuming profit can be negative but revenue cannot
            System.out.println("Invalid financial data. Revenue and Profit must be non-negative.");
            return;
        }
        setRevenue(newRevenue);
        setProfit(newProfit);
        System.out.println(super.getName() + " announced latest financials: Revenue Rs. "
                + String.format("%.2f", revenue) + " Cr, Profit Rs. "
                + String.format("%.2f", profit) + " Cr.");
    }

    /**
     * Simulates a stock split or reverse stock split for the company's shares.
     * Updates outstanding shares, share price, and current market prices accordingly.
     *
     * @param ratioNumerator The numerator of the split ratio (e.g., 2 for 2-for-1 split).
     * @param ratioDenominator The denominator of the split ratio (e.g., 1 for 2-for-1 split).
     */
    public void doShareSplit(int ratioNumerator, int ratioDenominator) {
        // Validate input for ratio
        if (ratioDenominator <= 0 || ratioNumerator <= 0) {
            System.out.println("Cannot perform share split: Ratio numerator and denominator must be positive.");
            return;
        }

        System.out.println("\n--- " + super.getName() + " initiating a " + ratioNumerator + "-for-" + ratioDenominator + " stock split ---");

        long oldOutstandingShares = this.outstandingShares;
        double oldSharePrice = this.sharePrice; // Use the primary sharePrice for calculations

        // Calculate the multiplier for shares and the inverse for price
        // Cast to double for accurate floating-point division
        double shareMultiplier = (double) ratioNumerator / ratioDenominator;
        double priceMultiplier = (double) ratioDenominator / ratioNumerator;

        // Update outstanding shares
        // Cast back to long, be aware of potential precision loss if not perfectly divisible,
        // though for real splits, shares are whole numbers.
        this.outstandingShares = (long) (this.outstandingShares * shareMultiplier);

        // Update share price
        this.sharePrice = this.sharePrice * priceMultiplier;

        // Update current BSE/NSE prices to reflect the split if they are linked to sharePrice
        // In a real scenario, these would also be updated by market data feeds.
        this.currentBSEPrice = this.currentBSEPrice * priceMultiplier;
        this.currentNSEPrice = this.currentNSEPrice * priceMultiplier;

        // Market capitalization is a derived value, it should remain approximately the same
        // after a split (ignoring slight market fluctuations).
        // It's good to recalculate it to ensure consistency with new shares/price.
        // No direct `setMarketCap` call, as `getMarketCap` will now calculate it based on updated values.

        System.out.println("Stock Split successful!");
        System.out.println("Old Outstanding Shares: " + oldOutstandingShares + ", New Outstanding Shares: " + this.outstandingShares);
        System.out.println("Old Share Price: Rs. " + String.format("%.2f", oldSharePrice) + ", New Share Price: Rs. " + String.format("%.2f", this.sharePrice));
        System.out.println("Current Market Capitalization: Rs. " + String.format("%.2f", getMarketCap()) + " Cr");
        System.out.println("----------------------------------------------");
    }

    /**
     * Simulates the company conducting its annual shareholder meeting.
     * Updates the last meeting date.
     */
    public void doAnnualShareHolderMeeting() {
        this.lastMeetingDate = LocalDate.now(); // Sets the date of the meeting to today
        System.out.println("\n--- " + super.getName() + " Annual Shareholder Meeting ---");
        System.out.println("Date: " + this.lastMeetingDate);
        System.out.println("Purpose: Review of annual performance, election of board members, and addressing shareholder queries.");
        System.out.println("Meeting concluded successfully. Full details available in annual report.");
        System.out.println("-------------------------------------------------");
    }

    // --- Utility Methods ---

    /**
     * Updates the current market prices for the company's shares.
     * @param newBSEPrice The latest price on BSE.
     * @param newNSEPrice The latest price on NSE.
     */
    public void updateMarketPrices(double newBSEPrice, double newNSEPrice) {
        if (newBSEPrice < 0 || newNSEPrice < 0) {
            System.out.println("Market prices cannot be negative. Not updated.");
            return;
        }
        this.currentBSEPrice = newBSEPrice;
        this.currentNSEPrice = newNSEPrice;
        // Decide which price to consider as the primary 'sharePrice' for calculations like market cap
        // For simplicity, let's use the higher of the two or an average, or just pick one.
        this.sharePrice = (this.currentBSEPrice + this.currentNSEPrice) / 2;
        System.out.println(super.getName() + " market prices updated. BSE: " + String.format("%.2f", currentBSEPrice) +
                ", NSE: " + String.format("%.2f", currentNSEPrice));
    }


    @Override
    public String toString() {
        // Call super.toString() to get base Company details and then add PubliclyTradedCompany details
        return super.toString().replace("}", "") + // Remove the closing brace from super.toString()
                ", PubliclyTradedCompany{" +
                "symbolNSE='" + symbolNSE + '\'' +
                ", symbolBSE='" + symbolBSE + '\'' +
                ", currentNSEPrice=" + String.format("%.2f", currentNSEPrice) +
                ", currentBSEPrice=" + String.format("%.2f", currentBSEPrice) +
                ", marketCap=" + String.format("%.2f", getMarketCap()) + // Call getter for calculated market cap
                ", sharePrice=" + String.format("%.2f", sharePrice) +
                ", priceOnIPO=" + String.format("%.2f", priceOnIPO) +
                ", outstandingShares=" + outstandingShares +
                ", revenue=" + String.format("%.2f", revenue) +
                ", profit=" + String.format("%.2f", profit) +
                ", lastMeetingDate=" + (lastMeetingDate != null ? lastMeetingDate : "N/A") +
                "}}"; // Add two closing braces
    }
}