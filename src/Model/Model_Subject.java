/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quoc An
 */
public class Model_Subject {
    private int SubjectID;
    private String SubjectName;
    
    
    public Model_Subject(){
        
    }
    
    public Model_Subject(int SubjectID, String SubjectName){
        this.SubjectID = SubjectID;
        this.SubjectName = SubjectName;
        
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
     * @return the SubjectName
     */
    public String getSubjectName() {
        return SubjectName;
    }

    /**
     * @param SubjectName the SubjectName to set
     */
    public void setSubjectName(String SubjectName) {
        this.SubjectName = SubjectName;
    }
    
}
