package com.example.tp3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.tp3moviles.modelo.inmueble;

import java.util.List;

public class ListaAdapter extends ArrayAdapter <inmueble>{
    private LayoutInflater li;
    private Context context;
    private List<inmueble> Lista;
    public ListaAdapter(@NonNull Context context, int resource, @NonNull List<inmueble> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context=context;
        this.li = li;
        this.Lista = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if(itemView==null){
            itemView = li.inflate(R.layout.item,parent,false);
        }

        inmueble inm = Lista.get(position);
        ImageView foto = itemView.findViewById(R.id.Foto);
        TextView direccion = itemView.findViewById(R.id.Direccion);
        TextView precio = itemView.findViewById(R.id.Precio);

        foto.setImageResource(inm.getFoto());
        direccion.setText(inm.getDIreccion());
        precio.setText(inm.getPrecio()+"");

        return itemView;
    }
}
