
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestGetDailyReport;


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
 *         &lt;element name="dtoRequestGetDailyReport" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestGetDailyReport" minOccurs="0"/>
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
    "dtoRequestGetDailyReport"
})
@XmlRootElement(name = "getDailyReportTelco")
public class GetDailyReportTelco {

    @XmlElementRef(name = "dtoRequestGetDailyReport", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestGetDailyReport> dtoRequestGetDailyReport;

    /**
     * Obtiene el valor de la propiedad dtoRequestGetDailyReport.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetDailyReport }{@code >}
     *     
     */
    public JAXBElement<DTORequestGetDailyReport> getDtoRequestGetDailyReport() {
        return dtoRequestGetDailyReport;
    }

    /**
     * Define el valor de la propiedad dtoRequestGetDailyReport.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetDailyReport }{@code >}
     *     
     */
    public void setDtoRequestGetDailyReport(JAXBElement<DTORequestGetDailyReport> value) {
        this.dtoRequestGetDailyReport = value;
    }

}
