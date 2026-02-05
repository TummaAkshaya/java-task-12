import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Akshaya",
                "Java Development",
                "secret123"
        );

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(student);

            out.close();
            fileOut.close();

            System.out.println("✅ Student object serialized successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
