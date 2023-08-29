package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;

import com.example.tp3.databinding.ActivityMainBinding;
import com.example.tp3moviles.modelo.inmueble;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private mainActivityViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mv = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(mainActivityViewModel.class);

        mv.getMutable().observe(this, new Observer<List<inmueble>>() {
            @Override
            public void onChanged(List<inmueble> lista) {
                binding.lvMiLista.setAdapter(new ListaAdapter(MainActivity.this,R.layout.item,lista,getLayoutInflater()));
            }
        });
        mv.AgregarDatos();

    }
}