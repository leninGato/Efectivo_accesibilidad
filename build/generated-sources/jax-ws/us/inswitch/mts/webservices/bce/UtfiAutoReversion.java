
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestUtfiAutoReversion;


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
 *         &lt;element name="dtoRequestUtfiAutoReversion" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestUtfiAutoReversion" minOccurs="0"/>
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
    "dtoRequestUtfiAutoReversion"
})
@XmlRootElement(name = "utfiAutoReversion")
public class UtfiAutoReversion {

    @XmlElementRef(name = "dtoRequestUtfiAutoReversion", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestUtfiAutoReversion> dtoRequestUtfiAutoReversion;

    /**
     * Obtiene el valor de la propiedad dtoRequestUtfiAutoReversion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestUtfiAutoReversion }{@code >}
     *     
     */
    public JAXBElement<DTORequestUtfiAutoReversion> getDtoRequestUtfiAutoReversion() {
        return dtoRequestUtfiAutoReversion;
    }

    /**
     * Define el valor de la propiedad dtoRequestUtfiAutoReversion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestUtfiAutoReversion }{@code >}
     *     
     */
    public void setDtoRequestUtfiAutoReversion(JAXBElement<DTORequestUtfiAutoReversion> value) {
        this.dtoRequestUtfiAutoReversion = value;
    }

}
