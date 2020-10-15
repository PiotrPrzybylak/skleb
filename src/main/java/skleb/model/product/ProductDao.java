package skleb.model.product;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao {
    public List<Product> all() {
        return List.of(
                new Product("Mydło", "", new BigDecimal("25.00")),
                new Product("Masło", "", new BigDecimal("99.99")),
                new Product("Chleb", "", new BigDecimal("5.50")));
    }
}
