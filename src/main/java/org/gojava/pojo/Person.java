package org.gojava.pojo;

import org.gojava.pojo.Builder.TRUE;

public class Person {

    private String name;
    private Integer age;
    private String state;
    
    public Person(Builder<TRUE, TRUE, TRUE> builder){
        this( builder.name, builder.age, builder.state );
    }
    
    private Person( String name, Integer age, String state ){
        this.name = name;
        this.age = age;
        this.state = state;
    }
    
    public String toString(){
        return "Name: " + name + " age: " + age + " state: " + state;
    }
    
}
