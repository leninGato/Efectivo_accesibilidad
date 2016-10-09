
package us.inswitch.mts.webservices.dto.web.response.xsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DTOResponseReportTransactions complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DTOResponseReportTransactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeErrorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reportTransactionList" type="{http://response.web.dto.webservices.mts.inswitch.us/xsd}DTOResponseReportTransaction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="resultText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="utfi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTOResponseReportTransactions", propOrder = {
    "codeErrorId",
    "reportTransactionList",
    "resultCode",
    "resultText",
    "utfi"
})
public class DTOResponseReportTransactions {

    @XmlElementRef(name = "codeErrorId", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeErrorId;
    @XmlElement(nillable = true)
    protected List<DTOResponseReportTransaction> reportTransactionList;
    protected Integer resultCode;
    @XmlElementRef(name = "resultText", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resultText;
    @XmlElementRef(name = "utfi", namespace = "http://response.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utfi;

    /**
     * Obtiene el valor de la propiedad codeErrorId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeErrorId() {
        return codeErrorId;
    }

    /**
     * Define el valor de la propiedad codeErrorId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeErrorId(JAXBElement<String> value) {
        this.codeErrorId = value;
    }

    /**
     * Gets the value of the reportTransactionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reportTransactionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportTransactionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTOResponseReportTransaction }
     * 
     * 
     */
    public List<DTOResponseReportTransaction> getReportTransactionList() {
        if (reportTransactionList == null) {
            reportTransactionList = new ArrayList<DTOResponseReportTransaction>();
        }
        return this.reportTransactionList;
    }

    /**
     * Obtiene el valor de la propiedad resultCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCode() {
        return resultCode;
    }

    /**
     * Define el valor de la propiedad resultCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCode(Integer value) {
        this.resultCode = value;
    }

    /**
     * Obtiene el valor de la propiedad resultText.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResultText() {
        return resultText;
    }

    /**
     * Define el valor de la propiedad resultText.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResultText(JAXBElement<String> value) {
        this.resultText = value;
    }

    /**
     * Obtiene el valor de la propiedad utfi.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUtfi() {
        return utfi;
    }

    /**
     * Define el valor de la propiedad utfi.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUtfi(JAXBElement<String> value) {
        this.utfi = value;
    }

}
