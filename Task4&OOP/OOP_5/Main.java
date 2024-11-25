public class Main
{
    public static void main(String[] args) {
        //OOP_5
        System.out.println("Person Information:");
        Person person =new Person();
        person.setName("shahd rabea");
        person.setId(15);
        System.out.println(person.getName());
        System.out.println(person.getId());

        System.out.println();
        System.out.println("Student Information:");
        Student5 student =new Student5();
        student.setName("Abdo");
        student.setId(12);
        student.setPhone("0101253546");
        student.setAge(18);
        System.out.println(student.getName());
        System.out.println(student.getId());
        System.out.println(student.getPhone());
        System.out.println(student.getAge());
        
        System.out.println();
        System.out.println("Player Information:");
        Player5 player =new Player5();
        player.setName("Abdo rabea");
        player.setId(12);
        player.setPhone("0101253546");
        player.setNumber(375);
        System.out.println(player.getName());
        System.out.println(player.getId());
        System.out.println(player.getPhone());
        System.out.println(player.getNumber());

    }
}
