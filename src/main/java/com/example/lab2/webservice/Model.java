
package com.example.lab2.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for model complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="model"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="field" type="{http://jaxb.dev.java.net/array}stringArray" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="currentTurn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstPlayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="winnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainderTurns" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "model", propOrder = {
    "field",
    "currentTurn",
    "firstPlayerName",
    "winnerName",
    "remainderTurns"
})
public class Model {

    @XmlElement(nillable = true)
    protected List<StringArray> field;
    protected String currentTurn;
    protected String firstPlayerName;
    protected String winnerName;
    protected int remainderTurns;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringArray }
     * 
     * 
     */
    public List<StringArray> getField() {
        if (field == null) {
            field = new ArrayList<StringArray>();
        }
        return this.field;
    }

    /**
     * Gets the value of the currentTurn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTurn() {
        return currentTurn;
    }

    /**
     * Sets the value of the currentTurn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTurn(String value) {
        this.currentTurn = value;
    }

    /**
     * Gets the value of the firstPlayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstPlayerName() {
        return firstPlayerName;
    }

    /**
     * Sets the value of the firstPlayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstPlayerName(String value) {
        this.firstPlayerName = value;
    }

    /**
     * Gets the value of the winnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinnerName() {
        return winnerName;
    }

    /**
     * Sets the value of the winnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinnerName(String value) {
        this.winnerName = value;
    }

    /**
     * Gets the value of the remainderTurns property.
     * 
     */
    public int getRemainderTurns() {
        return remainderTurns;
    }

    /**
     * Sets the value of the remainderTurns property.
     * 
     */
    public void setRemainderTurns(int value) {
        this.remainderTurns = value;
    }

}
