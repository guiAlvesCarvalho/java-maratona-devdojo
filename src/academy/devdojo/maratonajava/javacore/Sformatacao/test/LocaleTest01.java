package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapao = new Locale("ja", "JP");
        Locale localeHolanda = new Locale("nl", "NL");
        Locale localeBrasil = new Locale("pt", "BR");

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);

        System.out.println("Italia "+df1.format(calendar.getTime()));
        System.out.println("Suíça "+df2.format(calendar.getTime()));
        System.out.println("India "+df3.format(calendar.getTime()));
        System.out.println("Japão "+df4.format(calendar.getTime()));
        System.out.println("Holanda "+df5.format(calendar.getTime()));
        System.out.println("Brasil "+df6.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeHolanda.getDisplayCountry());

        System.out.println("Lingua falada na Holanda: "+localeHolanda.getDisplayLanguage());
        System.out.println("Lingua falada na Holanda - em japonês: "+localeHolanda.getDisplayLanguage(localeJapao));

    }
}
