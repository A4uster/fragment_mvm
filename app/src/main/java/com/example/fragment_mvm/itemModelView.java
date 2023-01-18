package com.example.fragment_mvm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class itemModelView extends ViewModel {

    private static final MutableLiveData<String> dadesLiveData = new MutableLiveData<>();

    //Definir un set i un get de l'atribut

    public void setDadesLiveData(String item){
        dadesLiveData.setValue(item);
    }

    public LiveData<String> getDadesLiveData(){
        return dadesLiveData;
    }
}
