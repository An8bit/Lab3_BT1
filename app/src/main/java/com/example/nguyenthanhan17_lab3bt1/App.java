package com.example.nguyenthanhan17_lab3bt1;

import android.app.Application;

import java.util.ArrayList;

public class App extends Application { // Singleton Pattern
    public static ArrayList<Country> data;

    @Override
    public void onCreate() {
        super.onCreate();
        if(data == null){
            data = new ArrayList<>();
        }
    }

    public static ArrayList<Country> initDataForCountry(){
        data.add(new Country(1,
                "Estonia",
                R.drawable.estonia,
                430805,
                "Eastern Europe, bordering the Baltic Sea and Gulf of Finland, between Latvia and Russia",
                58.595272,25.013607,
                "Tallinn", "02/24", "Euro"));
        data.add(new Country(2,
                "France",
                R.drawable.france,
                2206488,
                "Western Europe, bordering the Bay of Biscay and English Channel, between Belgium and Spain, southeast of the UK; bordering the Mediterranean Sea, between Italy and Spain",
                46.227638,2.213749,
                "Paris", "04/17", "Euro, Franc"));
        data.add(new Country(3,
                "Germany",
                R.drawable.germany,
                3664088,
                "Central Europe, bordering the Baltic Sea and the North Sea, between the Netherlands and Poland, south of Denmark",
                51.165691,10.451526,
                "Berlin", "03/10","Euro"));
        data.add(new Country(4,
                "Ireland",
                R.drawable.ireland,
                553165,
                "Western Europe, occupying five-sixths of the island of Ireland in the North Atlantic Ocean, west of Great Britain",
                53.412910,-8.243890,
                "Dublin", "01/21", "Euro"));
        data.add(new Country(5,
                "Italy",
                R.drawable.italy,
                2873147,
                "Southern Europe, a peninsula extending into the central Mediterranean Sea, northeast of Tunisia",
                41.871941,12.567380,
                "Rome", "04/25", "Euro"));
        data.add(new Country(6,
                "Principality of Monaco",
                R.drawable.monaco,
                37308,
                "Western Europe, bordering the Mediterranean Sea on the southern coast of France, near the border with Italy",
                43.738419,7.424616,
                "Monaco", "11/19", "Euro"));
        data.add(new Country(7,
                "Nigeria",
                R.drawable.nigeria,
                2750000,
                "Western Africa, bordering the Gulf of Guinea, between Benin and Cameroon",
                9.077751,8.6774567,
                "Abuja", "10/01", "Naira Nigeria"));
        data.add(new Country(8,
                "Poland",
                R.drawable.poland,
                1793579,
                "Central Europe, east of Germany",
                52.237049,21.017532,
                "Warsaw", "11/11", "PLN"));
        data.add(new Country(9,
                "Russia",
                R.drawable.russia,
                12506468,
                "North Asia bordering the Arctic Ocean, extending from Europe (the portion west of the Urals) to the North Pacific Ocean",
                55.751244,37.618423,
                "Moscow", "06/12", "Rup"));
        return data;
    }
}
