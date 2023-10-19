package com.codewithmosh;

import javax.sql.DataSource;

import com.codewithmosh.observer.Chart;
import com.codewithmosh.observer.Datasource;
import com.codewithmosh.observer.SpreeadSheet;



public class Main {

    public static void main(String[] args) {

        var dataSource = new Datasource();
        var sheet1 = new SpreeadSheet();
        var sheet2 = new SpreeadSheet();
        var chart = new Chart();

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
    }
}
