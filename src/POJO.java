import POJOAndRecords.Student;
import POJOAndRecords.WorkingStudent;

/*
* This file explores POJO (Plain Old Java Objects) and Records
* POJO is a special class in Java, that only has instance fields. Example: It only has fields and methods to access and retrieve data
* POJO is used as Data Transfer Objects or DTOs.
* They can be used as Database ORMs, entity objects etc.
*
* Records on the other hand, are immutable.
* They are almost same as POJO but they don't have any getters or setters methods. They only have constructors and accessors, not even getters.
* Ex: To access a field in a POJO, you might use the method known as get+FieldName(), but in Records you'll just do .fieldName().
* */
public class POJO {

    public static void main(String[] args) {
        Student s = new Student("22AM112", "Kausik D", "02/02/2004", "Java Developer");
        WorkingStudent ws = new WorkingStudent("22AM112", "Kausik D", "02/02/2004", "Java Developer");

        System.out.println(s);
        System.out.println(ws);

        System.out.println("Name = " + s.getName());
        System.out.println("Name Record: " + ws.name());
    }

}
