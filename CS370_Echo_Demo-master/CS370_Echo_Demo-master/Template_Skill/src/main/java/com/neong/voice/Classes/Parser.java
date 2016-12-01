
package com.neong.voice.Classes;

public class Parser {
    private String stream;
    private Integer j;

    public Integer getI() {
        return j;
    }

    public void setUp(String stream_in) {
        stream = stream_in;
        j = 0;
    }
    public void addToI(Integer x) {
        j = j + x;
    }

    public Boolean atEnd(String end_string, Integer i) {
        String x = "";
        x += stream.charAt(i);
        return x.equals(end_string);
    }

    public String collectToEnd(String end_string, Integer i) {

    	String collected_characters = "";
        
        for(;!atEnd(end_string, i); i++)
        {
        
            collected_characters += stream.substring(i, i + 1);
        }

        return collected_characters;
    }

    public String findRelativeURL() {

        Integer k = findLocation("ShowRatings.jsp");

        return collectToEnd(" ", k);
    }

    public Integer findLocation(String url_to_match) {
        Integer j = getI();
        for (int k = 0; k < stream.length(); k++) {
            if (stream.substring(j, j + url_to_match.length()).equals(url_to_match)) {
                return j;
            }
           j++;
        }
        return -1;
    }
    public String findDivTag(String label) {
        Integer x = findLocation(label);
        addToI(x);
        Integer y = findLocation(">");
        y = y + 1;
        return collectToEnd("<", y);
    }
    public void getresultsPage() {
        String relative_url = this.findRelativeURL();
    }
}