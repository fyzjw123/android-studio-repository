package com.example.zhongjw.myapplicationa;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by zhongjw on 15-10-21.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("SecondActivity",this.toString());
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.second_layout);

        Intent intent=getIntent();
        String data=intent.getStringExtra("extra_data");
        Toast.makeText(SecondActivity.this,data,Toast.LENGTH_SHORT).show();
        Button but2;
        but2 = (Button) findViewById(R.id.second_activity_button1);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(SecondActivity.this, "button 2 is clicked", Toast.LENGTH_SHORT).show();
//                Intent i=new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse("tel:10086"));
//                startActivity(i);
                Intent intent=new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
