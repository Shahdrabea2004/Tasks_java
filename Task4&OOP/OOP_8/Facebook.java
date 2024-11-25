package Main.OOP_8;

public class Facebook extends SocialMedia {
    //OOP_8
    public Facebook(String id, String text, String image)
    {
        super(id, text, image);
    }

    @Override
    public void postDetails() {

        Facebook facebook=new Facebook(id, text, image);
        facebook.setId("150");
        facebook.setImage("Cat");
        facebook.setText("I love My Cat");

        System.out.println("You are on application Facebook");
        System.out.println("Post ID: " + facebook.getId());
        System.out.println("Text: " + facebook.getText());
        System.out.println("Image: " + facebook.getImage());
        System.out.println();
      
    }
    
    
}
