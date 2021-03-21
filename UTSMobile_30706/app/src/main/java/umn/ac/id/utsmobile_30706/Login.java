package umn.ac.id.utsmobile_30706;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button btSubmit;

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        btSubmit = (Button) findViewById(R.id.bt_submit);

        btSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String usernameKey = etUsername.getText().toString();
                String passwordKey = etPassword.getText().toString();

                if (usernameKey.equals("uasmobile") && passwordKey.equals("uasmobilegenap")){

                    Intent intent = new Intent(Login.this, Home.class);
                    Login.this.startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(getApplicationContext(),"Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}