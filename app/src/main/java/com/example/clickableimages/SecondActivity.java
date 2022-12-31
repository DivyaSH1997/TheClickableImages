package com.example.clickableimages;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    ImageView imgA, imgB, imgC, imgD;
    int imgArray[];
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initViews();
        getDetails();
        initListeners();

    }
    public void initViews()
    {
        imgA = findViewById(R.id.imgA);
        imgB = findViewById(R.id.imgB);
        imgC = findViewById(R.id.imgC);
        imgD = findViewById(R.id.imgD);
    }
    public void getDetails()
    {
        Intent forward = getIntent();
        Bundle bundle = forward.getExtras();
        for (String key : bundle.keySet()) {
            str = key;

        }

        if (str.equals("Goa")) {
            imgArray = bundle.getIntArray("Goa");
            imgA.setImageResource(imgArray[0]);
            imgB.setImageResource(imgArray[1]);
            imgC.setImageResource(imgArray[2]);
            imgD.setImageResource(imgArray[3]);
        } else if (str.equals("Manali")) {
            imgArray = bundle.getIntArray("Manali");
            imgA.setImageResource(imgArray[0]);
            imgB.setImageResource(imgArray[1]);
            imgC.setImageResource(imgArray[2]);
            imgD.setImageResource(imgArray[3]);
        } else if (str.equals("Jodhpur") ){
            imgArray = bundle.getIntArray("Jodhpur");
            imgA.setImageResource(imgArray[0]);
            imgB.setImageResource(imgArray[1]);
            imgC.setImageResource(imgArray[2]);
            imgD.setImageResource(imgArray[3]);
        } else if (str.equals("Shillong")) {

            imgArray = bundle.getIntArray("Shillong");
            imgA.setImageResource(imgArray[0]);
            imgB.setImageResource(imgArray[1]);
            imgC.setImageResource(imgArray[2]);
            imgD.setImageResource(imgArray[3]);
        }
    }
    public void initListeners()
    {

        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent backward=new Intent();
                backward.putExtra("id",imgArray[0]);

                setResult(1,backward);
                finish();
            }
        });
        imgB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backward=new Intent();
                backward.putExtra("id",imgArray[1]);

                setResult(1,backward);
                finish();
            }
        });
        imgC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent backward=new Intent();
                backward.putExtra("id",imgArray[2]);

                setResult(1,backward);
                finish();
            }
        });
        imgD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent backward = new Intent();
                backward.putExtra("id",imgArray[3]);

                setResult(1, backward);
                finish();
            }
        });
    }


    }







