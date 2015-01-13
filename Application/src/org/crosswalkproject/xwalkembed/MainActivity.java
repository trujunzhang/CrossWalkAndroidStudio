package org.crosswalkproject.xwalkembed;

import org.xwalk.core.XWalkView;

import android.app.Activity;
import android.os.Bundle;

import com.xwalk.androidstudio.R;

public class MainActivity extends Activity {
    private XWalkView mXWalkView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mXWalkView = (XWalkView) findViewById(R.id.activity_main);

        // this loads a file from the assets/ directory
        mXWalkView.load("file:///android_asset/www/index.html", null);
    }
}