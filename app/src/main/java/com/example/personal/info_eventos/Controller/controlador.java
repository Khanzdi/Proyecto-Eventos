package com.example.personal.info_eventos.Controller;
import com.example.personal.info_eventos.Domain.User;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Personal on 11/09/2017.
 */

public class controlador {

    private static controlador controlador = null;

    public static controlador getControlador() {

        if (controlador == null) {
            controlador = new controlador();
        }
        return controlador;
    }
    private List<User> users;
    private String[] eventosList;

    public  controlador(){
        users= new ArrayList<>();
        fillDateBases();
        fillDataList();
    }
    private void fillDataList(){
        eventosList = new String[]{"Culturales","Gastronómicos","Empresariales","Sociales","Deportivos","Académicos","Religiosos"};
    }
    private void fillDateBases(){
        //Add users
        fillUsers();
    }

    private void fillUsers(){
        User person1=new User("Brayan","Torres","elbrayan","1234",24);
        users.add(person1);

        User person2=new User("Kevin","Ortiz","elkevin","4321",23);
        users.add(person2);
    }

    public boolean isValidUser(String username, String password){
        Boolean resp=false;
        for (User person:users) {
            if(username.equals(person.getUserName())){
                if(password.equals(person.getPassword())){
                    resp=true;
                }
            }
        }
        return resp;
    }
    public String[] getEventosList() {
        return eventosList;
    }

    public void setEventosList(String[] eventosList) {
        this.eventosList = eventosList;
    }

}
