package modal;

public abstract class Topic {

    private String name;
    private Question question;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public Question getQuestion() {
        return question;
    }
    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                ", question=" + question +
                '}';
    }
}

