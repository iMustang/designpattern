package builder.staticinner;

/**
 * Main
 *
 * @author xMustang
 * @version 1.0
 * @date 2020/2/21 13:45
 */
public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .id(1)
                .name("zhangsan")
                .age(21)
                .address("nanjing")
                .build();
        System.out.println(person);
    }
}
