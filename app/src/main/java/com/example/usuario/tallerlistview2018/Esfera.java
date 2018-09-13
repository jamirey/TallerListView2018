package com.example.usuario.tallerlistview2018;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Esfera extends AppCompatActivity {

    private EditText Radio;
    private Resources resource;
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        Radio= (EditText)findViewById(R.id.Resultado);
        resource=this.getResources();
    }

    public void Calcular (View view){

        double res;

        Double radio= Double.parseDouble(Radio.getText().toString());

        res= (4*Math.PI*Math.pow(radio,3))/3;

        Resultado obj = new Resultado("Area del Esfera",radio,0.0,res);
        obj.guardar();

        In= new Intent(Esfera.this, VistaCalculo.class);
        In.putExtra("TituloOperaciones",resource.getString(R.string.esfera));
        In.putExtra("textResultado","Area: "+obj.getRes());
        startActivity(In);

    }

    public void limpiar (View v){
        borrar();
    }

    private  void borrar (){

        Radio.setText("");
        Radio.requestFocus();
    }
}
