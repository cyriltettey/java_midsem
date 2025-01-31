public class ElectricityBill {
    private int consumerNo;
    private String consumerName;
    private double previousReading;
    private double currentReading;
    private String connectionType;
    
    public ElectricityBill(int consumerNo, String consumerName, double previousReading, 
                          double currentReading, String connectionType) {
        this.consumerNo = consumerNo;
        this.consumerName = consumerName;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
        this.connectionType = connectionType.toLowerCase();
    }
    
    public double calculateBill() {
        double unitsConsumed = currentReading - previousReading;
        double billAmount = 0;
        
        if (connectionType.equals("domestic")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1;
            } else if (unitsConsumed <= 200) {
                billAmount = (100 * 1) + ((unitsConsumed - 100) * 2.50);
            } else if (unitsConsumed <= 500) {
                billAmount = (100 * 1) + (100 * 2.50) + ((unitsConsumed - 200) * 4);
            } else {
                billAmount = (100 * 1) + (100 * 2.50) + (300 * 4) + ((unitsConsumed - 500) * 6);
            }
        } else if (connectionType.equals("commercial")) {
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 2;
            } else if (unitsConsumed <= 200) {
                billAmount = (100 * 2) + ((unitsConsumed - 100) * 4.50);
            } else if (unitsConsumed <= 500) {
                billAmount = (100 * 2) + (100 * 4.50) + ((unitsConsumed - 200) * 6);
            } else {
                billAmount = (100 * 2) + (100 * 4.50) + (300 * 6) + ((unitsConsumed - 500) * 7);
            }
        }
        
        return billAmount;
    }
    
    public void printBill() {
        System.out.println("Electricity Bill");
        System.out.println("Consumer No: " + consumerNo);
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Connection Type: " + connectionType);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.println("Bill Amount: GHC " + calculateBill());
    }
    
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill(1001, "John Doe", 5000, 5600, "domestic");
        bill.printBill();
    }
}