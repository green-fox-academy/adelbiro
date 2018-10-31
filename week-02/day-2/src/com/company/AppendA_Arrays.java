package com.company;

import javax.sound.midi.Soundbank;

// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end
public class AppendA_Arrays {
    public static void appendA(String[] input) {

        for (int i = 0; i < input.length; i++) {
            input[i] = input[i] + "a";
            // sout is there only to see it works
            System.out.println(input[i]);

        }
    }
    public static void main(String[] args) {
        String[] animals = {"koal", "pand" , "zebr"};
        appendA(animals);

    }
}
