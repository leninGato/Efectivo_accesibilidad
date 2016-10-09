
package us.inswitch.mts.webservices.bce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import us.inswitch.mts.webservices.dto.service.request.xsd.DTORequestReservesForBankTransfer;


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
 *         &lt;element name="dtoRequestReservesForBankTransfer" type="{http://request.service.dto.webservices.mts.inswitch.us/xsd}DTORequestReservesForBankTransfer" minOccurs="0"/>
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
    "dtoRequestReservesForBankTransfer"
})
@XmlRootElement(name = "reservesForBankTransfer")
public class ReservesForBankTransfer {

    @XmlElementRef(name = "dtoRequestReservesForBankTransfer", namespace = "http://bce.webservices.mts.inswitch.us", type = JAXBElement.class, required = false)
    protected JAXBElement<DTORequestReservesForBankTransfer> dtoRequestReservesForBankTransfer;

    /**
     * Obtiene el valor de la propiedad dtoRequestReservesForBankTransfer.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DTORequestReservesForBankTransfer }{@code >}
     *     
     */
    public JAXBElement<DTORequestReservesForBankTransfer> getDtoRequestReservesForBankTransfer() {
        return dtoRequestReservesForBankTransfer;
    }

    /**
     * Define el valor de la propiedad dtoRequestReservesForBankTransfer.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DTORequestReservesForBankTransfer }{@code >}
     *     
     */
    public void setDtoRequestReservesForBankTransfer(JAXBElement<DTORequestReservesForBankTransfer> value) {
        this.dtoRequestReservesForBankTransfer = value;
    }

}
