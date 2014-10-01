/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra.dicom;

public class DataSet {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected DataSet(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_DataSet(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DataSet() {
    this(imebraJNI.new_DataSet__SWIG_0(), true);
  }

  public DataSet(DataSet right) {
    this(imebraJNI.new_DataSet__SWIG_1(DataSet.getCPtr(right), right), true);
  }

  public DataSet assign(DataSet right) {
    return new DataSet(imebraJNI.DataSet_assign(swigCPtr, this, DataSet.getCPtr(right), right), false);
  }

  public Image getImage(int frameNumber) {
    return new Image(imebraJNI.DataSet_getImage(swigCPtr, this, frameNumber), true);
  }

  public DataSet getSequenceItem(int groupId, int order, int tagId, int itemId) {
    return new DataSet(imebraJNI.DataSet_getSequenceItem(swigCPtr, this, groupId, order, tagId, itemId), true);
  }

  public int getSignedLong(int groupId, int order, int tagId, int elementNumber) {
    return imebraJNI.DataSet_getSignedLong(swigCPtr, this, groupId, order, tagId, elementNumber);
  }

  public void setSignedLong(int groupId, int order, int tagId, int elementNumber, int newValue, String defaultType) {
    imebraJNI.DataSet_setSignedLong__SWIG_0(swigCPtr, this, groupId, order, tagId, elementNumber, newValue, defaultType);
  }

  public void setSignedLong(int groupId, int order, int tagId, int elementNumber, int newValue) {
    imebraJNI.DataSet_setSignedLong__SWIG_1(swigCPtr, this, groupId, order, tagId, elementNumber, newValue);
  }

  public int getUnsignedLong(int groupId, int order, int tagId, int elementNumber) {
    return imebraJNI.DataSet_getUnsignedLong(swigCPtr, this, groupId, order, tagId, elementNumber);
  }

  public void setUnsignedLong(int groupId, int order, int tagId, int elementNumber, int newValue, String defaultType) {
    imebraJNI.DataSet_setUnsignedLong__SWIG_0(swigCPtr, this, groupId, order, tagId, elementNumber, newValue, defaultType);
  }

  public void setUnsignedLong(int groupId, int order, int tagId, int elementNumber, int newValue) {
    imebraJNI.DataSet_setUnsignedLong__SWIG_1(swigCPtr, this, groupId, order, tagId, elementNumber, newValue);
  }

  public double getDouble(int groupId, int order, int tagId, int elementNumber) {
    return imebraJNI.DataSet_getDouble(swigCPtr, this, groupId, order, tagId, elementNumber);
  }

  public void setDouble(int groupId, int order, int tagId, int elementNumber, double newValue, String defaultType) {
    imebraJNI.DataSet_setDouble__SWIG_0(swigCPtr, this, groupId, order, tagId, elementNumber, newValue, defaultType);
  }

  public void setDouble(int groupId, int order, int tagId, int elementNumber, double newValue) {
    imebraJNI.DataSet_setDouble__SWIG_1(swigCPtr, this, groupId, order, tagId, elementNumber, newValue);
  }

  public String getString(int groupId, int order, int tagId, int elementNumber) {
    return imebraJNI.DataSet_getString(swigCPtr, this, groupId, order, tagId, elementNumber);
  }

  public void setString(int groupId, int order, int tagId, int elementNumber, String newString, String defaultType) {
    imebraJNI.DataSet_setString__SWIG_0(swigCPtr, this, groupId, order, tagId, elementNumber, newString, defaultType);
  }

  public void setString(int groupId, int order, int tagId, int elementNumber, String newString) {
    imebraJNI.DataSet_setString__SWIG_1(swigCPtr, this, groupId, order, tagId, elementNumber, newString);
  }

  public String getDefaultDataType(int groupId, int order, int tagId) {
    return imebraJNI.DataSet_getDefaultDataType(swigCPtr, this, groupId, order, tagId);
  }

  public String getDataType(int groupId, int order, int tagId) {
    return imebraJNI.DataSet_getDataType(swigCPtr, this, groupId, order, tagId);
  }

}
