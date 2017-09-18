package com.example.personal.info_eventos.Controller;
import com.example.personal.info_eventos.Domain.Eventos;
import com.example.personal.info_eventos.Domain.User;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Personal on 11/09/2017.
 */

public class controlador {

    private static controlador _instance;
    private static controlador singleton = null;

    private List<User> users;
    private ArrayList<Eventos> eventos;

    public static controlador getSingleton() {
        if (singleton == null) {
            singleton = new controlador();
        }
        return singleton;
    }


    private controlador(){
        users= new ArrayList<>();
        fillDateBases();
    }

    private void fillDateBases(){
        //Add users
        fillUsers();
    }

    private void fillUsers(){
        User person1=new User("Andres","Perez","estemanp","1234",24);
        users.add(person1);

        User person2=new User("Jessica","Ramirez","jessica","1234",16);
        users.add(person2);

        User person3=new User("Kevin","Ortiz","kevin","4321",23);
        users.add(person3);
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
}
