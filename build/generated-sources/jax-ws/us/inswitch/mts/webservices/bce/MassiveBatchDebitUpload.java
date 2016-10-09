
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestMassiveBatchUpload;


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
 *         &lt;element name="dtoRequestMassiveBatchUpload" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestMassiveBatchUpload" minOccurs="0"/>
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
    "dtoRequestMassiveBatchUpload"
})
@XmlRootElement(name = "massiveBatchDebitUpload")
public class MassiveBatchDebitUpload {

    @XmlElementRef(name = "dtoRequestMassiveBatchUpload", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestMassiveBatchUpload> dtoRequestMassiveBatchUpload;

    /**
     * Obtiene el valor de la propiedad dtoRequestMassiveBatchUpload.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestMassiveBatchUpload }{@code >}
     *     
     */
    public JAXBElement<DTORequestMassiveBatchUpload> getDtoRequestMassiveBatchUpload() {
        return dtoRequestMassiveBatchUpload;
    }

    /**
     * Define el valor de la propiedad dtoRequestMassiveBatchUpload.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestMassiveBatchUpload }{@code >}
     *     
     */
    public void setDtoRequestMassiveBatchUpload(JAXBElement<DTORequestMassiveBatchUpload> value) {
        this.dtoRequestMassiveBatchUpload = value;
    }

}
