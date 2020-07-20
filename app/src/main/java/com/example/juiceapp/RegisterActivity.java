package com.example.juiceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    Button kelogin, kedaftar;
    private FirebaseAuth mAuth;
    private EditText nama, email, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth = FirebaseAuth.getInstance();
        nama = findViewById(R.id.reg_nama);
        email = findViewById(R.id.reg_email);
        password = findViewById(R.id.reg_password);
        kedaftar = findViewById(R.id.daftar);
        kelogin = findViewById(R.id.ke_login);

        kelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
            }
        });


        kedaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = nama.getText().toString();
                String Email = email.getText().toString();
                String Password = password.getText().toString();

                if (username.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Silahkan isi Nama Anda",
                            Toast.LENGTH_LONG).show();
                } else if (Email.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Silahkan isi Email Anda",
                            Toast.LENGTH_LONG).show();
                } else if (Password.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Silahkan isi Password Anda",
                            Toast.LENGTH_LONG).show();
                } else {
                    mAuth.createUserWithEmailAndPassword(Email, Password)
                            .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information
                                        FirebaseUser user = mAuth.getCurrentUser();
                                        Toast.makeText(RegisterActivity.this, "Registrasi BERHASIL",
                                                Toast.LENGTH_SHORT).show();
                                    } else {
                                        // If sign in fails, display a message to the user.

                                        Toast.makeText(RegisterActivity.this, "Registrasi GAGAL",
                                                Toast.LENGTH_SHORT).show();
                                    }

                                    // ...
                                }
                            });
                }
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (SharedprefManager.getInstance(this).login())
        {
            Intent i = new Intent(RegisterActivity.this,MainActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);
        }
    }
}
