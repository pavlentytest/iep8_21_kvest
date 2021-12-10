package ru.samsung.itschool.mdev;

public class Question {

    private String title;
    private Answer[] answers;
    private int correct;

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public void setAnswers(Answer[] answers) {
        this.answers = answers;
    }

    public Question(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
class Answer {
    private String variant;

    public Answer(String variant) {
        this.variant = variant;
    }

    public String getVariant() {
        return variant;
    }
}
