
package com.example.lab2.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lastX" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastY" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastPlayerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "serverMessage", propOrder = {
    "lastX",
    "lastY",
    "lastPlayerName",
    "currentTurn",
    "firstPlayerName",
    "winnerName",
    "remainderTurns"
})
public class ServerMessage {

    protected int lastX;
    protected int lastY;
    protected String lastPlayerName;
    protected String currentTurn;
    protected String firstPlayerName;
    protected String winnerName;
    protected int remainderTurns;

    /**
     * Gets the value of the lastX property.
     * 
     */
    public int getLastX() {
        return lastX;
    }

    /**
     * Sets the value of the lastX property.
     * 
     */
    public void setLastX(int value) {
        this.lastX = value;
    }

    /**
     * Gets the value of the lastY property.
     * 
     */
    public int getLastY() {
        return lastY;
    }

    /**
     * Sets the value of the lastY property.
     * 
     */
    public void setLastY(int value) {
        this.lastY = value;
    }

    /**
     * Gets the value of the lastPlayerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPlayerName() {
        return lastPlayerName;
    }

    /**
     * Sets the value of the lastPlayerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPlayerName(String value) {
        this.lastPlayerName = value;
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
