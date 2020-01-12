package com.example.fortune;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //おみくじ画像を設定
        ImageView imageView = findViewById(R.id.image_view);
        imageView.setImageResource(R.drawable.omikuji);

        //MOVEボタン作成
        Button sendButton = findViewById(R.id.send_button);

        //MOVEボタンを押すと占い結果画面へ飛ぶ
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                Random rand = new Random();
                int RandomNum = rand.nextInt(5);
                intent.putExtra("keyword", RandomNum);
                startActivity(intent);
            }
        });
    }
}
