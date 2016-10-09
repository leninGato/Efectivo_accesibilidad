
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestRetrieveBatch;


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
 *         &lt;element name="dtoRequestRetrieveBatchCredit" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestRetrieveBatch" minOccurs="0"/>
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
    "dtoRequestRetrieveBatchCredit"
})
@XmlRootElement(name = "retrieveBatchCredit")
public class RetrieveBatchCredit {

    @XmlElementRef(name = "dtoRequestRetrieveBatchCredit", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestRetrieveBatch> dtoRequestRetrieveBatchCredit;

    /**
     * Obtiene el valor de la propiedad dtoRequestRetrieveBatchCredit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatch }{@code >}
     *     
     */
    public JAXBElement<DTORequestRetrieveBatch> getDtoRequestRetrieveBatchCredit() {
        return dtoRequestRetrieveBatchCredit;
    }

    /**
     * Define el valor de la propiedad dtoRequestRetrieveBatchCredit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatch }{@code >}
     *     
     */
    public void setDtoRequestRetrieveBatchCredit(JAXBElement<DTORequestRetrieveBatch> value) {
        this.dtoRequestRetrieveBatchCredit = value;
    }

}
