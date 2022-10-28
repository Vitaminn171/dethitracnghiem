/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Quoc An
 */
import java.util.Date;
public class Model_User {
    private int ID;
    private String Username;
    private String Password;
    private String Fullname;
    private String Email;
    private Date Birth;
    private boolean Gender;
    private int OTP;
    private boolean LogStatus;
    private boolean BlockStatus;
    
    public Model_User(){
        
    }
    public Model_User(int ID, String Username, String Password, String Fullname, String Email, Date Birth, boolean Gender, int OTP, boolean LogStatus, boolean BlockStatus){
        this.Username = Username;
        this.ID = ID;
        this.Fullname = Fullname;
        this.Password = Password;
        this.Birth = Birth;
        this.Email = Email;
        this.Gender = Gender;
        this.BlockStatus = BlockStatus;
        this.LogStatus = LogStatus;
        this.OTP = OTP;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Fullname
     */
    public String getFullname() {
        return Fullname;
    }

    /**
     * @param Fullname the Fullname to set
     */
    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Birth
     */
    public Date getBirth() {
        return Birth;
    }

    /**
     * @param Birth the Birth to set
     */
    public void setBirth(Date Birth) {
        this.Birth = Birth;
    }

    /**
     * @return the Gender
     */
    public boolean getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the OTP
     */
    public int getOTP() {
        return OTP;
    }

    /**
     * @param OTP the OTP to set
     */
    public void setOTP(int OTP) {
        this.OTP = OTP;
    }

    /**
     * @return the LogStatus
     */
    public Boolean getLogStatus() {
        return LogStatus;
    }

    /**
     * @param LogStatus the LogStatus to set
     */
    public void setLogStatus(boolean LogStatus) {
        this.LogStatus = LogStatus;
    }

    /**
     * @return the BlockStatus
     */
    public boolean getBlockStatus() {
        return BlockStatus;
    }

    /**
     * @param BlockStatus the BlockStatus to set
     */
    public void setBlockStatus(boolean BlockStatus) {
        this.BlockStatus = BlockStatus;
    }
}
