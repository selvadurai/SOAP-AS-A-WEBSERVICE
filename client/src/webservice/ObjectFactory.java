
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IdValidiationResponse_QNAME = new QName("http://webservice/", "id_validiationResponse");
    private final static QName _Product_QNAME = new QName("http://webservice/", "Product");
    private final static QName _CreateTime_QNAME = new QName("http://webservice/", "createTime");
    private final static QName _CreateSupplier_QNAME = new QName("http://webservice/", "createSupplier");
    private final static QName _GetSalesFactResponse_QNAME = new QName("http://webservice/", "getSalesFactResponse");
    private final static QName _Customer_QNAME = new QName("http://webservice/", "Customer");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://webservice/", "createEmployeeResponse");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://webservice/", "createCustomerResponse");
    private final static QName _Employee_QNAME = new QName("http://webservice/", "Employee");
    private final static QName _CreateProductResponse_QNAME = new QName("http://webservice/", "createProductResponse");
    private final static QName _CreateProduct_QNAME = new QName("http://webservice/", "createProduct");
    private final static QName _CreateOrderFactResponse_QNAME = new QName("http://webservice/", "createOrderFactResponse");
    private final static QName _GetSalesFact_QNAME = new QName("http://webservice/", "getSalesFact");
    private final static QName _CreateCustomer_QNAME = new QName("http://webservice/", "createCustomer");
    private final static QName _CreateSupplierResponse_QNAME = new QName("http://webservice/", "createSupplierResponse");
    private final static QName _OrderFact_QNAME = new QName("http://webservice/", "OrderFact");
    private final static QName _Time_QNAME = new QName("http://webservice/", "Time");
    private final static QName _Supplier_QNAME = new QName("http://webservice/", "Supplier");
    private final static QName _CreateOrderFact_QNAME = new QName("http://webservice/", "createOrderFact");
    private final static QName _CreateEmployee_QNAME = new QName("http://webservice/", "createEmployee");
    private final static QName _CreateTimeResponse_QNAME = new QName("http://webservice/", "createTimeResponse");
    private final static QName _SalesOrderFact_QNAME = new QName("http://webservice/", "SalesOrderFact");
    private final static QName _IdValidiation_QNAME = new QName("http://webservice/", "id_validiation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSalesFactResponse }
     * 
     */
    public GetSalesFactResponse createGetSalesFactResponse() {
        return new GetSalesFactResponse();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link CreateTime }
     * 
     */
    public CreateTime createCreateTime() {
        return new CreateTime();
    }

    /**
     * Create an instance of {@link CreateSupplier }
     * 
     */
    public CreateSupplier createCreateSupplier() {
        return new CreateSupplier();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link IdValidiationResponse }
     * 
     */
    public IdValidiationResponse createIdValidiationResponse() {
        return new IdValidiationResponse();
    }

    /**
     * Create an instance of {@link CreateProduct }
     * 
     */
    public CreateProduct createCreateProduct() {
        return new CreateProduct();
    }

    /**
     * Create an instance of {@link CreateOrderFactResponse }
     * 
     */
    public CreateOrderFactResponse createCreateOrderFactResponse() {
        return new CreateOrderFactResponse();
    }

    /**
     * Create an instance of {@link GetSalesFact }
     * 
     */
    public GetSalesFact createGetSalesFact() {
        return new GetSalesFact();
    }

    /**
     * Create an instance of {@link CreateProductResponse }
     * 
     */
    public CreateProductResponse createCreateProductResponse() {
        return new CreateProductResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link CreateCustomerResponse }
     * 
     */
    public CreateCustomerResponse createCreateCustomerResponse() {
        return new CreateCustomerResponse();
    }

    /**
     * Create an instance of {@link CreateOrderFact }
     * 
     */
    public CreateOrderFact createCreateOrderFact() {
        return new CreateOrderFact();
    }

    /**
     * Create an instance of {@link Supplier }
     * 
     */
    public Supplier createSupplier() {
        return new Supplier();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link CreateSupplierResponse }
     * 
     */
    public CreateSupplierResponse createCreateSupplierResponse() {
        return new CreateSupplierResponse();
    }

    /**
     * Create an instance of {@link CreateCustomer }
     * 
     */
    public CreateCustomer createCreateCustomer() {
        return new CreateCustomer();
    }

    /**
     * Create an instance of {@link OrderFact }
     * 
     */
    public OrderFact createOrderFact() {
        return new OrderFact();
    }

    /**
     * Create an instance of {@link CreateTimeResponse }
     * 
     */
    public CreateTimeResponse createCreateTimeResponse() {
        return new CreateTimeResponse();
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link IdValidiation }
     * 
     */
    public IdValidiation createIdValidiation() {
        return new IdValidiation();
    }

    /**
     * Create an instance of {@link SalesOrderFact }
     * 
     */
    public SalesOrderFact createSalesOrderFact() {
        return new SalesOrderFact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdValidiationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "id_validiationResponse")
    public JAXBElement<IdValidiationResponse> createIdValidiationResponse(IdValidiationResponse value) {
        return new JAXBElement<IdValidiationResponse>(_IdValidiationResponse_QNAME, IdValidiationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createTime")
    public JAXBElement<CreateTime> createCreateTime(CreateTime value) {
        return new JAXBElement<CreateTime>(_CreateTime_QNAME, CreateTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSupplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createSupplier")
    public JAXBElement<CreateSupplier> createCreateSupplier(CreateSupplier value) {
        return new JAXBElement<CreateSupplier>(_CreateSupplier_QNAME, CreateSupplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesFactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getSalesFactResponse")
    public JAXBElement<GetSalesFactResponse> createGetSalesFactResponse(GetSalesFactResponse value) {
        return new JAXBElement<GetSalesFactResponse>(_GetSalesFactResponse_QNAME, GetSalesFactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createCustomerResponse")
    public JAXBElement<CreateCustomerResponse> createCreateCustomerResponse(CreateCustomerResponse value) {
        return new JAXBElement<CreateCustomerResponse>(_CreateCustomerResponse_QNAME, CreateCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createProductResponse")
    public JAXBElement<CreateProductResponse> createCreateProductResponse(CreateProductResponse value) {
        return new JAXBElement<CreateProductResponse>(_CreateProductResponse_QNAME, CreateProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createProduct")
    public JAXBElement<CreateProduct> createCreateProduct(CreateProduct value) {
        return new JAXBElement<CreateProduct>(_CreateProduct_QNAME, CreateProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderFactResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createOrderFactResponse")
    public JAXBElement<CreateOrderFactResponse> createCreateOrderFactResponse(CreateOrderFactResponse value) {
        return new JAXBElement<CreateOrderFactResponse>(_CreateOrderFactResponse_QNAME, CreateOrderFactResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesFact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "getSalesFact")
    public JAXBElement<GetSalesFact> createGetSalesFact(GetSalesFact value) {
        return new JAXBElement<GetSalesFact>(_GetSalesFact_QNAME, GetSalesFact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createCustomer")
    public JAXBElement<CreateCustomer> createCreateCustomer(CreateCustomer value) {
        return new JAXBElement<CreateCustomer>(_CreateCustomer_QNAME, CreateCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSupplierResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createSupplierResponse")
    public JAXBElement<CreateSupplierResponse> createCreateSupplierResponse(CreateSupplierResponse value) {
        return new JAXBElement<CreateSupplierResponse>(_CreateSupplierResponse_QNAME, CreateSupplierResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderFact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "OrderFact")
    public JAXBElement<OrderFact> createOrderFact(OrderFact value) {
        return new JAXBElement<OrderFact>(_OrderFact_QNAME, OrderFact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Time")
    public JAXBElement<Time> createTime(Time value) {
        return new JAXBElement<Time>(_Time_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Supplier }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Supplier")
    public JAXBElement<Supplier> createSupplier(Supplier value) {
        return new JAXBElement<Supplier>(_Supplier_QNAME, Supplier.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrderFact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createOrderFact")
    public JAXBElement<CreateOrderFact> createCreateOrderFact(CreateOrderFact value) {
        return new JAXBElement<CreateOrderFact>(_CreateOrderFact_QNAME, CreateOrderFact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "createTimeResponse")
    public JAXBElement<CreateTimeResponse> createCreateTimeResponse(CreateTimeResponse value) {
        return new JAXBElement<CreateTimeResponse>(_CreateTimeResponse_QNAME, CreateTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderFact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "SalesOrderFact")
    public JAXBElement<SalesOrderFact> createSalesOrderFact(SalesOrderFact value) {
        return new JAXBElement<SalesOrderFact>(_SalesOrderFact_QNAME, SalesOrderFact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdValidiation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "id_validiation")
    public JAXBElement<IdValidiation> createIdValidiation(IdValidiation value) {
        return new JAXBElement<IdValidiation>(_IdValidiation_QNAME, IdValidiation.class, null, value);
    }

}
