package Main;

import Main.OOP_6.PrintImp;
import Main.OOP_6.Student;

public class Main
{
    public static void main(String[] args) {
        //OOP_6
        Student student =new Student();
        student.setName("Shahd");
        student.setId(12);
        PrintImp print=new PrintImp();
        print.Privateprint(student);
        print.Publicprint(student);



       

    }
}
