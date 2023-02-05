package com.atilsamancioglu.javaoopdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kedi kedi = new Kedi("Kedi1","Sari","Kahverengi");
        Kedi kedi2 = new Kedi();
        kedi2.isim = "Kedi 2";
        System.out.println(kedi2.isim);
        //System.out.println(turIsmi);
        System.out.println(Kedi.turIsmi);
        kedi.konusKedi();
        Kedi.konusKediStatic();

        Kopek kopek = new Kopek();
        Kopek kopek2 = new Kopek("Barley","Sari","Sari");
        System.out.println(kopek2.tuyRengi);
        Hayvan hayvan = new Hayvan();


    }

    public void test() {

    }
}