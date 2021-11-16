package com.idnp.tutoria_proyecto_final_idnp.main;

import com.idnp.tutoria_proyecto_final_idnp.main.Main;
import com.idnp.tutoria_proyecto_final_idnp.main.MainModel;

public class MainPresenter implements Main.Presenter{

    private Main.View view;
    private Main.Model model;

    public MainPresenter(Main.View view){
        this.view = view;
        model = new MainModel(this);
    }

    @Override
    public void showSesion(String nombre) {
        if(view != null){
            view.showSesion(nombre);
        }
    }

    @Override
    public void signOut() {
        if(view != null){
            model.logout();
        }
    }
}
