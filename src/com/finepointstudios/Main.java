package com.finepointstudios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String url = "https://cnn.com/story/98432/photography";
        String pattern = "\\d+";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(url);
        if (m.find()) {
            System.out.println("Found: " + m.group(0));
        }

    }
}
