package Pets2;
public class Dog2 {
    String colorOfFur;
    double weight;
    String breed;
    int age;
    boolean hasToyBone;

    void eat(String food) {
        System.out.println("Kaptam " + food + " -t a gazdámtól, vaúúúúú");
    };

Dog2(String breed, String colorOfFur, double weight, int age, boolean hasToyBone) {
 this.breed = breed;
 this.colorOfFur = colorOfFur;
 this.weight = weight;
 this.age = age;
 this.hasToyBone = hasToyBone;
}
  
}