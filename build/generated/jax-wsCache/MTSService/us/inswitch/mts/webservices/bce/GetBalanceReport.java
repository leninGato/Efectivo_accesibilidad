
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestGetBalanceReport;


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
 *         &lt;element name="dtoRequestGetBalanceReport" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestGetBalanceReport" minOccurs="0"/>
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
    "dtoRequestGetBalanceReport"
})
@XmlRootElement(name = "getBalanceReport")
public class GetBalanceReport {

    @XmlElementRef(name = "dtoRequestGetBalanceReport", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestGetBalanceReport> dtoRequestGetBalanceReport;

    /**
     * Obtiene el valor de la propiedad dtoRequestGetBalanceReport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetBalanceReport }{@code >}
     *     
     */
    public JAXBElement<DTORequestGetBalanceReport> getDtoRequestGetBalanceReport() {
        return dtoRequestGetBalanceReport;
    }

    /**
     * Define el valor de la propiedad dtoRequestGetBalanceReport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetBalanceReport }{@code >}
     *     
     */
    public void setDtoRequestGetBalanceReport(JAXBElement<DTORequestGetBalanceReport> value) {
        this.dtoRequestGetBalanceReport = value;
    }

}
