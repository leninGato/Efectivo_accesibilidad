
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestGetBalance;


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
 *         &lt;element name="dtoRequestGetBalance" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestGetBalance" minOccurs="0"/>
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
    "dtoRequestGetBalance"
})
@XmlRootElement(name = "getBalance")
public class GetBalance {

    @XmlElementRef(name = "dtoRequestGetBalance", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestGetBalance> dtoRequestGetBalance;

    /**
     * Obtiene el valor de la propiedad dtoRequestGetBalance.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetBalance }{@code >}
     *     
     */
    public JAXBElement<DTORequestGetBalance> getDtoRequestGetBalance() {
        return dtoRequestGetBalance;
    }

    /**
     * Define el valor de la propiedad dtoRequestGetBalance.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestGetBalance }{@code >}
     *     
     */
    public void setDtoRequestGetBalance(JAXBElement<DTORequestGetBalance> value) {
        this.dtoRequestGetBalance = value;
    }

}
