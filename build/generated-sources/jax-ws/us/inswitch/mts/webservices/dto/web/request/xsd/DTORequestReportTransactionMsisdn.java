
package us.inswitch.mts.webservices.dto.web.request.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DTORequestReportTransactionMsisdn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DTORequestReportTransactionMsisdn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rowPerPage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sourceId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DTORequestReportTransactionMsisdn", propOrder = {
    "dateFrom",
    "dateTo",
    "language",
    "msisdn",
    "page",
    "password",
    "rowPerPage",
    "sourceId",
    "user",
    "utfi"
})
public class DTORequestReportTransactionMsisdn {

    @XmlElementRef(name = "dateFrom", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateFrom;
    @XmlElementRef(name = "dateTo", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateTo;
    @XmlElementRef(name = "language", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> language;
    @XmlElementRef(name = "msisdn", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> msisdn;
    @XmlElementRef(name = "page", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> page;
    @XmlElementRef(name = "password", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "rowPerPage", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> rowPerPage;
    @XmlElementRef(name = "sourceId", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceId;
    @XmlElementRef(name = "user", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> user;
    @XmlElementRef(name = "utfi", namespace = "http://request.web.dto.webservices.mts.inswitch.us/xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> utfi;

    /**
     * Obtiene el valor de la propiedad dateFrom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateFrom() {
        return dateFrom;
    }

    /**
     * Define el valor de la propiedad dateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateFrom(JAXBElement<String> value) {
        this.dateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad dateTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateTo() {
        return dateTo;
    }

    /**
     * Define el valor de la propiedad dateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateTo(JAXBElement<String> value) {
        this.dateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguage(JAXBElement<String> value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad msisdn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMsisdn() {
        return msisdn;
    }

    /**
     * Define el valor de la propiedad msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMsisdn(JAXBElement<String> value) {
        this.msisdn = value;
    }

    /**
     * Obtiene el valor de la propiedad page.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPage() {
        return page;
    }

    /**
     * Define el valor de la propiedad page.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPage(JAXBElement<Integer> value) {
        this.page = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad rowPerPage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRowPerPage() {
        return rowPerPage;
    }

    /**
     * Define el valor de la propiedad rowPerPage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRowPerPage(JAXBElement<Integer> value) {
        this.rowPerPage = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceId() {
        return sourceId;
    }

    /**
     * Define el valor de la propiedad sourceId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceId(JAXBElement<Integer> value) {
        this.sourceId = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUser(JAXBElement<String> value) {
        this.user = value;
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
