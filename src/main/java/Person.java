import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

  //PROPERTIES
  private Integer id;
  private String  name;
  private Integer age;

  //SETTERS (Used by JAXB for Unmarshaling)
  public void setId  (Integer id  ) { this.id   = id;   }
  public void setName(String  name) { this.name = name; }
  public void setAge (Integer age ) { this.age  = age;  }

  //GETTERS (Used by us to read Properties)
  public Integer getId  () { return id;   }
  public String  getName() { return name; }
  public Integer getAge () { return age;  }

}
