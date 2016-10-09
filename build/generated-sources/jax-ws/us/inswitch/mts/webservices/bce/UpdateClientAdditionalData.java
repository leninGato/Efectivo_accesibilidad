
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestUpdateClientAdditionalData;


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
 *         &lt;element name="dtoRequestUpdateClientAdditionalData" type="{http://request.administration.dto.webservices.mts.inswitch.us/xsd}DTORequestUpdateClientAdditionalData" minOccurs="0"/>
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
    "dtoRequestUpdateClientAdditionalData"
})
@XmlRootElement(name = "updateClientAdditionalData")
public class UpdateClientAdditionalData {

    @XmlElementRef(name = "dtoRequestUpdateClientAdditionalData", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestUpdateClientAdditionalData> dtoRequestUpdateClientAdditionalData;

    /**
     * Obtiene el valor de la propiedad dtoRequestUpdateClientAdditionalData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestUpdateClientAdditionalData }{@code >}
     *     
     */
    public JAXBElement<DTORequestUpdateClientAdditionalData> getDtoRequestUpdateClientAdditionalData() {
        return dtoRequestUpdateClientAdditionalData;
    }

    /**
     * Define el valor de la propiedad dtoRequestUpdateClientAdditionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestUpdateClientAdditionalData }{@code >}
     *     
     */
    public void setDtoRequestUpdateClientAdditionalData(JAXBElement<DTORequestUpdateClientAdditionalData> value) {
        this.dtoRequestUpdateClientAdditionalData = value;
    }

}
