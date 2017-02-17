package flowertest;

/**
 * Write a Java class, Flower, that has three instance variables of type String,
 * int, and float, which respectively represent the name of the flower, its
 * number of petals, and price. Your class must include a constructor method
 * that initializes each variable to an appropriate value, and your class should
 * include methods for setting the value of each type, and getting the value of
 * each type.
 *
 * @author Khav
 */
/**
 * A simple Flower class
 *
 * @author Khav
 */
class Flower {

    private String name;
    private int num_of_petals;
    private int price;

    /**
     * Default constructor to allow use of new command to create instance
     */
    public Flower() {
    }

    /**
     * Construct a new Flower Instance
     *
     * @param name
     * @param num_of_petals
     * @param price
     */
    public Flower(String name, int num_of_petals, int price) {
        this.name = name; //name of flower
        this.num_of_petals = num_of_petals; // number of petals
        this.price = price; // price of the flower
    }
    //update methods

    public void setName(String name) {
        this.name = name;
    }

    public void setPetalCount(int num_of_petals) {
        this.num_of_petals = num_of_petals;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    //accessor methods

    public String getName() {
        return this.name;
    }

    public int getPetalCount() {
        return this.num_of_petals;
    }

    public int getPrice() {
        return this.price;
    }
}

public class FlowerTest {

    public static void main(String[] args) {
        Flower f1 = new Flower();
        f1.setName("Rose");
        f1.setPrice(2);
        f1.setPetalCount(5);

        System.out.println(f1.getName());
        System.out.println(f1.getPrice());
        System.out.println(f1.getPetalCount());

        Flower f2 = new Flower("Lily", 10, 4);

        System.out.println(f2.getName());
        System.out.println(f2.getPrice());
        System.out.println(f2.getPetalCount());

    }

}
