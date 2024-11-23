//OOP_1
public class Student_Information {

    private int idStudent;
    private String nameStudent;
    private int ageStudent;
    public Student_Information()
    {

    }
    public int getIdStudent() {
        System.out.print("ID : ");
        return idStudent;
    }
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }
    
    public String getNameStudent() {
        System.out.print("Name : ");
        return nameStudent;
    }
    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }
   
    
    public int getAgeStudent() {
        System.out.print("Age : ");
        return ageStudent;
    }
    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

}