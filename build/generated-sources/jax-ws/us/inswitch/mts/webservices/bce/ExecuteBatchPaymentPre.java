
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestExecuteBatchPayment;


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
 *         &lt;element name="dtoRequestExecuteBatchPayment" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestExecuteBatchPayment" minOccurs="0"/>
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
    "dtoRequestExecuteBatchPayment"
})
@XmlRootElement(name = "executeBatchPaymentPre")
public class ExecuteBatchPaymentPre {

    @XmlElementRef(name = "dtoRequestExecuteBatchPayment", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestExecuteBatchPayment> dtoRequestExecuteBatchPayment;

    /**
     * Obtiene el valor de la propiedad dtoRequestExecuteBatchPayment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestExecuteBatchPayment }{@code >}
     *     
     */
    public JAXBElement<DTORequestExecuteBatchPayment> getDtoRequestExecuteBatchPayment() {
        return dtoRequestExecuteBatchPayment;
    }

    /**
     * Define el valor de la propiedad dtoRequestExecuteBatchPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestExecuteBatchPayment }{@code >}
     *     
     */
    public void setDtoRequestExecuteBatchPayment(JAXBElement<DTORequestExecuteBatchPayment> value) {
        this.dtoRequestExecuteBatchPayment = value;
    }

}
