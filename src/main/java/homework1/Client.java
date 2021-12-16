package homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Patient patient = context.getBean("patient", Patient.class);
        Registry registry = context.getBean("registry", Registry.class);
        patient.askForHelp();
        registry.registerPatient(patient);
    }
}