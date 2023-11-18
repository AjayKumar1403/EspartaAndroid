package com.example.esparta_android;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.example.espartaandro.Adapters.ImageAdapter;
import com.example.espartaandro.Model.ImageData;

import io.paperdb.Paper;



public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Create an array of ImageData objects
        ImageData[] imageDatas = {
                new ImageData(R.drawable.art1, "Title 1", "Description 1"),
                new ImageData(R.drawable.art2, "Title 2", "Description 2"),
                // Add more objects as needed
        };

        recyclerView = findViewById(R.id.recyclerView);
        ImageAdapter imageAdapter = new ImageAdapter(imageDatas);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(imageAdapter);

        imageAdapter.setOnItemClickListener(new ImageAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                ImageData selectedImageData = imageDatas[position];

                Intent intent = new Intent(HomeActivity.this, ItemView.class);
                intent.putExtra("imageResource", selectedImageData.getImageResource());
                intent.putExtra("title", selectedImageData.getTitle());
                intent.putExtra("description", selectedImageData.getDescription());
                startActivity(intent);
            }
        });
    }
}
