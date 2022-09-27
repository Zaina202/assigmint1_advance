import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("................Please select one...................." );
        System.out.println("1 - Add student" );
        System.out.println("2 - Retrieving student" );
        System.out.println("3 - Removing student" );
        System.out.println("4 - Report for number of operation" );
        System.out.println("5 - Report" );
        System.out.println("6 - Exit" );

        System.out.println(".....................................................");
    }
    static void menu1() {
        System.out.println("................Please select one...................." );
        System.out.println("1 - Add student" );
        System.out.println("2 - Add Master student" );
        System.out.println("3 - Add Medical student" );
        System.out.println("4 - Add Engineering student" );
        System.out.println(".....................................................");
    }
    static void menu2() {
        System.out.println("1 - philosophy" );
        System.out.println("2 - psychology" );
        System.out.println("3 - sociology" );
    }
    enum BA_Degree{
        philosophy,
        psychology,
        sociology
    }
    public static void main(String[] args){

        ArrayList<Student>list=new ArrayList();
        Scanner in = new Scanner(System.in);
        String name;
        int year,month,day;
        String sup,hos,res1,res2,lab;
        int ba;
        Student ob1 = null;
        Master ob2 = null;
        Medical ob3 ;
        Engineering ob4 ;

        int index;
        int countAdd=0 ,countRem=0,countRet=0;

        Scanner scan=new Scanner(System.in);
        int option,optionA;
        boolean result = true;

        while (result) {
            menu();
            System.out.print("Enter your option(1-5) : ");
            option=scan.nextInt();

            if (option >= 1 && option<=5) {
                switch (option) {
                    case 1:
                        menu1();
                        optionA= scan.nextInt();
                        if (optionA >= 1 && optionA<=4){
                            switch (optionA){
                                case 1:
                                    System.out.print("Enter your info : \n Name : ");
                                    name = in.next();
                                    System.out.println("\n Birth Date(year month day) : ");
                                    year = in.nextInt();
                                    month = in.nextInt();
                                    day = in.nextInt();
                                    ob1 = new Student(name, year, month, day);
                                    list.add(ob1);
                                    countAdd++;
                                    break;
                                case 2:
                                    System.out.print("Enter your info : \n Name : ");
                                    name = in.next();
                                    System.out.println("\n Birth Date(year month day) : ");
                                    year = in.nextInt();
                                    month = in.nextInt();
                                    day = in.nextInt();
                                    System.out.print("Supervisor : ");
                                    sup = in.next();
                                    System.out.println("BA : ");
                                    menu2();
                                    ba=in.nextInt();
                                    if (ba >= 1 && ba <= 3) {
                                        switch (ba) {
                                            case 1:
                                                ob2.setBA("philosophy");
                                                break;
                                            case 2:
                                                ob2.setBA("psychology");
                                                break;
                                            case 3:
                                                ob2.setBA("sociology");
                                                break;
                                            default:
                                                break;
                                        }
                                        System.out.print("Resarch : ");
                                        res2 = in.next();
                                        ob2 = new Master(name, year, month, day, sup, res2);

                                        list.add(ob2);
                                        countAdd++;
                                        break;
                                    }
                                case 3:
                                    System.out.print("Enter your info : \n Name : ");
                                    name = in.next();
                                    System.out.println("\n Birth Date(year month day) : ");
                                    year = in.nextInt();
                                    month = in.nextInt();
                                    day = in.nextInt();
                                    System.out.print("Hospital : ");
                                    hos = in.next();
                                    System.out.print("Resarch : ");
                                    res1 = in.next();

                                    ob3 = new Medical(name, year, month, day, hos, res1);

                                    list.add(ob3);
                                    countAdd++;
                                    break;
                                case 4:
                                    System.out.print("Enter your info : \n Name : ");
                                    name = in.next();
                                    System.out.println("\n Birth Date(year month day) : ");
                                    year = in.nextInt();
                                    month = in.nextInt();
                                    day = in.nextInt();
                                    System.out.print("Lab : ");
                                    lab = in.next();

                                    ob4 = new Engineering(name, year, month, day, lab);

                                    list.add(ob4);
                                    countAdd++;
                                    break;
                                default:
                                    break;
                            }
                        }
                        break;

                    case 2:
                        for (Student student : list) student.print();
                        countRet++;
                        break;


                    case 3:
                        System.out.print("Which Student you want to remove ?! ");
                        index = in.nextInt();
                        if (index > list.size() && index < 1) {
                            System.out.println("above the limit!! try again");
                            index = in.nextInt();
                        }
                        list.remove(index - 1);
//                        System.out.println(list.size());
                        countRem++;
                        break;

                    case 4:
                        System.out.println("Add : " + countAdd + "\nRemove : " + countRem + "\nRetrive : " + countRet);
                        break;


                    case 5:
                        result = false;
                        break;

                    default:
                        break;
                }


            } else System.out.println("wrong option!!");
        }
    }
}








