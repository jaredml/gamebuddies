package com.example.aaron.gamebuddies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Aaron on 4/18/16.
 */
public class HomeActivity extends MainActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageButton btnchat = (ImageButton) findViewById(R.id.btnchat);
        btnchat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), ChatActivity.class);
                startActivityForResult(intent, 0);

            }
        });


        Button btnprofile = (Button) findViewById(R.id.btnprofile);
        btnprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(v.getContext(), FirstScreen.class);
                startActivityForResult(intent2, 0);
            }
        });

        Button btnsearch = (Button) findViewById(R.id.btnsearch);
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent4 = new Intent(v.getContext(), SearchActivity.class);
                startActivityForResult(intent4, 0);
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

    }

}
