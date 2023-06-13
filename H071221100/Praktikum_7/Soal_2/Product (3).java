// SOAL NO 2

import java.time.LocalDate;

public class Product<T> {
    private String name;
    private T price;
    private LocalDate tanggalKadaluarsa;

    Product(String name, T price, LocalDate tanggalKadaluarsa) {
        this.name = name;
        this.price = price;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public LocalDate getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("Teh Kotak", 5000, LocalDate.of(2023, 5, 7));
        Product<String> product2 = new Product<>("Susu Ultra", "6000", LocalDate.of(2024, 12, 20));
        Product<Double> product3 = new Product<>("Sosis Kanzler", 12.7, LocalDate.of(2025, 4, 11));

        System.out.println("Product 1: " + product1.getName() + " - " + product1.getPrice() + " - " + product1.getTanggalKadaluarsa());
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - " + product2.getTanggalKadaluarsa());
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - " + product3.getTanggalKadaluarsa());
    }
}
