
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestReportTransaction;


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
 *         &lt;element name="dtoRequestReportTransaction" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestReportTransaction" minOccurs="0"/>
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
    "dtoRequestReportTransaction"
})
@XmlRootElement(name = "reportTransaction")
public class ReportTransaction {

    @XmlElementRef(name = "dtoRequestReportTransaction", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestReportTransaction> dtoRequestReportTransaction;

    /**
     * Obtiene el valor de la propiedad dtoRequestReportTransaction.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestReportTransaction }{@code >}
     *     
     */
    public JAXBElement<DTORequestReportTransaction> getDtoRequestReportTransaction() {
        return dtoRequestReportTransaction;
    }

    /**
     * Define el valor de la propiedad dtoRequestReportTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestReportTransaction }{@code >}
     *     
     */
    public void setDtoRequestReportTransaction(JAXBElement<DTORequestReportTransaction> value) {
        this.dtoRequestReportTransaction = value;
    }

}
