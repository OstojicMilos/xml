//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.27 at 10:44:08 PM CEST 
//


package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MT102Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MT102Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MT102" type="{http://www.ftn.xml/centralnabanka}MT102"/>
 *         &lt;element name="MT900" type="{http://www.ftn.xml/centralnabanka}MT900"/>
 *         &lt;element name="MT910" type="{http://www.ftn.xml/centralnabanka}MT910"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MT102Response", propOrder = {
    "mt102",
    "mt900",
    "mt910"
})
public class MT102Response {

    @XmlElement(name = "MT102", required = true)
    protected MT102 mt102;
    @XmlElement(name = "MT900", required = true)
    protected MT900 mt900;
    @XmlElement(name = "MT910", required = true)
    protected MT910 mt910;

    /**
     * Gets the value of the mt102 property.
     * 
     * @return
     *     possible object is
     *     {@link MT102 }
     *     
     */
    public MT102 getMT102() {
        return mt102;
    }

    /**
     * Sets the value of the mt102 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT102 }
     *     
     */
    public void setMT102(MT102 value) {
        this.mt102 = value;
    }

    /**
     * Gets the value of the mt900 property.
     * 
     * @return
     *     possible object is
     *     {@link MT900 }
     *     
     */
    public MT900 getMT900() {
        return mt900;
    }

    /**
     * Sets the value of the mt900 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT900 }
     *     
     */
    public void setMT900(MT900 value) {
        this.mt900 = value;
    }

    /**
     * Gets the value of the mt910 property.
     * 
     * @return
     *     possible object is
     *     {@link MT910 }
     *     
     */
    public MT910 getMT910() {
        return mt910;
    }

    /**
     * Sets the value of the mt910 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MT910 }
     *     
     */
    public void setMT910(MT910 value) {
        this.mt910 = value;
    }

}
