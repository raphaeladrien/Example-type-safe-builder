package org.gojava.pojo;

public class Builder<HA, HB, HC> {
    
    protected String name;
    protected Integer age;
    protected String state;
    
    private Builder(){
        super();
    }
    
    private Builder( String name, Integer age, String state ){
        super();
        this.name = name;
        this.age = age;
        this.state = state;
    }
    
    public static Builder<FALSE, FALSE, FALSE> create(){
        return new Builder<FALSE, FALSE, FALSE>();
    }
    
    public Builder<TRUE, HB, HC> initName( String name ){
        return new Builder<TRUE, HB, HC>( name, age, state );
    }
    
    public Builder<HA, TRUE, HC> initAge( Integer age ){
        return new Builder<HA, TRUE, HC>( name, age, state );
    }
    
    public Builder<HA, HB, TRUE> initTelephone( String telephone ){
        return new Builder<HA, HB, TRUE>( name, age, state );
    }
    
    static abstract class TRUE{};
    static abstract class FALSE{};
}
