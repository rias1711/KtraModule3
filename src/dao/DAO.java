package dao;

import model.Category;
import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface DAO {
    public Product selectProduct(int id);

    public List<Product> selectAllProduct();

    public void insertProduct(Product product) throws SQLException;

    public boolean deleteProduct(int id) throws SQLException;

    public boolean updateProduct (Product product) throws SQLException;

    public List<Product> searchProductByName(String search);

    public List<Category> getAllCategories();
}
