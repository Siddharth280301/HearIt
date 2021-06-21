package indus.toycathon.hearit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class ArActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView myWebView = new WebView(getApplicationContext());
        setContentView(myWebView);
        myWebView.loadUrl("https://modelviewertoyca.netlify.app/");
    }
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slidein_left,R.anim.slideout_right);
        finish();
    }
}