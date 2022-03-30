package ru.mail.polis.homework.analyzer;

public class TooLongAnalyzer implements TextAnalyzer{
    private long maxLength;

    TooLongAnalyzer(long maxLength){
        this.maxLength = maxLength;
    }

    @Override
    public FilterType analyze(String string) {

        if(string == null)
            return FilterType.GOOD;
        return string.length() > maxLength
        ?FilterType.TOO_LONG
        :FilterType.GOOD;
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.TOO_LONG;
    }

}
