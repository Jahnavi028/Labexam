package Service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.klef.jfsd.exam.model.Product;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
	private final RestTemplate restTemplate = new RestTemplate();
    private static final String API_URL = "https://fakestoreapi.com/products";

    public List<Product> getAllProducts() {
        Product[] products = restTemplate.getForObject(API_URL, Product[].class);
        return Arrays.asList(products);
    }

}
