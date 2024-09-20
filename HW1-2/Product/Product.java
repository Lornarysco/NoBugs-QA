package Product;

public class Product {
    public String Name;
    public double Price;

    public Product(String Name, double Price){
        this.Name = Name;
        this.Price = Price;
    }

    public  void setName(String Name){
        this.Name = Name;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public double getPrice() {
        return Price;
    }

    public String getName() {
        return Name;
    }

    public void ChangePrice(double newPrice){
        this.Price = newPrice;
    }

}
