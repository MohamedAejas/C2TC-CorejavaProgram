
package Assignment2;

public class Commision {
    String name;
    String address;
    String phone;
    double sales_amount;

    public void acceptDetails(String name, String address, String phone, double sales_amount) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.sales_amount = sales_amount;
    }

    public void calculateCommission() {
        double commission;

        if (sales_amount >= 100000) {
            commission = 0.10 * sales_amount;
        } else if (sales_amount >= 50000) {
            commission = 0.05 * sales_amount;
        } else if (sales_amount >= 30000) {
            commission = 0.03 * sales_amount;
        } else {
            commission = 0;
        }

        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + sales_amount);
        System.out.println("Commission: " + commission);
    }
}