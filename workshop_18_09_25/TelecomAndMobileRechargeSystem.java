import java.util.*;

abstract class Plan {
    final String mobileNumber;  // immutable
    static double networkTaxPercent = 10.0;  // static tax applied to all plans

    UsageDetails usageDetails;

    Plan(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.usageDetails = new UsageDetails();
    }

    // Abstract method for polymorphic billing calculation
    abstract double calculateBill();

    // Inner class for DataPack
    class DataPack {
        int dataInMB;

        DataPack(int dataInMB) {
            this.dataInMB = dataInMB;
        }

        void activate() {
            System.out.println(dataInMB + " MB Data Pack activated for " + mobileNumber);
        }
    }
}

// UsageDetails: Composition inside Plan
class UsageDetails {
    int callMinutes;
    int smsCount;
    int dataUsedMB;

    UsageDetails() {
        callMinutes = 0;
        smsCount = 0;
        dataUsedMB = 0;
    }

    void addCalls(int mins) { callMinutes += mins; }
    void addSms(int count) { smsCount += count; }
    void addData(int mb) { dataUsedMB += mb; }
}

// Rechargeable Interface
interface Rechargeable {
    void recharge(double amount);
    double checkBalance();
}

// PrepaidPlan subclass
class PrepaidPlan extends Plan implements Rechargeable {
    double balance;

    PrepaidPlan(String mobileNumber, double initialBalance) {
        super(mobileNumber);
        this.balance = initialBalance;
    }

    @Override
    public void recharge(double amount) {
        balance += amount;
        System.out.println("Prepaid Plan recharged with " + amount + ". Balance: " + balance);
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    double calculateBill() {
        double bill = usageDetails.callMinutes * 1 + usageDetails.smsCount * 0.5 + usageDetails.dataUsedMB * 0.1;
        bill += bill * (networkTaxPercent / 100);
        if (balance >= bill) {
            balance -= bill;
            System.out.println("Bill of " + bill + " deducted from prepaid balance. Remaining balance: " + balance);
            return bill;
        } else {
            System.out.println("Insufficient balance! Please recharge.");
            return 0;
        }
    }
}

// PostpaidPlan subclass
class PostpaidPlan extends Plan implements Rechargeable {
    double monthlyBill;

    PostpaidPlan(String mobileNumber) {
        super(mobileNumber);
        monthlyBill = 0;
    }

    @Override
    public void recharge(double amount) {
        monthlyBill -= amount;
        System.out.println("Postpaid Plan payment made: " + amount + ". Remaining bill: " + monthlyBill);
    }

    @Override
    public double checkBalance() {
        return monthlyBill;
    }

    @Override
    double calculateBill() {
        double bill = usageDetails.callMinutes * 1 + usageDetails.smsCount * 0.5 + usageDetails.dataUsedMB * 0.1;
        bill += bill * (networkTaxPercent / 100);
        monthlyBill += bill;
        System.out.println("Monthly bill updated by " + bill + ". Total bill: " + monthlyBill);
        return bill;
    }
}

// Customer class (Aggregation)
class Customer {
    String name;
    List<Plan> plans = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addPlan(Plan plan) {
        plans.add(plan);
    }

    List<Plan> getPlans() {
        return plans;
    }
}

// Billing System
class BillingSystem {
    static void generateMonthlyBill(Customer c) {
        System.out.println("\nGenerating monthly bill for customer: " + c.name);
        double totalBill = 0;
        for (Plan plan : c.getPlans()) {
            totalBill += plan.calculateBill();
        }
        System.out.println("Total monthly bill for " + c.name + ": " + totalBill + "\n");
    }
}

// Demo
public class TelecomAndMobileRechargeSystem {
    public static void main(String[] args) {
        Customer cust = new Customer("Alice");

        PrepaidPlan prepaid = new PrepaidPlan("1112223333", 500);
        PostpaidPlan postpaid = new PostpaidPlan("4445556666");

        cust.addPlan(prepaid);
        cust.addPlan(postpaid);

        // Add usage
        prepaid.usageDetails.addCalls(100);
        prepaid.usageDetails.addSms(50);
        prepaid.usageDetails.addData(300);

        postpaid.usageDetails.addCalls(200);
        postpaid.usageDetails.addSms(100);
        postpaid.usageDetails.addData(800);

        // Recharge prepaid plan
        prepaid.recharge(200);

        // Generate monthly bill for customer
        BillingSystem.generateMonthlyBill(cust);
    }
}
