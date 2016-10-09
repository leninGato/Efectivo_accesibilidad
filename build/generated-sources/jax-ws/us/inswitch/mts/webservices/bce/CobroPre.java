
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCobroPre;


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
 *         &lt;element name="dtoRequestCobroPre" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCobroPre" minOccurs="0"/>
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
    "dtoRequestCobroPre"
})
@XmlRootElement(name = "cobroPre")
public class CobroPre {

    @XmlElementRef(name = "dtoRequestCobroPre", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCobroPre> dtoRequestCobroPre;

    /**
     * Obtiene el valor de la propiedad dtoRequestCobroPre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCobroPre }{@code >}
     *     
     */
    public JAXBElement<DTORequestCobroPre> getDtoRequestCobroPre() {
        return dtoRequestCobroPre;
    }

    /**
     * Define el valor de la propiedad dtoRequestCobroPre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCobroPre }{@code >}
     *     
     */
    public void setDtoRequestCobroPre(JAXBElement<DTORequestCobroPre> value) {
        this.dtoRequestCobroPre = value;
    }

}
