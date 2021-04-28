package bll;

import dao.ProductDAO;
import model.Product;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;

public class ProductBLL {
    private ProductDAO productDAO;

    public ProductBLL()
    {
        productDAO = new ProductDAO();
    }

    public Product findProductById(int id)
    {
        Product product = productDAO.findById(id);
        if(product == null)
            throw new NoSuchElementException();
        return product;
    }

    public List<Product> findAllProducts()
    {
        List<Product> list = productDAO.findAll();
        if(list == null)
            throw new NoSuchElementException();
        return list;
    }

    public void insertProduct(Product product) throws IllegalAccessException {
        productDAO.insert(product);
    }

    public void updateProduct(Product product) throws IllegalAccessException {
        productDAO.update(product);
    }

    public void deleteProduct(Product product) throws SQLException, IllegalAccessException {
        productDAO.delete(product);
    }

}
