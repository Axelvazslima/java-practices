public class Employees {
    double salary, tax;
    String name, role;
    int id;

    public Employees (String name, int id, String role){
        this.role = role;
        this.name = name;
        this.id = id;
    }

    public void setSalary(){
        if (this.role.equalsIgnoreCase("software engineer")){
            this.salary = 10000.00F;
        } else if (this.role.equalsIgnoreCase("CEO")) {
            this.salary = 50000.00F;
        } else {
            this.salary = 2500.00F;
        }
    }

    public void setTax(){
        if (this.salary > 10000){
            this.tax = 20;
        } else {
            this.tax = 15;
        }
    }

    public double salaryAfterTax(){
        return this.salary - (this.tax/100 * this.salary);
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nID: %d\nSalary: %.2f\nTax: %.2f%%\nAfter Tax: %.2f", this.name, this.id, this.salary, this.tax, salaryAfterTax());
    }
}
