import getRandomNum.GetRandomNum;
import myArray.MyArrays;
import person.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static final GetRandomNum getRandomNum = new GetRandomNum();

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/hospital?useSSL=false";

        String login = "admin";

        String password = "admin";

        try {
            Connection connection = DriverManager.getConnection(url, login, password);

            MyArrays myArrays = new MyArrays();
            Person person = new Person();

            int i = 1;
            while (i<1000) {
                person.setSurname(myArrays.getSurname(getRandomNum.getRandomNumber()));
                person.setFirstname(myArrays.getFirstname(getRandomNum.getRandomNumber()));
                person.setSecondname(myArrays.getSecondname(getRandomNum.getRandomNumber()));
                /*System.out.println(person.getSurname() + " " + person.getFirstname() + " "
                        + person.getSecondname() + " " + (getRandomNum.getRandomNumber()+1));*/
                int key = getRandomNum.getRandomNumber()+1;



                Statement statement = connection.createStatement();
                statement.execute("insert into persons (surname, firstname, secondname, hospital_id) " +
                        "values ('" + person.getSurname() + "', '" + person.getFirstname() + "','"+person.getSecondname()+"', '" + key + "')");
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
    }



    }

}
