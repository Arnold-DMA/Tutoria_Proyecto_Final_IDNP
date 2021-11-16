package com.idnp.tutoria_proyecto_final_idnp.main;

public interface Main {

    interface View{
        void showSesion(String nombre);
    }

    interface Presenter{
        void showSesion(String nombre);
        void signOut();
    }

    interface Model{
        void logout();
    }
}
