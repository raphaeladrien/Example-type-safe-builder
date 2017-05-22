package org.gojava.pojo;

public class Builder<HA, HB, HC> {
    
    protected String name;
    protected String age;
    protected String telephone;
    
    private Builder(){
        super();
    }
    
    private Builder( String name, String age, String telephone ){
        super();
        this.name = name;
        this.age = age;
        this.telephone = telephone;
    }
    
    public static Builder<FALSE, FALSE, FALSE> create(){
        return new Builder<FALSE, FALSE, FALSE>();
    }
    
    public Builder<TRUE, HB, HC> initName( String name ){
        return new Builder<TRUE, HB, HC>( name, age, telephone );
    }
    
    public Builder<HA, TRUE, HC> initAge( String age ){
        return new Builder<HA, TRUE, HC>( name, age, telephone );
    }
    
    public Builder<HA, HB, TRUE> initTelephone( String telephone ){
        return new Builder<HA, HB, TRUE>( name, age, telephone );
    }
    
    static abstract class TRUE{};
    static abstract class FALSE{};
}
