package com.codewithmosh;

import com.codewithmosh.command.BlackAndWhiteCommand;
import com.codewithmosh.command.Button;
import com.codewithmosh.command.CompositeCommand;
import com.codewithmosh.command.ResizeCommand;
import com.codewithmosh.command.fx.AddCustomerCommand;
import com.codewithmosh.command.fx.CustomerService;
import com.codewithmosh.strategy.HighContrastFilter;
import com.codewithmosh.strategy.ImageStore;
import com.codewithmosh.strategy.JpegCompressor;
import com.codewithmosh.templateMethod.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

       var composite = new CompositeCommand();
       composite.add(new ResizeCommand());
       composite.add(new BlackAndWhiteCommand());
       composite.execute();
       composite.execute();
       composite.execute();
    }
}
