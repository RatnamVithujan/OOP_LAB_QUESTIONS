package LAB5.Question1;

public class DeliveryChargeCalculator {
    
    private static final double distance_rate = 100.0 ;
    private static final double weight_charge = 50.0 ;
    private static final double express_charge = 500.0 ;
    
    public double calculateCharge(double baseCharge){
        return baseCharge;
    }
    
    public double calculateCharge(double baseCharge, double distanceKm){
        return baseCharge + (distanceKm*distance_rate);
    }
    
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg){
        return baseCharge + (distanceKm*distance_rate) + (weightKg*weight_charge);
    }
    
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery == true){
            return baseCharge + express_charge;
        }else{
            return baseCharge;
        }
    }
    
    
}
