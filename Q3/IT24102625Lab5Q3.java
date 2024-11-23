import java.util.Scanner;

public class IT24102625Lab5Q3 {
    public static void main(String[] args) 
       {
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10_PERCENT = 0.10;
        final double DISCOUNT_20_PERCENT = 0.20;

    
        Scanner scanner = new Scanner(System.in);

                
        System.out.println("Enter the start date (1-31):");
        int startDate = scanner.nextInt();
        
        System.out.println("Enter the end date (1-31):");
        int endDate = scanner.nextInt();
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
        } else if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date.");
        } else {
            int numberOfDays = endDate - startDate;
            double totalAmount = numberOfDays * ROOM_CHARGE;
            double discount = 0.0;
            
            if (numberOfDays >= 3 && numberOfDays <= 4) {
                discount = DISCOUNT_10_PERCENT;
            } else if (numberOfDays >= 5) {
                discount = DISCOUNT_20_PERCENT;
            }
            
            double finalAmount = totalAmount - (totalAmount * discount);
            System.out.println("Room charge Per Day: " + ROOM_CHARGE);
            System.out.println("Number of days reserved: " + numberOfDays);
            System.out.println("Total amount to be paid: " + finalAmount);
        }
        
        scanner.close();
    }
}