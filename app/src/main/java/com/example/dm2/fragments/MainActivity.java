package com.example.dm2.fragments;

import com.example.dm2.fragments.fragmento_listado.LibrosListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LibrosListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmento_listado frgListado=(fragmento_listado)getSupportFragmentManager().findFragmentById(R.id.FrgListado);
        frgListado.setLibrosListener(this);
    }

    public void onLibroSeleccionado(Libro l){

        boolean hayDetalle=(getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)!=null);

        if(hayDetalle){
            ((FragmentDetalle)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle)).mostrarDetalle(l.getContenido());
        }else{
            Intent i=new Intent(this,detalle.class);
            i.putExtra(detalle.EXTRA_TEXTO,l.getContenido());
            startActivity(i);
        }
    }
}
