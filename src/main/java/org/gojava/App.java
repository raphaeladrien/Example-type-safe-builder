package org.gojava;

import org.gojava.pojo.Builder;
import org.gojava.pojo.Person;

public class App {
    
    public static void main(String[] args) {

        Builder<?, ?, ?> builder = Builder.create();
        Person person = new Person(builder.initName("GOJAVA").initAge("12")
                .initTelephone("+55 62"));
        
        System.out.println( person.toString() );
    }
}
