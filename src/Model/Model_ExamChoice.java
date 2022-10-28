/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quoc An
 */
public class Model_ExamChoice {
    private String ExamID;
    private int NumChoice;
    private String Question;
    private String Choice1;
    private String Choice2;
    private String Choice3;
    private String Choice4;
    private String Answer;
    
    public Model_ExamChoice(){
        
    }
    
    public Model_ExamChoice(String ExamID, int NumChoice, String Question, String Choice1, String Choice2, String Choice3, String Choice4, String Answer){
        this.Answer = Answer;
        this.Choice1 = Choice1;
        this.Choice2 = Choice2;
        this.Choice3 = Choice3;
        this.Choice4 = Choice4;
        this.ExamID = ExamID;
        this.NumChoice = NumChoice;
        this.Question = Question;
    }

    /**
     * @return the ExamID
     */
    public String getExamID() {
        return ExamID;
    }

    /**
     * @param ExamID the ExamID to set
     */
    public void setExamID(String ExamID) {
        this.ExamID = ExamID;
    }

    /**
     * @return the NumChoice
     */
    public int getNumChoice() {
        return NumChoice;
    }

    /**
     * @param NumChoice the NumChoice to set
     */
    public void setNumChoice(int NumChoice) {
        this.NumChoice = NumChoice;
    }

    /**
     * @return the Question
     */
    public String getQuestion() {
        return Question;
    }

    /**
     * @param Question the Question to set
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * @return the Choice1
     */
    public String getChoice1() {
        return Choice1;
    }

    /**
     * @param Choice1 the Choice1 to set
     */
    public void setChoice1(String Choice1) {
        this.Choice1 = Choice1;
    }

    /**
     * @return the Choice2
     */
    public String getChoice2() {
        return Choice2;
    }

    /**
     * @param Choice2 the Choice2 to set
     */
    public void setChoice2(String Choice2) {
        this.Choice2 = Choice2;
    }

    /**
     * @return the Choice3
     */
    public String getChoice3() {
        return Choice3;
    }

    /**
     * @param Choice3 the Choice3 to set
     */
    public void setChoice3(String Choice3) {
        this.Choice3 = Choice3;
    }

    /**
     * @return the Choice4
     */
    public String getChoice4() {
        return Choice4;
    }

    /**
     * @param Choice4 the Choice4 to set
     */
    public void setChoice4(String Choice4) {
        this.Choice4 = Choice4;
    }

    /**
     * @return the Answer
     */
    public String getAnswer() {
        return Answer;
    }

    /**
     * @param Answer the Answer to set
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
    
}
