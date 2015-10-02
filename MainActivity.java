package com.jesseearl.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button anwserYesButton, anwserNoButton;
    private EditText usersNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anwserYesButton = (Button) findViewById(R.id.anwser_yes);
        anwserNoButton = (Button) findViewById(R.id.anwser_no);
        usersNameEditText = (EditText) findViewById(R.id.users_name);


    }

    public void onYesButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());

        String yourYesResponse = "That's AWESOME" + usersName;

        Toast.makeText(this, yourYesResponse, Toast.LENGTH_SHORT).show();
    }

    public void onNoButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());

        String yourNoResponse = "Chear the fuck up" + usersName;

        Toast.makeText(this, yourNoResponse, Toast.LENGTH_SHORT).show();
    }
}
