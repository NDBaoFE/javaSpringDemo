package product_demo.controllers;
import org.springframework.http.HttpStatus;
import product_demo.dto.ResponseObject;
import product_demo.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import product_demo.repositories.ProductRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import product_demo.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<ResponseObject> getAllProducts() {
        List<Product> products = productRepository.findAll();


        if ( !products.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject(200, "Product list", products)
            );
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject(404, "Empty product list", "")
            );
        }
    }
    @GetMapping("/products/{id}")
    public ResponseEntity<ResponseObject> getProductById(@PathVariable(value = "id") Long productId)
            throws ResourceNotFoundException {
        Optional<Product> product = productRepository.findById(productId);


        if (product.isEmpty()) {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject(404, "Error finding product", null)
            );
        } else {
           return ResponseEntity.status(HttpStatus.OK).body(
                   new ResponseObject(200, "Product detail found", product)
           );
       }
    }



}
