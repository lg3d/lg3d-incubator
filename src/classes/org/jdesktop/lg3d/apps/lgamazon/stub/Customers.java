/**
 * Customers.java
 *
 */

package org.jdesktop.lg3d.apps.lgamazon.stub;

public class Customers  implements java.io.Serializable {
    private org.jdesktop.lg3d.apps.lgamazon.stub.Request request;
    private org.apache.axis.types.NonNegativeInteger totalResults;
    private org.apache.axis.types.NonNegativeInteger totalPages;
    private org.jdesktop.lg3d.apps.lgamazon.stub.Customer[] customer;

    public Customers() {
    }

    public Customers(
           org.jdesktop.lg3d.apps.lgamazon.stub.Request request,
           org.apache.axis.types.NonNegativeInteger totalResults,
           org.apache.axis.types.NonNegativeInteger totalPages,
           org.jdesktop.lg3d.apps.lgamazon.stub.Customer[] customer) {
           this.request = request;
           this.totalResults = totalResults;
           this.totalPages = totalPages;
           this.customer = customer;
    }


    /**
     * Gets the request value for this Customers.
     * 
     * @return request
     */
    public org.jdesktop.lg3d.apps.lgamazon.stub.Request getRequest() {
        return request;
    }


    /**
     * Sets the request value for this Customers.
     * 
     * @param request
     */
    public void setRequest(org.jdesktop.lg3d.apps.lgamazon.stub.Request request) {
        this.request = request;
    }


    /**
     * Gets the totalResults value for this Customers.
     * 
     * @return totalResults
     */
    public org.apache.axis.types.NonNegativeInteger getTotalResults() {
        return totalResults;
    }


    /**
     * Sets the totalResults value for this Customers.
     * 
     * @param totalResults
     */
    public void setTotalResults(org.apache.axis.types.NonNegativeInteger totalResults) {
        this.totalResults = totalResults;
    }


    /**
     * Gets the totalPages value for this Customers.
     * 
     * @return totalPages
     */
    public org.apache.axis.types.NonNegativeInteger getTotalPages() {
        return totalPages;
    }


    /**
     * Sets the totalPages value for this Customers.
     * 
     * @param totalPages
     */
    public void setTotalPages(org.apache.axis.types.NonNegativeInteger totalPages) {
        this.totalPages = totalPages;
    }


    /**
     * Gets the customer value for this Customers.
     * 
     * @return customer
     */
    public org.jdesktop.lg3d.apps.lgamazon.stub.Customer[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this Customers.
     * 
     * @param customer
     */
    public void setCustomer(org.jdesktop.lg3d.apps.lgamazon.stub.Customer[] customer) {
        this.customer = customer;
    }

    public org.jdesktop.lg3d.apps.lgamazon.stub.Customer getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, org.jdesktop.lg3d.apps.lgamazon.stub.Customer _value) {
        this.customer[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customers)) return false;
        Customers other = (Customers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.totalResults==null && other.getTotalResults()==null) || 
             (this.totalResults!=null &&
              this.totalResults.equals(other.getTotalResults()))) &&
            ((this.totalPages==null && other.getTotalPages()==null) || 
             (this.totalPages!=null &&
              this.totalPages.equals(other.getTotalPages()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer())));
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
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getTotalResults() != null) {
            _hashCode += getTotalResults().hashCode();
        }
        if (getTotalPages() != null) {
            _hashCode += getTotalPages().hashCode();
        }
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", ">Customers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "Request"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "TotalResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "TotalPages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
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
