import modal.Answer;
import modal.Question;
import modal.SubTopic;
import modal.Topic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        String a="Apple";
        String b="Orange";
        String c="Banana";
        String question="Which fruit is round";
        List<String> options=new ArrayList<>();
        options.add(a);
        options.add(b);
        options.add(c);
        Answer ans=new Answer();
        ans.setAnswers(options);
        Question q=new Question(question,ans);
        Topic topic=new SubTopic("Fruits",q);
        System.out.print(topic);

    }
}
