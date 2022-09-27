public class Master extends Student{
    private String supervisor;
    private String BA;
    private String resarch;

    public Master(String Name, int year, int month, int day,String supervisor,String resarch) {
        super(Name, year, month, day);
        this.supervisor=supervisor;
        this.resarch=resarch;
        this.BA=null;
    }
    public void setBA(String ba){this.BA=ba;}
    public void submitResarch(String res){this.resarch=res;}
    public String getSupervisor() {return supervisor;}
}
