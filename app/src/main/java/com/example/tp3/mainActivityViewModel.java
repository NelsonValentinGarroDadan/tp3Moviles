package com.example.tp3;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.app.Application;
import android.content.Context;

import com.example.tp3moviles.modelo.inmueble;

import java.util.ArrayList;
import java.util.List;

public class mainActivityViewModel extends AndroidViewModel {
    private List<inmueble> Lista;
    private MutableLiveData<List<inmueble>> ListaM;
    private Context contexto;
    public mainActivityViewModel(@NonNull Application application) {
        super(application);
        contexto = application.getApplicationContext();
        Lista=new ArrayList<>();
    }
    public LiveData getMutable(){
        if(ListaM==null){
            ListaM = new MutableLiveData();
        }
        return ListaM;
    }
    public void AgregarDatos(){
        Lista.add(new inmueble(2000,"Lic 22",R.drawable.img1));
        Lista.add(new inmueble(100,"Modulo 15",R.drawable.img2));
        Lista.add(new inmueble(142000,"Colo y Ayacucho 123",R.drawable.img3));
        Lista.add(new inmueble(578000,"Obelisco",R.drawable.img4));
        ListaM.setValue(Lista);
    }
}
