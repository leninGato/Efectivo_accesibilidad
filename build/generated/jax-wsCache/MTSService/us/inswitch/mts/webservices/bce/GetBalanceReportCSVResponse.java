
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.response.xsd.DTOResponseGetBalanceReportCSV;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://response.service.dto.webservices.mts.inswitch.us/xsd}DTOResponseGetBalanceReportCSV" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "_return"
})
@XmlRootElement(name = "getBalanceReportCSVResponse")
public class GetBalanceReportCSVResponse {

    @XmlElementRef(name = "return", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTOResponseGetBalanceReportCSV> _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTOResponseGetBalanceReportCSV }{@code >}
     *     
     */
    public JAXBElement<DTOResponseGetBalanceReportCSV> getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTOResponseGetBalanceReportCSV }{@code >}
     *     
     */
    public void setReturn(JAXBElement<DTOResponseGetBalanceReportCSV> value) {
        this._return = value;
    }

}
