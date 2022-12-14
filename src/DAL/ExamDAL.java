package DAL;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.ExamDTO;

public class ExamDAL extends MyDatabaseManager {

    public ExamDAL() {
        ExamDAL.connectDB();
    }

    public ArrayList readExam() throws SQLException {
        String query = "SELECT * FROM exam, user, subject WHERE user.UserID = exam.Creator AND subject.SubjectID = exam.SubjectID";
        ResultSet rs = ExamDAL.doReadQuery(query);
        ArrayList list = new ArrayList();

        if (rs != null) {
            while (rs.next()) {
                ExamDTO e = new ExamDTO();
                e.setExamID(rs.getInt("ExamID"));
                e.setTitle(rs.getString("ExamTitle"));
                e.setFullname(rs.getString("Fullname"));
                e.setSubjectname(rs.getString("SubjectName"));
                e.setNumOfQuiz(rs.getInt("NumOfQuiz"));
                e.setTime(rs.getInt("LimitTime"));
                e.setStatus(rs.getBoolean("ExamStatus"));
                e.setNumOfDo(rs.getInt("NumOfDo"));
                e.setHighest(rs.getFloat("HighestScore"));
                e.setLowest(rs.getFloat("LowestScore"));
                e.setAvg(rs.getFloat("AvgScore"));
                list.add(e);
            }
        }
        return list;
    }

    public ArrayList getExamBySubject(int SubjectID) throws SQLException {
        String query = "SELECT * FROM exam, user, subject WHERE user.UserID = exam.Creator AND subject.SubjectID = exam.SubjectID AND exam.SubjectID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        p.setInt(1, SubjectID);
        ResultSet rs = p.executeQuery();
        ArrayList list = new ArrayList();
        if (rs != null) {
            while (rs.next()) {
                ExamDTO e = new ExamDTO();
                e.setExamID(rs.getInt("ExamID"));
                e.setTitle(rs.getString("ExamTitle"));
                e.setFullname(rs.getString("Fullname"));
                e.setSubjectname(rs.getString("SubjectName"));
                e.setNumOfQuiz(rs.getInt("NumOfQuiz"));
                e.setTime(rs.getInt("LimitTime"));
                e.setStatus(rs.getBoolean("ExamStatus"));
                e.setNumOfDo(rs.getInt("NumOfDo"));
                e.setHighest(rs.getFloat("HighestScore"));
                e.setLowest(rs.getFloat("LowestScore"));
                e.setAvg(rs.getFloat("AvgScore"));
                list.add(e);
            }
        }
        return list;
    }
    
    public ArrayList getExamByUser(int UserID) throws SQLException {
        String query = "SELECT * FROM exam, user, subject WHERE user.UserID = exam.Creator AND subject.SubjectID = exam.SubjectID AND exam.UserID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        p.setInt(1, UserID);
        ResultSet rs = p.executeQuery();
        ArrayList list = new ArrayList();
        if (rs != null) {
            while (rs.next()) {
                ExamDTO e = new ExamDTO();
                e.setExamID(rs.getInt("ExamID"));
                e.setTitle(rs.getString("ExamTitle"));
                e.setSubjectname(rs.getString("SubjectName"));
                e.setNumOfQuiz(rs.getInt("NumOfQuiz"));
                e.setTime(rs.getInt("LimitTime"));
                e.setStatus(rs.getBoolean("ExamStatus"));
                e.setNumOfDo(rs.getInt("NumOfDo"));
                e.setHighest(rs.getFloat("HighestScore"));
                e.setLowest(rs.getFloat("LowestScore"));
                e.setAvg(rs.getFloat("AvgScore"));
                list.add(e);
            }
        }
        return list;
    }

    // DEFAULT: Creator l?? ng?????i th??m ?????, ExamStatus l?? 0, NumOfDo l?? 0, c??c Score
    // l?? NULL (WIP)
    public int insertExam(ExamDTO e) throws SQLException {
        String query = "INSERT INTO exam (ExamTitle, SubjectID, NumOfQuiz, LimitTime) VALUES (?, ?, ?, ?)";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        p.setString(1, e.getTitle());
        p.setInt(2, e.getSubjectID());
        p.setInt(3, e.getNumOfQuiz());
        p.setInt(4, e.getTime());
        int result = p.executeUpdate();
        return result;
    }

