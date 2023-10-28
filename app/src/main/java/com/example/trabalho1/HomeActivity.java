package com.example.trabalho1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        View view;
        List<Noticia> noticias = new ArrayList<>();
        noticias.add(new Noticia("Lorem Ipsum", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...", "noticia_1"));
        noticias.add(new Noticia("Lorem Ipsum", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...", "noticia_2"));
        noticias.add(new Noticia("Lorem Ipsum", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...", "noticia_3"));
        NoticiaAdapter adapter = new NoticiaAdapter(this, noticias);
        ListView listView = findViewById(R.id.ListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Noticia selectedNoticia = noticias.get(position);
                selectedNoticia.getActivity();
            }
        });
    }

    public void chamarPrimeiraNoticia(View view) {

        Intent intent = new Intent(this, PrimeiraNoticiaActivity.class);
        startActivity(intent);
    }

    public void chamarSegundaNoticia(View view) {

        Intent intent = new Intent(this, SegundaNoticiaActivity.class);
        startActivity(intent);
    }

    public void chamarTerceiraNoticia(View view) {

        Intent intent = new Intent(this, TerceiraNoticiaActivity.class);
        startActivity(intent);
    }
}
