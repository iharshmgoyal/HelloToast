package com.example.android.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    public static final String EXTRA_COUNT =
            "com.example.android.hellotoast.extra.COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count_second);
    }

    public void secondActivityCount(View view) {
        Intent intent = new Intent(this,
                SecondActivity.class);
        String count = mShowCount.getText().toString();
        intent.putExtra(EXTRA_COUNT, count);
        startActivity(intent);
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}