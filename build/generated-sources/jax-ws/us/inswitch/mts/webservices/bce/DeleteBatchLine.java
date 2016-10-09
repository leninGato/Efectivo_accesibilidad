
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestDeleteBatchLine;


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
 *         &lt;element name="dtoRequestDeleteBatchLine" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestDeleteBatchLine" minOccurs="0"/>
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
    "dtoRequestDeleteBatchLine"
})
@XmlRootElement(name = "deleteBatchLine")
public class DeleteBatchLine {

    @XmlElementRef(name = "dtoRequestDeleteBatchLine", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestDeleteBatchLine> dtoRequestDeleteBatchLine;

    /**
     * Obtiene el valor de la propiedad dtoRequestDeleteBatchLine.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestDeleteBatchLine }{@code >}
     *     
     */
    public JAXBElement<DTORequestDeleteBatchLine> getDtoRequestDeleteBatchLine() {
        return dtoRequestDeleteBatchLine;
    }

    /**
     * Define el valor de la propiedad dtoRequestDeleteBatchLine.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestDeleteBatchLine }{@code >}
     *     
     */
    public void setDtoRequestDeleteBatchLine(JAXBElement<DTORequestDeleteBatchLine> value) {
        this.dtoRequestDeleteBatchLine = value;
    }

}
