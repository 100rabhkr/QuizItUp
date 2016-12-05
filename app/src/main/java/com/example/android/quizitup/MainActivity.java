package com.example.android.quizitup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    String ChkName ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getname();


    }

    /*public void getname(){
        Bundle bundle = getIntent().getExtras();
        ChkName = bundle.getString("message");
        if (ChkName != null){
            EditText text = (EditText) findViewById(R.id.editText);
            text.setText(ChkName);
        }
        else {
            return;
        }
    }*/

    public void StartActivity(View v) {
        String messagename;
        EditText editText = (EditText) findViewById(R.id.editText);
        messagename = editText.getText().toString();
        Spinner activity = (Spinner) findViewById(R.id.spinner);
        String Text = activity.getSelectedItem().toString();
        //Toast.makeText(getApplicationContext(),Text,Toast.LENGTH_SHORT).show();
        String ind = getResources().getString(R.string.Option1);
        String tv = getResources().getString(R.string.Option2);
        if (Text == ind) {
            //Toast.makeText(getApplicationContext(), messagename, Toast.LENGTH_SHORT).show();
            //Toast.makeText(getApplicationContext(),"la",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), QuizIndia.class);
            intent.putExtra("message", messagename);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(getApplicationContext(), QuizTv.class);
            intent.putExtra("message", messagename);
            startActivity(intent);
        }
    }
}
