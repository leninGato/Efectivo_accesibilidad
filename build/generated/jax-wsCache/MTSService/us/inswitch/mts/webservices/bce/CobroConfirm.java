
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCobroConfirm;


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
 *         &lt;element name="dtoRequestCobroConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCobroConfirm" minOccurs="0"/>
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
    "dtoRequestCobroConfirm"
})
@XmlRootElement(name = "cobroConfirm")
public class CobroConfirm {

    @XmlElementRef(name = "dtoRequestCobroConfirm", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCobroConfirm> dtoRequestCobroConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestCobroConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCobroConfirm }{@code >}
     *     
     */
    public JAXBElement<DTORequestCobroConfirm> getDtoRequestCobroConfirm() {
        return dtoRequestCobroConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestCobroConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCobroConfirm }{@code >}
     *     
     */
    public void setDtoRequestCobroConfirm(JAXBElement<DTORequestCobroConfirm> value) {
        this.dtoRequestCobroConfirm = value;
    }

}
