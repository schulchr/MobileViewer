/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.imebra.dicom;

public class ModalityVOILUT extends Transform {
  private long swigCPtr;

  protected ModalityVOILUT(long cPtr, boolean cMemoryOwn) {
    super(imebraJNI.ModalityVOILUT_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModalityVOILUT obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        imebraJNI.delete_ModalityVOILUT(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ModalityVOILUT(DataSet dataset) {
    this(imebraJNI.new_ModalityVOILUT(DataSet.getCPtr(dataset), dataset), true);
  }

}
