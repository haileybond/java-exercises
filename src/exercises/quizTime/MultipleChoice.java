package exercises.quizTime;

import java.util.HashMap;

public class MultipleChoice extends Question {

    //fields
    private String questionPrompt;
    private String correctPrompt;
    private String incorrectPrompt;
    private String questionType;
    private HashMap<String, Boolean> answerKey;

    //constructor
    public MultipleChoice(String questionPrompt, String correctPrompt, String incorrectPrompt, String questionType, HashMap<String, Boolean> answerKey) {
        this.questionPrompt = questionPrompt;
        this.correctPrompt = correctPrompt;
        this.incorrectPrompt = incorrectPrompt;
        this.questionType = questionType;
        this.answerKey = answerKey;
    }

    //getters

    public String getQuestionPrompt() {
        return questionPrompt;
    }

    public String getCorrectPrompt() {
        return correctPrompt;
    }

    public String getIncorrectPrompt() {
        return incorrectPrompt;
    }

    public String getQuestionType() {
        return questionType;
    }

    public HashMap<String, Boolean> getAnswerKey() {
        return answerKey;
    }

    //setters

    public void setQuestionPrompt(String aQuestionPrompt) {
        this.questionPrompt = aQuestionPrompt;
    }

    public void setCorrectPrompt(String aCorrectPrompt) {
        this.correctPrompt = aCorrectPrompt;
    }

    public void setIncorrectPrompt(String anIncorrectPrompt) {
        this.incorrectPrompt = anIncorrectPrompt;
    }

    public void setQuestionType(String aQuestionType) {
        this.questionType = aQuestionType;
    }

    public void setAnswerKey(HashMap<String, Boolean> anAnswerKey) {
        this.answerKey = anAnswerKey;
    }

    //methods

    //grade question
    public Boolean gradeQuestion(int userAnswer) {
        return (Boolean)answerKey.get(userAnswer);
    }

}
