package indus.toycathon.hearit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button arBtn = findViewById(R.id.arBtn);
        Button lensBtn = findViewById(R.id.lensBtn);

        // on AR button clicked
        arBtn.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "AR button clicked.", Toast.LENGTH_SHORT).show();
//            Intent intent1 = new Intent(view.getContext(),ArActivity.class);
//            startActivity(intent1);
//            overridePendingTransition( R.anim.slide_in_up, R.anim.slide_out_up );

            String url = "https://modelviewertoyca.netlify.app/";
            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            CustomTabsIntent customTabsIntent = builder.build();
            builder.setToolbarColor(ContextCompat.getColor(this,R.color.orange_accent_400));
            customTabsIntent.launchUrl(this, Uri.parse(url));
        });

        //on Lens button clicked
        lensBtn.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Lens button clicked.", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(view.getContext(), LensActivity.class);
            startActivity(intent2);
        });
    }
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slidein_left,R.anim.slideout_right);
        finish();
    }
}