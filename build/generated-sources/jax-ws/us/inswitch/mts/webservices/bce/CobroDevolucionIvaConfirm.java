
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestCobroDevolucionIvaConfirm;


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
 *         &lt;element name="dtoRequestCobroDevolucionIvaConfirm" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestCobroDevolucionIvaConfirm" minOccurs="0"/>
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
    "dtoRequestCobroDevolucionIvaConfirm"
})
@XmlRootElement(name = "cobroDevolucionIvaConfirm")
public class CobroDevolucionIvaConfirm {

    @XmlElementRef(name = "dtoRequestCobroDevolucionIvaConfirm", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestCobroDevolucionIvaConfirm> dtoRequestCobroDevolucionIvaConfirm;

    /**
     * Obtiene el valor de la propiedad dtoRequestCobroDevolucionIvaConfirm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCobroDevolucionIvaConfirm }{@code >}
     *     
     */
    public JAXBElement<DTORequestCobroDevolucionIvaConfirm> getDtoRequestCobroDevolucionIvaConfirm() {
        return dtoRequestCobroDevolucionIvaConfirm;
    }

    /**
     * Define el valor de la propiedad dtoRequestCobroDevolucionIvaConfirm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestCobroDevolucionIvaConfirm }{@code >}
     *     
     */
    public void setDtoRequestCobroDevolucionIvaConfirm(JAXBElement<DTORequestCobroDevolucionIvaConfirm> value) {
        this.dtoRequestCobroDevolucionIvaConfirm = value;
    }

}
