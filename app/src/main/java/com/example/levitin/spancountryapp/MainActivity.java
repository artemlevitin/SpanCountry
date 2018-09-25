package com.example.levitin.spancountryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    WorldData worldData;
    Spinner countrySpinner ;
    ArrayAdapter<String>  countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorldData worldData = new WorldData();
        InitialazerDataWorld.execute(worldData);

        countrySpinner = (Spinner)findViewById(R.id.countrySpinner) ;
        countryAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,worldData.getNameCountries()) ;
        countrySpinner.setAdapter(countryAdapter);

        setregion();


        Spinner citySpinner = (Spinner)findViewById(R.id.citySpinner);
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,worldData.getCountries().get(1).getRegions().get(1).getCityName());
        citySpinner.setAdapter(cityAdapter);



    }

    private void setregion() {

        Spinner regionSpinner = (Spinner)findViewById(R.id.regionSpinner);
        ArrayAdapter<String> regionAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,worldData.getCountries().get(1).getRegionName());
        regionSpinner.setAdapter(regionAdapter);
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
