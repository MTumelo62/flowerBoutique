package co.capenexis.flowerboutique;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView WebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView = (WebView) findViewById(R.id.web_view);
        WebSettings webSettings = WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        WebView.loadUrl("file:///android_asset/index.html");
        WebView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (WebView.canGoBack()) {
            WebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}