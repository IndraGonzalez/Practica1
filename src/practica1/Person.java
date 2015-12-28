
package practica1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private static final long MILLISECONDS_PER_YEAR = (long) (60 * 60 * 1000 * 24 * 365.25);
    private final String name;
    private final String surname;
    private final Calendar birthday;

    public Person(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getAge(){
        return (int) ((GregorianCalendar.getInstance().getTimeInMillis()-birthday.getTimeInMillis()) / MILLISECONDS_PER_YEAR);
    }
    
}

