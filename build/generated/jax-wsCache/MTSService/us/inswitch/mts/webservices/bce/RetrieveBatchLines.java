
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestRetrieveBatchLines;


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
 *         &lt;element name="dtoRequestRetrieveBatchLines" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestRetrieveBatchLines" minOccurs="0"/>
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
    "dtoRequestRetrieveBatchLines"
})
@XmlRootElement(name = "retrieveBatchLines")
public class RetrieveBatchLines {

    @XmlElementRef(name = "dtoRequestRetrieveBatchLines", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestRetrieveBatchLines> dtoRequestRetrieveBatchLines;

    /**
     * Obtiene el valor de la propiedad dtoRequestRetrieveBatchLines.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatchLines }{@code >}
     *     
     */
    public JAXBElement<DTORequestRetrieveBatchLines> getDtoRequestRetrieveBatchLines() {
        return dtoRequestRetrieveBatchLines;
    }

    /**
     * Define el valor de la propiedad dtoRequestRetrieveBatchLines.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatchLines }{@code >}
     *     
     */
    public void setDtoRequestRetrieveBatchLines(JAXBElement<DTORequestRetrieveBatchLines> value) {
        this.dtoRequestRetrieveBatchLines = value;
    }

}
