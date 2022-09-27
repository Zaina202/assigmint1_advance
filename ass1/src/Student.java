import java.time.LocalDate;

public class Student {
    protected int ID;
    protected String name;
    protected LocalDate dateOfBirth;
    protected static int count=1;

    public Student(String Name,int year,int month ,int day){
        this.ID=count;
        this.name=Name;
        this.dateOfBirth=LocalDate.of(year,month,day);
        count++;
    }


    public int getAge(){
        LocalDate today=LocalDate.now();
        return today.getYear()-dateOfBirth.getYear();
    }
    public void print(){
        System.out.println("Student Info --> \n ID   : "+ ID +"\n Name : "+ name +"\n Age  : "+getAge());
    }
    public boolean Equal(Student a){
        if(this.name==a.name && this.dateOfBirth==a.dateOfBirth)
            return true;
        else return false;
    }

}
