package Wine;

import java.time.LocalDate;
import java.time.Period;

public class Wine {
    private String nameWine;
    private String markaName;
    private String countryName;
    private LocalDate data;
    private String opisanie;


    public String getNameWine() {
        return nameWine;
    }

    public void setNameWine(String nameWine) {
        this.nameWine = nameWine;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getMarkaName() {
        return markaName;
    }

    public void setMarkaName(String markaName) {
        this.markaName = markaName;
    }

    public Wine(String nameWine, String opisanie, LocalDate data,
                String countryName, String markaName) {
        this.nameWine = nameWine;
        this.opisanie = opisanie;
        this.data = data;
        this.countryName = countryName;
        this.markaName = markaName;
    }

    public void wineYears(LocalDate now){
        int years = Period.between(data, now).getYears();
        System.out.println("Выдержка в годах: "+years);
    }
}
