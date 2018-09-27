package com.example.levitin.spancountryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{

    WorldData worldData;
    Country currentCoontry;

    ArrayAdapter<String> countryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        worldData = new WorldData();
        InitialazerDataWorld.execute(worldData);

        setCountrySpinner();

        Country country = worldData.findCountry("США");

        setCountrySpinner();
        setRegionsSpinner(country);
        setCitiesSpinner(country.findRregion("Техас"));



    }

    private void setCountrySpinner() {
        Spinner countrySpinner = (Spinner) findViewById(R.id.countrySpinner);
        countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, worldData.getNameCountries());
        countrySpinner.setAdapter(countryAdapter);
        countrySpinner.setOnItemSelectedListener(this);
    }

    private void setRegionsSpinner(Country country) {
        Spinner regionSpinner = (Spinner) findViewById(R.id.regionSpinner);
        ArrayAdapter<String> regionAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, country.getRegionName());
        regionSpinner.setAdapter(regionAdapter);
        regionSpinner.setOnItemSelectedListener(this);
    }

    private void setCitiesSpinner(Region region) {
        Spinner citySpinner = (Spinner) findViewById(R.id.citySpinner);
        ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, region.getCityName());
        citySpinner.setAdapter(cityAdapter);
        citySpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner)parent;
        String item = (String)parent.getItemAtPosition(position);
        switch (spinner.getId()) {
            case R.id.countrySpinner:
                currentCoontry = worldData.findCountry(item);
                setRegionsSpinner(currentCoontry);
                break;
            case R.id.regionSpinner:
               setCitiesSpinner(currentCoontry.findRregion(item));
                break;
            case R.id.citySpinner:
                break;
            default:
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

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
