package com.example.aaron.gamebuddies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Aaron on 4/18/16.
 */
public class FriendActivity extends MainActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends);

        ImageButton btnchat = (ImageButton) findViewById(R.id.btnchat);
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), ChatActivity.class);
                startActivityForResult(intent, 0);

            }
        });

        ImageButton btnfriends = (ImageButton) findViewById(R.id.btnfriends);
        btnfriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(v.getContext(), FriendActivity.class);
                startActivityForResult(intent1, 0);
            }
        });

        Button btnhome = (Button) findViewById(R.id.btnhome);
        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(v.getContext(), HomeActivity.class);
                startActivityForResult(intent2, 0);
            }
        });

        ImageButton btnprofile1 = (ImageButton) findViewById(R.id.btnprofile1);
        btnprofile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent3 = new Intent(v.getContext(), Oprofile.class);
                startActivityForResult(intent3, 0);
            }
        });


    }

}