
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestFondeoLocalPre;


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
 *         &lt;element name="dtoRequestFondeoLocalPre" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestFondeoLocalPre" minOccurs="0"/>
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
    "dtoRequestFondeoLocalPre"
})
@XmlRootElement(name = "fondeoLocalPre")
public class FondeoLocalPre {

    @XmlElementRef(name = "dtoRequestFondeoLocalPre", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestFondeoLocalPre> dtoRequestFondeoLocalPre;

    /**
     * Obtiene el valor de la propiedad dtoRequestFondeoLocalPre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestFondeoLocalPre }{@code >}
     *     
     */
    public JAXBElement<DTORequestFondeoLocalPre> getDtoRequestFondeoLocalPre() {
        return dtoRequestFondeoLocalPre;
    }

    /**
     * Define el valor de la propiedad dtoRequestFondeoLocalPre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestFondeoLocalPre }{@code >}
     *     
     */
    public void setDtoRequestFondeoLocalPre(JAXBElement<DTORequestFondeoLocalPre> value) {
        this.dtoRequestFondeoLocalPre = value;
    }

}
