package com.example.levitin.spancountryapp;

import java.util.ArrayList;

public class InitialazerDataWorld {
    public static void execute(WorldData worldData){
        ukraineInit(worldData);
        usaInit(worldData);
    }

    private static void ukraineInit(WorldData worldData){
        final Region ZaporozObl = new Region("Запорожская",
                new ArrayList<City>() {{
                    add(new City("Запорожье"));
                    add(new City("Бердянск"));
                    add(new City("Мелитополь"));
                } });
        final Region KievObl = new Region("Киевская",
                new ArrayList<City>() {{
                    add(new City("Киев"));
                    add(new City("Борисполь"));
                    add(new City("Бровары"));
                } });
        final Region LvovObl = new Region("Львовская",
                new ArrayList<City>() {{
                    add(new City("Львов"));
                    add(new City("Моршин"));
                    add(new City("Дрошгобыч"));
                } });
        Country ukraine = new Country("Украина",
                new ArrayList<Region>() {{
                    add(ZaporozObl);
                    add(KievObl);
                    add(LvovObl);
                } });
        worldData.getCountries().add(ukraine);
    }

    private static void usaInit(WorldData worldData){
        final Region ZaporozObl = new Region("Нью-Йорк",
                new ArrayList<City>() {{
                    add(new City("Нью-Йорк"));
                    add(new City("Бердянск"));
                    add(new City("Мелитополь"));
                } });
        final Region KievObl = new Region("Мичиган",
                new ArrayList<City>() {{
                    add(new City("Детройт"));
                    add(new City("Лансинг"));
        } });
        final Region LvovObl = new Region("Техас",
                new ArrayList<City>() {{
                    add(new City("Львов"));
                    add(new City("Моршин"));
                    add(new City("Дрошгобыч"));
                } });
        Country usa = new Country("США",
                new ArrayList<Region>() {{
                    add(ZaporozObl);
                    add(KievObl);
                    add(LvovObl);
                } });
        worldData.getCountries().add(usa);
    }
}