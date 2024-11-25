package Main.OOP_10;

public class ServiceStudentBaseImp implements ServiceStudent {

    @Override
    public Student addStudent(Student student) {
            return student;
      
    }

    @Override
    public void showStudent(Student student) {
        System.out.println("ID : "+student.getId() + " *** " +"Name : "+ student.getName());
    }
    
}
