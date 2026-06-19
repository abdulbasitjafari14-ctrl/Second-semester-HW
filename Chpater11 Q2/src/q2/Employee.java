package q2;

public class Employee extends Person {
    String office;
    double salary;
    MyDate dateHired;

    public Employee() {
        super();
        this.office = "";
        this.salary = 0.0;
        this.dateHired = new MyDate();
    }

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate dateHired)
{
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee: name = " + getName() + ", address = " + getAddress() +
               ", phone = " + getPhone() + ", email = " + getEmail() +
               ", office = " + office + ", salary = " + salary + ", dateHired = " + dateHired;
    }
}