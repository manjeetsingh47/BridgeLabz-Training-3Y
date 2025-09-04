package Constructor.level_1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    public CarRental() {
        this.customerName = "";
        this.carModel = "";
        this.rentalDays = 0;
        this.dailyRate = 0.0;
    }

    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}

