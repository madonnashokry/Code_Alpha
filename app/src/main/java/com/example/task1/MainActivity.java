package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import java.util.Random;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button generatebtn ;
    String[] quoteArray = new String[] {
            "The best way to predict the future is to create it. - Peter Drucker",
            "Strive not to be a success, but rather to be of value. - Albert Einstein",
            "The only person you should try to be better than is the person you were yesterday. - Anonymous",
            "Success is stumbling from failure to failure with no loss of enthusiasm. - Winston Churchill",
            "You miss 100% of the shots you don't take. - Wayne Gretzky",
            "The greatest glory in living lies not in never falling, but in rising every time we fall. - Nelson Mandela",
            "In the midst of chaos, there is also opportunity. - Sun Tzu",
            "The only way to do great work is to love what you do. - Steve Jobs",
            "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel. - Maya Angelou",
            "It does not matter how slowly you go as long as you do not stop. - Confucius",
            "The only limit to our realization of tomorrow will be our doubts of today. - Franklin D. Roosevelt",
            "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
            "Nothing in life is to be feared, it is only to be understood. Now is the time to understand more, so that we may fear less. - Marie Curie"
    };


    private void generateQuote() {
        Random generator = new Random();
        int randomQuote = generator.nextInt(quoteArray.length);
        String quote = quoteArray[randomQuote];

        Intent intent = new Intent(MainActivity.this, DisplayQuoteActivity.class);
        intent.putExtra("quote", quote);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.welcome_to_);
        generatebtn=(Button) findViewById(R.id.getstart);
        generatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
               generateQuote();
            }
        });
}
}