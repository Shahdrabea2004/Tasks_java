package Main;

import Main.OOP_7.Club;
import Main.OOP_7.ClubFc;
import Main.OOP_7.ClubRel;
import Main.OOP_7.ServiceClubsImp;

public class Main
{
    public static void main(String[] args) {
        //OOP_7
        ServiceClubsImp service=new ServiceClubsImp();
        ClubFc clubFc=new ClubFc();
        ClubRel clubRel=new ClubRel();
        Club club=new Club();
        service.printClub(club);
        System.out.println();
        service.printClubFc(clubFc); 
        System.out.println();
        service.printClubRel(clubRel);

    }
}
