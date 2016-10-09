
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.administration.request.xsd.DTORequestInsertClientAdditionalData;


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
 *         &lt;element name="dtoRequestInsertClientAdditionalData" type="{http://request.administration.dto.webservices.mts.inswitch.us/xsd}DTORequestInsertClientAdditionalData" minOccurs="0"/>
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
    "dtoRequestInsertClientAdditionalData"
})
@XmlRootElement(name = "insertClientAdditionalData")
public class InsertClientAdditionalData {

    @XmlElementRef(name = "dtoRequestInsertClientAdditionalData", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestInsertClientAdditionalData> dtoRequestInsertClientAdditionalData;

    /**
     * Obtiene el valor de la propiedad dtoRequestInsertClientAdditionalData.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestInsertClientAdditionalData }{@code >}
     *     
     */
    public JAXBElement<DTORequestInsertClientAdditionalData> getDtoRequestInsertClientAdditionalData() {
        return dtoRequestInsertClientAdditionalData;
    }

    /**
     * Define el valor de la propiedad dtoRequestInsertClientAdditionalData.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestInsertClientAdditionalData }{@code >}
     *     
     */
    public void setDtoRequestInsertClientAdditionalData(JAXBElement<DTORequestInsertClientAdditionalData> value) {
        this.dtoRequestInsertClientAdditionalData = value;
    }

}
