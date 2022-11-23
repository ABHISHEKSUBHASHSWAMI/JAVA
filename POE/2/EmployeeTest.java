
class Employee{
    String firstname;
    String lastname;
    double salary;
    
    
    void employee(String firstname, String lastname, double salary){
        this.firstname=firstname;
        this.lastname=lastname;
        if (salary>=0){
            this.salary=salary;
        }
        else{
            this.salary=0.0;
        }
    }
    //set first name method
    void setFirstName(String firstname){
        this.firstname=firstname;
    }
    //get first name method
    String getFirstName(){
        return firstname;
    }

    //set last name method
    void setLastName(String lastname){
        this.lastname=lastname;
    }
    
    //get last name method
    String getLastName(){
        return lastname;
    }

    //set monthly salary method
    void setSalary(double salary){
        if(salary>=0){
            this.salary=salary;
        }
        else{
            this.salary=0.0;
        }
    }

    //get salary method
    double getSalary(){
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args){

        Employee employee1= new Employee();
        Employee employee2= new Employee();

        employee1.setFirstName("Atharv");
        employee1.setLastName("Patil");
        employee1.setSalary(30000.50);

        employee2.setFirstName("Abhishek");
        employee2.setLastName("Swami");
        employee2.setSalary(33450.50);



        System.out.println("\n"+employee1.getFirstName()+" "+employee1.getLastName()+"'s Monthly salary is "+employee1.getSalary());
        System.out.println("\n"+employee2.getFirstName()+" "+employee2.getLastName()+"'s Monthly salary is "+employee2.getSalary());

        //increment salary by 10%

        employee1.setSalary(employee1.getSalary()*1.1);
        employee2.setSalary(employee2.getSalary()*1.1);

        //salary after 10% increment
        System.out.println("\nSalary after 10% increment");

        System.out.println("\n"+employee1.getFirstName()+" "+employee1.getLastName()+"'s Monthly salary is "+employee1.getSalary());
        System.out.println("\n"+employee2.getFirstName()+" "+employee2.getLastName()+"'s Monthly salary is "+employee2.getSalary());
        
        //yearly salary
        System.out.println("\n"+employee1.getFirstName()+" "+employee1.getLastName()+"'s Yearly salary is "+String.format("%.4f",employee1.getSalary()*12));
        System.out.println("\n"+employee2.getFirstName()+" "+employee2.getLastName()+"'s Yearly salary is "+String.format("%.4f",employee2.getSalary()*12)+"\n");
    }
}