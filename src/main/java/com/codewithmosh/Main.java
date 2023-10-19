package com.codewithmosh;

import com.codewithmosh.command.Button;
import com.codewithmosh.command.fx.AddCustomerCommand;
import com.codewithmosh.command.fx.CustomerService;
import com.codewithmosh.strategy.HighContrastFilter;
import com.codewithmosh.strategy.ImageStore;
import com.codewithmosh.strategy.JpegCompressor;
import com.codewithmosh.templateMethod.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

       var service = new CustomerService();
       var command = new AddCustomerCommand(service);
       var button = new Button(command);
       button.click();
    }
}
