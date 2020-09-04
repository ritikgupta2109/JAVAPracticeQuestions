/* Create a class Employee, whose instance will represent following properties, first name, last name, salary, employee
id, employee experience, mobile number, email
 */

package datapack;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private int empId;
    private double experience;
    private long mobile;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return firstName + ", " + lastName + ", " + salary + ", " + empId + ", " + experience + ", " + mobile + ", " +
                email + " \n";
    }
}
