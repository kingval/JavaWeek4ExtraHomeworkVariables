package JavaWeek4ExtraHomeworkVariables;

public class StaticVariable3 {

    static Boolean yourSex;
    static String Question;



    static void display(){
        System.out.println(Question);
        System.out.println("That is "+yourSex);


    }

    public static void main(String[] args) {

        Question = "Are you a Male? ";
        yourSex = Boolean.TRUE;
        display();
        Question = "Are you From the UK";
        yourSex = Boolean.FALSE;
        display();

    }

}
