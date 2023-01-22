package JavaWeek4ExtraHomeworkVariables;

public class InstanceVariable1 {

    /*
Instance Variable
A variable declared inside the class but outside the body of the method, is called an instance variable.
It is not declared as static.
It is called an instance variable because its value is instance-specific and is not shared among instances.

     */

    int Samsung;
    int LG;
    int Sony;

    public static void main(String[] args) {
        InstanceVariable1 ob1 = new InstanceVariable1();
        ob1.Samsung = 600;
        ob1.LG = 700;
        ob1.Sony = 800;
        System.out.println("Price of the latest TV's are:");
        System.out.println("Samsung Price is: "+ob1.Samsung+"\nLG Price is: \""+ ob1.LG+"\nSony Price is: \""+ ob1.Sony);

/*
Price of the latest TV's are:
Samsung Price is: 600
LG Price is: "700
Sony Price is: "800

*/

    }

}
