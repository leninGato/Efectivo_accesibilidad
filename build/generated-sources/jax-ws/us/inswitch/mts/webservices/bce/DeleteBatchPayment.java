
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestDeleteBatchPayment;


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
 *         &lt;element name="dtoRequestDeleteBatchPayment" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestDeleteBatchPayment" minOccurs="0"/>
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
    "dtoRequestDeleteBatchPayment"
})
@XmlRootElement(name = "deleteBatchPayment")
public class DeleteBatchPayment {

    @XmlElementRef(name = "dtoRequestDeleteBatchPayment", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestDeleteBatchPayment> dtoRequestDeleteBatchPayment;

    /**
     * Obtiene el valor de la propiedad dtoRequestDeleteBatchPayment.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestDeleteBatchPayment }{@code >}
     *     
     */
    public JAXBElement<DTORequestDeleteBatchPayment> getDtoRequestDeleteBatchPayment() {
        return dtoRequestDeleteBatchPayment;
    }

    /**
     * Define el valor de la propiedad dtoRequestDeleteBatchPayment.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestDeleteBatchPayment }{@code >}
     *     
     */
    public void setDtoRequestDeleteBatchPayment(JAXBElement<DTORequestDeleteBatchPayment> value) {
        this.dtoRequestDeleteBatchPayment = value;
    }

}
