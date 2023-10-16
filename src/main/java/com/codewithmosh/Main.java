package com.codewithmosh;

import com.codewithmosh.iterator.BrowseHistory;
import com.codewithmosh.memento.Editor;
import com.codewithmosh.memento.History;
import com.codewithmosh.state.Canvas;
import com.codewithmosh.state.SelectionTool;
import com.codewithmosh.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {

       var history = new BrowseHistory();
       history.push("a");
       history.push("b");
       history.push("c");

       history.createIterator();
        var iterator = history.createIterator();

        while (iterator.hasNext()){
          var url = iterator.current();
          System.out.println(url);
          iterator.next();
        }
    }
}
