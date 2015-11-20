package lol.owo.com.lol;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import lol.owo.com.lol.gaode.MainFrame;
import lol.owo.com.lol.net.TCPClient;


public class MainActivity extends Activity {
  private MainFrame mMainFrame;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                         WindowManager.LayoutParams.FLAG_FULLSCREEN);
    TextView tv = new TextView(this);
    tv.setText("Main");
    tv.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        TCPClient.start();
      }
    });
    mMainFrame = new MainFrame(this);
    mMainFrame.onCreate(savedInstanceState);
    LinearLayout contentView = new LinearLayout(this);
    {
      contentView.setOrientation(LinearLayout.VERTICAL);
      //contentView.addView(tv);
      contentView.addView(mMainFrame);
    }

    setContentView(contentView);
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    mMainFrame.onDestroy();
  }

  @Override
  protected void onPause() {
    super.onPause();
    mMainFrame.onPause();
  }

  @Override
  protected void onResume() {
    super.onResume();
    mMainFrame.onResume();
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    mMainFrame.onSaveInstanceState(outState);
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mMainFrame.onRestoreInstanceState(savedInstanceState);
  }
}
