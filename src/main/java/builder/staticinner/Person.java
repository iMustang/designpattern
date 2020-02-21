package builder.staticinner;

import lombok.ToString;

/**
 * Person
 * 静态内部类实现建造者模式
 *
 * @author xMustang
 * @version 1.0
 * @date 2020/2/21 13:44
 */
@ToString
public class Person {
    private int id;
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(PersonBuilder personBuilder) {
        this.id = personBuilder.id;
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.address = personBuilder.address;
    }

    public static Person.PersonBuilder builder() {
        return new Person.PersonBuilder();
    }

    public static class PersonBuilder {

        private int id;
        private String name;
        private int age;
        private String address;

        public PersonBuilder() {
        }

        public Person build() {
            return new Person(this);
        }

        public PersonBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }
    }
}
