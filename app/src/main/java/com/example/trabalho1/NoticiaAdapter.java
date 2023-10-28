package com.example.trabalho1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class NoticiaAdapter extends ArrayAdapter<Noticia> {
    public NoticiaAdapter(Context context, List<Noticia> noticias) {
        super(context, 0, noticias);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.preview_noticia,
                    parent, false);
        }
        Noticia currentNoticia = getItem(position);
        TextView titulo = convertView.findViewById(R.id.titulo);
        TextView texto = convertView.findViewById(R.id.texto);
        Button button = convertView.findViewById(R.id.button);
        titulo.setText(currentNoticia.getTitulo());
        texto.setText(currentNoticia.getTexto());
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                currentNoticia.getActivity();

            }
        });
        return convertView;
    }
}
