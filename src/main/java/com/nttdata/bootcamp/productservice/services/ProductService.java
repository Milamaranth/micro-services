package com.nttdata.bootcamp.productservice.services;

// import java.util.List;

// import javax.annotation.PostConstruct;
// import javax.transaction.Transactional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.autoconfigure.AutoConfiguration;
// import org.springframework.stereotype.Service;

// import com.nttdata.mangatrack.dao.AutorDao;
// import com.nttdata.mangatrack.modelos.Autor;

// import org.springframework.stereotype.Service;

// import com.nttdata.bootcamp.productservice.dto.Product;

// @Service
// public class ProductService {
    
//     private Product product = new Product();

//     public Integer getId(){
//         return product.getProductId();
//     }

//     public String postId(){
//         return product.getChannel();
//     }

//     public void agregarProducto(Producto producto){
//         product.create(producto);
//     }

//     public void borrarProducto(int productId) {
//         product.delete(product.findById(productId));
//     }

//     public List<Product> listaProductos(){
//         return product.listAllProductos();
//     }

//     public Product getProductById(int id) {
//         product.getProductId();
//         return
//     }

//     public void imprimirProducto(int i) {
// 		System.out.println(obtenerProductoId(1));
//     }
// }