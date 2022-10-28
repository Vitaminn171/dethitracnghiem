/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quoc An
 */
public class Model_Result {
    private int ResultID;
    private String ExamID;
    private String Examinee;
    private float Score;
    private int CorrectQuiz;
    private int WrongQuiz;
    private int NumOfTime;
    
    public Model_Result(){
        
    }
    
    public Model_Result(int ResultID, String ExamID, String Examinee, float Score, int CorrectQuiz, int WrongQuiz, int NumOfTime){
        this.CorrectQuiz = CorrectQuiz;
        this.ExamID = ExamID;
        this.Examinee = Examinee;
        this.NumOfTime = NumOfTime;
        this.ResultID = ResultID;
        this.Score = Score;
        this.WrongQuiz = WrongQuiz;
    }
    
    
    

    /**
     * @return the ResultID
     */
    public int getResultID() {
        return ResultID;
    }

    /**
     * @param ResultID the ResultID to set
     */
    public void setResultID(int ResultID) {
        this.ResultID = ResultID;
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
     * @return the Examinee
     */
    public String getExaminee() {
        return Examinee;
    }

    /**
     * @param Examinee the Examinee to set
     */
    public void setExaminee(String Examinee) {
        this.Examinee = Examinee;
    }

    /**
     * @return the Score
     */
    public Float getScore() {
        return Score;
    }

    /**
     * @param Score the Score to set
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * @return the CorrectQuiz
     */
    public int getCorrectQuiz() {
        return CorrectQuiz;
    }

    /**
     * @param CorrectQuiz the CorrectQuiz to set
     */
    public void setCorrectQuiz(int CorrectQuiz) {
        this.CorrectQuiz = CorrectQuiz;
    }

    /**
     * @return the WrongQuiz
     */
    public int getWrongQuiz() {
        return WrongQuiz;
    }

    /**
     * @param WrongQuiz the WrongQuiz to set
     */
    public void setWrongQuiz(int WrongQuiz) {
        this.WrongQuiz = WrongQuiz;
    }

    /**
     * @return the NumOfTime
     */
    public int getNumOfTime() {
        return NumOfTime;
    }

    /**
     * @param NumOfTime the NumOfTime to set
     */
    public void setNumOfTime(int NumOfTime) {
        this.NumOfTime = NumOfTime;
    }
}
