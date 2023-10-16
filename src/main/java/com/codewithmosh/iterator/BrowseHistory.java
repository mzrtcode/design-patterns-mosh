package com.codewithmosh.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        if(count < 10){
            urls[count] = url;
            count++;
        }else{
            System.out.println("El historial esta lleno");
        }
        
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    public void pop(){

        if(count > 0){
            urls[count] = null;
            count--;
        }else{
            System.out.println("El historial esta vacio");
        }
    }

    public class ListIterator implements Iterator<String>{


        private BrowseHistory history;
        private int index = 0 ;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.count);
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
           index++;
        }

    }
    
}
