package com.codewithmosh;

import com.codewithmosh.memento.Editor;
import com.codewithmosh.memento.History;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.SelectionTool;
import com.codewithmosh.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {

       var stopwatch = new Stopwatch();

         stopwatch.click();
         stopwatch.click();
    }
}
