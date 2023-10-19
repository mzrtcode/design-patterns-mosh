package com.codewithmosh;

import javax.sql.DataSource;

import com.codewithmosh.mediator.ArticlesDialogBox;
import com.codewithmosh.observer.Chart;
import com.codewithmosh.observer.Datasource;
import com.codewithmosh.observer.SpreeadSheet;

public class Main {

    public static void main(String[] args) {

        var dialog = new ArticlesDialogBox();
        dialog.simulateUserInreaction();
    }

}