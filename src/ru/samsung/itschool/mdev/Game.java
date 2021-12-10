package ru.samsung.itschool.mdev;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private String name;
    private ArrayList<Question> gameQuestions;
    private Scanner scanner;
    private Rating rating;

    public Game(String name, ArrayList<Question> gameQuestions) {
        this.name = name;
        this.gameQuestions = gameQuestions;
        this.rating = new Rating();
    }

    public void start() throws InterruptedException {
        scanner = new Scanner(System.in);
        System.out.println("Приветствуем вас в игре: "+this.name);
        System.out.println("Для ответа на вопрос укажите цифровой вариант ответа!");
        Thread.sleep(2000);
        for(Question q: this.gameQuestions) {
            System.out.println("Вопрос: " + q.getTitle());
            for(Answer a: q.getAnswers()) {
                System.out.println("Ответы: " + a.getVariant());
            }
            int a = scanner.nextInt();
            if(a == q.getCorrect()) {
                Rating.counter++;
            }
        }
        // проверка баллов
        // сообщение
    }
}
