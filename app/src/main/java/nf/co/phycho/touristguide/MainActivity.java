package nf.co.phycho.touristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.v("at run", "nf.co.phycho.touristguide");
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                Log.v("intent created", "nf.co.phycho.touristguide");
                startActivity(i);
                finish();
                Log.v("activity started", "nf.co.phycho.touristguide");

            }
        }, 300);
    }

    @Override
    public void onBackPressed() {

    }
}


