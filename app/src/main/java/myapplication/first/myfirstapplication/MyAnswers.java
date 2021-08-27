package myapplication.first.myfirstapplication;

import android.widget.TextView;

import java.util.Random;



public class MyAnswers {

    public String[]mAnswers ={
            "Apple",
            "Oranges","Mango","Banana","Strawberry","Apricot"

    };

    //Methods which will be called to get all Answers


    public String getAnswer() {

        String answer ="";
        Random randomGenerator = new Random();//Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mAnswers.length);
        answer = mAnswers[randomNumber];
        return answer;

    }

    public TextView findViewById() {
        return null;
    }
}
