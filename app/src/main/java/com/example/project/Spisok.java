package com.example.project;

import java.util.ArrayList;
import java.util.HashMap;

public class Spisok {
    static ArrayList<String> questions = new ArrayList<String>();
    static HashMap<String, ArrayList<String>> answers = new HashMap<>();
    static ArrayList<String> rightAnswer = new ArrayList<String>();
    public static int index = 0;

    static {
        // добавим в список ряд элементов
        questions.add("Материализм - филофское течение, отвечающее на основной вопрос философии словом...");
        ArrayList<String> a = new ArrayList<String>();
        a.add("'бытие'");
        a.add("'сознание'");
        a.add("'эклектика'");
        a.add("'телевизор'");
        rightAnswer.add("'бытие'");
        answers.put("Материализм - филофское течение, отвечающее на основной вопрос философии словом...", a);

        questions.add("Идеализм - филофское течение, отвечающее на основной вопрос философии словом...");
        a = new ArrayList<>();
        a.add("'Иисус'");
        a.add("'Ленин'");
        a.add("'сознание'");
        a.add("'общество'");
        rightAnswer.add("'общество'");
        answers.put("Идеализм - филофское течение, отвечающее на основной вопрос философии словом...", a);

        questions.add("Когда родился Гегель?");
        a = new ArrayList<>();
        a.add("Не сказано");
        a.add("20 июня 1824 года");
        a.add("Вчера");
        a.add("Сегодня");
        rightAnswer.add("Не сказано");
        answers.put("Когда родился Гегель?", a);

        questions.add("ОВФ - это...");
        a = new ArrayList<>();
        a.add("Очень Вёрткий Фиксик");
        a.add("Основной Вопрос Философии");
        a.add("Огненная Вафля Фиска");
        a.add("Основной Вопрос Фероподов");
        rightAnswer.add("Основной Вопрос Философии");
        answers.put("ОВФ - это...", a);

        questions.add("В тексте писалось что-то, связанное с Лениным. Что?");
        a = new ArrayList<>();
        a.add("Ленин задал ОФВ");
        a.add("Ленин был позитивистом");
        a.add("Ничего не было");
        a.add("Ленин разоблачал позитивизм");
        rightAnswer.add("Ленин разоблачал позитивизм");
        answers.put("В тексте писалось что-то, связанное с Лениным. Что?", a);

        questions.add("Что из названного является сортом ликера?");
        a = new ArrayList<>();
        a.add("Пино-нуар");
        a.add("Мерло");
        a.add("Шартрез");
        a.add("Гевюрцтраминера");
        rightAnswer.add("Шартрез");
        answers.put("Что из названного является сортом ликера?", a);

        questions.add("Эклектика - это...");
        a = new ArrayList<>();
        a.add("Бессвязное бормотание");
        a.add("Сокращение от 'эка клетка!'");
        a.add("Множественное повторение одних и тех же слов");
        a.add("Нечто нелогичное/противоречащее самому себе");
        rightAnswer.add("Нечто нелогичное/противоречащее самому себе");
        answers.put("Эклектика - это...", a);

        questions.add("Существует ли философское течение, отрицающее само себя? Если да, то как оно называется?");
        a = new ArrayList<>();
        a.add("Это глупость. Нет конечно!");
        a.add("Позитивизм");
        a.add("Дуализм");
        a.add("Не сказано.");
        rightAnswer.add("Позитивизм");
        answers.put("Существует ли философское течение, отрицающее само себя? Если да, то как оно называется?", a);

        questions.add("Как в известной драме Гёте звали покровителя доктора Фауста?");
        a = new ArrayList<>();
        a.add("Азазель");
        a.add("Мефистофель");
        a.add("Михаил");
        a.add("Рафаэль");
        rightAnswer.add("Мефистофель");
        answers.put("Как в известной драме Гёте звали покровителя доктора Фауста?", a);

        questions.add("Существует ли философское течение, придерживающееся концепции двойственности субстанции? Если да, то как оно называется?");
        a = new ArrayList<>();
        a.add("Дэбизм");
        a.add("Монизм");
        a.add("Дуализм");
        a.add("Дуплетизм");
        rightAnswer.add("Дуализм");
        answers.put("Существует ли философское течение, придерживающееся концепции двойственности субстанции? Если да, то как оно называется?", a);

        questions.add("Сколько существовало волн позитивизма?");
        a = new ArrayList<>();
        a.add("Четыре");
        a.add("Три");
        a.add("Пять");
        a.add("Не сказано");
        rightAnswer.add("Четыре");
        answers.put("Сколько существовало волн позитивизма?", a);

        questions.add("Как оказалось, чем он являлся на самом деле?");
        a = new ArrayList<>();
        a.add("Идеализмом");
        a.add("Бредом");
        a.add("Единственной истинно-верной концепцией");
        a.add("Не сказано");
        rightAnswer.add("Идеализмом");
        answers.put("Как оказалось, чем он являлся на самом деле?", a);

    }
}
