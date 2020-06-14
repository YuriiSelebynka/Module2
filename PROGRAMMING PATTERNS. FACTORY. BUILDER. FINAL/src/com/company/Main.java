/*
 *
 * Classame : Java Development (K)
 *
 *  13 June 2020
 *
 * Created by Selebynka Yurii (UzhNU)
 *
 *  Programming patterns. Factory. Builder.
 *
 *    Develop for your class
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student.
 *
 * */

package com.company;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

            // 1. Factory
        /* Here we check Factory for class Ring - we create
        a sample VW for this class*/

        Ring VW = RingFactory.create(4,5);
        System.out.println(VW);

            // 2. Abstract factory.
        /* Here we check Abstract factory - we create
        a sample circle1 */

        Geometry circle1 = AbstractFactoryRing.create(4,4, Figures.CIRCLE);
        System.out.println(circle1);

            // 3. Create a class Student  - 25 fields.
        /* Here we create a sample yurii for class Student using Constructor*/

        Student yurii = new Student("Yurii", "Selebynka",
                "Vasylovich", LocalDate.of(1996, Month.MAY,
                6), "male", "passport",
                "+380979116919", "yura@mail.com", true,
                true, "atheist", false,
                "Slovak", 199, 194,
                167, 196, true,
                true, 12, 108, "law 081",
                "Civil law and process", "master", false,
                "Cargo delivery agreements", "Krivonis Ivan Ivanovich",
                "-", 2, 0,
                true, false, false, "-",
                "-");
        System.out.println(yurii);

            // 4. Create a builder for the class Student.
        /* Here we create and check a sample ivan for class Student using Builder*/

        Student ivan = new Student.Builder()
                .setFirstName("Ivan")
                .setSurName("Krivonis")
                .setPatronymic("Ivanovich")
                .setBirthday(LocalDate.of(1994, Month.SEPTEMBER, 12))
                .setGender("male")
                .setIdentityDocument("passport")
                .setPhoneNumber("+380969116919")
                .setEMailAddress("ivan@mail.com")
                .setIsAdult(true)
                .setIsMilitary(true)
                .setPersuasion("orthodox")
                .setIsPrivileged(false)
                .setKnowledgeOfForeignLanguages("Slovak")
                .setCertificateMark(199)
                .setUALanguageZNOResults(194)
                .setEnglishLanguageZNOResults(167)
                .setHistoryZNOResults(197)
                .setIsStateEmployee(true)
                .setIsScholar(true)
                .setStudentTicketNumber(13)
                .setCreditBookNumber(1000)
                .setSpeciality("law 081")
                .setChair("Civil law and process")
                .setEducationLevel("master")
                .setIsReTakesTheExams(false)
                .setTitleOfThesis("IT agreements")
                .setSupervisor("Krivonis Ivan Ivanovich")
                .setSpecialCourses("-")
                .setNumberOfConferences(0)
                .setNumberOfScientificArticles(4)
                .setParticipationInLegalClinic(false)
                .setIsSportsActivist(false)
                .setIsArtActivist(false)
                .setSpecialAwards("-")
                .setNotes("-")
                .build();
        System.out.println(ivan);

            // 4. Create a builder for the class Student.
        /* Here we create and check a similar to ivan sample andriy for class Student
        using Builder and method setSimilarTo*/

        Student andriy = new Student.Builder()
                .setSimilarTo(ivan)
                .setFirstName("Andriy")
                .setSurName("Andriyenko")
                .build();
        System.out.println(andriy);
    }
}

