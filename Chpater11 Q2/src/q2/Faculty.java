/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q2;

    public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty() {
        super();
        this.officeHours = "";
        this.rank = "";
    }

    public Faculty(String name, String address, String phone, String email, String office, double salary, MyDate dateHired,
String officeHours, String rank) {
        super(name, address, phone, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty: name = " + getName() + ", address = " + getAddress() +
               ", phone = " + getPhone() + ", email = " + getEmail() +
               ", office = " + office + ", salary = " + salary + ", dateHired = " + dateHired +
               ", officeHours = " + officeHours + ", rank = " + rank;
    }
 }
