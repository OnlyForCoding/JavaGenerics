package collectionapi;

import java.util.Arrays;

public class ArrayProblems {

    public static void main(String[] args) {

        Person j = new Person("jitu",28);
        Person n = new Person("Nauman", 35);

        Person[] people = {j,n};
        System.out.println(people);
        System.out.println(Arrays.toString(people));

        Person m = new Person("monu", 30);
        people = add(m, people);
        System.out.println(Arrays.toString(people));
    }

    private static Person[] add(Person m, Person[] people) {
        int len = people.length;
        people = Arrays.copyOf(people,len+1);
        people[len] = m;
        return people;
    }
}
