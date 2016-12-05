package com.example.android.quizitup;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    String message;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Bundle bundle = getIntent().getExtras();
        name = bundle.getString("name");
        message = bundle.getString("message");
        TextView textView = (TextView) findViewById(R.id.textView3);
        textView.setText(message);
        TextView textView1 = (TextView) findViewById(R.id.nameTV);
        String salutation;
        salutation = "Hi, " + name +"!! Thank You For Taking Our Quiz.\nThe following is your Result";
        textView1.setText(salutation);

    }

    public void GoToMain(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void SendAsEmail(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(intent.EXTRA_TEXT,message);
        intent.putExtra(Intent.EXTRA_SUBJECT, "My QuizItUp Result!!");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
