package model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Manufacturer;
import model.ProductCode;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-27T08:42:16")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-02T17:34:59")
>>>>>>> 3f5f334fc07a27b242167abc750dfd4944c8fceb
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, BigDecimal> purchaseCost;
    public static volatile SingularAttribute<Product, ProductCode> productCode;
    public static volatile SingularAttribute<Product, Integer> productId;
    public static volatile SingularAttribute<Product, BigDecimal> markup;
    public static volatile SingularAttribute<Product, Integer> quantityOnHand;
    public static volatile SingularAttribute<Product, String> available;
    public static volatile SingularAttribute<Product, Manufacturer> manufacturerId;
    public static volatile SingularAttribute<Product, String> description;

}