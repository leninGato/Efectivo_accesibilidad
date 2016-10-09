
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestRetrieveBatchOneLine;


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
 *         &lt;element name="dtoRequestRetrieveBatchOneLine" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestRetrieveBatchOneLine" minOccurs="0"/>
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
    "dtoRequestRetrieveBatchOneLine"
})
@XmlRootElement(name = "retrieveBatchOneLine")
public class RetrieveBatchOneLine {

    @XmlElementRef(name = "dtoRequestRetrieveBatchOneLine", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestRetrieveBatchOneLine> dtoRequestRetrieveBatchOneLine;

    /**
     * Obtiene el valor de la propiedad dtoRequestRetrieveBatchOneLine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatchOneLine }{@code >}
     *     
     */
    public JAXBElement<DTORequestRetrieveBatchOneLine> getDtoRequestRetrieveBatchOneLine() {
        return dtoRequestRetrieveBatchOneLine;
    }

    /**
     * Define el valor de la propiedad dtoRequestRetrieveBatchOneLine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatchOneLine }{@code >}
     *     
     */
    public void setDtoRequestRetrieveBatchOneLine(JAXBElement<DTORequestRetrieveBatchOneLine> value) {
        this.dtoRequestRetrieveBatchOneLine = value;
    }

}
