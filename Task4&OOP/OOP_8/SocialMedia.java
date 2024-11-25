package Main.OOP_8;

abstract class SocialMedia {
  
    //OOP_8
    protected String id;
    protected String text;
    protected String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public SocialMedia(String id, String text, String image) {
        this.id = id;
        this.text = text;
        this.image = image;
    }

    public abstract void postDetails();


}
