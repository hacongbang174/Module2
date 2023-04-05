package facadeDesignPattern;

public class LinkedIn implements SocialShare {
    private String message;

    public LinkedIn() {
    }

    public LinkedIn(String message) {
        this.message = message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to LinkedIn: " + this.message);
    }
}
