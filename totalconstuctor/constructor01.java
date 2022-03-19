package totalconstuctor;
import java.util.Scanner;
public class constructor01 {
    String name;
    //Constructor
    constructor01(){
       this.name = "BeginnersBook.com";
    }
    public static void main(String[] args) {
       constructor01 obj = new constructor01();
       System.out.println(obj.name);
    }
 }