package com.freedom_mobile.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mSpotifyStreamerButton;
    private Button mScoresAppButton;
    private Button mLibraryAppButton;
    private Button mBuildItBiggerButton;
    private Button mXYZReaderButton;
    private Button mOwnAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtons();
    }

    private void setupButtons() {
        mSpotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerLabel);
        mScoresAppButton = (Button) findViewById(R.id.scoresAppLabel);
        mLibraryAppButton = (Button) findViewById(R.id.libraryAppLabel);
        mBuildItBiggerButton = (Button) findViewById(R.id.buildItBiggerLabel);
        mXYZReaderButton = (Button) findViewById(R.id.xyzReaderLabel);
        mOwnAppButton = (Button) findViewById(R.id.ownAppLabel);

        mSpotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Launch spotify streamer!", Toast.LENGTH_LONG).show();
            }
        });

        mScoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Launch scores app!", Toast.LENGTH_LONG).show();
            }
        });

        mLibraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Launch library app!", Toast.LENGTH_LONG).show();
            }
        });

        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Launch build it bigger!", Toast.LENGTH_LONG).show();
            }
        });

        mXYZReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Launch xyz reader!", Toast.LENGTH_LONG).show();
            }
        });

        mOwnAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Launch capstone app!", Toast.LENGTH_LONG).show();
            }
        });
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
