package JavaWeek4ExtraHomeworkVariables;

public class StaticVariable1 {

    /*Static Variable
A variable that is declared as static is called a static variable. It cannot be local.
You can create a single copy of the static variable and share it among all the instances of the class.
Memory allocation for static variables happens only once when the class is loaded in the memory.
     */

static int age;
static String name;


    static void display(){
        System.out.println(" Age is: "+age);
        System.out.println(" Name is: "+name);
    }

    public static void main(String[] args) {

    age = 18;
    name = "Chetan";
    display();

        age = 18;
        name = "Nidhi";
        display();

    }

}
