
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCashInConfirm;


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
 *         &lt;element name="dtoRequestCashInATMConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCashInConfirm" minOccurs="0"/>
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
    "dtoRequestCashInATMConfirm"
})
@XmlRootElement(name = "cashInATMConfirm")
public class CashInATMConfirm {

    @XmlElementRef(name = "dtoRequestCashInATMConfirm", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCashInConfirm> dtoRequestCashInATMConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestCashInATMConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInConfirm }{@code >}
     *     
     */
    public JAXBElement<DTORequestCashInConfirm> getDtoRequestCashInATMConfirm() {
        return dtoRequestCashInATMConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestCashInATMConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCashInConfirm }{@code >}
     *     
     */
    public void setDtoRequestCashInATMConfirm(JAXBElement<DTORequestCashInConfirm> value) {
        this.dtoRequestCashInATMConfirm = value;
    }

}
