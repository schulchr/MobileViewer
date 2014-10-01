/*
$fileHeader$
*/

/*! \file charsetConversion.cpp
    \brief Implementation of the charsetConversion class.

*/

#include "../include/exception.h"
#include "../include/charsetConversion.h"
#include <memory>

namespace puntoexe
{

const charsetInformation m_charsetTable[]={
    {"LOCALE", "", 0, false},
    {"ISO-IR 6", "ASCII", 20127, false},
    {"ISO-8859-1", "ISO-8859-1", 28591, false},
    {"ISO-8859-2", "ISO-8859-2", 28592, false},
    {"ISO-8859-3", "ISO-8859-3", 28593, false},
    {"ISO-8859-4", "ISO-8859-4", 28594, false},
    {"ISO-8859-5", "ISO-8859-5", 28595, false},
    {"ISO-8859-6", "ISO-8859-6", 28596, false},
    {"ISO-8859-7", "ISO-8859-7", 28597, false},
    {"ISO-8859-8", "ISO-8859-8", 28598, false},
    {"ISO-8859-9", "ISO-8859-9", 28599, false},
    {"ISO-IR 13",  "JIS-X0201",  50222, true},
    {"ISO-IR 166", "ISO-8859-11",874, false},
    {"ISO-IR 87",  "JIS-X0208" ,20932, false},
    {"ISO-IR 159", "JIS-X0212",20932, false},
    {"ISO-IR 149", "KSC-5601", 50225, false},
    {"ISO-IR 192", "UTF-8", 65001, true},
    {"GB18030",    "GB18030", 54936, true},
    {0,0,0, false}
};

///////////////////////////////////////////////////////////
//
// Destructor
//
///////////////////////////////////////////////////////////
charsetConversion::~charsetConversion()
{
	close();
}


///////////////////////////////////////////////////////////
//
// Find the ID of the charset with the specified name
//
///////////////////////////////////////////////////////////
int charsetConversion::findTable(const std::string& tableName) const
{
	PUNTOEXE_FUNCTION_START(L"charsetConversion::findTable");

	for(int scanTables = 0; m_charsetTable[scanTables].m_iconvName != 0; ++scanTables)
	{
		if(tableName == m_charsetTable[scanTables].m_iconvName ||
			tableName == m_charsetTable[scanTables].m_isoRegistration)
		{
			return scanTables;
		}
	}
	return -1;

	PUNTOEXE_FUNCTION_END();
}


///////////////////////////////////////////////////////////
//
// Initialize the charsetConversion object
//
///////////////////////////////////////////////////////////
void charsetConversion::initialize(const std::string& tableName)
{
	PUNTOEXE_FUNCTION_START(L"charsetConversion::initialize");

	// Find the table ID
	///////////////////////////////////////////////////////////
	int requestedTable = findTable(tableName);
	if(requestedTable == -1)
	{
		close();
		PUNTOEXE_THROW(charsetConversionExceptionNoTable, "The requested ISO table doesn't exist");
	}

	// The specified table is already active. Simply return
	///////////////////////////////////////////////////////////
	if(m_charsetTable[requestedTable].m_isoRegistration == m_isoCharset)
	{
		return;
	}

	// Close the active table
	///////////////////////////////////////////////////////////
	close();

	// Save the name of the active table
	///////////////////////////////////////////////////////////
	m_isoCharset = m_charsetTable[requestedTable].m_isoRegistration;

    initialize(requestedTable);

	PUNTOEXE_FUNCTION_END();
}


///////////////////////////////////////////////////////////
//
// Uninitialize the charsetConversion object
//
///////////////////////////////////////////////////////////
void charsetConversion::close()
{
	PUNTOEXE_FUNCTION_START(L"charsetConversion::close");

	m_isoCharset.clear();

	PUNTOEXE_FUNCTION_END();
}


///////////////////////////////////////////////////////////
//
// Return the ISO name of the active charset
//
///////////////////////////////////////////////////////////
std::string charsetConversion::getIsoCharset() const
{
	return m_isoCharset;
}

} // namespace puntoexe

