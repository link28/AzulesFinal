package edu.itchii.plat2.azulesfinal;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class splash extends AppCompatActivity {
    ImageView img3;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_splash);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

        img3=(ImageView)findViewById(R.id.imgQ);

        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);

        mp = MediaPlayer.create(splash.this,R.raw.arranque);

        Thread miHilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Intent mainIntent = new Intent(splash.this,Principal.class);
                            splash.this.startActivity(mainIntent);
                            splash.this.finish();
                            Toast.makeText(getApplicationContext(),"Bienvenido",Toast.LENGTH_SHORT).show();
                        }
                    });
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        });

        Animation transparencia;
        transparencia = AnimationUtils.loadAnimation(splash .this, R.anim.transparentar);
        transparencia.reset();
        img3.startAnimation(transparencia);
        mp.start();
        miHilo.start();

    }
}
