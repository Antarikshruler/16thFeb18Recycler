package com.example.antariksh.a16thfeb18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        });

        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });


        TextView phrases = (TextView) findViewById(R.id.phrases);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Toast t=Toast.makeText(getApplicationContext(),"Phases",Toast.LENGTH_LONG);
                t.show();
            }
        });

    }

}
