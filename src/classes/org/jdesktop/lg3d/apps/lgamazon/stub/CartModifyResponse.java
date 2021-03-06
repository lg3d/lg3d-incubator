/**
 * CartModifyResponse.java
 *
 */

package org.jdesktop.lg3d.apps.lgamazon.stub;

public class CartModifyResponse  implements java.io.Serializable {
    private org.jdesktop.lg3d.apps.lgamazon.stub.OperationRequest operationRequest;
    private org.jdesktop.lg3d.apps.lgamazon.stub.Cart[] cart;

    public CartModifyResponse() {
    }

    public CartModifyResponse(
           org.jdesktop.lg3d.apps.lgamazon.stub.OperationRequest operationRequest,
           org.jdesktop.lg3d.apps.lgamazon.stub.Cart[] cart) {
           this.operationRequest = operationRequest;
           this.cart = cart;
    }


    /**
     * Gets the operationRequest value for this CartModifyResponse.
     * 
     * @return operationRequest
     */
    public org.jdesktop.lg3d.apps.lgamazon.stub.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this CartModifyResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(org.jdesktop.lg3d.apps.lgamazon.stub.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the cart value for this CartModifyResponse.
     * 
     * @return cart
     */
    public org.jdesktop.lg3d.apps.lgamazon.stub.Cart[] getCart() {
        return cart;
    }


    /**
     * Sets the cart value for this CartModifyResponse.
     * 
     * @param cart
     */
    public void setCart(org.jdesktop.lg3d.apps.lgamazon.stub.Cart[] cart) {
        this.cart = cart;
    }

    public org.jdesktop.lg3d.apps.lgamazon.stub.Cart getCart(int i) {
        return this.cart[i];
    }

    public void setCart(int i, org.jdesktop.lg3d.apps.lgamazon.stub.Cart _value) {
        this.cart[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CartModifyResponse)) return false;
        CartModifyResponse other = (CartModifyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationRequest==null && other.getOperationRequest()==null) || 
             (this.operationRequest!=null &&
              this.operationRequest.equals(other.getOperationRequest()))) &&
            ((this.cart==null && other.getCart()==null) || 
             (this.cart!=null &&
              java.util.Arrays.equals(this.cart, other.getCart())));
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
        if (getOperationRequest() != null) {
            _hashCode += getOperationRequest().hashCode();
        }
        if (getCart() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCart());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCart(), i);
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
        new org.apache.axis.description.TypeDesc(CartModifyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", ">CartModifyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "OperationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "Cart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2006-03-08", "Cart"));
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
