
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import org.apache.poi.ss.usermodel.Workbook

import java.util.List

import org.apache.poi.ss.usermodel.Sheet

import java.lang.Object

import org.apache.poi.ss.usermodel.Cell

import org.apache.poi.ss.usermodel.Row

import java.util.Map

import com.kms.katalon.core.testobject.TestObject

import com.kms.katalon.core.model.FailureHandling

import org.openqa.selenium.WebElement

import kms.turing.katalon.plugins.helper.table.WebTableHelper.CellTextOptions

import kms.turing.katalon.plugins.helper.XPathHelper.CompareOptions

import org.openqa.selenium.By

import com.applitools.eyes.RectangleSize

import com.applitools.eyes.selenium.Eyes



def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelFile"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelFile(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheet"(
    	Workbook workbook	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheet(
        	workbook
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getSheetNames"(
    	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getSheetNames(
        	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createExcelSheets"(
    	Workbook workbook	
     , 	java.util.List<String> sheetNames	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createExcelSheets(
        	workbook
         , 	sheetNames)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.createWorkbook"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).createWorkbook(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.saveWorkbook"(
    	String filePath	
     , 	Workbook workbook	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).saveWorkbook(
        	filePath
         , 	workbook)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByIndex"(
    	Sheet sheet	
     , 	int rowIndex	
     , 	int colIndex	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByIndex(
        	sheet
         , 	rowIndex
         , 	colIndex
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	
     , 	Object value	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddress(
        	sheet
         , 	cellAddress
         , 	value)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	Workbook wbs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	wbs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheet"(
    	String filePath	
     , 	int sheetIndex	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheet(
        	filePath
         , 	sheetIndex)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getExcelSheetByName"(
    	String filePath	
     , 	String sheetName	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getExcelSheetByName(
        	filePath
         , 	sheetName)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.locateCell"(
    	Sheet sheet	
     , 	Object cellContent	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).locateCell(
        	sheet
         , 	cellContent)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValue"(
    	Cell cell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValue(
        	cell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByIndex"(
    	Sheet sheet	
     , 	int rowIdx	
     , 	int colIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByIndex(
        	sheet
         , 	rowIdx
         , 	colIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellIndexByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellIndexByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByAddress"(
    	Sheet sheet	
     , 	String cellAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByAddress(
        	sheet
         , 	cellAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getRowIndexByCellContent"(
    	Sheet sheet	
     , 	String cellContent	
     , 	int columnIdxForCell	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getRowIndexByCellContent(
        	sheet
         , 	cellContent
         , 	columnIdxForCell)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getTableContent"(
    	Sheet sheet	
     , 	int startRow	
     , 	int endRow	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getTableContent(
        	sheet
         , 	startRow
         , 	endRow)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getDataRows"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> rowIndexs	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getDataRows(
        	sheet
         , 	rowIndexs)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getMapOfKeyValueRows"(
    	Sheet sheet	
     , 	int keyRowIdx	
     , 	int valueRowIdx	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getMapOfKeyValueRows(
        	sheet
         , 	keyRowIdx
         , 	valueRowIdx)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getColumnsByIndex"(
    	Sheet sheet	
     , 	java.util.List<java.lang.Integer> columnIndexes	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getColumnsByIndex(
        	sheet
         , 	columnIndexes)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoExcels"(
    	Workbook workbook1	
     , 	Workbook workbook2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoExcels(
        	workbook1
         , 	workbook2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoSheets"(
    	Sheet sheet1	
     , 	Sheet sheet2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoSheets(
        	sheet1
         , 	sheet2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoRows"(
    	Row row1	
     , 	Row row2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoRows(
        	row1
         , 	row2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	
     , 	boolean isValueOnly	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2
         , 	isValueOnly)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.compareTwoCells"(
    	Cell cell1	
     , 	Cell cell2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).compareTwoCells(
        	cell1
         , 	cell2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValuesByRangeIndexes"(
    	Sheet sheet	
     , 	int rowInd1	
     , 	int colInd1	
     , 	int rowInd2	
     , 	int colInd2	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValuesByRangeIndexes(
        	sheet
         , 	rowInd1
         , 	colInd1
         , 	rowInd2
         , 	colInd2)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.getCellValueByRangeAddress"(
    	Sheet sheet	
     , 	String topLeftAddress	
     , 	String rightBottomAddress	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).getCellValueByRangeAddress(
        	sheet
         , 	topLeftAddress
         , 	rightBottomAddress)
}


def static "com.kms.katalon.keyword.excel.ExcelKeywords.setValueToCellByAddresses"(
    	Sheet sheet	
     , 	Map content	) {
    (new com.kms.katalon.keyword.excel.ExcelKeywords()).setValueToCellByAddresses(
        	sheet
         , 	content)
}


def static "com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate"(
    	TestObject to	
     , 	int day	
     , 	int month	
     , 	int year	
     , 	int slideTimeOut	
     , 	FailureHandling flowControl	) {
    (new com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword()).setDate(
        	to
         , 	day
         , 	month
         , 	year
         , 	slideTimeOut
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "com.kms.katalon.keyword.tinymce.TinyMCEKeywords.setText"(
    	TestObject iFrame	
     , 	String text	) {
    (new com.kms.katalon.keyword.tinymce.TinyMCEKeywords()).setText(
        	iFrame
         , 	text)
}


def static "com.kms.katalon.keyword.tinymce.TinyMCEKeywords.clearAll"(
    	TestObject iFrame	) {
    (new com.kms.katalon.keyword.tinymce.TinyMCEKeywords()).clearAll(
        	iFrame)
}


def static "com.kms.katalon.keyword.tinymce.TinyMCEKeywords.sendKeys"(
    	TestObject iFrame	
     , 	String text	) {
    (new com.kms.katalon.keyword.tinymce.TinyMCEKeywords()).sendKeys(
        	iFrame
         , 	text)
}


def static "com.kms.katalon.keyword.tinymce.TinyMCEKeywords.selectAll"(
    	TestObject iFrame	) {
    (new com.kms.katalon.keyword.tinymce.TinyMCEKeywords()).selectAll(
        	iFrame)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyRowDisplayed"(
    	WebElement table	
     , 	Map cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyRowDisplayed(
        	table
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyRowDisplayed"(
    	WebElement table	
     , 	Map cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyRowDisplayed(
        	table
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByHeader"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByHeader(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByHeader(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getRowIndexByCellsInfo"(
    	WebElement table	
     , 	Map cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getRowIndexByCellsInfo(
        	table
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getRowIndexByCellsInfo"(
    	WebElement table	
     , 	Map cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getRowIndexByCellsInfo(
        	table
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByIndexes"(
    	WebElement table	
     , 	int columnIndex	
     , 	int rowIndex	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByIndexes(
        	table
         , 	columnIndex
         , 	rowIndex)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByIndexes"(
    	WebElement table	
     , 	int columnIndex	
     , 	int rowIndex	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByIndexes(
        	table
         , 	columnIndex
         , 	rowIndex
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.clickOnColumn"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).clickOnColumn(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.clickOnColumn"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).clickOnColumn(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	
     , 	CompareOptions compareOption	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption
         , 	compareOption
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	
     , 	CompareOptions compareOption	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption
         , 	compareOption)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getCellsValueByColumnHeader"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getCellsValueByColumnHeader(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getCellsValueByColumnHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getCellsValueByColumnHeader(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByHeaderAndCellsInfo"(
    	WebElement table	
     , 	String columnHeader	
     , 	Map cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByHeaderAndCellsInfo(
        	table
         , 	columnHeader
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByHeaderAndCellsInfo"(
    	WebElement table	
     , 	String columnHeader	
     , 	Map cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByHeaderAndCellsInfo(
        	table
         , 	columnHeader
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByAttribute"(
    	WebElement table	
     , 	String attribute	
     , 	String value	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByAttribute(
        	table
         , 	attribute
         , 	value
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByAttribute"(
    	WebElement table	
     , 	String attribute	
     , 	String value	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByAttribute(
        	table
         , 	attribute
         , 	value)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByValueAndColHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	String cellValue	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByValueAndColHeader(
        	table
         , 	columnHeader
         , 	cellValue
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByValueAndColHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	String cellValue	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByValueAndColHeader(
        	table
         , 	columnHeader
         , 	cellValue)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders
         , 	timeout)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs)
}


def static "com.kms.katalon.keyword.pdf.PDF.getPageNumber"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getPageNumber(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.getAllText"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getAllText(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.getTextFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextFromPage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.getTextInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).getTextInPageRange(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareInPageRange"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareInPageRange(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareFromPage"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareFromPage(
        	file1
         , 	file2
         , 	startPage
         , 	excludePattern)
}


def static "com.kms.katalon.keyword.pdf.PDF.savePageAsImage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageAsImage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.savePageRangeAsImages"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).savePageRangeAsImages(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.saveAllPagesAsImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).saveAllPagesAsImages(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareByPixel"(
    	String file1	
     , 	String file2	
     , 	int startPage	
     , 	int endPage	
     , 	boolean highlightImageDifferences	
     , 	boolean showAllDifferences	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareByPixel(
        	file1
         , 	file2
         , 	startPage
         , 	endPage
         , 	highlightImageDifferences
         , 	showAllDifferences)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractImagesFromPage"(
    	String file	
     , 	int startPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesFromPage(
        	file
         , 	startPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractImagesInPageRange"(
    	String file	
     , 	int startPage	
     , 	int endPage	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractImagesInPageRange(
        	file
         , 	startPage
         , 	endPage)
}


def static "com.kms.katalon.keyword.pdf.PDF.extractAllImages"(
    	String file	) {
    (new com.kms.katalon.keyword.pdf.PDF()).extractAllImages(
        	file)
}


def static "com.kms.katalon.keyword.pdf.PDF.compareAllPages"(
    	String file1	
     , 	String file2	
     , 	Object excludePattern	) {
    (new com.kms.katalon.keyword.pdf.PDF()).compareAllPages(
        	file1
         , 	file2
         , 	excludePattern)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	description)
}


def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDrop"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDrop(
        	sourceObject
         , 	destinationObject)
}


def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropHtml5"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropHtml5(
        	sourceObject
         , 	destinationObject)
}


def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropJquery"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropJquery(
        	sourceObject
         , 	destinationObject)
}


def static "com.kms.katalon.keyword.draganddrop.DragAndDropKeywords.dragAndDropBy"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	
     , 	int xOffset	
     , 	int yOffset	) {
    (new com.kms.katalon.keyword.draganddrop.DragAndDropKeywords()).dragAndDropBy(
        	sourceObject
         , 	destinationObject
         , 	xOffset
         , 	yOffset)
}


def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.waitForAngularLoad"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).waitForAngularLoad()
}


def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.findWebElementBy"(
    	By by	) {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).findWebElementBy(
        	by)
}


def static "com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords.initNgDriver"() {
    (new com.katalon.plugin.keyword.waitforangular.WaitForAngularKeywords()).initNgDriver()
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByIndex"(
    	TestObject dropdownObject	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByIndex(
        	dropdownObject
         , 	range
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectAllOption"(
    	TestObject dropdownObject	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectAllOption(
        	dropdownObject)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean expectedStatus	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames
         , 	expectedStatus)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionItemsStatus"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionItemsStatus(
        	dropdownObject
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectOptionByName"(
    	TestObject dropdownObject	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectOptionByName(
        	dropdownObject
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByIndex"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	Object range	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByIndex(
        	dropdownObject
         , 	optionGroupName
         , 	range)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.selectSubOptionByName"(
    	TestObject dropdownObject	
     , 	String optionGroupName	
     , 	String listItemNames	
     , 	boolean isSelect	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).selectSubOptionByName(
        	dropdownObject
         , 	optionGroupName
         , 	listItemNames
         , 	isSelect)
}


def static "com.katalon.plugin.keyword.angularjs.DropdownKeywords.verifyOptionSelectedByName"(
    	TestObject dropdownObject	
     , 	String expectedName	) {
    (new com.katalon.plugin.keyword.angularjs.DropdownKeywords()).verifyOptionSelectedByName(
        	dropdownObject
         , 	expectedName)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description
         , 	flowControl)
}


def static "com.devstored.browserstackConnect.ANDROID"(
    	Object deviceName	
     , 	Object deviceVersion	
     , 	Object bsURL	
     , 	Object projectName	
     , 	Object title	
     , 	Object deviceOrientation	
     , 	Object networdProfile	) {
    (new com.devstored.browserstackConnect()).ANDROID(
        	deviceName
         , 	deviceVersion
         , 	bsURL
         , 	projectName
         , 	title
         , 	deviceOrientation
         , 	networdProfile)
}


def static "com.devstored.browserstackConnect.IOS"(
    	Object deviceName	
     , 	Object deviceVersion	
     , 	Object bsURL	
     , 	Object projectName	
     , 	Object title	
     , 	Object deviceOrientation	
     , 	Object networdProfile	) {
    (new com.devstored.browserstackConnect()).IOS(
        	deviceName
         , 	deviceVersion
         , 	bsURL
         , 	projectName
         , 	title
         , 	deviceOrientation
         , 	networdProfile)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description)
}
