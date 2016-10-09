
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestDeleteClientAdditionalData;


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
 *         &lt;element name="dtoRequestDeleteClientAdditionalData" type="{http://request.administration.dto.webservices.mts.inswitch.us/xsd}DTORequestDeleteClientAdditionalData" minOccurs="0"/>
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
    "dtoRequestDeleteClientAdditionalData"
})
@XmlRootElement(name = "deleteClientAdditionalData")
public class DeleteClientAdditionalData {

    @XmlElementRef(name = "dtoRequestDeleteClientAdditionalData", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestDeleteClientAdditionalData> dtoRequestDeleteClientAdditionalData;

    /**
     * Obtiene el valor de la propiedad dtoRequestDeleteClientAdditionalData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestDeleteClientAdditionalData }{@code >}
     *     
     */
    public JAXBElement<DTORequestDeleteClientAdditionalData> getDtoRequestDeleteClientAdditionalData() {
        return dtoRequestDeleteClientAdditionalData;
    }

    /**
     * Define el valor de la propiedad dtoRequestDeleteClientAdditionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestDeleteClientAdditionalData }{@code >}
     *     
     */
    public void setDtoRequestDeleteClientAdditionalData(JAXBElement<DTORequestDeleteClientAdditionalData> value) {
        this.dtoRequestDeleteClientAdditionalData = value;
    }

}
