package modal;
import java.util.List;

public class Answer {
    private List<String> answers;
    private AnswerComments answerComments;
    private AnswerLikes answerLikes;
    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public AnswerComments getAnswerComments() {
        return answerComments;
    }

    public void setAnswerComments(AnswerComments answerComments) {
        this.answerComments = answerComments;
    }

    public AnswerLikes getAnswerLikes() {
        return answerLikes;
    }

    public void setAnswerLikes(AnswerLikes answerLikes) {
        this.answerLikes = answerLikes;
    }
    @Override
    public String toString() {
        return "Answer{" +
                "answers=" + answers +
                ", answerComments=" + answerComments +
                ", answerLikes=" + answerLikes +
                '}';
    }
}
