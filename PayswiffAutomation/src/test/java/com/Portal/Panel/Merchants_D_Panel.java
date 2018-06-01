/*
 * @author Sai G
 * 
 */
package com.Portal.Panel;

import org.openqa.selenium.By;

public class Merchants_D_Panel {

	//Upload Bulk Merchants
	public static By FT_Upload_Bulk_Merchant = By.xpath("//*[text()=' Upload Bulk Merchants']");
	
	//Selecting the first merchant
	public static By Frst_Mer = By.xpath(".//*[@id='merchantsList']/tbody/tr[1]/td[1]/a");
	
	//POS@CashUpload
	public static By FT_POSCash = By.xpath(".//*[@id='page-wrapper']/div[2]/div[4]/div/div/div/div[2]/button[3]");
	
	//POS Approvals
	public static By FT_POSApprovals = By.xpath(".//*[@id='page-wrapper']/div[2]/div[4]/div/div/div/div[2]/button[4]");
	
	//Merchant Bulk Upload Package
	public static By FT_Package = By.xpath(".//*[@id='bundleId']");
	
	//FileUpload
	public static By FT_FileUpload = By.xpath(".//*[@id='dto']/div[2]/div/div/div");
	
	//Left Panel Merchant_button
	public static By FT_LMerchant = By.xpath(".//*[@id='merchantsSlider']/a/span");
	
	//Mercahnt ID
	public static By FT_MercahntID = By.xpath(".//*[@id='searchFieldValue']");
	
	//FT_MerchantSearchButton
	public static By FT_SearchButton = By.xpath(".//*[@id='merchantDTO']/div[1]/div[3]/button");
	
	//First MercahntID from the Lit
	public static By FT_firstMerchID = By.xpath(".//*[@id='merchantsList']/tbody/tr/td[1]/a/span");
	
	//POS MID TID Tab
	public static By Portal_POSMID = By.xpath(".//*[@id='headingFour']/h4/a");
	
	//MID TID Actions tab
	public static By MID_Act1 = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[9]/a/i");
	
	//MID TID Actions tab
	public static By MID_Act2 = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[2]/td[9]/a/i");
	
	//MID TID Actions tab
	public static By MID_Act3 = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[3]/td[9]/a/i");
		
	//MID TID Actions tab
	public static By MID_Act4 = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[4]/td[9]/a/i");
	
	//Status Update in MID TID popup
	public static By Act_Status = By.xpath("html/body/div[4]/div/div[2]/div[26]/div/div/div[2]/form/div[5]/div/div/a/span");
	
	
	//Status Update in MID TID popup
	public static By Act_Statustext = By.xpath("html/body/div[4]/div/div[2]/div[26]/div/div/div[2]/form/div[5]/div/div/div/div/input");
	
	//Status Selection from the drop down
	public static By Act_Status_Sel = By.xpath("html/body/div[4]/div/div[2]/div[26]/div/div/div[2]/form/div[5]/div/div/div/ul/li[1]");
	
	
	//Status Update
	public static By Act_Update = By.xpath("html/body/div[4]/div/div[2]/div[26]/div/div/div[2]/form/div[6]/div/button[1]");
	
	//Success OK
	public static By Act_OK = By.xpath("html/body/div[6]/div[7]/button[2]");

	//Header_Devices
	public static By FT_HeadDevices = By.xpath(".//*[@id='headingTerminal']/h4/a");
	//public static By FT_HeadDevices = By.xpath("//a[contains(@href,'#terminals')]");	
	
	//Devices Actions tab
	public static By Act_Devices = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[7]/div/button");
	
	//click on Update Status
	public static By Act_UpdateStatus = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[7]/div/ul/li[1]/a");
	
	
	//Devices Status Update
	public static By Act_StatusUpdate = By.xpath(".//*[@id='deviceStatus']");
	
	//Status Update Button
	public static By Act_SUpdate = By.xpath(".//*[@id='merchantTerminalDTO']/div[4]/button");
	
	//Status update OK
	public static By Act_SOK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	//Header_terminal
	//public static By FT_HeadDevices = By.xpath(".//*[@id='headingTerminal']/h4/a");
	public static By FT_Headterminal = By.xpath("//a[contains(@href,'#terminalsMapping')]");
	
	
	//Assign New Device
	public static By FT_AsssigneNewDevice = By.xpath(".//*[@id='terminals']/div/div[1]/button[2]");
	
