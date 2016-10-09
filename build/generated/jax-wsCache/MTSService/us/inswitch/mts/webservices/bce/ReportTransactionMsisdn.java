
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestReportTransactionMsisdn;


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
 *         &lt;element name="dtoRequestReportTransactionMsisdn" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestReportTransactionMsisdn" minOccurs="0"/>
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
    "dtoRequestReportTransactionMsisdn"
})
@XmlRootElement(name = "reportTransactionMsisdn")
public class ReportTransactionMsisdn {

    @XmlElementRef(name = "dtoRequestReportTransactionMsisdn", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestReportTransactionMsisdn> dtoRequestReportTransactionMsisdn;

    /**
     * Obtiene el valor de la propiedad dtoRequestReportTransactionMsisdn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestReportTransactionMsisdn }{@code >}
     *     
     */
    public JAXBElement<DTORequestReportTransactionMsisdn> getDtoRequestReportTransactionMsisdn() {
        return dtoRequestReportTransactionMsisdn;
    }

    /**
     * Define el valor de la propiedad dtoRequestReportTransactionMsisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestReportTransactionMsisdn }{@code >}
     *     
     */
    public void setDtoRequestReportTransactionMsisdn(JAXBElement<DTORequestReportTransactionMsisdn> value) {
        this.dtoRequestReportTransactionMsisdn = value;
    }

}
