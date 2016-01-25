/* #1
* example of JUnit testing using POJO class, Business logic class and a test class which will be run by test runner.
* This is a POJO class.
* EmployeeDetails class is used to
* get/set the value of employee's name.
* get/set the value of employee's monthly salary.
* get/set the value of employee's age.
 */


public class EmployeeDetails {

    private String name;
    private double monthlySalary;
    private int age;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the monthlySalary
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * @param monthlySalary the monthlySalary to set
     */
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}
