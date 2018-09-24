package com.example.levitin.spancountryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Country> countries;
    Spinner spinner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorldData worldData = new WorldData();
        InitialazerDataWorld.execute(worldData);
        countries = worldData.getCountries();

    }

    /*void toXml(WorldData worldData) {
        File file = new File("C:\\file.xml");



            JAXBContext jaxbContext = JAXBContext.newInstance(WorldData.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        // output pretty printed
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        jaxbMarshaller.marshal(customer,file);

        jaxbMarshaller.marshal(customer,System.out);
        }*/
}
