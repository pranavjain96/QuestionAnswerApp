package modal;

public class AnswerLikes implements Likes {
    private int likes;
    @Override
    public int getLikes() {
        return likes;
    }
    @Override
    public void setLikes(int likes) {
        this.likes=likes;
    }
}
