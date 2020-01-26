package com.example.fortune;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    Fortune fortune = new Fortune();
    // drawableに画像を入れる
    private static final int[] photos = {
            R.drawable.great_good,
            R.drawable.middle_good,
            R.drawable.lesser_good,
            R.drawable.not_so_good,
            R.drawable.great_bad
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = getIntent();
        int value = intent.getIntExtra("keyword", 0);

        TextView textView_title = findViewById(R.id.text_view_title);
        TextView textView_content = findViewById(R.id.text_view_content);

        //おみくじ結果の画像出力
        ImageView imageView = findViewById(R.id.image_view);
        imageView.setImageResource(photos[value]);

        // テキストを設定して表示
        textView_title.setText(fortune.fortuneList(value));
        textView_content.setText(fortune.fortuneListContent(value));

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
