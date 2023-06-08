package com.binaryTree;

public class Person implements Comparable<Person> {
    private Integer age;
    private String firstName;
    private String lastName;

    @Override
    public String toString(){
        return age.toString() + " " + firstName + " " + lastName;
    }
    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public int compareTo(Person person){
        return age.compareTo(person.getAge());
    }
}
