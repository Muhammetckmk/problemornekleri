package alıştırma;

public class Course extends Student {/*woman-raising-hand:
        ----------Öğrenci Not Sistemi-----------
                ----------Course Class Özellikleri :
        fields (variable) : name,code,prefix,note,Teacher
        Methods : Course() , addTeacher() , printTeacher()
                ----------Teacher Class Özellikleri :
        fields : name,branch
        Methods : Teacher()
                ----------Student Class Özellikleri :
        fields : name,stuNo,classes,course1,course2,course3,avarage,isPass
        Methods : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
                -----------TASK
        Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
        her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
        yüzdesi ile dahil edin.
        Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise
        sınav notunun etkisi %80'dir.
        Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin
        genel ortalamaya etkisi şu şekilde hesaplanır :
        Fizik Ortalaması : (90 * 0.20) + (60* 0.80);*/

   /*  ----------Course Class Özellikleri :
        fields (variable) : name,code,prefix,note,Teacher
        Methods : Course() , addTeacher() , printTeacher()*/


       public static  String name;
       //public static  public static Integer code;
       public static  double sözlü;
       public static  double note;
       public static double dersOrt;




    public Course(String name, Integer sözlü, Integer note, String course){
        super(name, stuNo, classes, course);
        this.name=name;

        this.sözlü= sözlü;
        this.note=note;
        }

        public void addTeacher(String teacher){
        Teacher.teacherName=teacher;
            System.out.println("ders öğretmeni : "+ teacher);
        }
      //  public static void printTeacher(){
//
      //  }


    /*Course class'ında derse ait sözlü notu kısmını girin ve ortalamaya etkisini
    her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme
    yüzdesi ile dahil edin.*/

    public void ortalamaHesaplama(){
        this.sözlü=sözlü;
        this.note=note;
    ;
        this.dersOrt = (note * 0.8) + (sözlü * 0.2);
        System.out.println("ortalama = " + dersOrt);


    }




    }
