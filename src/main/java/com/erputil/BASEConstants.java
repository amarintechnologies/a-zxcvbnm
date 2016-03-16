
package com.erputil;

public class BASEConstants {
	// List of Base module tables. Primarily used for populating the audit table
	public static final String M_GENERIC_TABLE = "GENERIC";
	public static final String M_BASE_TIMEZONE = "M_BAM_GENERIC_TABLESE_TIMEZONE";
	public static final String M_BASE_COUNTRY = "M_BASE_COUNTRY";
	public static final String M_BASE_CURRENCY = "M_BASE_CURRENCY";
	public static final String M_BASE_COMPANY = "M_BASE_COMPANY";
	public static final String M_BASE_MODULE = "M_BASE_MODULE";
	public static final String M_BASE_STATE = "M_BASE_STATE";
	public static final String M_BASE_MODULE_CTRL = "M_BASE_MODULE_CTRL";
	public static final String M_BASE_LOOKUP = "M_BASE_LOOKUP";
	public static final String M_BASE_COMPANY_LOOKUP = "M_BASE_COMPANY_LOOKUP";
	public static final String M_BASE_REGION = "M_BASE_REGION";
	public static final String M_BASE_CITY = "M_BASE_CITY";
	public static final String M_BASE_BRANCH = "M_BASE_BRANCH";
	public static final String M_BASE_DEPARTMENT = "M_BASE_DEPARTMENT";
	public static final String M_BASE_USER = "M_BASE_USER";
	public static final String M_BASE_EMPLOYEE = "M_BASE_EMPLOYEE";
	public static final String T_BASE_USER_LOGIN = "T_BASE_USER_LOGIN";
	public static final String M_BASE_ROLE = "M_BASE_ROLE";
	public static final String M_BASE_USER_ROLES = "M_BASE_USER_ROLES";
	public static final String M_BASE_APP_SCREENS = "M_BASE_APP_SCREENS";
	public static final String M_BASE_SCREENS_FIELDS = "M_BASE_APP_SCRN_FIELDS";
	public static final String M_BASE_SCRN_ACCESS_CONFIG = "M_BASE_SCRN_ACCESS_CONFIG";
	public static final String M_BASE_FIELD_ACCESS_CONFIG = "M_BASE_FIELD_ACCESS_CONFIG";
	public static final String M_BASE_USER_FAVS = "M_BASE_USER_FAVS";
	public static final String T_BASE_LOGGER = "T_BASE_LOGGER";
	public static final String T_BASE_MESSAGES = "T_BASE_MESSAGES";
	public static final String T_BASE_AUDIT_CONFIG = "T_BASE_AUDIT_CONFIG";
	public static final String T_BASE_AUDIT_RECORDS = "T_BASE_AUDIT_RECORDS";
	public static final String R_BASE_DASHBOARD = "R_BASE_DASHBOARD";
	public static final String M_BASE_PARAMETER = "M_BASE_PARAMETER";
	public static final String T_BASE_ORG_NEWS = "T_BASE_ORG_NEWS";
	public static final String T_BASE_HOLIDAY = "T_BASE_HOLIDAY";
	public static final String M_BASE_SLNO_GEN = "M_BASE_SLNO_GEN";
	public static final String M_BASE_APPROVAL_SCHEMA = "M_BASE_APPROVAL_SCHEMA";
	public static final String M_BASE_PRODUCT_CATEGORY = "M_BASE_PRODUCT_CATEGORY";
	public static final String M_BASE_PRODUCT = "M_BASE_PRODUCT";
	public static final String M_BASE_PRODUCT_SPEC = "M_BASE_PRODUCT_SPEC";
	public static final String M_BASE_VENDOR_TYPE = "M_BASE_VENDOR_TYPE";
	public static final String M_BASE_VENDOR = "M_BASE_VENDOR";
	public static final String M_CRM_CLIENT_CAT = "M_CRM_CLIENT_CAT";
	public static final String M_CRM_CLIENT_SUBCAT = "M_CRM_CLIENT_SUBCAT";
	public static final String M_CRM_CLIENTS = "M_CRM_CLIENTS";
	public static final String T_CRM_APPOINTMENT = "T_CRM_APPOINTMENT";
	public static final String M_CRM_LEADS = "M_CRM_LEADS";
	public static final String T_CRM_CAMPAIGN = "T_CRM_CAMPAIGN";
	public static final String CLIENT_RATING = "CLIENT_RATING";
	public static final String T_CRM_CLIENT_CASES = "T_CRM_CLIENT_CASES";
	public static final String T_CRM_OPPERTUNITIES = "T_CRM_OPPERTUNITIES";
	public static final String CASE_SEV = "CASE_SEV";
	public static final String CASE_CATE = "CASE_CATE";
	public static final String M_AMS_ASSET_BRAND = "M_AMS_ASSET_BRAND";
	public static final String T_AMS_ASSET_DETAILS = "T_AMS_ASSET_DETAILS";
	public static final String M_AMS_ASSET_CATEGORY = "M_AMS_ASSET_CATEGORY";
	public static final String T_AMS_ASST_MAINT_DTLS = "T_AMS_ASST_MAINT_DTLS";
	public static final String T_AMS_ASSET_SCHEDULE = "T_AMS_ASSET_SCHEDULE";
	public static final String M_HCM_EMPLOYEE_SKILL = "M_HCM_EMPLOYEE_SKILL";
	public static final String T_HCM_PAYROLL_DTL = "T_HCM_PAYROLL_DTL";
	public static final String T_SMS_ENQUIRY_HDR = "T_SMS_ENQUIRY_HDR";
	public static final String T_MFG_QA_SIGNOFF_DTL = "T_MFG_QA_SIGNOFF_DTL";
	public static final String T_MFG_QA_SIGNOFF_HDR = "T_MFG_QA_SIGNOFF_HDR";
	public static final String T_CRM_CLIENT_CASES_STATUS = "STATUS";
	

