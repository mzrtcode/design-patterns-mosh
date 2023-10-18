package com.codewithmosh;

import com.codewithmosh.strategy.HighContrastFilter;
import com.codewithmosh.strategy.ImageStore;
import com.codewithmosh.strategy.JpegCompressor;
import com.codewithmosh.templateMethod.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {

       var task = new TransferMoneyTask();
        task.execute();
    }
}
