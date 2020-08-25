/* Write a student class, whose instance will represent name, roll no., email,mobile. 
Implement 100% Encapsulation.*/


class studentDemo{
    private int rollno;
    private String name;
    private String email;
    private long mobile;

    
    public int getstudentrollno(){
        return rollno;
    }

    public String getstudentName(){
        return name;
    }

    public long getstudentmobile(){
        return mobile;
    }
    
    public String getstudentemail(){
        return email;
    }

    public void setstudentrollno(int newValue){
        rollno = newValue;
    }

    public void setstudentName(String newValue){
        name = newValue;
    }

    public void setstudentmobile(long newValue){
        mobile = newValue;
    }
    
    public void setstudentemail(String newValue){
        email = newValue;
    
    }
}
public class EncapsTest{
    public static void main(String args[]){
         studentDemo obj = new studentDemo();
         obj.setstudentName("ABC");
         obj.setstudentrollno(48);
         obj.setstudentmobile(954679544);
         obj.setstudentemail("abcd@gmail.com");
         System.out.println("Student Name: " + obj.getstudentName());
         System.out.println("Student rollno: " + obj.getstudentrollno());
         System.out.println("Student mobile: " + obj.getstudentmobile());
         System.out.println("Student email: " + obj.getstudentemail());
    } 
}