package co.com.validaTest.data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class GenerateRamdonData {

    final Faker fakerObject = new Faker(new Locale("es-CO"));
    final String HOST_EMAIL = "@hotmail.com";
    final String user = "";

    public String getFakeUser(){
        return fakerObject.name().firstName().concat(String.valueOf(fakerObject.number().numberBetween(1000,9999)));
    }

    public String getFakePassword(){
        return "";
    }

    public String getFakePasswordWithUserName(){
        return "";
    }

    public String getFakeMail(){
        return getFakeUser().concat(HOST_EMAIL);
    }

    public static void main(String[] args) {

    }
}
