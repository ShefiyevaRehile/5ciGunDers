package BesinciGunDers.nLayeredDemo.business.abstracts;

import BesinciGunDers.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
