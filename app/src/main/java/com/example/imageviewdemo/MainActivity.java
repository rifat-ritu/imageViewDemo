package com.example.imageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView1,imageView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = (ImageView) findViewById(R.id.image1Id);
        imageView2 = (ImageView) findViewById(R.id.image2Id);


        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId()==R.id.image1Id){

            Toast.makeText(MainActivity.this," Single Woman Image. ",Toast.LENGTH_SHORT).show();

        }
        else if (v.getId()==R.id.image2Id){
            Toast.makeText(MainActivity.this," double Woman Image. ",Toast.LENGTH_SHORT).show();

        }


    }
}



