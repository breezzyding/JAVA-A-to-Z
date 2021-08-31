package com.dinglearn.static_;

public class TestPerson {
    public static void main(String[] args) {
        /**
         * 练习2
         * System.out.println("Number of total is " + Person.getTotalPerson());
         * Person p1 = new Person();
         * System.out.println("Number of total is " + Person.getTotalPerson());
         */
        Person.setTotalPerson(3);
        new Person();


    }
}

class Person {
    private int id;
    private static int total = 0;
    public static int getTotalPerson() {

        return total;
    }
    public static void setTotalPerson(int total) {
        Person.total = total;
    }

    public Person() {
        total++;
        id = total;
        System.out.println(total);
    }
}


