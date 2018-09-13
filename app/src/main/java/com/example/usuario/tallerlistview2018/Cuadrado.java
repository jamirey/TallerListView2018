package com.example.usuario.tallerlistview2018;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cuadrado extends AppCompatActivity {

    private EditText Lado;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        Lado= (EditText)findViewById(R.id.Resultado);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;
        Double lado= Double.parseDouble(Lado.getText().toString());
        res= Math.pow(lado,2);

        Resultado obj = new Resultado("Area del cuadrado",lado,0.0, res);
        obj.guardar();
        In= new Intent(Cuadrado.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.cuadrado));
        In.putExtra("textResultado","Area: "+obj.getRes());
        startActivity(In);
    }

    pu

    public void limpiar (View v){
        borrar();
    }

    private  void borrar (){

        Lado.setText("");
        Lado.requestFocus();
    }
}