	//Device Model
	public static By FT_DeviceModel = By.xpath(".//*[@id='vendorPartyId']");
	
	//Devices to be assigned
	public static By FT_Dev2BAssigned = By.xpath(".//*[@id='devicesCount']");
	
	//show
	public static By FT_Show = By.xpath(".//*[@id='terminalMidAndTidMappingForm']/div[2]/div[2]/div[7]/button");
	
	//Serial Number
	public static By FT_SerNum = By.xpath(".//*[@id='4975']");
	
	//Assign
	public static By FT_Assign = By.xpath(".//*[@id='submitButton']");
	
	//Terminal OK POPUP
	public static By FT_TerOK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	public static By OK_Text= By.xpath("html/body/div[6]/p");
	
	//Auto Config 
	public static By FT_AutoConfig = By.xpath(".//*[@id='terminals']/div/div[1]/button[1]");
	
	//Conf Successfully OK button
	public static By FT_SuccessOK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	//config Successfully OK button
	public static By Auto_SuccessOK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	//Mercahnts_Upload
	public static By Mer_Upload = By.xpath(".//*[@id='dto']/div[4]/button");
	
	//POSCash@POS File Upload
	public static By FT_MIDUpload = By.xpath("//*[text()=' POS/Cash@POS Files Upload']");
	
	//FT_MID Select tab
	//public static By FT_MIDSelTab = By.xpath(".//*[@id='merchantPOSMIDAndTIDConfigDTO']/div[2]/div/div/div");
	public static By FT_BulkMerchSelTab = By.xpath(".//*[@id='dto']/div[2]/div/div/div");
	
	//SM Select file field from the mid tid assign 
	public static By FT_MIDSelTab = By.xpath(".//*[@id='merchantPOSMIDAndTIDConfigDTO']/div[2]/div/div/div");
	
	
	//FT_MID Upload button
	public static By FT_Upload = By.xpath(".//*[@id='merchantPOSMIDAndTIDConfigDTO']/div[4]/button");
	
	//FT_Merch Upload Buttton
	public static By FT_MerchUpload = By.xpath("//*[text()='Upload']");
	
	//MIDTID Text Confirmation
	public static By FT_MIDConfirmation = By.xpath("//p[text()='Details updated successfully']");
	
	//FT_CloseIcon
	public static By FT_CloseIcon = By.xpath(".//*[@id='posApplReqPop']/div/div/div[1]/button");
	
	//Applogout
	public static By AppLogout = By.xpath(".//*[@id='page-wrapper']/div[1]/nav/ul/li[3]/a");
	
	//FT_CloseIcon
	public static By FT_MerchCloseIcon = By.xpath(".//*[@id='failedRecords']/div/div/div[1]/button");
	
	//FT_MerchCloseICon2
	public static By FT_MerchCloseIcon2 = By.xpath(".//*[@id='merchantsBulkUploadPop']/div/div/div/button");
	
	//FT_OKbttn
	public static By FT_OK = By.xpath("//button[text()='OK']");
	
	//FT_Package
	public static By FT_MerchPackage = By.xpath(".//*[@id='bundleId']");
	
	//FT_MerchantUpload Success
	public static By FT_MErchantSuccess = By.xpath("html/body/div[6]/p");
	
	//FT_OK
	public static By FT_MerchOK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	//FT_MIDApprovals
	public static By FT_MIDApproval = By.xpath("//*[text()=' POS/Cash@POS Approvals']");
	
	//FT_MIDApprProcessor
	public static By FT_MIDApprProcessor = By.xpath(".//*[@id='acqProcessorId_chosen']/a/span");
	
	//FT_MerchApproval Upload
	public static By FT_MerchAppUpload = By.xpath(".//*[@id='merchantPOSMIDAndTIDConfigDTO']/div[4]/button");
	
	//FT_MerchApprovalText
	public static By FT_MerchApprovalText = By.xpath("html/body/div[6]/p");
	
	//FT_MerchApproval SuccessOK
	public static By FT_MerchApprovalOK = By.xpath("	html/body/div[6]/div[7]/button[2]");

