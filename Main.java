package com.anthony;

public class Main {

    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage");
            System.out.println("You must at least have 1 argument which is a filepath or a real word");
        }

        // firstly we're gonna implement the word only implementation
        Word.Interpretation("args[0]");
    }
}
