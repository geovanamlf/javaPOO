package ex01;

public class Product {

    //Atributos
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    //Metodos getters e setters. Para chama-los quando quiser alterar um atributo da classe que esta protegido.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() { // Metodo para calcular o valor total em estoque.
        return price * quantity;
    }

    public void addProducts(int quantity) { // Metodo para adicionar produtos no estoque.
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) { // Metodo para remover produtos no estoque.
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
