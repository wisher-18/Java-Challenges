import java.util.*;
class WaterBill{
    public static double calculateWaterBill(double gallonsUsage){
        double minUsageBill = 18.84*81.76;
        double numberofGallonsInCCF = 748;
        double includedGallons = 2 * numberofGallonsInCCF;
        if(gallonsUsage < includedGallons){
            return minUsageBill;
        }else{
            double extraGallonsUsed = gallonsUsage - includedGallons;
            double extraChargeOwned = Math.ceil(extraGallonsUsed/numberofGallonsInCCF) * (3.9*81.76);
            return minUsageBill + extraChargeOwned;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the gallons usage to calculate the bill:");
        double usage = sc.nextDouble();
        System.out.println("Your bill is: Rs. "+calculateWaterBill(usage));

        
    }
}