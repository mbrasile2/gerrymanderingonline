package jaguars.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    String name;
    String description;

    public Person() {

    }

    public Person(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
