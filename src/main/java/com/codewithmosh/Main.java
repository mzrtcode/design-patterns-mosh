package com.codewithmosh;

import com.codewithmosh.strategy.HighContrastFilter;
import com.codewithmosh.strategy.ImageStore;
import com.codewithmosh.strategy.JpegCompressor;

public class Main {

    public static void main(String[] args) {

       var imageStore = new ImageStore(new JpegCompressor(),
        new HighContrastFilter());

        imageStore.store("A");
    }
}
