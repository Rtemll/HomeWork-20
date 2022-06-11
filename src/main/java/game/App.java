package game;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        Humanoid person = new Humanoid("Ivan");
//        String result = person.getName();
//        System.out.println(result);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Unit unit = context.getBean("AppUnitBean", Unit.class);
        System.out.println(unit.getName());
        context.close();

    }
}
