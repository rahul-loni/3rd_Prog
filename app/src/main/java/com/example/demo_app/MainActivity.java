package com.example.demo_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button btn_Signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_Signup=(Button)findViewById(R.id.btnSignup);
        btn_Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_signup=new Intent(MainActivity.this,Signup.class);
                startActivity(intent_signup);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.item1){
            Intent item1_intent=new Intent(MainActivity.this,Signup.class);
            startActivity(item1_intent);

        }else {}
        if (item.getItemId()==R.id.item2){
            Intent item2_intent=new Intent(MainActivity.this,Settings.class);
            startActivity(item2_intent);
        }else {}
        if (item.getItemId()==R.id.item3){
            Toast.makeText(this, "Clicked Dashboard", Toast.LENGTH_LONG).show();

        }else {}
        if (item.getItemId()==R.id.item5){
            startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/rahul.loni.509")));
        }else {}

        return super.onOptionsItemSelected(item);
    }
}