	//FT_MerchApprovalSelect
	//public static By FT_MerchAppSelectF = By.xpath("//button[text()='Upload'])[2]");
	public static By FT_MerchAppSelectF = By.xpath(".//*[@id='merchantPOSMIDAndTIDConfigDTO']/div[2]/div/div/div");
	
	//FT_Device already assigned to Merchant pop up
	public static By FT_DeviceAssigOK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	//Upload Bulk Info
	//upload Additional Information 
	public static By SM_AddInfo = By.xpath("//*[text()=' Upload Bulk Addl Info']");
	
	//Select File Upload add info
	public static By SM_SAddInfo = By.xpath(".//*[@id='dto']/div[1]/div/div/div");
	
	//click on upload
	public static By SM_Upload = By.xpath(".//*[@id='dto']/div[3]/button");
	
	//AddInfo Popup
	public static By SM_ConfPopup = By.xpath("html/body/div[6]/p");
	
	//OK in the popup
	public static By SM_OK = By.xpath("html/body/div[6]/div[7]/button[2]");
	
	//Close in the popup
	public static By SM_close = By.xpath(".//*[@id='failedRecords']/div/div/div[1]/button");
	
	//Selecting the value from drop down
	public static By SM_BankDp = By.xpath(".//*[@id='acqProcessorId_chosen']/a/span");
	
	//Bank Processor Drop Down Locators
	//clicking the drop down
	public static By SM_SProc = By.xpath(".//*[@id='acqProcessorId_chosen']/a/div/b");
	
	//Auto Config Processor selection
	public static By Auto_Proc = By.xpath(".//*[@id='acqProcessorId1_chosen']/a/span");
	
	//Sending the Value in the field
	public static By SM_VProc = By.xpath(".//*[@id='acqProcessorId_chosen']/div/div/input");
	
	//Sending the value in the Auto Config field
	public static By Auto_VProc = By.xpath(".//*[@id='acqProcessorId1_chosen']/div/div/input");
	
	//Selecting the result
	public static By SM_SelRes = By.xpath(".//*[@id='acqProcessorId_chosen']/div/ul/li");
	
	//Selecting the result
	public static By Auto_SelRes = By.xpath(".//*[@id='acqProcessorId1_chosen']/div/ul/li");
	
	//Auto Config Submit 
	public static By Auto_Submit = By.xpath(".//*[@id='midAndTidAutoConfigForm']/div[2]/button");
	
	//fetching the device serial Number
	public static By Device_SerNum = By.xpath(".//*[@id='DataTables_Table_2']/tbody/tr/td[1]");
	
	//fetching the device serial Number
	public static By terminal_SerNum = By.xpath(".//*[@id='DataTables_Table_3']/tbody/tr/td[1]");
	
	//WebHook tab
		public static By WebHookTab = By.xpath(".//*[@id='accordion']/div[12]/div[1]/h4/a");
		
		//Create WebHook
		public static By CreWH = By.xpath(".//*[@id='webhookList']/button");
		
		//WebHook URL
		public static By WebHookURL = By.xpath(".//*[@id='url']");
		
		//Create WHook
		public static By CreWHBtn = By.xpath(".//*[@id='merchantWebhookForm']/div[3]/div/input");
		
		//Create Successful PopUp
		public static By SuccessWH = By.xpath("html/body/div[6]/p");
		
		//Success OK Button
		public static By SuccessOK = By.xpath("html/body/div[6]/div[7]/button[2]");
		
  public static By Pro = By.xpath(".//*[@id='DataTables_Table_2']/tbody/tr/td[3]");
  public static By Pro1 = By.xpath(".//*[@id='DataTables_Table_2']/tbody/tr[2]/td[3]");
  public static By Pro2 = By.xpath(".//*[@id='DataTables_Table_2']/tbody/tr[3]/td[3]");
  
  //DevicesActions
  public static By Dev_Act = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[2]/td[7]/div/button");
  
  //Device DeAcivationb
  public static By Dev_DeActivate = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[7]/div/button");
  
  //Update Device 3
  public static By Dev_Update = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[7]/div/ul/li[1]/a");
  
