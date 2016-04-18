package com.example.aaron.gamebuddies;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;

/**
 * Created by Aaron on 4/17/16.
 */
public class ChatActivity extends MainActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat);

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