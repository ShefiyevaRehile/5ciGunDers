package BesinciGunDers.nLayeredDemo;

import BesinciGunDers.nLayeredDemo.business.abstracts.ProductService;
import BesinciGunDers.nLayeredDemo.business.concretes.ProductManager;
import BesinciGunDers.nLayeredDemo.core.JLoggerManagerAdapter;
import BesinciGunDers.nLayeredDemo.dataAccess.concretes.AbcProductDao;
import BesinciGunDers.nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import BesinciGunDers.nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product=new Product(1,2,"elma",12,50);
        productService.add(product);

    }
}
