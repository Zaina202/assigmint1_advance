public class Engineering extends Student {
    private String lab;

    public Engineering(String Name,int year,int month ,int day,String lab ){
        super(Name, year, month, day);
        this.lab=lab;
    }
    @Override
    public void print(){
        System.out.println("Student Info --> \n ID   : "+ ID +"\n Name : "+ name +"\n Age  : "+getAge()+"\n Lab : "+lab);
    }
    public void submitLab(String lab){this.lab=lab;}

}