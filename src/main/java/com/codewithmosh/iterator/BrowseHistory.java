package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    public void pop(){
        var lastIndex = urls.size() - 1;
        urls.remove(lastIndex);
    }

    public class ListIterator implements Iterator<String>{


        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
           index++;
        }

    }
    
}
