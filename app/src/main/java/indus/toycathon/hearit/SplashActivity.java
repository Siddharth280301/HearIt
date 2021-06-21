package indus.toycathon.hearit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        ImageView img = (ImageView)findViewById(R.id.mandalaImg);
        Animation aniRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotation);
        img.startAnimation(aniRotate);

        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashActivity.this, IntroActivity.class);
            //Intent is used to switch from one activity to another.
            startActivity(i);
            //invoke the SecondActivity.
            finish();
            //the current activity will get finished.
        }, SPLASH_SCREEN_TIME_OUT);


    }
}