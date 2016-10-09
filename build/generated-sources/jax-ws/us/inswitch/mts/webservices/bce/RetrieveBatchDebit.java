
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
 *         &lt;element name="dtoRequestRetrieveBatchDebit" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestRetrieveBatch" minOccurs="0"/>
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
    "dtoRequestRetrieveBatchDebit"
})
@XmlRootElement(name = "retrieveBatchDebit")
public class RetrieveBatchDebit {

    @XmlElementRef(name = "dtoRequestRetrieveBatchDebit", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestRetrieveBatch> dtoRequestRetrieveBatchDebit;

    /**
     * Obtiene el valor de la propiedad dtoRequestRetrieveBatchDebit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatch }{@code >}
     *     
     */
    public JAXBElement<DTORequestRetrieveBatch> getDtoRequestRetrieveBatchDebit() {
        return dtoRequestRetrieveBatchDebit;
    }

    /**
     * Define el valor de la propiedad dtoRequestRetrieveBatchDebit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestRetrieveBatch }{@code >}
     *     
     */
    public void setDtoRequestRetrieveBatchDebit(JAXBElement<DTORequestRetrieveBatch> value) {
        this.dtoRequestRetrieveBatchDebit = value;
    }

}
