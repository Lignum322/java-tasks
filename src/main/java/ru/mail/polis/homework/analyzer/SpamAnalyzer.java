package ru.mail.polis.homework.analyzer;

public class SpamAnalyzer implements TextAnalyzer{
    private String[] spam;

    SpamAnalyzer(String[] spam){this.spam = spam; }

    @Override
    public FilterType analyze(String string) {
        if(string == null)
            return FilterType.GOOD;
        for (String banWord:spam) {
            if (string.contains(banWord)){
                return  FilterType.SPAM;
            }
        }

        return FilterType.GOOD;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.SPAM;
    }

}
