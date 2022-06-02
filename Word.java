package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {
    private String word;
    private final String[] words = new String[] {"maimuta", "bucuresti", "laptop"};
    private List<Character> guestChars = new ArrayList();

    public Word() {
        Random rand = new Random();
        int rand_index = rand.nextInt(words.length - 1);
        this.word = words[rand_index];
        if (guestChars.size() == 0) {
            guestChars.add(this.word.toCharArray()[0]);
            guestChars.add(this.word.toCharArray()[this.word.length() - 1]);
        }
    }
    public void show() {
        String output = "";
        for (int i = 0; i < this.word.length(); ++i) {
            if (guestChars.contains(this.word.toCharArray()[i])) {
                output += this.word.toCharArray()[i];
            }
            else
                output += "|_|";
        }
        System.out.println(output);
    }

    public boolean checkCharacter(char c) {
        if (this.word.indexOf(c) >= 0) {
            if(!this.guestChars.contains(c)) {
                this.guestChars.add(c);
            }
            return true;
        }
        return false;
    }
    public boolean isGuessed() {
        for (int i = 0; i < this.word.length(); ++i) {
            if (this.guestChars.indexOf(this.word.toCharArray()[i]) < 0) {
                return false;
            }
        }
        return true;
    }
}
