package practica1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        Calendar date = GregorianCalendar.getInstance();
        date.set(1973,Calendar.NOVEMBER,20);
        Person pepe = new Person("Orlando","González",date);
        System.out.println(pepe.getName() + " " + pepe.getSurname() + "\n" + pepe.getAge());
        System.out.println(pepe.getBirthday().getTime());
    }
    
}
