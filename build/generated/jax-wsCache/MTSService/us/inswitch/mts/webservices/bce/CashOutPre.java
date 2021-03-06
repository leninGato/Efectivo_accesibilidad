
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashOutPre;


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
 *         &lt;element name="dtoRequestCashOutPre" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCashOutPre" minOccurs="0"/>
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
    "dtoRequestCashOutPre"
})
@XmlRootElement(name = "cashOutPre")
public class CashOutPre {

    @XmlElementRef(name = "dtoRequestCashOutPre", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCashOutPre> dtoRequestCashOutPre;

    /**
     * Obtiene el valor de la propiedad dtoRequestCashOutPre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashOutPre }{@code >}
     *     
     */
    public JAXBElement<DTORequestCashOutPre> getDtoRequestCashOutPre() {
        return dtoRequestCashOutPre;
    }

    /**
     * Define el valor de la propiedad dtoRequestCashOutPre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashOutPre }{@code >}
     *     
     */
    public void setDtoRequestCashOutPre(JAXBElement<DTORequestCashOutPre> value) {
        this.dtoRequestCashOutPre = value;
    }

}
