
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestSendSMS;


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
 *         &lt;element name="dtoRequestSendSMS" type="{http://request.administration.dto.webservices.mts.inswitch.us/xsd}DTORequestSendSMS" minOccurs="0"/>
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
    "dtoRequestSendSMS"
})
@XmlRootElement(name = "sendSMS")
public class SendSMS {

    @XmlElementRef(name = "dtoRequestSendSMS", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestSendSMS> dtoRequestSendSMS;

    /**
     * Obtiene el valor de la propiedad dtoRequestSendSMS.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestSendSMS }{@code >}
     *     
     */
    public JAXBElement<DTORequestSendSMS> getDtoRequestSendSMS() {
        return dtoRequestSendSMS;
    }

    /**
     * Define el valor de la propiedad dtoRequestSendSMS.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestSendSMS }{@code >}
     *     
     */
    public void setDtoRequestSendSMS(JAXBElement<DTORequestSendSMS> value) {
        this.dtoRequestSendSMS = value;
    }

}
