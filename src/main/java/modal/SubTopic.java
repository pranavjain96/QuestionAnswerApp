package modal;

public class SubTopic extends Topic {
    private String name;
    private Question question;

    public SubTopic(String topicName, Question question) {
        this.name = topicName;
        this.question = question;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public Question getQuestion() {
        return question;
    }
    @Override
    public String toString() {
        return "SubTopic{" +
                "name='" + name + '\'' +
                ", question=" + question +
                '}';
    }
}
