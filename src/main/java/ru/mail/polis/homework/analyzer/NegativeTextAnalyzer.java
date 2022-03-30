package ru.mail.polis.homework.analyzer;

public class NegativeTextAnalyzer implements TextAnalyzer{
    private String[] negativeWordsDictionary = {"=(", ":(", ":|"};


    @Override
    public FilterType analyze(String string) {
        if(string == null)
            return FilterType.GOOD;
        for (String banWord:negativeWordsDictionary) {
            if (string.contains(banWord)){
                return  FilterType.NEGATIVE_TEXT;
            }
        }
        return FilterType.GOOD;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.GOOD;
    }
}