	// Material Management
	public static final String T_MMS_MATERIAL_STOCK = "T_MMS_MATERIAL_STOCK";
	public static final String T_MMS_MATERIAL_PARKED_STOCK = "T_MMS_MATERIAL_PARKED_STOCK";
	// Status columns in BASE modules
	public static final String M_GENERIC_COLUMN = "GENERIC";
	public static final String USER_STATUS = "USER_STATUS";
	// Static List columns
	public static final String LOG_TYPE = "LOG_TYPE";
	public static final String APPROVE_LVL = "APPROVE_LVL";
	public static final String MSG_TYPE = "MSG_TYPE";
	public static final String DASH_STATUS = "DASH_STATUS";
	public static final String HOLDY_SESSION = "HOLDY_SESSION";
	public static final String MSG_STATUS = "MSG_STATUS";
	public static final String MESSAGES_MSG_TYPE = "MESSAGES_MSG_TYPE";
	public static final String SLNOGEN_LEVEL = "SLNOGEN_LEVEL";
	public static final String RECORD_LVL = "RECORD_LVL";
	public static final String BASIC_GROSS = "BASIC_GROSS";
	public static final String FLAT_PERCENT = "FLAT_PERCENT";
	public static final String GRD_ALLOWANCE = "GRD_ALLOWANCE";
	public static final String WO_HDR = "WO_HDR";
	public static final String WO_AP_STATUS = "WO_AP_STATUS";
	public static final String WO_RV_STATUS = "WO_RV_STATUS";
	public static final String MEETING_STATUS = "MEETING_STATUS";
	public static final String CAMPAIGNS = "CAMPAIGNS";
	public static final String ASSETSTATUS = "ASSETSTATUS";
	public static final String ASSET_TYPE = "ASSET_TYPE";
	public static final String MAINT_TYPE = "MAINT_TYPE";
	public static final String SERVICE_TYP = "SERVICE_TYP";
	public static final String SGN_APVER = "SGN_APVER";
	public static final String SGN_RVER = "SGN_RVER";
	public static final String CLIENTS = "CLIENTS";

	public static final String REVIEWER_LVL = "REVIEWER_LVL";
	public static final String JV_APRVDSTS = "JV_APRVDSTS";
	public static final String JV_JOBSTS = "JV_JOBSTS";

	public static final String MAINT_STS = "MAINT_STS";
	public static final String SKILL_STATUS = "SKILL_STATUS";

