package com.example.dm2.fragments;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentDetalle extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_fragment_detalle,container,false);
    }

    public void mostrarDetalle(String texto){
        TextView textDetalle=(TextView) getView().findViewById(R.id.textDetalle);
        textDetalle.setText(texto);
    }
}
