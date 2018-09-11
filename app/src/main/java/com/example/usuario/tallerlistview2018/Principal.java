package com.example.usuario.tallerlistview2018;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    private ListView lv;
    private Resources resources;
    private ListView listView;
    private Intent in;
    String valores [];

    public Principal() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lv = (ListView)findViewById(R.id.Opciones);
        resources = this.getResources();
        listView = (ListView) findViewById(R.id.Opciones);
        valores = getResources().getStringArray(R.array.Valores);

    }
}
