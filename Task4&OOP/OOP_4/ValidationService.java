public class ValidationService {

  public static boolean VaildatePlayer(PlayerInfo player)
  {
      if(player.getNumber()<=99 && player.getNumber()>0 && player.getId() > 0 )
      {
             return true;
      }
      return false;
  }
  public static boolean VaildateStudent(StudentInfo student)
  {
      if(student.getAge()>7 && student.getAge()<30 && student.getId() > 0 )
      {
             return true;
      }
      return false;
  }
    
}