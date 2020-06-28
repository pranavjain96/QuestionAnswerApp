package modal;

import java.util.ArrayList;
import java.util.List;

public class AnswerComments {
    private List<String> answerComments=new ArrayList<>();

    public List<String> getAnswerComments() {
        return answerComments;
    }

    public void setAnswerComments(List<String> answerComments) {
        this.answerComments = answerComments;
    }
    @Override
    public String toString() {
        return "AnswerComments{" +
                "answerComments=" + answerComments +
                '}';
    }
}
