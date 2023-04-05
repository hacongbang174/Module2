package facadeDesignPattern;

public class Facebook implements SocialShare{
    private String message;

    public Facebook() {
    }

    public Facebook(String message) {
        this.message = message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Facebook: " + this.message);
    }
}
