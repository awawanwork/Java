import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {

            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new RegistrationForm();
                }
            });

            // Addition a1 =new Addition(4,5);
//         // System.out.println(a1.sum());
        
            // PersonalInfo info = new PersonalInfo();
            // PersonalInfo subtraction = new Student();
            // // info.calculate(4, 10);
            // System.out.println(info.calculate(4, 10)); 
            // System.out.println(subtraction.calculate(4, 10)); 

            
            // info.setName("1233");
            // info.setFatherName("John");
            // info.setPhoneNumber("1234567890");
            // info.setAddress("123 Main Street");
            // info.setAge(20);
            // info.setGender("Female");

            // System.out.println("Student Information:");
            // System.out.println("Name: " + info.getName());
            // System.out.println("Father's Name: " + info.getFatherName());
            // System.out.println("Phone Number: " + info.getPhoneNumber());
            // System.out.println("Address: " + info.getAddress());
            // System.out.println("Age: " + info.getAge());
            // System.out.println("Gender: " + info.getGender());


        // // Create a Student object
        // Student student = new Student();
        
        // // // Set student information using setter methods
        // student.setName("Ali");
        // student.setFatherName("Ameen");
        // student.setPhoneNumber("0300123456789");
        // student.setAddress("Islambad");
        // student.setAge(19);
        // student.setGender("Male");
        // student.setRollNum("0507123456");


        // // // Display student information
        // System.out.println("Student Information:");
        // System.out.println("Name: " + student.getName());
        // System.out.println("Father's Name: " + student.getFatherName());
        // System.out.println("Phone Number: " + student.getPhoneNumber());
        // System.out.println("Address: " + student.getAddress());
        // System.out.println("Age: " + student.getAge());
        // System.out.println("Gender: " + student.getGender());
        // System.out.println("Roll Number: " + student.getRollNum());


        } catch (Exception e) {
            // handle exception
            System.out.println("Something went wrong please try again later" + e.getMessage());
        }finally{
            System.out.println("Program executed");
        }
    }
}
