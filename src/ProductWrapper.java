import java.util.Arrays;
import java.util.Objects;

public class ProductWrapper {
    private final String name;
    private final String category;
    private final byte[] internalCode;

    public ProductWrapper(String name, String category, byte[] internalCode) {
        this.name = name;
        this.category = category;
        this.internalCode = internalCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ProductWrapper other)) {
            return false;
        }
        return Objects.equals(name, other.name) && Objects.equals(category, other.category) && Arrays.equals(internalCode, other.internalCode);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, category, Arrays.hashCode(internalCode));
    }
}





































