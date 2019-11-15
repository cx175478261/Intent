package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

      //          Toast.makeText(Main2Activity.this,"you click Button2",
        //                Toast.LENGTH_SHORT).show();

           /*     Intent intent = new Intent("com.example.intent.ACTION_START");
                intent.addCategory("com.example.intent.MY_CATEGORY");
                startActivity(intent);*/

          /* Intent intent = new Intent(Intent.ACTION_VIEW);
           intent.setData(Uri.parse("http://www.baidu.com"));
           startActivity(intent);
            }*/
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }

        });
    }

}

