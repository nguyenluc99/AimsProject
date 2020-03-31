import java.util.Date;
public class MyDate{
    public static final String[] dayStr = new String[] {"first", "second", "third", "forth", "fifth", "sixth", "seventh", "righth", "nineth",
    "tenth", "eleventh", "twelveth", "thirdteenth", "forthteenth", "fifteenth", "sixteenth", "seventeenth", "eighteenth", "nineteenth",
    "twentyth", "twnentyoneth", "twentytwoth", "twentythreeth", "twentyforth","twentyfifth","twentysixth","twentyseventh",
    "twentynineth", "thirty","thirdtyfirst"};
    public static final String[] monthStr = new String[] {"january", "february", "march","april","may","june","july","august","september","october", "november","december"};
    public int day = 0;
    public int month = 0;
    public int year = 0;

    public MyDate(int day, int month, int year) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(String day, int month, int year) {
        super();
        int index = java.util.Arrays.asList(this.dayStr).indexOf(day);
        if (index == -1) throw null;
        this.day = index;
        this.month = month;
        this.year = year;
    }
    public MyDate(int day, String month, int year) {
        super();
        int index = java.util.Arrays.asList(this.monthStr).indexOf(month);
        if (index == -1) throw null;
        this.day = day;
        this.month = index;
        this.year = year;
    }
    public MyDate(String day, String month, int year) {
        super();
        int indexd = java.util.Arrays.asList(this.dayStr).indexOf(day);
        if (indexd == -1) throw null;
        int indexm = java.util.Arrays.asList(this.monthStr).indexOf(month);
        if (indexm == -1) throw null;
        this.day = indexd;
        this.month = indexm;
        this.year = year;
    }
}