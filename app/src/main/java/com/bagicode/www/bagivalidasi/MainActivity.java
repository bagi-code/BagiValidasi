package com.bagicode.www.bagivalidasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText tUsername, tPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tUsername = (EditText) findViewById(R.id.username);
        tPassword = (EditText) findViewById(R.id.password);

        Button btnLogin = (Button) findViewById(R.id.login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = tUsername.getText().toString();
                String pass = tPassword.getText().toString();

                if(username.equals("")) {
                    tUsername.setError("Username tidak boleh kosong");
                } else if (pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Password Anda kosong", Toast.LENGTH_SHORT).show();
                } {
                    //baru bisa login
                    Log.e("login", "berhasil");
                }
            }
        });
    }
}
