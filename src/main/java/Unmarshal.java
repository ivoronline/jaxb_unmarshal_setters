import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Unmarshal {

  public static void main(String[] args) throws JAXBException, FileNotFoundException {
    Unmarshaller unmarshaller = JAXBContext.newInstance(Person.class).createUnmarshaller();
    Person       person       = (Person) unmarshaller.unmarshal(new FileReader("person.xml"));
    System.out.println(person.getName() + " is " + person.getAge() + " years old");
  }

}
