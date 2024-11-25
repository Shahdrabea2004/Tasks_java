package Main.OOP_10;

public class ServiceStudentImp2 extends ServiceStudentImp1{

    @Override
    public void showStudent(Student student) {
        System.out.println("show student");
        System.out.println(student.getId() + "   " + student.getName());
    }
    
}
