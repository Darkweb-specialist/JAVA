interface collegeData {
    void collegeDetail();
}

interface HostelData {
    void hostelData();
}

public class Studentrecord implements collegeData, HostelData {
    public void collegeDetail() {
        System.out.println(" courses of Student : MCA , MTech , MBA , BCA");
    }

    public void hostelData() {
        System.out.println(" Hostel name : shreekrishna hostel Thane 400604 MH ");
    }

    public void StudentData() {
        System.out.println("Student Selected based on: percentage, financial condition.");
    }

    public static void main(String args[]) {
        Studentrecord student = new Studentrecord();
        student.collegeDetail();
        student.hostelData();
        student.StudentData();
    }
}
