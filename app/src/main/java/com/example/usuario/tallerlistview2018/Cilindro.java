package com.example.usuario.tallerlistview2018;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {
    private EditText RadioCilindro;
    private EditText AlturaCilindro;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);

        RadioCilindro= (EditText)findViewById(R.id.ValorRadio);
        AlturaCilindro= (EditText)findViewById(R.id.ValorAltura);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;

        Double radioCilindro= Double.parseDouble(RadioCilindro.getText().toString());
        Double alturaCilindro= Double.parseDouble(AlturaCilindro.getText().toString());

        res = ((Math.PI) * (Math.pow(radioCilindro,2)) * alturaCilindro);

        Resultado obj = new Resultado("Area del Cilindro",radioCilindro,alturaCilindro,res);
        obj.guardar();

        In= new Intent(Cilindro.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.cilindro));
        In.putExtra("textResultado","Area: "+obj.getRes());
        startActivity(In);

    }

    public void limpiar (View v){
        borrar();
    }

    private  void borrar (){

        RadioCilindro.setText("");
        AlturaCilindro.setText("");
        RadioCilindro.requestFocus();
    }
}
