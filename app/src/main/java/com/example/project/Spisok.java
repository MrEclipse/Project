package com.example.project;

import java.util.ArrayList;
import java.util.HashMap;

public class Spisok {
    static ArrayList<String> questions = new ArrayList<String>();
    static HashMap<String, ArrayList<String>> answers = new HashMap<>();
    public static int index = 0;

    static {
        // добавим в список ряд элементов
        questions.add("Когда полетел в космос Юрий Гагарин?");
        ArrayList<String> a = new ArrayList<String>();
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");
        answers.put("Когда полетел в космос Юрий Гагарин?", a);

        questions.add("Когда развалился СССР?");
        a = new ArrayList<>();
        a.add("6");
        a.add("7");
        a.add("8");
        a.add("9");
        answers.put("Когда развалился СССР?", a);

        questions.add("Когда родился Гегел?");
        a = new ArrayList<>();
        a.add("4");
        a.add("154");
        a.add("1564");
        a.add("136");
        answers.put("Когда родился Гегел?", a);

        questions.add("Кем был Энгельс?");
        a = new ArrayList<>();
        a.add("163");
        a.add("154");
        a.add("175");
        a.add("146");
        answers.put("Кем был Энгельс?", a);

        questions.add("Cколько лет было Канту, когда он умер?");
        a = new ArrayList<>();
        a.add("133");
        a.add("164");
        a.add("185");
        a.add("176");
        answers.put("Cколько лет было Канту, когда он умер?", a);

        questions.add("Что из названного является сортом ликера?");
        a = new ArrayList<>();
        a.add("153");
        a.add("1644");
        a.add("1575");
        a.add("165");
        answers.put("Что из названного является сортом ликера?", a);

        questions.add("Какой древнегреческий философ любил повторять: \"Я знаю, что ничего не знаю\"?");
        a = new ArrayList<>();
        a.add("1387");
        a.add("145");
        a.add("157");
        a.add("1665");
        answers.put("Какой древнегреческий философ любил повторять: \"Я знаю, что ничего не знаю\"?", a);

        questions.add("Какой модуль был пристыкован к орбитальному комплексу \"Мир\" последним?");
        a = new ArrayList<>();
        a.add("13756");
        a.add("147");
        a.add("15y");
        a.add("1hty6");
        answers.put("Какой модуль был пристыкован к орбитальному комплексу \"Мир\" последним?", a);

        questions.add("Как в известной драме Гёте звали покровителя доктора Фауста?");
        a = new ArrayList<>();
        a.add("13ht");
        a.add("14fg");
        a.add("15y");
        a.add("1rt6");
        answers.put("Как в известной драме Гёте звали покровителя доктора Фауста?", a);

        questions.add("Сколько граней имеет куб?");
        a = new ArrayList<>();
        a.add("1ue3");
        a.add("14te");
        a.add("15tyw");
        a.add("16hrth");
        answers.put("Сколько граней имеет куб?", a);

    }
}
