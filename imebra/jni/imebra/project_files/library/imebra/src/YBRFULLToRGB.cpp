/*
$fileHeader$
*/

/*! \file YBRFULLToRGB.cpp
    \brief Implementation of the class YBRFULLToRGB.

*/

#include "../../base/include/exception.h"
#include "../include/YBRFULLToRGB.h"
#include "../include/dataHandler.h"
#include "../include/dataSet.h"
#include "../include/image.h"


namespace puntoexe
{

namespace imebra
{

namespace transforms
{

namespace colorTransforms
{

static registerColorTransform m_registerTransform(ptr<colorTransform>(new YBRFULLToRGB));

///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
//
//
// Return the initial color space
//
//
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
std::wstring YBRFULLToRGB::getInitialColorSpace()
{
	return L"YBR_FULL";
}


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
//
//
// Return the final color space
//
//
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
std::wstring YBRFULLToRGB::getFinalColorSpace()
{
	return L"RGB";
}


///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
//
//
// Create a new YBRFULLToRGB object
//
//
///////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////
ptr<colorTransform> YBRFULLToRGB::createColorTransform()
{
	return ptr<colorTransform>(new YBRFULLToRGB);
}



} // namespace colorTransforms

} // namespace transforms

} // namespace imebra

} // namespace puntoexe

