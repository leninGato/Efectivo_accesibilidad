
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInPre;


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
 *         &lt;element name="dtoRequestCashInPre" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCashInPre" minOccurs="0"/>
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
    "dtoRequestCashInPre"
})
@XmlRootElement(name = "cashInPre")
public class CashInPre {

    @XmlElementRef(name = "dtoRequestCashInPre", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCashInPre> dtoRequestCashInPre;

    /**
     * Obtiene el valor de la propiedad dtoRequestCashInPre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInPre }{@code >}
     *     
     */
    public JAXBElement<DTORequestCashInPre> getDtoRequestCashInPre() {
        return dtoRequestCashInPre;
    }

    /**
     * Define el valor de la propiedad dtoRequestCashInPre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInPre }{@code >}
     *     
     */
    public void setDtoRequestCashInPre(JAXBElement<DTORequestCashInPre> value) {
        this.dtoRequestCashInPre = value;
    }

}
