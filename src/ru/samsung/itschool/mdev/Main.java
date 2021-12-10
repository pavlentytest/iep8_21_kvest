package ru.samsung.itschool.mdev;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// Игра к в города:
        // - Игра
        // - Вопросы
        // - Ответы
        // - Рейтинг

        Question question = new Question("Столица России?");
        Answer[] answer = {
                new Answer("1 - Москва"),
                new Answer("2 - Казань"),
                new Answer("3 - Санкт-Петербург")
        };
        question.setAnswers(answer);
        question.setCorrect(0);

        Question question2 = new Question("Столица Германии?");
        Answer[] answer2 = {
                new Answer("1 - Мюнхен"),
                new Answer("2 - Берлин"),
                new Answer("3 - Гамбург"),
                new Answer("4 - Бонн")
        };
        question.setAnswers(answer2);
        question.setCorrect(1);

        ArrayList<Question> questionArrayList = new ArrayList<>();
        questionArrayList.add(question);
        questionArrayList.add(question2);
        //....
        Game game = new Game("Игра в города", questionArrayList);
        game.start();




    }
}
