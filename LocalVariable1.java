package JavaWeek4ExtraHomeworkVariables;

public class LocalVariable1 {

    /*Local Variable

A variable declared inside the body of the method is called local variable.
You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.
A local variable cannot be defined with "static" keyword.

     */

    public void VariableDiscussions(){
        int id = 0;
        id = id + 6;

        System.out.println("Employee ID: " + id);

    }

    public static void main(String[] args) {

        LocalVariable1 var = new LocalVariable1();
        var.VariableDiscussions();

    }


}
