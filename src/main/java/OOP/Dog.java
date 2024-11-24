package OOP;

public class Dog extends Hayvanlar{

    @Override
    public String sesi() {
        return "köpekler havlar";
    }

    public Dog(String nameAnimal, int ageAnimal) {
        super(nameAnimal, ageAnimal);
    }

    private String renk="kahverengi";

    public void setRengi(String renk){
        this.renk=renk;
    }
    public String getRenk(){
        return renk;
    }




    @Override
    public String toString() {
        return "Dog{" +
                "ageAnimal=" + ageAnimal +
                ", nameAnimal='" + nameAnimal + '\'' +
                '}';
    }
}
