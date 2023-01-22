package JavaWeek4ExtraHomeworkVariables;

public class InstanceVariable2 {

    int ageChetan;
    int ageAarav;
    float ageArnav;



    public static void main(String[] args) {

        InstanceVariable2 obj1 = new InstanceVariable2();
        obj1.ageChetan = 33;
        obj1.ageAarav = 5;
        obj1.ageArnav = 0.11f;
        System.out.println("Age of Chetan, Aarav & Arnav are:");
        System.out.println("Chetan: "+obj1.ageChetan+" Years Old\nAarav: "+obj1.ageAarav+" Years Old\nArnav: "+ obj1.ageArnav+" Months Old");
    }
}
