
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.response.xsd.DTOResponseMassiveBatchUpload;


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
 *         &lt;element name="return" type="{http://response.web.dto.webservices.mts.inswitch.us/xsd}DTOResponseMassiveBatchUpload" minOccurs="0"/>
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
    "_return"
})
@XmlRootElement(name = "massiveBatchDebitUploadResponse")
public class MassiveBatchDebitUploadResponse {

    @XmlElementRef(name = "return", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTOResponseMassiveBatchUpload> _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTOResponseMassiveBatchUpload }{@code >}
     *     
     */
    public JAXBElement<DTOResponseMassiveBatchUpload> getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTOResponseMassiveBatchUpload }{@code >}
     *     
     */
    public void setReturn(JAXBElement<DTOResponseMassiveBatchUpload> value) {
        this._return = value;
    }

}
