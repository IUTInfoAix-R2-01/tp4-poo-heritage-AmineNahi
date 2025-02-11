package YAIP7;

public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public double getServiceDiscount(String membershipType) {
        switch (membershipType.toUpperCase()) {
            case "PREMIUM":
                return serviceDiscountPremium;
            case "GOLD":
                return serviceDiscountGold;
            case "SILVER":
                return serviceDiscountSilver;
            default:
                return 0; 
        }
    }

    public double getProductDiscount(String membershipType) {
        if (membershipType.equalsIgnoreCase("PREMIUM") || membershipType.equalsIgnoreCase("GOLD") || membershipType.equalsIgnoreCase("SILVER")) {
            return productDiscountPremium; 
        } 
        
        else {
            return 0; 
        }
    }
}
