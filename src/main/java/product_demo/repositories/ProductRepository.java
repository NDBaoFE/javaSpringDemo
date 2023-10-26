package product_demo.repositories;

import product_demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends  JpaRepository<Product,Long> {



}
