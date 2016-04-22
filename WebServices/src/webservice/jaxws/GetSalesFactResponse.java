
package webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getSalesFactResponse", namespace = "http://webservice/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSalesFactResponse", namespace = "http://webservice/")
public class GetSalesFactResponse {

    @XmlElement(name = "return", namespace = "")
    private model.SalesOrderFact _return;

    /**
     * 
     * @return
     *     returns SalesOrderFact
     */
    public model.SalesOrderFact getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(model.SalesOrderFact _return) {
        this._return = _return;
    }

}
