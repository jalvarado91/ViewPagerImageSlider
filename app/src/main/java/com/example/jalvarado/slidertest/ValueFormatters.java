package com.example.jalvarado.slidertest;

import java.text.NumberFormat;

/**
 * Created by jalvarado on 4/22/15.
 */
public class ValueFormatters {

    private static NumberFormat moneyNF = NumberFormat.getCurrencyInstance();
    private static NumberFormat intNF = NumberFormat.getIntegerInstance();

    public static String formatMoney(int input) {
        return moneyNF.format(input);
    }

    public static String formatBetter(int input){
        return intNF.format(input);
    }

    public static String toTitleCase(String str) {
        if (str == null) {
            return null;
        }
        boolean space = true;
        StringBuilder builder = new StringBuilder(str);
        final int len = builder.length();

        for (int i=0; i < len; ++i) {
            char c = builder.charAt(i);
            if (space) {
                if (!Character.isWhitespace(c)) {
                    // Convert to title case and switch out of whitespace mode.
                    builder.setCharAt(i, Character.toTitleCase(c));
                    space = false;
                }
            } else if (Character.isWhitespace(c)) {
                space = true;
            } else {
                builder.setCharAt(i, Character.toLowerCase(c));
            }
        }

        return builder.toString();
    }

    public static String formatYesNo(String value) {
        if(value == null) {
            return "N/A";
        }

        if(value.equals("Y") || value.equals("Yes")){
            return "Yes";
        }
        else { return "No"; }
    }


}
