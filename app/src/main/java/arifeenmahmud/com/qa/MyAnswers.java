package arifeenmahmud.com.qa;


import java.util.Random;



public class MyAnswers {

    public String[]mAnswers ={
            "Apple","Oranges","Mango","Banana","Strawberry",
            "Apricot", "Malta","Strawberry", "Guava"

    };

    //Methods which will be called to get all Answers


    public String getAnswer() {

        String answer;
        Random randomGenerator = new Random();//Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mAnswers.length);
        answer = mAnswers[randomNumber];
        return answer;

    }
}