    // ??i???u ki???n ????? s???a: ExamStatus = 0 ho???c l?? NumOfDo = 0
    public int updateExam(ExamDTO e) throws SQLException {
        String query = "UPDATE exam SET ExamTitle = ?, SubjectID = ? , NumOfQuiz = ?, LimitTime = ? WHERE ExamID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        p.setString(1, e.getTitle());
        p.setInt(2, e.getSubjectID());
        p.setInt(3, e.getNumOfQuiz());
        p.setInt(4, e.getTime());
        int result = p.executeUpdate();
        return result;
    }

    // ??i???u ki???n ????? x??a: ExamStatus = 0 ho???c l?? NumOfDo = 0
    public int deleteExam(int ExamID) throws SQLException {
        String query = "DELETE FROM exam WHERE ExamID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        p.setInt(1, ExamID);
        int result = p.executeUpdate();

        return result;
    }

    // T??m theo t??n t??c gi??? ho???c t??n ?????
    public List findExam(String str) throws SQLException {
        String query = "SELECT * FROM exam e, user u, subject s WHERE u.UserID = e.Creator AND s.SubjectID = e.SubjectID AND (e.ExamTitle LIKE ? OR u.Fullname LIKE ?)";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        p.setString(1, "%" + str + "%");
        p.setString(2, "%" + str + "%");
        ResultSet rs = p.executeQuery();
        List list = new ArrayList();
        if (rs != null) {
            while (rs.next()) {
                ExamDTO e = new ExamDTO();
                e.setExamID(rs.getInt("ExamID"));
                e.setTitle(rs.getString("ExamTitle"));
                e.setFullname(rs.getString("Fullname"));
                e.setSubjectname(rs.getString("SubjectName"));
                e.setNumOfQuiz(rs.getInt("NumOfQuiz"));
                e.setTime(rs.getInt("LimitTime"));
                e.setStatus(rs.getBoolean("ExamStatus"));
                e.setNumOfDo(rs.getInt("NumOfDo"));
                e.setHighest(rs.getFloat("HighestScore"));
                e.setLowest(rs.getFloat("LowestScore"));
                e.setAvg(rs.getFloat("AvgScore"));
                list.add(e);
            }
        }
        return list;
    }

    public int getNumberOfExam() throws SQLException {
        String query = "SELECT COUNT(*) FROM exam";
        ResultSet rs = UserDAL.doReadQuery(query);
        return rs.getInt(1);
    }

    // T??ng NumOfDo (S??? l???n thi) (WIP)
    public int Increase(int ExamID) throws SQLException {
        String query = "UPDATE Exam SET NumOfDo = ? WHERE ExamID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        // T??ng NumOfDo l??n 1
        p.setInt(2, ExamID);
        int result = p.executeUpdate();
        return result;
    }

    // T??nh AvgScore (??i???m trung b??nh c???a ?????) (WIP)
    public int CalAvg(int ExamID, float Avg) throws SQLException {
        String query = "UPDATE exam SET AvgScore = ? WHERE ExamID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);

        p.setInt(1, ExamID);
        int result = p.executeUpdate();
        return result;
    }

    // C???p nh???t HighestScore (WIP)
    public int Highest(int ExamID) throws SQLException {
        String query = "UPDATE exam SET HighestScore = ? WHERE ExamID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        // Set HighestScore m???i n???u l???n h??n HighestScore c??
        p.setInt(1, ExamID);
        int result = p.executeUpdate();
        return result;
    }

    // C???p nh???t LowestScore (WIP)
    public int Lowest(int ExamID) throws SQLException {
        String query = "UPDATE exam SET LowestScore = ? WHERE ExamID = ?";
        PreparedStatement p = ExamDAL.getConnection().prepareStatement(query);
        // Set LowestScore m???i n???u nh??? h??n LowestScore c??
        p.setInt(1, ExamID);
        int result = p.executeUpdate();
        return result;
    }
}
