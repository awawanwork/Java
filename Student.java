public class Student extends PersonalInfo {

    private String rollNum;

    // Getter and setter methods for roll number
    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        if (rollNum.matches("\\d{11}")) {
            this.rollNum = rollNum;
        } else {
            System.out.println("Invalid phone number format. Please provide a 11-digit number.");
        }
    }
    
    @Override
    public Double calculate(double a, double b){
        double c = a-b;
        return c;
    }
    
}
