package WorkJava;

public class Product {
    private int id;
    private int price;
    private int weight;
 
    public int finalPrice() {
        return this.price * this.weight;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
 
    public int getWeight() {
        return weight;
    }
 
    public void setWeight(int weight) {
        this.weight = weight;
    }
 
    public static void main(String[] args) {
        Product product = new Product();
 

        product.setId(1);
        
        product.setPrice(10);
        
        product.setWeight(44);
 
        
        System.out.println("Id: " + product.getId());
        
        System.out.println("Цена: " + product.getPrice());
        
        System.out.println("Вес товара: " + product.getWeight());
 
        
        System.out.println("Стоимость товара: " + product.finalPrice());
    }
}