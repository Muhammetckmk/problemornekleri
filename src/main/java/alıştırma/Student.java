package alıştırma;

public class Student extends Teacher{

                   /* ----------Student Class Özellikleri :
    fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()*/

     public static String name;
     public static Integer stuNo;
     public static String classes;
     public static String course1;
     public static String course2;
    public static String course3;
     public static boolean isPass;


        public Student(String name, Integer stuNo, String classes, String course1){
            this.classes=classes;
            this.name=name;
            this.stuNo=stuNo;
            this.course1= course1;
        this.course2=course2;
           this.course3=course3;
        }



        public static void calcAvarage(){

            if (Course.dersOrt>=55){
                System.out.println(course1 +" dersinden başarılıdır");
            }
        isPass=true;
        }



    }


