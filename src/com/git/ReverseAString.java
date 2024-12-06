package com.git;

public class ReverseAString {

	public static void main(String[] args) {
		String str1 = "rama and luxmana";
        StringBuilder sb = new StringBuilder();
        String word = "";

        
        for (int i = str1.length() - 1; i >= 0; i--) {
            char ch = str1.charAt(i);

           
            if (ch == ' ') {
                sb.append(word).append(" ");
                word = ""; 
            } else {
                word = ch + word;
            }
        }

        sb.append(word);

        System.out.println(sb.toString());

	}

}
