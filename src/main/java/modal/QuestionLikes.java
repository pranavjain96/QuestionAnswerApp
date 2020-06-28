package modal;

public class QuestionLikes {
    private int likes;
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    @Override
    public String toString() {
        return "QuestionLikes{" +
                "likes=" + likes +
                '}';
    }
}
