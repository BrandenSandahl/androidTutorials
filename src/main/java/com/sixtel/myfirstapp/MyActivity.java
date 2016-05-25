package com.sixtel.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.sixtel.myfirstapp.MESSAGE";  //this is being done to ensure a unique key in case this app tlaks to other apps

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class); //this is what is used to start another activity
        EditText editText = (EditText) findViewById(R.id.edit_message); //get the input
        String message = editText.getText().toString(); //save contents of input into a var
        intent.putExtra(EXTRA_MESSAGE, message); //put the contents into the intent (intents can hold key,val)
        startActivity(intent); //fire the intent
    }
}
