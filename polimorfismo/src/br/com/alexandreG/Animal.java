/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;

public abstract class Animal {
    //attributes
    private Float weight;
    private Integer members;
    private Integer age;

    //methods
    public abstract void move();
    public abstract void feed();
    public abstract void makeSound();

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", members=" + members +
                ", age=" + age +
                '}';
    }
}
