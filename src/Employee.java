public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(short personId, String name, String phone, String email, String position, double salary){
        super(personId, name, phone, email);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "\nEmployee Name: " + super.getName() + "\nPosition: " + this.position + "\nSalary: " + this.salary + "\n";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}