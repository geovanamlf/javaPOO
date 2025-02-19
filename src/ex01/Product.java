package ex01;

public class Product {

    //Atributos
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
