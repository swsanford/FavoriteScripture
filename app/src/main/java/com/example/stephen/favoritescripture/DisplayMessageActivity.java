package com.example.stephen.favoritescripture;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * DisplayMessageActivity
 * Take an intent, save it's contents to a string, and display it
 */
public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Get the message from the intent
        Intent intent = getIntent();
        String book = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String chapter = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_TWO);
        String verse = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_THREE);

        String scripture = book + " " + chapter + ":" + verse;

        //Create the text view
        TextView allView = new TextView(this);
        allView.setTextSize(40);
        allView.setText(scripture);

        setContentView(allView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