  //Update Status
  public static By Updte_Status = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[2]/td[7]/div/ul/li[1]/a");
  
  //DeviceStatus
  public static By DvceStatus_Updte = By.xpath(".//*[@id='deviceStatus']");
  
  //Update Button
  public static By Update_Btn = By.xpath(".//*[@id='merchantTerminalDTO']/div[4]/button");
  
  //Terminals Updated Status text
  public static By Suc_text = By.xpath("html/body/div[6]/p");
  
  //popOK
  public static By Succ_OK = By.xpath("html/body/div[6]/div[7]/button[2]");
  
  //Sevices tab in the merchant detail page
  public static By Merch_Ser = By.xpath(".//*[@id='headingTwo']/h4/a");
  
  //Documents tab in the merchant detail page
  public static By Merch_Doc = By.xpath(".//*[@id='accordion']/div[2]/div[1]/h4/a");
  
  //Actions button
  public static By DocActions = By.xpath(".//*[@id='DataTables_Table_3']/tbody/tr[1]/td[9]/div/button");
  
  //Upload Document
  public static By DocUpload = By.xpath(".//*[@id='DataTables_Table_3']/tbody/tr[1]/td[9]/div/ul/li[1]/a");
  
  //Upload Document select field
  public static By DocField = By.xpath(".//*[@id='documentCreateForm']/div[5]/div/div/div"); 
  
  //Click on submit on Document popup
  public static By DocSub = By.xpath(".//*[@id='documentCreateForm']/div[7]/div/button"); 
  
  //Click on submit on Subscrption popup
  public static By Subscrp = By.xpath("//a[contains(@href,'#subscrptions')]");
  
  //Click on submit on Subscrption popup
  public static By Subscrp_Act = By.xpath(".//*[@id='DataTables_Table_4']/tbody/tr/td[7]/a/i");
  
  //Subscr popup Close Icon
  public static By Subscrp_close= By.xpath(".//*[@id='subscriptionEditForm']/div/div/div[1]/button");
  
  //Click on Users tab
  public static By Users = By.xpath("//a[contains(@href, '#usersTab')]");
  
  //Click on Address Info tab
  public static By AddInfo = By.xpath(".//*[@id='headingAddress']/h4/a");
  
  //AddInfo Create New
  public static By AddCre = By.xpath(".//*[@id='address']/div/div/div/button");
  
  //AddressType
  public static By AddType = By.xpath(".//*[@id='addressType']");
  
  //Address1
  public static By Add1 = By.xpath(".//*[@id='addr1']");
  
  //country
  public static By country = By.xpath(".//*[@id='country']");
  
  //state
  public static By state = By.xpath(".//*[@id='region']");
  
  //City
  public static By city = By.xpath(".//*[@id='city']");
  
  //Create Address
  public static By Creaddress = By.xpath(".//*[@id='addressForm']/div[10]/div/input");
  
  //POPUp Success Message
  public static By POPMsg = By.xpath("html/body/div[6]/p");
  
  //popupOK
  public static By PopUpOK = By.xpath("html/body/div[6]/div[7]/button[2]");
  
  //Correspondence Address Type
  public static By Cor_AddType = By.xpath(".//*[@id='addrDataTables']/tbody/tr[2]/td[2]");
  
  
  
  //Click on Address Info tab
  public static By Contact = By.xpath(".//*[@id='headingContact']/h4/a");
  
  //Click on Address Info tab
  public static By BankInf = By.xpath(".//*[@id='headingBank']/h4/a");
  
  //Click on Address Info tab
  public static By Gateways = By.xpath(".//*[@id='headingGateways']/h4/a");
 
  //Click on Address Info tab
  public static By Cre_BankInfo = By.xpath(".//*[@id='bank']/div/div/div/button");
  
  //Account Holder Name Field
  public static By HolderName_GW = By.xpath(".//*[@id='bankAccountName']");
  
  //Account Number
  public static By Acnt_Num = By.xpath(".//*[@id='bankAccountNo']");
  
  //Account Type
  public static By Acct_Type = By.xpath(".//*[@id='bankAccountType']");
  
  //Bank Name
  public static By Bank_Name = By.xpath(".//*[@id='bankName']");
  
