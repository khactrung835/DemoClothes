package com.example.democlothes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "oncreate: started");
        initImageBitmaps();
    }



    private void initImageBitmaps(){

        Log.d(TAG, "initImageBitmaps: preparing bitmap");
        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g4/36729/prof/s1242x600/foody-upload-api-foody-mobile-3-200515150314.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");


        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");

        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");
        
        mImageUrls.add("https://images.foody.vn/res/g86/855450/prof/s1242x600/foody-upload-api-foody-mobile-119626488-jpg-181130163617.jpg");
        mNames.add("yasai");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
