package com.example.trabalho1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaNoticiaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noticia_2);
    }

    public void VoltarHome(View view) {

        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
