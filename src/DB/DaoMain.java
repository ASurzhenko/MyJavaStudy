package DB;

/**
 * Created by User on 23.05.2016.
 */
public class DaoMain {
    public static void main(String[] args) {
        ProductDbDAO productDbDAO = new ProductDbDAO();
        workWithProducts(productDbDAO);

    }

    private static void workWithProducts(ProductDbDAO productDbDAO) {
        Product product = productDbDAO.findById(3);

        System.out.println("id = 3: " + product);

        product.setName("Crocodile");

        productDbDAO.update(product);

        System.out.println("after croco update: " + productDbDAO.findAll());

        productDbDAO.delete(product);

        productDbDAO.create(new Product(5, "Giraffe", "African animal", 555_555));

        System.out.println("after croco delete and giraffe insert: " + productDbDAO.findAll());
    }
}
