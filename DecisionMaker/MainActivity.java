package com.example.decisionmaker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Initializes the decision maker button as well as the decision text
    Button decisionMaker;
    TextView decision;
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assigns a variable name to the button created
        decisionMaker = (Button)findViewById(R.id.button);
        //Assigns a variable name to the decision text
        decision = (TextView)findViewById(R.id.textView2);

        //Calls the onClick function when the button is pressed
        decisionMaker.setOnClickListener(this);
    }

    //This function is called when the button is clicked
    @Override
    public void onClick(View view) {
        if(view.getId() ==R.id.button){
            //Initializes the random choice
            int choice = random.nextInt(2);

            //Determines which statement to print based off of the generated number
            if (choice == 1) {
                decision.setText("DO THE THING!");
            }
            else{
                if (choice == 0) {
                    decision.setText("DON'T DO THE THING!");
                }
            }
        }
    }
}
