/**
 * PickupScheduleOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.pickup.stub;

public class PickupScheduleOption  implements java.io.Serializable {
    private com.fedex.pickup.stub.CarrierCodeType carrier;

    private java.lang.String description;

    private com.fedex.pickup.stub.PickupRequestType scheduleDay;

    private java.lang.Boolean available;

    private java.util.Date pickupDate;

    private org.apache.axis.types.Time cutOffTime;

    private org.apache.axis.types.Duration accessTime;

    /* Indicates whether residential pickup is available for the requested
     * postal code. */
    private java.lang.Boolean residentialAvailable;

    /* Describes the country relationship (domestic and/or international)
     * among the shipments being picked up. */
    private com.fedex.pickup.stub.CountryRelationshipType countryRelationship;

    public PickupScheduleOption() {
    }

    public PickupScheduleOption(
           com.fedex.pickup.stub.CarrierCodeType carrier,
           java.lang.String description,
           com.fedex.pickup.stub.PickupRequestType scheduleDay,
           java.lang.Boolean available,
           java.util.Date pickupDate,
           org.apache.axis.types.Time cutOffTime,
           org.apache.axis.types.Duration accessTime,
           java.lang.Boolean residentialAvailable,
           com.fedex.pickup.stub.CountryRelationshipType countryRelationship) {
           this.carrier = carrier;
           this.description = description;
           this.scheduleDay = scheduleDay;
           this.available = available;
           this.pickupDate = pickupDate;
           this.cutOffTime = cutOffTime;
           this.accessTime = accessTime;
           this.residentialAvailable = residentialAvailable;
           this.countryRelationship = countryRelationship;
    }


    /**
     * Gets the carrier value for this PickupScheduleOption.
     * 
     * @return carrier
     */
    public com.fedex.pickup.stub.CarrierCodeType getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this PickupScheduleOption.
     * 
     * @param carrier
     */
    public void setCarrier(com.fedex.pickup.stub.CarrierCodeType carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the description value for this PickupScheduleOption.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PickupScheduleOption.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the scheduleDay value for this PickupScheduleOption.
     * 
     * @return scheduleDay
     */
    public com.fedex.pickup.stub.PickupRequestType getScheduleDay() {
        return scheduleDay;
    }


    /**
     * Sets the scheduleDay value for this PickupScheduleOption.
     * 
     * @param scheduleDay
     */
    public void setScheduleDay(com.fedex.pickup.stub.PickupRequestType scheduleDay) {
        this.scheduleDay = scheduleDay;
    }


    /**
     * Gets the available value for this PickupScheduleOption.
     * 
     * @return available
     */
    public java.lang.Boolean getAvailable() {
        return available;
    }


    /**
     * Sets the available value for this PickupScheduleOption.
     * 
     * @param available
     */
    public void setAvailable(java.lang.Boolean available) {
        this.available = available;
    }


    /**
     * Gets the pickupDate value for this PickupScheduleOption.
     * 
     * @return pickupDate
     */
    public java.util.Date getPickupDate() {
        return pickupDate;
    }


    /**
     * Sets the pickupDate value for this PickupScheduleOption.
     * 
     * @param pickupDate
     */
    public void setPickupDate(java.util.Date pickupDate) {
        this.pickupDate = pickupDate;
    }


    /**
     * Gets the cutOffTime value for this PickupScheduleOption.
     * 
     * @return cutOffTime
     */
    public org.apache.axis.types.Time getCutOffTime() {
        return cutOffTime;
    }


    /**
     * Sets the cutOffTime value for this PickupScheduleOption.
     * 
     * @param cutOffTime
     */
    public void setCutOffTime(org.apache.axis.types.Time cutOffTime) {
        this.cutOffTime = cutOffTime;
    }


    /**
     * Gets the accessTime value for this PickupScheduleOption.
     * 
     * @return accessTime
     */
    public org.apache.axis.types.Duration getAccessTime() {
        return accessTime;
    }


    /**
     * Sets the accessTime value for this PickupScheduleOption.
     * 
     * @param accessTime
     */
    public void setAccessTime(org.apache.axis.types.Duration accessTime) {
        this.accessTime = accessTime;
    }


    /**
     * Gets the residentialAvailable value for this PickupScheduleOption.
     * 
     * @return residentialAvailable   * Indicates whether residential pickup is available for the requested
     * postal code.
     */
    public java.lang.Boolean getResidentialAvailable() {
        return residentialAvailable;
    }


    /**
     * Sets the residentialAvailable value for this PickupScheduleOption.
     * 
     * @param residentialAvailable   * Indicates whether residential pickup is available for the requested
     * postal code.
     */
    public void setResidentialAvailable(java.lang.Boolean residentialAvailable) {
        this.residentialAvailable = residentialAvailable;
    }


    /**
     * Gets the countryRelationship value for this PickupScheduleOption.
     * 
     * @return countryRelationship   * Describes the country relationship (domestic and/or international)
     * among the shipments being picked up.
     */
    public com.fedex.pickup.stub.CountryRelationshipType getCountryRelationship() {
        return countryRelationship;
    }


    /**
     * Sets the countryRelationship value for this PickupScheduleOption.
     * 
     * @param countryRelationship   * Describes the country relationship (domestic and/or international)
     * among the shipments being picked up.
     */
    public void setCountryRelationship(com.fedex.pickup.stub.CountryRelationshipType countryRelationship) {
        this.countryRelationship = countryRelationship;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PickupScheduleOption)) return false;
        PickupScheduleOption other = (PickupScheduleOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.scheduleDay==null && other.getScheduleDay()==null) || 
             (this.scheduleDay!=null &&
              this.scheduleDay.equals(other.getScheduleDay()))) &&
            ((this.available==null && other.getAvailable()==null) || 
             (this.available!=null &&
              this.available.equals(other.getAvailable()))) &&
            ((this.pickupDate==null && other.getPickupDate()==null) || 
             (this.pickupDate!=null &&
              this.pickupDate.equals(other.getPickupDate()))) &&
            ((this.cutOffTime==null && other.getCutOffTime()==null) || 
             (this.cutOffTime!=null &&
              this.cutOffTime.equals(other.getCutOffTime()))) &&
            ((this.accessTime==null && other.getAccessTime()==null) || 
             (this.accessTime!=null &&
              this.accessTime.equals(other.getAccessTime()))) &&
            ((this.residentialAvailable==null && other.getResidentialAvailable()==null) || 
             (this.residentialAvailable!=null &&
              this.residentialAvailable.equals(other.getResidentialAvailable()))) &&
            ((this.countryRelationship==null && other.getCountryRelationship()==null) || 
             (this.countryRelationship!=null &&
              this.countryRelationship.equals(other.getCountryRelationship())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getScheduleDay() != null) {
            _hashCode += getScheduleDay().hashCode();
        }
        if (getAvailable() != null) {
            _hashCode += getAvailable().hashCode();
        }
        if (getPickupDate() != null) {
            _hashCode += getPickupDate().hashCode();
        }
        if (getCutOffTime() != null) {
            _hashCode += getCutOffTime().hashCode();
        }
        if (getAccessTime() != null) {
            _hashCode += getAccessTime().hashCode();
        }
        if (getResidentialAvailable() != null) {
            _hashCode += getResidentialAvailable().hashCode();
        }
        if (getCountryRelationship() != null) {
            _hashCode += getCountryRelationship().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PickupScheduleOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupScheduleOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ScheduleDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "Available"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "PickupDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cutOffTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CutOffTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "AccessTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residentialAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "ResidentialAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryRelationship");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CountryRelationship"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/pickup/v13", "CountryRelationshipType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
