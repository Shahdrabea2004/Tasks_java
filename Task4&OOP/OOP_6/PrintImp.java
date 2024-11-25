package Main.OOP_6;

public class PrintImp implements Print {
    
    //OOP_6
    @Override
    public void Privateprint(Student student) {
       
        System.out.println("Private School");
        System.out.println("Id : "+student.getId()+" *** "+"Name : "+student.getName());

    }
    @Override
    public void Publicprint(Student student) {
        System.out.println("Public School");
        System.out.println("Id : "+student.getId()+" *** "+"Name : "+student.getName());

    }
}
