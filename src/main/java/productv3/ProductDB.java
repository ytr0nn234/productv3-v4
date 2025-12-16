package productv3;

public class ProductDB {

    public static Product getProduct(String productCode) {

        Product p = null;

        if (productCode.equalsIgnoreCase("java")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("ATU Java Programming");
            b.setPrice(57.50);
            b.setAuthor("Joe Brown");
            p = b;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("Java Servlets and JSP");
            b.setPrice(57.50);
            b.setAuthor("Mike White");
            p = b;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("Lennon's MySQL");
            b.setPrice(54.50);
            b.setAuthor("Jim Lennon");
            p = b;
        } else if (productCode.equalsIgnoreCase("studios")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Visual Studios");
            s.setPrice(57.50);
            s.setVersion("Microsoft 1.1");
            p = s;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Build Java apps");
            s.setPrice(57.50);
            s.setVersion("Eclipse Neon");
            p = s;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Latest MySQL");
            s.setPrice(54.50);
            s.setVersion("Oracle 3.0");
            p = s;
        }

        return p;
    }
}