package Main.OOP_7;

public class ServiceClubsImp implements ServiceClubs {
    //OOP_7
    @Override
    public void printClub(Club club) {
        club.setName("Shahd");
        club.setId(125);
        club.setNumber(125303);
        System.out.println("Club Information");
        System.out.println("Name : "+club.getName());
        System.out.println("ID : "+club.getId());
        System.out.println("Number : "+club.getNumber());
    }
        
            @Override
    public void printClubFc(ClubFc clubFc) {
        clubFc.setName("Abdo");
        clubFc.setId(126);
        clubFc.setNumber(11526);
        System.out.println("ClubFc Information");
        System.out.println("Name : "+clubFc.getName());
        System.out.println("ID : "+clubFc.getId());
        System.out.println("Number : "+clubFc.getNumber());
        
    }

    @Override
    public void printClubRel(ClubRel clubRel) {
       
        clubRel.setName("rabea");
        clubRel.setId(120);
        clubRel.setNumber(1020510);
        System.out.println("ClubRel Information");
        System.out.println("Name : "+clubRel.getName());
        System.out.println("ID : "+clubRel.getId());
        System.out.println("Number : "+clubRel.getNumber());
    }
    
}
