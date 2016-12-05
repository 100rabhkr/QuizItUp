package com.example.android.quizitup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizTv extends AppCompatActivity
{

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_tv);
        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("message");
    }

    public void scoreCalculatortv(View view) {
        int total = 0;
        int a1point = CheckAns1();
        int a2point = CheckAns2();
        int a3point = CheckAns3();
        int a4point = CheckAns4();
        total = total + a1point + a2point + a3point + a4point;
        String FMsg = "Quiz Name: " + getResources().getString(R.string.Option2) + "\nYour Score is: " + total + "\n\n\n\n";
        FMsg = FMsg + Chkmsg(a1point, a2point, a3point, a4point);
        Intent intent = new Intent(QuizTv.this, Final.class);
        intent.putExtra("message", FMsg);
        intent.putExtra("name", name);
        startActivity(intent);
    }

    public String Chkmsg(int a1,int a2,int a3,int a4){
        String message = "The incorrect Questions are :-\n\n";
        if(a1 !=1){
            message = message + getResources().getString(R.string.tvQ1) + "\n";
        }
        if(a2 !=1){
            message = message + getResources().getString(R.string.tvQ2) + "\n";
        }

        if(a3 !=1){
            message = message + getResources().getString(R.string.tvQ3)+"\n";
        }

        if(a4 !=1){
            message = message + getResources().getString(R.string.tvQ4)+"\n";
        }

        else if(a1==1 && a2==1 && a3==1 && a4==1) {
            message = message + "All Questions are correct";
        }

        return message;

    }

    public int CheckAns1()
    {
        int tva1score ;
        RadioGroup radioAns1Group = (RadioGroup) findViewById(R.id.tvAns1);
        int selectedAns1Id = radioAns1Group.getCheckedRadioButtonId();
        RadioButton radioAns1Button = (RadioButton) findViewById(selectedAns1Id);
        String CheckAns1 = radioAns1Button.getText().toString();
        String Correct = getResources().getString(R.string.tvA1);
        if(CheckAns1 == Correct){
            tva1score = 1;
        }
        else {
            tva1score = 0;
        }
        return tva1score;
    }

    public int CheckAns2(){
        int tva2score=0;
        RadioGroup radioAns2Group = (RadioGroup) findViewById(R.id.tvAns2);
        int selectedAns2Id = radioAns2Group.getCheckedRadioButtonId();
        RadioButton radioAns2Button = (RadioButton) findViewById(selectedAns2Id);
        String CheckAns2 = radioAns2Button.getText().toString();
        String Correct = getResources().getString(R.string.tvA2);
        if(CheckAns2 == Correct){
            tva2score = 1;
        }
        else {
            tva2score = 0;
        }
        return tva2score;
    }

    public int CheckAns3(){
        int tva3score=0;
        RadioGroup radioAns3Group = (RadioGroup) findViewById(R.id.tvAns3);
        int selectedAns3Id = radioAns3Group.getCheckedRadioButtonId();
        RadioButton radioAns2Button = (RadioButton) findViewById(selectedAns3Id);
        String CheckAns3 = radioAns2Button.getText().toString();
        String Correct = getResources().getString(R.string.tvA3);
        if(CheckAns3 == Correct){
            tva3score = 1;
        }
        else {
            tva3score = 0;
        }
        return tva3score;
    }

    public int CheckAns4(){
        int tva4score=0;
        RadioGroup radioAns4Group = (RadioGroup) findViewById(R.id.tvAns4);
        int selectedAns4Id = radioAns4Group.getCheckedRadioButtonId();
        RadioButton radioAns4Button = (RadioButton) findViewById(selectedAns4Id);
        String CheckAns4 = radioAns4Button.getText().toString();
        String Correct = getResources().getString(R.string.tvA4);
        if(CheckAns4 == Correct){
            tva4score = 1;
        }
        else {
            tva4score = 0;
        }
        return tva4score;
    }



}

