package com.isa.oca.preparation.section1.lecture6;

public class FinalArgumentTest {

    public String getBirthPlace(final String name, final int socialSecurityNum) {
        // Cannot assign a new variable
        // name = "Jack";
        // socialSecurityNum = 123456;

        return "";
    }

    public String getBirthPlace(final FamilyInfo info) {
        /**
         * Cannot assign a new FamilyInfo instance
         */
        // familyInfo = new FamilyInfo();

        /**
         * But can change fields of final Object
         */
        info.motherName = "Mary";

        return "";
    }
}
