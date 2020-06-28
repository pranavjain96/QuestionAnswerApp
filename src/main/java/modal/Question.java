package modal;

public class Question {
    private String question;
    private Answer answer;
    private QuestionLikes questionLikes;

    public QuestionLikes getQuestionLikes() {
        return questionLikes;
    }

    public void setQuestionLikes(QuestionLikes questionLikes) {
        this.questionLikes = questionLikes;
    }


    public Question(){}

    public Question(String question, Answer answer) {
        this.question = question;
        this.answer = answer;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }


    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answer=" + answer +
                ", questionLikes=" + questionLikes +
                '}';
    }
}
