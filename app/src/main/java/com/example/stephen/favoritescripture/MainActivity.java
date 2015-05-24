package com.example.stephen.favoritescripture;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * Main Activity. Create three strings to add three things to an intent
 * The intent should have the inputted Book, Chapter, and Verse
 */
public class MainActivity extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "This is my EXTRA_MESSAGE";
    public final static String EXTRA_MESSAGE_TWO = "Something";
    public final static String EXTRA_MESSAGE_THREE = "Another thing";

    /**
     * onCreate. Left at default
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * onCreateOptionsMenu. Left at default.
     * @param menu
     * @return true
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * sendMessage
     * Take the three editTexts and send them to the next activity
     * via an intent
     * @param view
     */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText bookText = (EditText) findViewById(R.id.bookTextBox);
        EditText chapterText = (EditText) findViewById(R.id.chapterTextBox);
        EditText verseText = (EditText) findViewById(R.id.verseTextBox);

        String book = bookText.getText().toString();
        String chapter = chapterText.getText().toString();
        String verse = verseText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, book);
        intent.putExtra(EXTRA_MESSAGE_TWO, chapter);
        intent.putExtra(EXTRA_MESSAGE_THREE, verse);

        startActivity(intent);

    }
}
