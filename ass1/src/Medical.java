public class Medical extends Student{

    private String hospital;
    private String resarch;

    public Medical(String Name, int year, int month, int day,String hospital,String resarch) {

        super(Name, year, month, day);
        this.hospital=hospital;
        this.resarch=resarch;
    }
    @Override
    public void print(){
        System.out.println("Student Info --> \n ID   : "+ ID +"\n Name : "+ name +"\n Age  : "+getAge()+"\n Hospital : "+hospital+"\n Resarch : "+resarch);
    }
    @Override
    public boolean Equal(Student a){
        if(this.name==a.name && this.dateOfBirth==a.dateOfBirth && this.hospital==hospital && this.resarch==resarch)
            return true;
        else return false;
    }
    public void submitResarch(String res){this.resarch=res;}


}
