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
    public Master(){
        super();
        this.supervisor=null;
        this.BA=null;
        this.resarch=null;

    }
    @Override
    public void print(){
        System.out.println("Student Info --> \n ID   : "+ ID +"\n Name : "+ name +"\n Age  : "+getAge()+"\n Supervisor : "+supervisor+"\n BA : "+BA+"\n Resarch : "+resarch);
    }
    public void setBA(String ba){this.BA=ba;}
    public void submitResarch(String res){this.resarch=res;}
    public String getSupervisor() {return supervisor;}
}
