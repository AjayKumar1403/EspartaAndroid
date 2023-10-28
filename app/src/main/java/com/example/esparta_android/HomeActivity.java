package com.example.esparta_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.espartaandro.R;

import io.paperdb.Paper;

public class HomeActivity extends AppCompatActivity {


    private Button logout_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        logout_btn = findViewById(R.id.logout_btn);


//        indianHistory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(HomeActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category","indianHistory");
//                startActivity(intent);
//            }
//        });
//
//
//        landScapeArt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(HomeActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "landScapeArt");
//                startActivity(intent);
//            }
//        });
//
//        stillArt.setOnClickListener(new View.OnClickListener() {
//            @Overridew
//            public void onClick(View view) {
//                Intent intent = new Intent(HomeActivity.this, AdminAddNewProductActivity.class);
//                intent.putExtra("category", "stillArt");
//                startActivity(intent);
//            }
//        });

//        logout_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Paper.book().destroy();
//                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });7
    }
}
