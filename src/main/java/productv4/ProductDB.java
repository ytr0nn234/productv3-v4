package productv4;

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
        else if (productCode.equalsIgnoreCase("purple")) {
            Music m = new Music();
            m.setCode(productCode);
            m.setDescription("Fireball");
            m.setPrice(8.00);
            m.setArtist("Deep Purple");
            m.setLabel("Columbia group");
            p = m;
        } else if (productCode.equalsIgnoreCase("55pus")) {
            TV tv = new TV();
            tv.setCode(productCode);
            tv.setDescription("Philips 4K UHD LED Smart TV 55PUS7607/12");
            tv.setPrice(819.00);
            tv.setManufacture("Philips");
            tv.setScreenSize("55\"");
            p = tv;
        }

        return p;
    }
}