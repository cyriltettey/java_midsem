class Employee {
    String empName, empId, address, mailId, mobileNo;
    double basicPay;

    Employee(String name, String id, String address, String mail, String mobile, double basicPay) {
        this.empName = name;
        this.empId = id;
        this.address = address;
        this.mailId = mail;
        this.mobileNo = mobile;
        this.basicPay = basicPay;
    }

    double calculateSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClub = 0.001 * basicPay;
        return basicPay + da + hra - pf - staffClub;
    }

    void displayPaySlip() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Net Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    Programmer(String name, String id, String address, String mail, String mobile, double basicPay) {
        super(name, id, address, mail, mobile, basicPay);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Programmer p = new Programmer("Alice", "P123", "Accra", "alice@mail.com", "1234567890", 5000);
        p.displayPaySlip();
    }
}
