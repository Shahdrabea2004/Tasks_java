package Main;

import Main.OOP_10.ServiceStudent;
import Main.OOP_10.ServiceStudentBaseImp;
import Main.OOP_10.ServiceStudentImp1;
import Main.OOP_10.ServiceStudentImp2;
import Main.OOP_10.Student;


public class Main
{
    public static void main(String[] args) {
        
        Student student = new Student();
        student.setId(1);
        student.setName("student One");

        ServiceStudent serviceStudent=new ServiceStudentImp1();
        System.out.println(serviceStudent.addStudent(student).getName());
        serviceStudent.showStudent(student);

       
        System.out.println("--------------");
        ServiceStudent serviceStudent2=new ServiceStudentImp2();
        System.out.println(serviceStudent2.addStudent(student).getName());
        serviceStudent2.showStudent(student);




    }

}
