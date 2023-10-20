package com.codewithmosh;

import javax.sql.DataSource;

import com.codewithmosh.chainOfResponsability.Authentication;
import com.codewithmosh.chainOfResponsability.Compressor;
import com.codewithmosh.chainOfResponsability.HttpRequest;
import com.codewithmosh.chainOfResponsability.Logger;
import com.codewithmosh.chainOfResponsability.WebServer;
import com.codewithmosh.mediator.ArticlesDialogBox;
import com.codewithmosh.observer.Chart;
import com.codewithmosh.observer.Datasource;
import com.codewithmosh.observer.SpreeadSheet;

public class Main {

    public static void main(String[] args) {

        // authentication -> logger -> compressor


        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authentication = new Authentication(logger);

        var webServer = new WebServer(authentication);
        webServer.handle(new HttpRequest("admin", "1234"));
    }

}