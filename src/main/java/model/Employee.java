package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "city_id")
    private Long cityId;
//    @Column(name = "city")
//    private int city;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String firstName,
                    String lastName,
                    String gender,
                    int age,
                    Long cityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }

    public Employee(int id,
                    String firstName,
                    String lastName,
                    String gender,
                    int age,
                    Long cityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first_name) {
        this.firstName = first_name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last_name) {
        this.lastName = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long city_id) {
        this.cityId = city_id;
    }

//    public int getCity() {
//        return city;
//    }
//
//    public void setCity(int city) {
//        this.city = city;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id
                && age == employee.age
//                && city == employee.city
                && Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName)
                && Objects.equals(gender, employee.gender)
                && Objects.equals(cityId, employee.cityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender, age, cityId/*, city*/);
    }

    @Override
    public String
    toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", city_id=" + cityId +
//                ", city=" + city +
                '}';
    }
}
