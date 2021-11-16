package com.idnp.tutoria_proyecto_final_idnp.main;


public class MainModel implements Main.Model{

    private Main.Presenter presenter;
    private String nombre;


    public MainModel(Main.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void logout() {
        nombre = "Sesión finalizada";
        presenter.showSesion(nombre);
    }
}
