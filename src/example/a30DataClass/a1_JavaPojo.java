package example.a30DataClass;

import java.util.Objects;

public class a1_JavaPojo {

    Integer id;
    String name;
    String surname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        a1_JavaPojo AJavaPojo = (a1_JavaPojo) o;
        return Objects.equals(id, AJavaPojo.id) &&
                Objects.equals(name, AJavaPojo.name) &&
                Objects.equals(surname, AJavaPojo.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname);
    }

    @Override
    public String toString() {
        return "JavaPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
