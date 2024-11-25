package Main.OOP_8;

public class LinkedIn extends SocialMedia {
     //OOP_8
    public LinkedIn(String id, String text, String image)
    {
        super(id, text, image);
    }

    @Override
    public void postDetails() {
        LinkedIn linkedIn=new LinkedIn(id, text, image);
        linkedIn.setId("120");
        linkedIn.setImage("Dog");
        linkedIn.setText("I love My Dog");

        System.out.println("You are on application LinkedIn");
        System.out.println("Post ID: " + linkedIn.getId());
        System.out.println("Text: " + linkedIn.getText());
        System.out.println("Image: " + linkedIn.getText());
        System.out.println();
    }

    
    
}