  //Bank Branch
  public static By Bank_Branch = By.xpath(".//*[@id='bankBranch']");
  
  //Bank IFSC Code
  public static By IFSC_Code = By.xpath(".//*[@id='bankIfscCode']");
  
  //Bank Micro Code
  public static By BankMicroCode = By.xpath(".//*[@id='bankMicrCode']");
  
  //Create Bank
  public static By Cre_Bank = By.xpath(".//*[@id='merchantBankForm']/div[8]/div/input");
  
  //Ok POPup
  public static By Popup_OK = By.xpath("html/body/div[6]/div[7]/button[2]");
  
  //Bank Details Popup
  public static By BankPOPup = By.xpath("html/body/div[6]/p");
  
  //GW DropDown
  public static By GW_DD = By.xpath(".//*[@id='paymentMode']");
  
  
  //AcctType
  public static By AccType = By.xpath(".//*[@id='bankDataTables']/tbody/tr/td[4]");
  
  //Click on Address Info tab
  public static By Webhook = By.xpath(".//*[@id='accordion']/div[9]/div[1]/h4/a");
  
  //Create New MID from Merchant Detail Screen
  public static By Mid_Cre = By.xpath(".//*[@id='midTid']/div/div[1]/button");
  
  //Processor from POS MID TID popup
  public static By Mid_Proc = By.xpath(".//*[@id='acqProcessorId_chosen']/a/span");
  
  //Processor field from POS MID TID popup
  public static By Mid_ProcField = By.xpath(".//*[@id='acqProcessorId_chosen']/div/div/input");
  
  
  //Processor field selected value from POS MID TID popup
  public static By Mid_ProcSelField = By.xpath(".//*[@id='acqProcessorId_chosen']/div/ul/li[1]");
  
  //Payment Mode from POS MID TID popup
  public static By Mid_PaymntMode = By.xpath(".//*[@id='paymentMode_chosen']/a/span");
  
  //Payment field from POS MID TID popup
  public static By Mid_PayField = By.xpath(".//*[@id='paymentMode_chosen']/div/div/input");
  
  //Payment field selected value from POS MID TID popup
  public static By Mid_PaycSelField = By.xpath(".//*[@id='paymentMode_chosen']/div/ul/li");
  
  //MID field in POS MID TID popup
  public static By Mid_field = By.xpath(".//*[@id='mid']");
  
  //Tid field in POS MID TID popup
  public static By Tid_field = By.xpath(".//*[@id='tid']");
  
  //Tid GetText
  public static By TIDValue = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[4]/td[2]");
  
  //Submit in POS MID TID popup
  public static By Mid_Sub = By.xpath(".//*[@id='merchantMidAndTidForm']/div[5]/div/button[1]");
  
  //MID TID Successful Message
  public static By Mid_Success = By.xpath("html/body/div[6]/p");
  
  //MId TID Success OK
  public static By Mid_SuccOK = By.xpath("html/body/div[6]/div[7]/button[2]");
  
  //Services
  public static By M_Services= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[1]/div[1]/h4/a");
  
  //Documents
  public static By M_Doc = By.xpath(".//*[@id='accordion']/div[2]/div[1]/h4/a");
  
  //Users
  public static By M_Users= By.xpath(".//*[@id='merchantUsers']/h4/a");
  
  //Add Info
  public static By M_AddInfo= By.xpath(".//*[@id='headingAddress']/h4/a");
  
  //Contact Info
  public static By M_ContInfo = By.xpath(".//*[@id='headingContact']/h4/a");
  
  //User Name
  //public static By M_UserName = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr/td[1]");
  public static By M_UserName = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td[1]");
  
  //User Contact Info Name
  public static By M_UserName_Cont = By.xpath(".//*[@id='contactDataTables']/tbody/tr/td[1]");
  
 //User Contact Info Name
  public static By M_UserEmail_Cont = By.xpath(".//*[@id='contactDataTables']/tbody/tr/td[4]");
  
 //User Contact Info Name
  public static By M_Desig = By.xpath(".//*[@id='contactDataTables']/tbody/tr/td[2]");
  
 //User Contact Info Name
  public static By M_Cont_Status = By.xpath(".//*[@id='contactDataTables']/tbody/tr/td[6]"); 
  
