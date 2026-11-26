package com.redking.app;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);
        layout.setBackgroundColor(Color.BLACK);

        TextView title = new TextView(this);
        title.setText("RED KING V2");
        title.setTextSize(32);
        title.setTextColor(Color.RED);
        title.setGravity(Gravity.CENTER);

        TextView status = new TextView(this);
        status.setText("ระบบพร้อมใช้งาน");
        status.setTextSize(18);
        status.setTextColor(Color.GREEN);
        status.setPadding(0, 24, 0, 24);

        Button start = new Button(this);
        start.setText("เปิด FREE FIRE MAX");
        start.setTextColor(Color.WHITE);
        start.setBackgroundColor(Color.RED);

        start.setOnClickListener(v -> {
            try {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setPackage("com.dts.freefiremax");
                startActivity(intent);
            } catch (Exception e) {
                Toast.makeText(this,
                    "ไม่สามารถเปิดเกมได้",
                    Toast.LENGTH_LONG).show();
            }
        });

        layout.addView(title);
        layout.addView(status);
        layout.addView(start);

        setContentView(layout);
    }
}
