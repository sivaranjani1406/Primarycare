Feature: Register New Patient Feature

Scenario Outline: Register New Patient Feature with Test data
Given user navigates to Register New Patient screen
When user fills patient details from sheetname "<SheetName>" and rownumber <RowNumber>


Examples:
|SheetName|RowNumber|
|automationexcel|0|
