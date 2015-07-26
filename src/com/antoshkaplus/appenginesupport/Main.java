package com.antoshkaplus.appenginesupport;



public class Main {

    public static void main(String[] args) {
        RecursiveLists lists = new RecursiveLists();
        try {
            lists.handle();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
