package Main.OOP_10;

public class ServiceStudentImp1 extends ServiceStudentBaseImp {
    @Override
    public Student addStudent(Student student) {
        System.out.println("Add student");
        return student;
    }
}
