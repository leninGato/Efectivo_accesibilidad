
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestFondeoLocalConfirm;


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
 *         &lt;element name="dtoRequestFondeoLocalConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestFondeoLocalConfirm" minOccurs="0"/>
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
    "dtoRequestFondeoLocalConfirm"
})
@XmlRootElement(name = "fondeoLocalConfirm")
public class FondeoLocalConfirm {

    @XmlElementRef(name = "dtoRequestFondeoLocalConfirm", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestFondeoLocalConfirm> dtoRequestFondeoLocalConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestFondeoLocalConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestFondeoLocalConfirm }{@code >}
     *     
     */
    public JAXBElement<DTORequestFondeoLocalConfirm> getDtoRequestFondeoLocalConfirm() {
        return dtoRequestFondeoLocalConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestFondeoLocalConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestFondeoLocalConfirm }{@code >}
     *     
     */
    public void setDtoRequestFondeoLocalConfirm(JAXBElement<DTORequestFondeoLocalConfirm> value) {
        this.dtoRequestFondeoLocalConfirm = value;
    }

}
