import in.sp.beans.Student;
import in.sp.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Student std=(Student) context.getBean(Student.class);

        std.display();
        }
    }
