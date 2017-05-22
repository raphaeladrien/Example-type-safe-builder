package org.gojava.pojo;

import org.gojava.pojo.Builder.TRUE;

public class Person {

    private String name;
    private String age;
    private String telephone;
    
    public Person(Builder<TRUE, TRUE, TRUE> builder){
        this( builder.name, builder.age, builder.telephone );
    }
    
    private Person( String name, String age, String telephone ){
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }
    
    public String toString(){
        return "Name: " + name + " age: " + age + " telephone; " + telephone;
    }
    
}
