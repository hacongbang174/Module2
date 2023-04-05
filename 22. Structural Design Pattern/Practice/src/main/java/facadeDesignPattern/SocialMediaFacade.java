package facadeDesignPattern;

public class SocialMediaFacade {
    private Facebook facebook;
    private Twitter twitter;
    private LinkedIn linkedIn;

    public SocialMediaFacade(Facebook facebook, Twitter twitter, LinkedIn linkedIn) {
        this.facebook = facebook;
        this.twitter = twitter;
        this.linkedIn = linkedIn;
    }
    public void share(String message) {
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.facebook.share();
    }
}
