package com.company;

import com.company.model.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte age = 18;
        System.out.println("My age is " + age);

         int a = 5;
         Integer b = 5;



         Double c = 7.0;
         String str = "";

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date2 = LocalDate.of(2016, Month.DECEMBER,27);
        LocalDate date3 = date.plusDays(3);
        System.out.println(date.getDayOfWeek());

        int delay = (int) ChronoUnit.DAYS.between(date2, date3);
        System.out.println(delay);

        LocalDateTime instantTime = LocalDateTime.of(2019,Month.DECEMBER,27,18,2,11);

        System.out.println(instantTime);

        String dt = "27.12.2019";


        Student st1 = new Student(1, "Ivan", LocalDate.now().minusYears(20), "wasp", 77);
        Student st2 = new Student(2, "Stepan", LocalDate.now().minusYears(21), "latinos", 66);
        Student st3 = new Student(3, "Sidor", LocalDate.now().minusYears(16), "wasp", 88);
        Student st4 = new Student(4, "Petr", LocalDate.now().minusYears(15), "asia", 55);
        Student st5 = new Student(5, "Joan", LocalDate.now().minusYears(22), "wasp", 70);


        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        int counter = 0;
        for(Student student:students){
            if(student.getEthnicity().equals("wasp")) {
                counter++;}
        }
        System.out.println(counter);

        counter = (int) students.stream().filter(student -> student.getEthnicity().equals("wasp")).count();

        students.stream().forEach(item->System.out.println(item));

        System.out.println(st1.getFullAge());

        students.stream().filter(el-> el.isOverAge())
                .forEach(el -> System.out.println(el));

        System.out.println(students.stream().mapToDouble(Student::getGrade)
                .boxed().min(Double::compare).orElse(0.0));

    }
}
