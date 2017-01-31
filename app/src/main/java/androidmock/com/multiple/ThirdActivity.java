package androidmock.com.multiple;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by kotha on 22-Jan-17.
 */

public class ThirdActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        Button play= (Button)findViewById(R.id.button1);
        Button pause=(Button) findViewById(R.id.button2);
        Button stop=(Button) findViewById(R.id.button3);

        final MediaPlayer mp=MediaPlayer.create(ThirdActivity.this,R.raw.nenu_local);
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
                ThirdActivity.this.finish();
            }
        });
    }
}
