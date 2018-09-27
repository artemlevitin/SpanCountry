package com.example.levitin.spancountryapp;

import java.util.ArrayList;

public class InitialazerDataWorld {

    public static void execute(WorldData worldData){
        ukraineInit(worldData);
        usaInit(worldData);
        franceInit(worldData);
    }

    private static void ukraineInit(WorldData worldData){
        final Region ZaporozObl = new Region("Запорожская",
                new ArrayList<City>() {{
                    add(new City("Бердянск"));
                    add(new City("Мелитополь"));
                    add(new City("Запорожье"));
                } });
        final Region KievObl = new Region("Киевская",
                new ArrayList<City>() {{
                    add(new City("Борисполь"));
                    add(new City("Бровары"));
                    add(new City("Киев"));
                } });
        final Region LvovObl = new Region("Львовская",
                new ArrayList<City>() {{
                    add(new City("Дрошгобыч"));
                    add(new City("Львов"));
                    add(new City("Моршин"));
                } });
        final Region OdessObl = new Region("Одесская",
                new ArrayList<City>() {{
                    add(new City("Белгород-Днестровский,"));
                    add(new City("Измаил"));
                    add(new City("Одесса"));
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
                    add(new City("Буффало"));
                    add(new City("Нью-Йорк"));
                    add(new City("Рочестер"));
                } });
        final Region KievObl = new Region("Мичиган",
                new ArrayList<City>() {{
                    add(new City("Детройт"));
                    add(new City("Лансинг"));
        } });
        final Region LvovObl = new Region("Техас",
                new ArrayList<City>() {{
                    add(new City("Сан-Антонио"));
                    add(new City("Даллас"));
                    add(new City("Остин"));
                } });
        Country usa = new Country("США",
                new ArrayList<Region>() {{
                    add(ZaporozObl);
                    add(KievObl);
                    add(LvovObl);
                } });
        worldData.getCountries().add(usa);
    }


    private static void franceInit(WorldData worldData){
        final Region burgundia = new Region("Бургундия",
                new ArrayList<City>() {{
                    add(new City("Дижон"));
                    add(new City("Кот-д’Ор"));
                    } });
        final Region normandia = new Region("Нормандия",
                new ArrayList<City>() {{
                    add(new City("Гавр"));
                    add(new City("Руан"));
                    add(new City("Кан"));
                } });
        final Region elzas = new Region("Эльзас",
                new ArrayList<City>() {{
                    add(new City("Страсбурга"));
                    add(new City("Мюлуза"));
                    add(new City("Кольмара"));
                } });
        Country france = new Country("Франция",
                new ArrayList<Region>() {{
                    add(burgundia);
                    add(normandia);
                    add(elzas);
                } });
        worldData.getCountries().add(france);
    }
}