package indus.toycathon.hearit;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

public class ArActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        WebView myWebView = new WebView(getApplicationContext());
//        setContentView(myWebView);

//        WebView browser = (WebView) findViewById(R.id.webView1);
//        browser.getSettings().setLoadWithOverviewMode(true);
//        browser.getSettings().setUseWideViewPort(true);
//        browser.getSettings().setJavaScriptEnabled(true);
//        browser.loadUrl("https://modelviewertoyca.netlify.app/");

//        String url = "https://modelviewertoyca.netlify.app/";
//        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
//        CustomTabsIntent customTabsIntent = builder.build();
//        customTabsIntent.launchUrl(this, Uri.parse(url));
    }
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slidein_left,R.anim.slideout_right);
        finish();
    }
}