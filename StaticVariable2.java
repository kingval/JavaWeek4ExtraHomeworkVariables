package JavaWeek4ExtraHomeworkVariables;

public class StaticVariable2 {

static int mySalary;
static String department;



    static void display(){
        System.out.println("I Work for the "+department+" Department");
        System.out.println("My Salary is: £"+mySalary);


    }

    public static void main(String[] args) {

    department = "QA";
    mySalary = 40000;
    display();
    department = "Sales";
    mySalary = 25000;
    display();

    }

}
