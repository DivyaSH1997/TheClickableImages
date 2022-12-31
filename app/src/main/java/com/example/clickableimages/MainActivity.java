package com.example.clickableimages;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnGoa, btnManali, btnShillong, btnJodhpur;
    ImageView imageDisplay;


    int picsGoa[] = {R.drawable.gone, R.drawable.gtwo, R.drawable.gthree, R.drawable.gfour};
    int picsManali[] = {R.drawable.mone, R.drawable.mtwo, R.drawable.mthree, R.drawable.mfour};
    int picsShillong[] = {R.drawable.sone, R.drawable.stwo, R.drawable.sthree, R.drawable.sfour};
    int picsJodhpur[] = {R.drawable.jone, R.drawable.jtwo, R.drawable.jthree, R.drawable.jfour};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        initListeners();

    }
    public void initViews()
    {
        btnGoa = findViewById(R.id.btnGoa);
        btnManali = findViewById(R.id.btnManali);
        btnJodhpur = findViewById(R.id.btnJodhpur);
        btnShillong = findViewById(R.id.btnShillong);
        imageDisplay = findViewById(R.id.imageDisplay);
    }
    public void initListeners()
    {
        btnGoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("Its Goa!!");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Goa", picsGoa);
                startActivityForResult(intent, 1);


            }
        });

        btnShillong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("Its Shillong!!");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Shillong", picsShillong);
                startActivityForResult(intent, 1);

            }
        });

        btnManali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("Its Manali!!");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Manali", picsManali);
                startActivityForResult(intent, 1);

            }
        });

        btnJodhpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makeToast("Its Jodhpur!!");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Jodhpur", picsJodhpur);
                startActivityForResult(intent, 1);

            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle bundle = data.getExtras();

        int imageid = bundle.getInt("id");
        imageDisplay.setImageResource(imageid);

    }

    public String makeToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        return str;
    }
}


