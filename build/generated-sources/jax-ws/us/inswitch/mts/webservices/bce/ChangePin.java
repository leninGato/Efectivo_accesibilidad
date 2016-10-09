
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestChangePin;


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
 *         &lt;element name="dtoRequestChangePin" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestChangePin" minOccurs="0"/>
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
    "dtoRequestChangePin"
})
@XmlRootElement(name = "changePin")
public class ChangePin {

    @XmlElementRef(name = "dtoRequestChangePin", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestChangePin> dtoRequestChangePin;

    /**
     * Obtiene el valor de la propiedad dtoRequestChangePin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestChangePin }{@code >}
     *     
     */
    public JAXBElement<DTORequestChangePin> getDtoRequestChangePin() {
        return dtoRequestChangePin;
    }

    /**
     * Define el valor de la propiedad dtoRequestChangePin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestChangePin }{@code >}
     *     
     */
    public void setDtoRequestChangePin(JAXBElement<DTORequestChangePin> value) {
        this.dtoRequestChangePin = value;
    }

}
