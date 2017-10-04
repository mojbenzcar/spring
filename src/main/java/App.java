import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
//        //ApplicationContext ctx = new ClassPathXmlApplicationContext("bean1.xml");
//        City city= (City) ctx.getBean("myCity");
//        city.getMessage();
//        ((FileSystemXmlApplicationContext)ctx).close();

        ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
        City city = (City) ctx.getBean("myCity");
        System.out.println(city);
        city.getMessage();
        ((FileSystemXmlApplicationContext) ctx).close();
    }
}
