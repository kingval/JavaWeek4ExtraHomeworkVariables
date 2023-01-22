package JavaWeek4ExtraHomeworkVariables;

public class LocalVariable2 {

    public void VariableDiscussions(){
        int agePuppy = 0;
        agePuppy = agePuppy + 10*4;

        System.out.println("My Puppy's Age is: " + agePuppy + " in Dog years");

    }

    public static void main(String[] args) {

        LocalVariable2 var = new LocalVariable2();
        var.VariableDiscussions();

    }


}
