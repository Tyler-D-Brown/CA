package com.example.creatorsassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static com.example.creatorsassistant.utilities.Constants.WORLD_ID_KEY;

public class MainActivity extends AppCompatActivity {
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button newWorld = findViewById(R.id.newWorld);
        Button loadWorld = findViewById(R.id.loadWorld);
        newWorld.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, worldDetails.class);
                int id = -1;
                intent.putExtra(WORLD_ID_KEY, id);
                try{
                    context.startActivity(intent);
                }
                catch(Exception e){
                    Log.d("Exception on Start worldDetails", e.toString());
                }
            }
        });
        loadWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}