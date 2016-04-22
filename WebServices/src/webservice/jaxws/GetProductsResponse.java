
package webservice.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getProductsResponse", namespace = "http://webservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getProductsResponse", namespace = "http://webservice/")
public class GetProductsResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<model.Product> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Product>
     */
    public ArrayList<model.Product> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<model.Product> _return) {
        this._return = _return;
    }

}