	public static final String BOM_STATUS = "BOM_STATUS";
	public static final String PAYROLL_STATUS = "PAYROLL_STATUS";

	// FMS
	public static final String M_FMS_ACCOUNT_TYPE = "M_FMS_ACCOUNT_TYPE";
	public static final String M_FMS_TRANS_TYPE = "M_FMS_TRANS_TYPE";
	public static final String T_FMS_ACCOUNTS = "T_FMS_ACCOUNTS";
	// Credit/Debit Column in FMS Base
	public static final String M_FMS_CR_DE = "CR_DR";
	// Account Group
	public static final String T_FMS_ACCOUNT_GROUP = "ACCOUNT_GROUP";
	// Account auth. Manager
	public static final String T_FMS_APPROVEAUTH_RM_AM = "APPROVEAUTH_RM_AM";
	// PNC center
	public static final String M_FMS_PNC_CENTERS = "M_FMS_PNC_CENTERS";
	// Bank
	public static final String M_FMS_BANK = "M_FMS_BANK";
	// Bank Branch
	public static final String M_FMS_BANK_BRANCH = "M_FMS_BANK_BRANCH";
	public static final String M_BASE_LEAVE_TYPE = "M_BASE_LEAVE_TYPE";
	// Finance plan

	public static final String T_FMS_FINANCE_PLAN = "T_FMS_FINANCE_PLAN";
	public static final String FMS_STATUS = "FMS_STATUS";

	// Finance Transaction
	public static final String T_FMS_ACCOUNT_TXNS = "T_FMS_ACCOUNT_TXNS";
	public static final String TXN_STATUS = "TXN_STATUS";
	// Finance Accounts Payable
	public static final String T_FMS_ACCOUNT_PAYABLES = "T_FMS_ACCOUNT_PAYABLES";
	public static final String PAY_STATUS = "PAY_STATUS";
	public static final String PAY_ACTION = "PAY_ACTION";
	// Finance Accounts Receivable
	public static final String T_FMS_ACCOUNT_RECEIVABLES = "T_FMS_ACCOUNT_RECEIVABLES";
	// Finance Fund Request
	public static final String T_FMS_FUND_REQUEST = "T_FMS_FUND_REQUEST";
	public static final String FUND_STATUS = "FUND_STATUS";
	// HCM
	public static final String M_HCM_QUALIFICATION = "M_HCM_QUALIFICATION";
	public static final String M_HCM_LEAVE_TYPE = "M_HCM_LEAVE_TYPE";
	public static final String M_HCM_SHIFT = "M_HCM_LEAVE_TYPE";
	public static final String M_HCM_EMPLOYEE_TYPE = "M_HCM_EMPLOYEE_TYPE";
	public static final String M_HCM_JOBCLASSIFICATION = "M_HCM_JOBCLASSIFICATION";
	public static final String M_HCM_GRADE = "M_HCM_GRADE";
	public static final String M_HCM_DESIGNATION = "M_HCM_DESIGNATION";
	public static final String M_HCM_PAYPERIOD = "M_HCM_PAYPERIOD";
	public static final String M_HCM_EARNINGS = "M_HCM_EARNINGS";
	public static final String M_HCM_GRADE_EARNING = "M_HCM_GRADE_EARNING";
	public static final String M_HCM_DEDUCTION = "M_HCM_DEDUCTION";
	public static final String M_HCM_ALLOWANCE = "M_HCM_ALLOWANCE";
	public static final String M_HCM_GRADE_ALLOWANCE = "M_HCM_GRADE_ALLOWANCE";
	public static final String M_HCM_TAX = "M_HCM_TAX";
	public static final String M_HCM_TAX_SLAB = "M_HCM_TAX_SLAB";
	public static final String T_HCM_IT_OTHER_INCOME = "T_HCM_IT_OTHER_INCOME";
	public static final String T_HCM_IT_HRA_DECL = "T_HCM_IT_HRA_DECL";
	public static final String T_HCM_TAX_LIMIT = "T_HCM_TAX_LIMIT";
	public static final String T_HCM_JOB_VACCANCY = "T_HCM_JOB_VACCANCY";
	public static final String T_HCM_KPI_GROUP = "T_HCM_KPI_GROUP";
	public static final String T_HCM_KPI = "T_HCM_KPI";
	public static final String T_HCM_EMPLOYEE_EARNING = "T_HCM_EMPLOYEE_EARNING";

