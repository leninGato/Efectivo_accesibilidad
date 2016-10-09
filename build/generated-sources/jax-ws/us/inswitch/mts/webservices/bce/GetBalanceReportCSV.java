
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.web.request.xsd.DTORequestGetBalanceReportCSV;


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
 *         &lt;element name="dtoRequestGetBalanceReportCSV" type="{http://request.web.dto.webservices.mts.inswitch.us/xsd}DTORequestGetBalanceReportCSV" minOccurs="0"/>
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
    "dtoRequestGetBalanceReportCSV"
})
@XmlRootElement(name = "getBalanceReportCSV")
public class GetBalanceReportCSV {

    @XmlElementRef(name = "dtoRequestGetBalanceReportCSV", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestGetBalanceReportCSV> dtoRequestGetBalanceReportCSV;

    /**
     * Obtiene el valor de la propiedad dtoRequestGetBalanceReportCSV.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetBalanceReportCSV }{@code >}
     *     
     */
    public JAXBElement<DTORequestGetBalanceReportCSV> getDtoRequestGetBalanceReportCSV() {
        return dtoRequestGetBalanceReportCSV;
    }

    /**
     * Define el valor de la propiedad dtoRequestGetBalanceReportCSV.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetBalanceReportCSV }{@code >}
     *     
     */
    public void setDtoRequestGetBalanceReportCSV(JAXBElement<DTORequestGetBalanceReportCSV> value) {
        this.dtoRequestGetBalanceReportCSV = value;
    }

}
