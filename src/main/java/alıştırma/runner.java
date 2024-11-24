package alıştırma;

public class runner {
    public static void main(String[] args) {
      Student s= new Student("muhammet",36,"5A", "fizik");
      s.Teacher("Nimet", "Fizik");
      Course c= new Course("Muhammet ", 90,55, "Fizik");
      c.ortalamaHesaplama();
        System.out.println(Course.isPass);

    }
}
