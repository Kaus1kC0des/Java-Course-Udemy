import Inheritance.PubliclyTradedCompany;

public class InheritanceTutorial {
    public static void main(String[] args) {

        /*
        This PubliclyTradedCompany is a child / subclass of Company.
        So we can access the parent properties and it's methods.
         */

        PubliclyTradedCompany indusIndBank = new PubliclyTradedCompany(
                "IndusInd Bank", "Sumant Kathpalia", "Delhi", "Banking",
                "INDUSINDBK", "INDUSINDBK", 12.54, 100000000
        );
//      Own methods
        indusIndBank.setCurrentBSEPrice(835.0);
        indusIndBank.setSharePrice(835.00);
        indusIndBank.doAnnualShareHolderMeeting();
        System.out.println();
        indusIndBank.doShareSplit(3, 2);
        System.out.println();
        System.out.println(indusIndBank);

//        Parent Methods
        System.out.println(indusIndBank.getCeo());
        System.out.println(indusIndBank.getName());
    }
}
