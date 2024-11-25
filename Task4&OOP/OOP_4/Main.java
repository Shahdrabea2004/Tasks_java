public class Main
{
    public static void main(String[] args) {
        //OOP_4
        PlayerInfo player =new PlayerInfo();
        player.setId(12);
        player.setName("Mo Salah");
        player.setNumber(11);
 
        StudentInfo student =new StudentInfo();
        student.setId(10);
        student.setName("Shahd Rabea");
        student.setAge(20);

        PrintInfoImp printInformation=new PrintInfoImp();
        printInformation.printPlayer(player);
        System.out.println();
        printInformation.printStudent(student);
        
    }
}
