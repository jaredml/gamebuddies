package com.example.aaron.gamebuddies;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Aaron on 4/18/16.
 */
public class Login extends MainActivity {

        public void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login);

            Button btnhome = (Button) findViewById(R.id.btnhome);
            btnhome.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent2 = new Intent(v.getContext(), HomeActivity.class);
                    startActivityForResult(intent2, 0);
                }
            });

    }
}
