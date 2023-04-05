package facadeDesignPattern;

public class Twitter implements SocialShare{
    private String message;

    public Twitter() {
    }

    public Twitter(String message) {
        this.message = message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Twitter: " + this.message);
    }
}
