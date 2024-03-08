import java.util.ArrayList;
import java.util.Random;

public class Animal {

    private Type type;
    private String name;
    private Size size;
    private String specialCare;
    private int happines;
    private int price;
    private String Product;

    public Animal(Type type, Size size, int happines,int price) {
        this.type = type;
        this.size = size;
        this.happines = happines;
        this.price = price;

    }

    Random rn = new Random();

    ArrayList<Animal> ave = new ArrayList<>();


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", specialCare='" + specialCare + '\'' +
                '}';
    }

    public void Animalmakin(){
        for (int i = 0;i<rn.nextInt(5)+5;i++){
            int z = rn.nextInt(4)+1;
            if (z == 1){
                ave.add(new Animal(Type.Chicken,Size.SMALL,1,100));
            }
            else if (z == 2){
                ave.add(new Animal(Type.Goose,Size.SMALL,1,150));
            }
            else if (z == 3){
                ave.add(new Animal(Type.Cow,Size.BIG,1,250));
            }
        }
    }
}
