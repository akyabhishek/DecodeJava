package ref.constructor;

public class ConsMain {
    public static void main(String[] args) {
        //Constructor reference
        //ClassName::new without parenthesis
        StudentInter studentInter=Student::new;
        Student student=studentInter.getStudent();
        student.display();
    }
}
