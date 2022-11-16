import java.util.Scanner;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class auto {

    public static final  Scanner in = new Scanner(System.in); 
    public static void main(String[] args) {

        String str = in.nextLine();
        int n = in.nextInt();
        long date = new Date().getTime();

        obj newobj = new obj(str, n);

    }
    
}
class obj{

    private int nmb;
    private String str;
    // nmb和str都是私有属性，类外不可访问。

    public obj(String n, int a){

        String name = n;
        int age = a;

        System.out.printf("name：%s\n年龄：%d\n时间：%s", name, age, fun());

    }
    // obj是obj类的构造器

    private String fun(){
        LocalDate dh = LocalDate.now();
        int year = dh.getYear();
        int month = dh.getMonthValue();
        int day = dh.getDayOfMonth();
        GregorianCalendar m = new GregorianCalendar();
        return year + "年" + month +"月" + day + "日" + m.get(Calendar.HOUR_OF_DAY) + "时";
        
    }
    // fun方法是一个私有方法，类外不可访问

    // public void fun (){

    //     System.out.println(str);
    // }
    // // fun是一个公有的方法，类外可访问。

}