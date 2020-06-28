package modal;

public class QuestionMapping {
    private Company company;
    private Question question;
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
    @Override
    public String toString() {
        return "QuestionMapping{" +
                "company=" + company +
                ", question=" + question +
                '}';
    }
}