  //User ID
  //public static By M_UserID = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr/td[2]");
  public static By M_UserID = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td[2]");
  
  
  //User Address
  public static By M_Useradd=  By.xpath(".//*[@id='addrDataTables']/tbody/tr/td[1]");
  
//User City
  public static By M_UserCity = By.xpath(".//*[@id='addrDataTables']/tbody/tr/td[3]");
  
//User Region State
  public static By M_UserReg = By.xpath(".//*[@id='addrDataTables']/tbody/tr/td[4]");
  
//User LMark
  public static By M_UserLMark = By.xpath(".//*[@id='addrDataTables']/tbody/tr/td[5]");
  
//User Address
  public static By M_UserAddStatus = By.xpath(".//*[@id='addrDataTables']/tbody/tr/td[7]");
  
  //User Status
 // public static By M_UserStatus = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr/td[5]");
  public static By M_UserStatus = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[3]/div[2]/div/div[2]/div/div/div/table/tbody/tr/td[5]");
  
  
  //BAnk Info
  public static By M_BankInfo = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[6]/div[1]/h4/a");
  
  //GateWay Info
  public static By M_Gateway = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[7]/div[1]/h4/a");
  
//GateWay Info
  public static By M_POSMID = By.xpath(".//*[@id='headingFour']/h4/a");
  
  //Ac Processor
 // public static By M_AcqProc = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[4]");
  public static By M_AcqProcr = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[4]");
  
  //Status
  public static By M_MidStatus = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[8]");
  
  //Device Status
  //public static By Dev_Status = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[6]");
  public static By Dev_Status = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[6]");
  
  //Device from left slider
  public static By SDevices = By.xpath(".//*[@id='header_inventory_link']/a");
  
  //Device from left slider
  public static By D_InvStatus = By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr/td[8]");
  
  
 //Device text from Device tab
  public static By D_Text = By.xpath(".//*[@id='customField1']");
  
  //Device Serial Num Drop Down
  public static By Device_DD = By.xpath(".//*[@id='customField']");
  
//Device ta GO
  public static By D_Go = By.xpath(".//*[@id='assetInventryDto']/div[1]/div/div[2]/div[3]/button");
  
//GateWay Info
  public static By M_Devices = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[1]/h4/a");
  
//GateWay Info
  public static By M_Terminals = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[1]/h4/a");
  
  
  
  //To fetch Devices from the column of Devices tab
  //public static By DeviceNum = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[1]");
  public static By Device1 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[1]");
  public static By Device2 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[1]");
  
  public static By Device3 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[3]/td[1]");
  public static By Device4 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[4]/td[1]");
  
  public static By Device5 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[5]/td[1]");
  public static By Device6 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[9]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[6]/td[1]");
  
  
  
  //To fetch Devices from the column of Devices tab
  //public static By terminal1 = By.xpath(".//*[@id='DataTables_Table_1']/tbody/tr[1]/td[1]");
  public static By terminal1 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[1]");
  public static By terminal2 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[1]");
  
  public static By terminal3 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[3]/td[1]");
  public static By terminal4 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[4]/td[1]");
  
  public static By terminal5 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[5]/td[1]");
  public static By terminal6 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[6]/td[1]");
  
  
 //To fetch TIDs from the column of TID tab of terminal
  public static By TTId1 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[3]");
  public static By TTId2 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[3]");
  
  public static By TTId3 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[3]/td[3]");
  public static By TTId4 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[4]/td[3]");
  
  
  public static By TTId5 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[5]/td[3]");
  public static By TTId6 = By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[10]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[6]/td[3]");
  
  //TO fetch the TIDs from the POS MID TID panel(tab)- 4
  public static By tid1= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[1]/td[2]");
  public static By tid2= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[2]/td[2]");
  public static By tid3= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[3]/td[2]");
  public static By tid4= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[4]/td[2]");
  public static By tid5= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[5]/td[2]");
  public static By tid6= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[6]/td[2]");
  public static By tid7= By.xpath("html/body/div[4]/div/div[2]/div[2]/div/div[3]/div/div[8]/div[2]/div/div[2]/div/form/div[1]/div/table/tbody/tr[7]/td[2]");
  
  
  
  	  
}
