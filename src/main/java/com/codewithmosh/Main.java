package com.codewithmosh;

import com.codewithmosh.memento.Editor;
import com.codewithmosh.memento.History;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.SelectionTool;

public class Main {

    public static void main(String[] args) {

        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