	public static final String T_HCM_EMPLOYEE_LEAVE = "T_HCM_EMPLOYEE_LEAVE";
	public static final String LEAVE_STATUS = "LEAVE_STATUS";

	// public static final String T_HCM_EMP_EARNING = "T_HCM_EMP_EARNING";
	public static final String M_HCM_EMP_ALLOWANCE = "M_HCM_EMP_ALLOWANCE";
	public static final String M_HCM_JOB_VACCANCY = "T_HCM_JOB_VACCANCY";
	public static final String T_HCM_JOB_CANDIDATE = "T_HCM_JOB_CANDIDATES";
	public static final String M_HCM_TAX_SECTION = "M_HCM_TAX_SECTION";
	public static final String T_HCM_JOB_INTERVIEW = "T_HCM_JOB_CANDIDATES_INTERVIEW";
	public static final String T_HCM_EMP_PROXIMITY = "T_HCM_EMPLOYEE_PROXIMITY";
	public static final String T_HCM_EMP_EARNING = "T_HCM_EMPLOYEE_EARNING";
	public static final String T_HCM_EMPLOYEE_DEDUCTION = "T_HCM_EMPLOYEE_DEDUCTION";
	public static final String T_HCM_EMPLOYEE_ADVANCE = "T_HCM_EMPLOYEE_ADVANCE";
	public static final String T_HCM_Emp_Appraisal = "T_HCM_Emp_Appraisal";

	public static final String M_HCM_EMPLOYMNT_STS = "M_HCM_EMPLOYMENT_STATUS";
	public static final String T_HCM_IT_INVESTMNT_DEC = "T_HCM_IT_INVESTMNT_DECL";
	public static final String T_HCM_EMP_CLAIM_DTLS = "T_HCM_EMP_CLAIM_DTLS";
	public static final String T_HCM_EMPLOYEE_ALLOWANCE_CLAIM = "T_HCM_EMPLOYEE_ALLOWANCE_CLAIM";
	public static final String T_HCM_APPRAISAL_EMP_INCIDENT = "T_HCM_APPRAISAL_EMP_INCIDENT";
	public static final String APP_EMPINCIDENT = "APP_EMPINCIDENT";
	public static final String T_HCM_LEAVE_STATUS = "T_HCM_LEAVE_STATUS";
	public static final String AP_LEAVE_STATUS = "AP_LEAVE_STATUS";
	public static final String RV_LEAVE_STATUS = "RV_LEAVE_STATUS";

	// MFG
	public static final String M_MFG_QA_TEST_GROUP = "M_MFG_QA_TEST_GROUP";
	public static final String M_MFG_QA_TEST_TYPE = "M_MFG_QA_TEST_TYPE";
	public static final String T_MFG_WORKORDER_HDR = "T_MFG_WORKORDER_HDR";
	public static final String T_MFG_WORKORDER_DTL = "T_MFG_WORKORDER_DTL";
	public static final String M_MFG_PRODUCT_DWG = "M_MFG_PRODUCT_DWG";
	public static final String T_MFG_WO_PLAN_HDR = "T_MFG_WO_PLAN_HDR";
	public static final String M_MFG_QC_TEST_TYPE = "M_MFG_QC_TEST_TYPE";

	// STT MFG
	public static final String M_MFG_STT_ASMBLYPLAN = "M_MFG_STT_ASMBLYPLAN";
	public static final String T_STT_MFG_PULVIZ_DTL = "T_STT_MFG_PULVIZ_DTL";
	public static final String PULVIZ_STATUS = "PULVIZ_STATUS";
	public static final String T_STT_MFG_EXTRUD_HDR = "T_STT_MFG_EXTRUD_HDR";
	public static final String T_STT_MFG_EXTRUD_DTL = "T_STT_MFG_EXTRUD_DTL";

