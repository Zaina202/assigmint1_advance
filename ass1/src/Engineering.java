public class Engineering extends Student {
    private String lab;

    public Engineering(String Name,int year,int month ,int day,String lab ){
        super(Name, year, month, day);
        this.lab=lab;
    }
    public void submitLab(String lab){this.lab=lab;}

}