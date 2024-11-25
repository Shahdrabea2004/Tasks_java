public class PrintInfoImp implements PrintInfo {
     
     //OOP_4
     @Override
     public void printStudent(StudentInfo student) {

          
          if (ValidationService.VaildateStudent(student)) {
               System.out.println("The Sudent Information Is:");
               System.out.println("Name : " + student.getName());
               System.out.println("ID: " + student.getId());
               System.out.println("Age : " + student.getAge());
          } else {
               System.out.println("invalid Input");
          }
     }

     @Override
     public void printPlayer(PlayerInfo player) {
          if (ValidationService.VaildatePlayer(player)) {
               System.out.println("The Player Information Is:");
               System.out.println("Name : " + player.getName());
               System.out.println("ID: " + player.getId());
               System.out.println("Number : " + player.getNumber());
          } else {
               System.out.println("invalid Input");
          }
     }
}
