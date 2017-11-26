package com.isa.oca.preparation.section2.lecture11;

public class DefaultConstructorBasics {
    // Compiler puts this default constructor implicitly
    /**
     * public DefaultConstructorBasics() { }
     **/
}

class Agent {
    // No constructor declared. Default one will provided.
    /**
     * Agent() { }
     **/
}

class Agent2 {

    Agent2(int time) { // Default cons. will not be provided.
    }
}

class Agent3 {

    Agent3() { // A no-arg constructor. But not a default constructor.
    }
}

class Firm {

    Firm() {
        super(); // Call super constructor. Constructor of Object class.
    }
}

class Firm2 {

    Firm2() {
        /**
         * super(); // Compiler will add a no-arg call to super().
         **/
    }
}

class Firm3 {
    /**
     Firm3() { // Compiler will add both default constructor and no-arg call to super().
     super();
     }
     **/
}
