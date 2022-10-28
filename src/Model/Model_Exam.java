/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quoc An
 */
public class Model_Exam {
    private String ExamID;
    private String ExamTitle;
    private int Creator;
    private int SubjectID;
    private int NumOfQuestion;
    private int LimitTime;
    private boolean ExamStatus;
    private int NumOfDo;
    private float HighestScore;
    private float LowestScore;
    private float AvgScore;

    public Model_Exam(){
        
       
    }
    
    public Model_Exam(String ExamID, String ExamTitle, int Creator, int SubjectID, int NumOfQuestion, int LimitTime, boolean ExamStatus, int NumOfDo, float HighestScore, float LowestScore, float AvgScore){
        this.AvgScore = AvgScore;
        this.Creator = Creator;
        this.ExamID = ExamID;
        this.ExamStatus = ExamStatus;
        this.ExamTitle = ExamTitle;
        this.HighestScore = HighestScore;
        this.LimitTime = LimitTime;
        this.LowestScore = LowestScore;
        this.NumOfDo = NumOfDo;
        this.NumOfQuestion = NumOfQuestion;
        this.SubjectID = SubjectID;
       
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
     * @return the ExamTitle
     */
    public String getExamTitle() {
        return ExamTitle;
    }

    /**
     * @param ExamTitle the ExamTitle to set
     */
    public void setExamTitle(String ExamTitle) {
        this.ExamTitle = ExamTitle;
    }

    /**
     * @return the Creator
     */
    public int getCreator() {
        return Creator;
    }

    /**
     * @param Creator the Creator to set
     */
    public void setCreator(int Creator) {
        this.Creator = Creator;
    }

    /**
     * @return the SubjectID
     */
    public int getSubjectID() {
        return SubjectID;
    }

    /**
     * @param SubjectID the SubjectID to set
     */
    public void setSubjectID(int SubjectID) {
        this.SubjectID = SubjectID;
    }

    /**
     * @return the NumOfQuestion
     */
    public int getNumOfQuestion() {
        return NumOfQuestion;
    }

    /**
     * @param NumOfQuestion the NumOfQuestion to set
     */
    public void setNumOfQuestion(int NumOfQuestion) {
        this.NumOfQuestion = NumOfQuestion;
    }

    /**
     * @return the LimitTime
     */
    public int getLimitTime() {
        return LimitTime;
    }

    /**
     * @param LimitTime the LimitTime to set
     */
    public void setLimitTime(int LimitTime) {
        this.LimitTime = LimitTime;
    }

    /**
     * @return the ExamStatus
     */
    public boolean isExamStatus() {
        return ExamStatus;
    }

    /**
     * @param ExamStatus the ExamStatus to set
     */
    public void setExamStatus(boolean ExamStatus) {
        this.ExamStatus = ExamStatus;
    }

    /**
     * @return the NumOfDo
     */
    public int getNumOfDo() {
        return NumOfDo;
    }

    /**
     * @param NumOfDo the NumOfDo to set
     */
    public void setNumOfDo(int NumOfDo) {
        this.NumOfDo = NumOfDo;
    }

    /**
     * @return the HighestScore
     */
    public float getHighestScore() {
        return HighestScore;
    }

    /**
     * @param HighestScore the HighestScore to set
     */
    public void setHighestScore(float HighestScore) {
        this.HighestScore = HighestScore;
    }

    /**
     * @return the LowestScore
     */
    public float getLowestScore() {
        return LowestScore;
    }

    /**
     * @param LowestScore the LowestScore to set
     */
    public void setLowestScore(float LowestScore) {
        this.LowestScore = LowestScore;
    }

    /**
     * @return the AvgScore
     */
    public float getAvgScore() {
        return AvgScore;
    }

    /**
     * @param AvgScore the AvgScore to set
     */
    public void setAvgScore(float AvgScore) {
        this.AvgScore = AvgScore;
    }
    
}
