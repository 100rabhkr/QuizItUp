package com.example.android.quizitup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizIndia extends AppCompatActivity {
String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_india);
        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("message");
    }
    public void scoreCalculator(View view) {
        int total = 0;
        int a1point = CheckAns1();
        int a2point = CheckAns2();
        int a3point = CheckAns3();
        int a4point = CheckAns4();
        total = total + a1point + a2point + a3point + a4point;
        String FMsg = "Quiz Name: " + getResources().getString(R.string.Option1)+ "\nYour Score is: " + total + "\n\n\n\n" + Chkmsg(a1point,a2point,a3point,a4point);
        //TextView textView = (TextView) findViewById(R.id.test);
        //textView.setText(FMsg);
        Intent intent = new Intent(QuizIndia.this, Final.class);
        intent.putExtra("message", FMsg);
        intent.putExtra("name",name);
        startActivity(intent);
        //FMsg = "Your Total Score is: " + total;
        // Toast.makeText(getApplicationContext(), FMsg, Toast.LENGTH_SHORT).show();

    }

    public String Chkmsg(int a1,int a2,int a3,int a4){
        String message = "The incorrect Questions are :-\n\n";
        if(a1 !=1){
            message = message + getResources().getString(R.string.indQ1) + "\n";
        }
        if(a2 !=1){
            message = message + getResources().getString(R.string.indQ2) + "\n";
        }

        if(a3 !=1){
            message = message + getResources().getString(R.string.indQ3)+"\n";
        }

        if(a4 !=1){
            message = message + getResources().getString(R.string.indQ4)+"\n";
        }

        else if(a1==1 && a2==1 && a3==1 && a4==1) {
            message = message + "All Questions are correct";
        }

        return message;

    }

    public int CheckAns1(){
        int a1score=0;
        RadioGroup radioAns1Group = (RadioGroup) findViewById(R.id.Ans1);
        int selectedAns1Id = radioAns1Group.getCheckedRadioButtonId();
        //String checking = ""+selectedAns1Id;
        RadioButton radioAns1Button = (RadioButton) findViewById(selectedAns1Id);
        String CheckAns1 = radioAns1Button.getText().toString();
        String Correct = getResources().getString(R.string.indA1);
        if (CheckAns1 == Correct){
            a1score = 1;
        }
        else {
            a1score = 0;
        }
        return a1score;
    }


    public int CheckAns2(){
        int a2score=0;
        RadioGroup radioAns2Group = (RadioGroup) findViewById(R.id.Ans2);
        int selectedAns2Id = radioAns2Group.getCheckedRadioButtonId();
        //String checking = ""+selectedAns1Id;
        RadioButton radioAns1Button = (RadioButton) findViewById(selectedAns2Id);
        String CheckAns2 = radioAns1Button.getText().toString();
        String Correct = getResources().getString(R.string.indA2);
        if (CheckAns2 == Correct){
            a2score = 1;
        }
        else {
            a2score = 0;
        }
        return a2score;
    }


    public int CheckAns3(){
        int a3score=0;
        RadioGroup radioAns3Group = (RadioGroup) findViewById(R.id.Ans3);
        int selectedAns3Id = radioAns3Group.getCheckedRadioButtonId();
        //String checking = ""+selectedAns1Id;
        RadioButton radioAns3Button = (RadioButton) findViewById(selectedAns3Id);
        String CheckAns3 = radioAns3Button.getText().toString();
        String Correct = getResources().getString(R.string.indA3);
        if (CheckAns3 == Correct){
            a3score = 1;
        }
        else {
            a3score = 0;
        }
        return a3score;
    }

    public int CheckAns4(){
        int a4score=0;
        RadioGroup radioAns4Group = (RadioGroup) findViewById(R.id.Ans4);
        int selectedAns4Id = radioAns4Group.getCheckedRadioButtonId();
        //String checking = ""+selectedAns1Id;
        RadioButton radioAns4Button = (RadioButton) findViewById(selectedAns4Id);
        String CheckAns4 = radioAns4Button.getText().toString();
        String Correct = getResources().getString(R.string.indA4);
        if (CheckAns4 == Correct){
            a4score = 1;
        }
        else {
            a4score = 0;
        }
        return a4score;
    }
}


