package com.example.task1;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class DisplayQuoteActivity extends AppCompatActivity {
    TextView txt;
    Button sharebtn ;
    Button copyButton ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_quote);

        TextView quoteTextView = findViewById(R.id.quoteTextView);

        String quote = getIntent().getStringExtra("quote");

        quoteTextView.setText(quote);



       sharebtn = findViewById(R.id.shareButton);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareQuote(quote);
            }
        });

    }
    private void shareQuote(String quote) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, quote);
        startActivity(Intent.createChooser(shareIntent, "Share quote"));
    }
}