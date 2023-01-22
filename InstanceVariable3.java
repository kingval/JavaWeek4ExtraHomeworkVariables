package JavaWeek4ExtraHomeworkVariables;

public class InstanceVariable3 {

    String HeadTeacher;
    String Teachers;
    String Parents;
    String Students;

    public static void main(String[] args) {
        InstanceVariable3 ob1 = new InstanceVariable3();
        ob1.HeadTeacher = "The Head Teacher looks after the whole School including the Teachers, Other Staff & Students.";
        ob1.Teachers = "The Teachers look after the Students and their Education.";
        ob1.Parents = "The Parents look after the Students and ensure they are in school on time.";
        ob1.Students = "The Students ensure they learn and do their homework.";
        System.out.println("*************************************************************************************************************");
        System.out.println("                                 Hierarchy of the School");
        System.out.println("*************************************************************************************************************");
        System.out.println("Head Teacher: "+ob1.HeadTeacher+"\nTeachers & Staff: \""+ ob1.Teachers+"\nParents: \""+ ob1.Parents+"\nStudents: "+ob1.Students);

    }

}
