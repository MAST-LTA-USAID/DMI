//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.06 at 02:44:21 PM IST 
//


package net.opengis.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for DimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="units" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unitSymbol" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="userValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="multipleValues" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="nearestValue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="current" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionType", propOrder = {
    "value"
})
public class DimensionType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "units", required = true)
    protected String units;
    @XmlAttribute(name = "unitSymbol", required = true)
    protected String unitSymbol;
    @XmlAttribute(name = "userValue", required = true)
    protected String userValue;
    @XmlAttribute(name = "default")
    protected String _default;
    @XmlAttribute(name = "multipleValues")
    protected Boolean multipleValues;
    @XmlAttribute(name = "nearestValue")
    protected Boolean nearestValue;
    @XmlAttribute(name = "current")
    protected Boolean current;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the unitSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitSymbol() {
        return unitSymbol;
    }

    /**
     * Sets the value of the unitSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitSymbol(String value) {
        this.unitSymbol = value;
    }

    /**
     * Gets the value of the userValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserValue() {
        return userValue;
    }

    /**
     * Sets the value of the userValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserValue(String value) {
        this.userValue = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the multipleValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleValues() {
        return multipleValues;
    }

    /**
     * Sets the value of the multipleValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleValues(Boolean value) {
        this.multipleValues = value;
    }

    /**
     * Gets the value of the nearestValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNearestValue() {
        return nearestValue;
    }

    /**
     * Sets the value of the nearestValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNearestValue(Boolean value) {
        this.nearestValue = value;
    }

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCurrent(Boolean value) {
        this.current = value;
    }

}
