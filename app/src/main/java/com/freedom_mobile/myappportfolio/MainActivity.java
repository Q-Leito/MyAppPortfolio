package com.freedom_mobile.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClicked(View view) {
        int buttonId = view.getId();

        // Check which button was clicked
        switch (buttonId) {
            case R.id.spotifyStreamerLabel:
                Toast.makeText(MainActivity.this, "Launch spotify streamer!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.scoresAppLabel:
                Toast.makeText(MainActivity.this, "Launch scores app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.libraryAppLabel:
                Toast.makeText(MainActivity.this, "Launch library app!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.buildItBiggerLabel:
                Toast.makeText(MainActivity.this, "Launch build it bigger!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.xyzReaderLabel:
                Toast.makeText(MainActivity.this, "Launch xyz reader!",
                        Toast.LENGTH_LONG).show();
                break;
            case R.id.ownAppLabel:
                Toast.makeText(MainActivity.this, "Launch capstone app!",
                        Toast.LENGTH_LONG).show();
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
