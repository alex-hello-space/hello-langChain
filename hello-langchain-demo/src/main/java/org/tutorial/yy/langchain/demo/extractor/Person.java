package org.tutorial.yy.langchain.demo.extractor;

import java.time.LocalDate;

/**
 * @author yyHuangfu
 * @create 2024/1/29
 * @description
 */
public class Person {
    private String firstName;
    private String lastName;
    private String birthDate;

    @Override
    public String toString() {
        return "Person { " +
                "firstName = \"" + firstName + '\"' +
                ", lastName = \"" + lastName + '\"' +
                ", birthDate = " + birthDate +
                " }";
    }
}
