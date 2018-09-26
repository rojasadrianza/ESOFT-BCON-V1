package com.avilacorporation.esoft.service;

import com.avilacorporation.esoft.conexion.BConConexion;
import com.temenos.buildcontrol.BUILDCONTROLType;
import com.temenos.buildcontrol.ObjectFactory;
import com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse;
import com.temenos.wsbanescobcon.CreateT24BconUnitResponse;
import com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse;
import com.temenos.wsbanescobcon.OfsFunction;
import com.temenos.wsbanescobcon.T24WebServicesImpl;
import com.temenos.wsbanescobcon.TransactionId;
import com.temenos.wsbanescobcon.WebRequestCommon;
import com.temenos.wsbanescobcon.EnquiryInput;
import com.temenos.wsbanescobcon.EnquiryInputCollection;
import com.temenos.wsbanescobcon.Status;
import java.util.List;
import javax.xml.ws.Response;
import javax.xml.ws.Holder;

public class BconService
{
  public BconService() {}
  
  private WebRequestCommon getWebRequestCommon(String username, String password, String company)
  {
    WebRequestCommon result = new WebRequestCommon();
    result.setUserName(username);
    result.setPassword(password);
    result.setCompany(company);
    return result;
  }
  
  private Holder<Status> getStatus() {
        Holder<Status> result = new Holder<>();
        return result;
  }
  
    private EnquiryInputCollection setEnquiryInput(String columnName, String criteriaValue, String operand)  {
        EnquiryInputCollection result = new EnquiryInputCollection();        
        result.setColumnName(columnName);
        result.setCriteriaValue(criteriaValue);
        result.setOperand(operand);
        return result;
    }
    
    /*
   private void setEnquiryInput(String columnName, String criteriaValue, String operand)  {
        EnquiryInputCollection result = new EnquiryInputCollection();        
        result.setColumnName(columnName);
        result.setCriteriaValue(criteriaValue);
        result.setOperand(operand);
    }
    */
    
  
  public Response<CreateT24BconUnitResponse> createT24(String ip, String username, String password, String buildControlType, String releasePath, String company) {
    BConConexion conexion = BConConexion.getInstace(ip);
    T24WebServicesImpl service = conexion.getService();
    WebRequestCommon webRequestCommon = getWebRequestCommon(username, password, company);
    OfsFunction ofsFunction = new OfsFunction();
    BUILDCONTROLType buildcontrolType = new BUILDCONTROLType();
    ObjectFactory factory = new ObjectFactory();
    buildcontrolType.setACTION(factory.createBUILDCONTROLTypeACTION("RELEASE"));
    buildcontrolType.setId(buildControlType);    
    buildcontrolType.setOFSSOURCEID(factory.createBUILDCONTROLTypeOFSSOURCEID("BUILD.CONTROL"));
    
    buildcontrolType.setRELEASEPATH(factory.createBUILDCONTROLTypeRELEASEPATH(releasePath));
    
    /*************************************************************************************/
    System.out.println("CLASE: BconService"); 
    System.out.println("METODO: createT24:"); 
    System.out.println("webRequestCommon.getUserName() " + webRequestCommon.getUserName()); 
    System.out.println("webRequestCommon.getPassword() " + webRequestCommon.getPassword());
    System.out.println("webRequestCommon.getCompany() " + webRequestCommon.getCompany());
    System.out.println("ofsFunction.getActivityName() " + ofsFunction.getActivityName());    
    System.out.println("ofsFunction.getAssignReason() " + ofsFunction.getAssignReason());
    System.out.println("ofsFunction.getDueDate() " + ofsFunction.getDueDate());
    System.out.println("ofsFunction.getExtProcess() " + ofsFunction.getExtProcess());
    System.out.println("ofsFunction.getExtProcessID() " + ofsFunction.getExtProcessID());
    System.out.println("ofsFunction.getGtsControl() " + ofsFunction.getGtsControl());
    System.out.println("ofsFunction.getMessageId() " + ofsFunction.getMessageId());
    System.out.println("ofsFunction.getNoOfAuth() " + ofsFunction.getNoOfAuth());
    System.out.println("ofsFunction.getOwner() " + ofsFunction.getOwner());
    System.out.println("ofsFunction.getReplace() " + ofsFunction.getReplace());
    System.out.println("ofsFunction.getStartDate() " + ofsFunction.getStartDate());
    System.out.println("ofsFunction.getUser() " + ofsFunction.getUser());    
    System.out.println("buildcontrolType.getACTION() " + buildcontrolType.getACTION());
    System.out.println("buildcontrolType.getId() " + buildcontrolType.getId());
    System.out.println("buildcontrolType.getOFSSOURCEID() " + buildcontrolType.getOFSSOURCEID());
    System.out.println("buildcontrolType.getRELEASEPATH() " + buildcontrolType.getRELEASEPATH());
    System.out.println("FIN: createT24");    
    /*************************************************************************************/
    
    try {
      Response<CreateT24BconUnitResponse> response = service.createT24BconUnitAsync(webRequestCommon, ofsFunction, buildcontrolType);
      while (!response.isDone())
      {
        Thread.sleep(100L);
      }
      return response;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
  
  public Response<CreateBconPhysicUnitResponse> createPhysicUnit(String ip, String username, String password, String transactionId, String company) {
    BConConexion conexion = BConConexion.getInstace(ip);
    T24WebServicesImpl service = conexion.getService();
    WebRequestCommon webRequestCommon = getWebRequestCommon(username, password, company);
    TransactionId transactionIdResult = new TransactionId();
    transactionIdResult.setTransactionId(transactionId);
    
    
     /*************************************************************************************/
    System.out.println("CLASE: BconService"); 
    System.out.println("METODO: createPhysicUnit:"); 
    System.out.println("webRequestCommon.getUserName() " + webRequestCommon.getUserName()); 
    System.out.println("webRequestCommon.getPassword() " + webRequestCommon.getPassword());
    System.out.println("webRequestCommon.getCompany() " + webRequestCommon.getCompany());
    System.out.println("transactionIdResult.getTransactionId() " + transactionIdResult.getTransactionId());
    System.out.println("FIN: createPhysicUnit");    
    /*************************************************************************************/
    
    
    try {
      Response<CreateBconPhysicUnitResponse> response = service.createBconPhysicUnitAsync(webRequestCommon, transactionIdResult);
      while (!response.isDone())
      {
        Thread.sleep(100L);
      }
      
      return response;
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
    return null;
  }
  
  public Response<ViewtheResultsofaBCONunitResponse> viewtheResultsofaBCONunit(String ip, String username, String password, String company, String columName, String criteriaValue, String operand) {
    BConConexion conexion = BConConexion.getInstace(ip);
    T24WebServicesImpl service = conexion.getService();
    WebRequestCommon webRequestCommon = getWebRequestCommon(username, password, company);
    //setEnquiryInput(columName,criteriaValue,operand); 
    EnquiryInput enquiryInput =   new EnquiryInput();
    enquiryInput.getEnquiryInputCollection().add(setEnquiryInput(columName,criteriaValue,operand));
    
    try {
  //System.out.println("VALORES enquiryResult " + enquiryInput );     
      Response<ViewtheResultsofaBCONunitResponse> response = service.viewtheResultsofaBCONunitAsync(webRequestCommon, enquiryInput);
      while (!response.isDone())
      {
        Thread.sleep(100L);
      }
      
      return response;
    } catch (Exception e) {
      System.out.println("BconService " + e.getMessage());
    }
    
    return null;
  }
  
  
  
  
  
  
  
  
  
  
  
}
