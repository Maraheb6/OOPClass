public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee emp=new Employee("Maraheb","4419MA",2000);
        System.out.println("Annual Salary:" +emp.getAnnualSalary());
        System.out.println("The Salary has been Raised:" +emp.raisedSalary(10));
        System.out.println(emp.toString());

    }
}