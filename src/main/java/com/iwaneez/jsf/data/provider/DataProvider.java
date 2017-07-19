package com.iwaneez.jsf.data.provider;

import com.iwaneez.jsf.enums.Country;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class DataProvider {

    public Country[] getCountries() {
        return Country.values();
    }
}
