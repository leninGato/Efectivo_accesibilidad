
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestGetClientAdditionalData;


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
 *         &lt;element name="dtoRequestGetClientAdditionalData" type="{http://request.administration.dto.webservices.mts.inswitch.us/xsd}DTORequestGetClientAdditionalData" minOccurs="0"/>
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
    "dtoRequestGetClientAdditionalData"
})
@XmlRootElement(name = "getClientAdditionalData")
public class GetClientAdditionalData {

    @XmlElementRef(name = "dtoRequestGetClientAdditionalData", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestGetClientAdditionalData> dtoRequestGetClientAdditionalData;

    /**
     * Obtiene el valor de la propiedad dtoRequestGetClientAdditionalData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetClientAdditionalData }{@code >}
     *     
     */
    public JAXBElement<DTORequestGetClientAdditionalData> getDtoRequestGetClientAdditionalData() {
        return dtoRequestGetClientAdditionalData;
    }

    /**
     * Define el valor de la propiedad dtoRequestGetClientAdditionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetClientAdditionalData }{@code >}
     *     
     */
    public void setDtoRequestGetClientAdditionalData(JAXBElement<DTORequestGetClientAdditionalData> value) {
        this.dtoRequestGetClientAdditionalData = value;
    }

}
