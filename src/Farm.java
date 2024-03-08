import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Farm {
    private String name;
    ArrayList<List> kolik = new ArrayList<>();
    ArrayList<Flower> grehs = new ArrayList<>();
    ArrayList<Animal> coop = new ArrayList<>();
    ArrayList<Animal> barn = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void FarmerMakin(Farmer e) {
        System.out.println("Sup");
        System.out.println("What is your name??");
        e.setName(sc.nextLine());
        System.out.println("ohh, and how dou you call your Farm??");
        name = sc.nextLine();
        kolik.add(grehs);

    }

    public void buyAnimal(){

    }



}