	// MMS
	public static final String M_MMS_PRODUCT_BOM_HDR = "M_MMS_PRODUCT_BOM_HDR";
	public static final String T_MMS_GATEPASS_HDR = "T_MMS_GATEPASS_HDR";
	public static final String STOCKTYPE = "STOCKTYPE";
	public static final String GATE_STATUS = "GATE_STATUS";
	public static final String T_MMS_ENQUIRY_HDR = "T_MMS_ENQUIRY_HDR";
	public static final String M_ENQ_STATUS = "M_ENQ_STATUS";
	public static final String ENQUIRYSTATUS = "ENQUIRYSTATUS";
	public static final String T_MMS_PO_RECEIPTS_DTL = "T_MMS_PO_RECEIPTS_DTL";
	public static final String PORECDTL_STATUS = "PORECDTL_STATUS";
	public static final String T_MMS_PO_RECEIPTS_HDR = "T_MMS_PO_RECEIPTS_HDR";
	public static final String PORECT_STATUS = "PORECT_STATUS";
	public static final String T_MMS_VENDOR_BILL_HDR = "T_MMS_VENDOR_BILL_HDR";
	public static final String MMSVBR_STATUS = "MMSVBR_STATUS";
	public static final String MMSVB_STATUS = "MMSVB_STATUS";
	public static final String T_MMS_QUOTE_HDR = "T_MMS_QUOTE_HDR";
	public static final String MMS_QUOTE_STATUS = "MMS_QUOTE_STATUS";
	public static final String T_MMS_INDENT_ISSUE_HDR = "T_MMS_INDENT_ISSUE_HDR";
	public static final String MMS_QUOTE_STATUS_RV = "MMS_QUOTE_STATUS_RV";
	public static final String T_MMS_DC_HDR = "T_MMS_DC_HDR";
	public static final String T_MMS_MATERIAL_VNDRGRP = "T_MMS_MATERIAL_VNDRGRP";
	public static final String T_MMS_MATERIAL_LEDGER = "T_MMS_MATERIAL_LEDGER";

	// GCAT
	public static final String M_GCAT__COMPANYSETTINGS = "M_GCAT__COMPANYSETTINGS";

	// SMS
	public static final String T_SMS_P_ENQUIRY_HDR = "T_SMS_P_ENQUIRY_HDR";
	public static final String PE_STATUS = "PE_STATUS";
	public static final String PE_STATUS_RV = "PE_STATUS_RV";

	public static final String T_SMS_PRODUCT_RETURN_HDR = "T_SMS_PRODUCT_RETURN_HDR";
	public static final String T_SMS_P_QUOTE_HDR = "T_SMS_P_QUOTE_HDR";

	public static final String QUOTE_STATUS = "QUOTE_STATUS";

	public static final String QUOTE_STATUS_RV = "QUOTE_STATUS_RV";

	public static final String INV_STATUS = "INV_STATUS";

	public static final String T_SMS_P_PO_RECEIPTS_DTL = "T_SMS_P_PO_RECEIPTS_DTL";

	public static final String RP_STATUS = "RP_STATUS";

	public static final String T_SMS_INVOICE_HDR = "T_SMS_INVOICE_HDR";
	public static final String INVOICE_STATUS_RV = "INVOICE_STATUS_RV";
	public static final String INVOICE_STATUS = "INVOICE_STATUS";

	public static final String T_SMS_VENDOR_BILL_HDR = "T_SMS_VENDOR_BILL_HDR";
	public static final String VBR_STATUS = "VBR_STATUS";
	public static final String VB_STATUS = "VB_STATUS";
	public static final String T_SMS_PO_ACCEPTANCE = "T_SMS_PO_ACCEPTANCE";

	public static final String ACCEPT_OPTION = "ACCEPT_OPTION";
	// Tools
	public static final String M_TOOL_FEEDBACK_CATGRY = "M_TOOL_FEEDBACK_CATGRY";

	public static final String M_TOOL_FEEDBACK_QUESTION = "M_TOOL_FEEDBACK_QUESTION";

	public static final String EXTRUD_DTL_STS = "EXTRUD_DTL_STS";
	public static final String EXTRUD_DTL_AP_STS = "EXTRUD_DTL_AP_STS";


}
