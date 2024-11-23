public class Player {
    // OOP_2
    private int numberPlayer;
    private String namePlayer;
 
    public Player()
    {

    }
     
    public int getNumberPlayer() {
        if (numberPlayer > 0) {
            System.out.print("Number Plyer is : ");
            return numberPlayer;
        } else {
            System.out.print("Invalid Input : ");
            return 0;
        }
    }

    public void setNumberPlayer(int numberPlayer) {
        this.numberPlayer = numberPlayer;
    }

    public String getNamePlayer() {
        
        if (namePlayer.length() > 5) {
            System.out.print("Name Plyer is : ");
            return namePlayer;
        } else {
           
            return "Make sure that your name 5 characters";
        }
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

}
