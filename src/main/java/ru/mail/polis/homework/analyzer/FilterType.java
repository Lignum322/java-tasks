package ru.mail.polis.homework.analyzer;

/**
 * Типы фильтров (2 тугрика)
 */
public enum FilterType {
    GOOD(3),
    NEGATIVE_TEXT(2),
    TOO_LONG(1),
    SPAM(0);

    private int priority;
    FilterType(int i){priority = i;}

    int getPriority(){return priority;}

}
