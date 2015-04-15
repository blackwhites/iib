//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 01:24:22 AM BRT 
//


package com.ibm.stats;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _RecordCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="_RecordCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MajorInterval"/>
 *     &lt;enumeration value="Snapshot"/>
 *     &lt;enumeration value="Shutdown"/>
 *     &lt;enumeration value="ReDeploy"/>
 *     &lt;enumeration value="StatsSettingsModified"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "_RecordCode")
@XmlEnum
public enum RecordCode {

    @XmlEnumValue("MajorInterval")
    MAJOR_INTERVAL("MajorInterval"),
    @XmlEnumValue("Snapshot")
    SNAPSHOT("Snapshot"),
    @XmlEnumValue("Shutdown")
    SHUTDOWN("Shutdown"),
    @XmlEnumValue("ReDeploy")
    RE_DEPLOY("ReDeploy"),
    @XmlEnumValue("StatsSettingsModified")
    STATS_SETTINGS_MODIFIED("StatsSettingsModified");
    private final String value;

    RecordCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RecordCode fromValue(String v) {
        for (RecordCode c: RecordCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
