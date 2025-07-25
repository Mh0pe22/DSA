import java.beans.Transient;
import java.io.*;

public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    private transient String password;

    Person(String name , int age , String password){
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString(){
        return "Person [name = " + name + "age = " + age + "]";
    }

}
