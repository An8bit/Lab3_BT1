package com.example.nguyenthanhan17_lab3bt1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CountryAdapter.Listener {

    RecyclerView rvCountries;

    CountryAdapter countryAdapter;

    ArrayList<Country> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCountries = findViewById(R.id.rvCountries);

        countries = App.initDataForCountry();

        countryAdapter = new CountryAdapter(MainActivity.this,countries);


        rvCountries.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));

        rvCountries.setAdapter(countryAdapter);


    }

    @Override
    public void onItemListener(Country country) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(country.getName());
        builder.setIcon(getDrawable(country.getImage()));
        builder.setMessage("Description: "+country.getDescription()+"\n"+"LAT: "+country.getLatitude()+"\n"+"LONG: "+country.getLongitude());

        builder.setCancelable(false);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}