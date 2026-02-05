import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {

        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student student = (Student) in.readObject();

            in.close();
            fileIn.close();

            System.out.println("✅ Student object deserialized successfully!");
            System.out.println("📄 Restored Student Data:");
            student.display();

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Class not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
