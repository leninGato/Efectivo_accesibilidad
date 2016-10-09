
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestRemitConfirm;


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
 *         &lt;element name="dtoRequestRemitConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestRemitConfirm" minOccurs="0"/>
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
    "dtoRequestRemitConfirm"
})
@XmlRootElement(name = "remitConfirm")
public class RemitConfirm {

    @XmlElementRef(name = "dtoRequestRemitConfirm", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestRemitConfirm> dtoRequestRemitConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestRemitConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRemitConfirm }{@code >}
     *     
     */
    public JAXBElement<DTORequestRemitConfirm> getDtoRequestRemitConfirm() {
        return dtoRequestRemitConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestRemitConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRemitConfirm }{@code >}
     *     
     */
    public void setDtoRequestRemitConfirm(JAXBElement<DTORequestRemitConfirm> value) {
        this.dtoRequestRemitConfirm = value;
    }

}
