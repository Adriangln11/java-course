package builder;

import java.util.Objects;

public class Person {
  String name;
  String rol;
  int age;

  public Person() {
    this.name = name;
    this.rol = rol;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getRol() {
    return rol;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name) && Objects.equals(rol, person.rol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rol, age);
  }

  @Override
  public String toString() {
    return "Person{" +
      "name='" + name + '\'' +
      ", rol='" + rol + '\'' +
      ", age=" + age +
      '}';
  }

  public static final class PersonBuilder {
    private String name;
    private String rol;
    private int age;

    private PersonBuilder() {
    }

    public static PersonBuilder aPerson() {
      return new PersonBuilder();
    }

    public PersonBuilder withName(String name) {
      this.name = name;
      return this;
    }

    public PersonBuilder withRol(String rol) {
      this.rol = rol;
      return this;
    }

    public PersonBuilder withAge(int age) {
      this.age = age;
      return this;
    }

    public Person build() {
      Person person = new Person();
      person.age = this.age;
      person.name = this.name;
      person.rol = this.rol;
      return person;
    }
  }
}
