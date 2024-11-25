package Main;

import java.net.Socket;
import java.util.Scanner;

import Main.OOP_9.ClubPlayer;
import Main.OOP_9.ServicePlayerClubImp;



public class Main
{
    public static void main(String[] args) {
        
        ClubPlayer player = new ClubPlayer();
        player.setName("Shaha");
        player.setId(12);
        player.setAge(20);
       
        ServicePlayerClubImp serviceImp=new ServicePlayerClubImp();
        
         System.out.println("NamePublic : "+serviceImp.savePlayerPublic(player).getName());

        player.setName("abdo");
        player.setId(10);
        player.setAge(18);
        
        System.out.println();
        System.out.println("IdPrivate : "+serviceImp.savePlayerPrivate(player).getId());

    }

}
