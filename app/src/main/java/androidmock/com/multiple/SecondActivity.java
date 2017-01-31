package androidmock.com.multiple;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by kotha on 22-Jan-17.
 */

public class SecondActivity extends Activity {
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button play = (Button) findViewById(R.id.button1);
        Button pause = (Button) findViewById(R.id.button2);
        Button stop = (Button) findViewById(R.id.button3);
        Intent j=getIntent();
        String name=j.getStringExtra("NAME");

        if(name.equals("0")) {
            final MediaPlayer mp = MediaPlayer.create(SecondActivity.this, R.raw.nenu_local);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.start();
                }
            });

            pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.pause();
                }
            });

            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.stop();
                    SecondActivity.this.finish();
                }
            });
        }

        if(name.equals("1")) {
            final MediaPlayer mp1 = MediaPlayer.create(SecondActivity.this, R.raw.khiladi);
            play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp1.start();
                }
            });

            pause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp1.pause();
                }
            });

            stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp1.stop();
                    SecondActivity.this.finish();
                }
            });
        }

        if(name.equals("2"))
           {
              final MediaPlayer mp2 = MediaPlayer.create(SecondActivity.this, R.raw.nani);
               play.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       mp2.start();
                   }
               });

               pause.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       mp2.pause();
                   }
               });

               stop.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       mp2.stop();
                       SecondActivity.this.finish();
                   }
               });
           }



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Second Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

