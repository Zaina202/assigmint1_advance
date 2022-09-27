public class Medical extends Student{

    private String hospital;
    private String resarch;

    public Medical(String Name, int year, int month, int day,String hospital,String resarch) {

        super(Name, year, month, day);
        this.hospital=hospital;
        this.resarch=resarch;
    }
    public void submitResarch(String res){this.resarch=res;}


}
