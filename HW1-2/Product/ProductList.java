package Product;


import java.util.HashMap;



public class ProductList {

    private HashMap<String, Double> ProductList = new HashMap<>();

    public ProductList(){
       this.ProductList = new HashMap<>();
   }
    public void addProductList(Product product){
        this.ProductList.put(product.getName(), product.getPrice());
    }

    public void ProductList(String Name, double Price) {
        this.ProductList.put(Name, Price);
    }

    public void ChangePrice(Product product, double newPrice){
        if(this.ProductList.containsKey(product.getName())){
            //Находит такой продукт и заменяет его с новой ценой и
            //таким же ключом (название)
            ProductList.put(product.getName(), newPrice);
        }
    }
    public double getPriceProduct(String productName){
        if(this.ProductList.containsKey(productName)){
            return  this.ProductList.get(productName);
        }
        else{
            return 0;
        }
    }
}
