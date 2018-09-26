package com.temenos.wsbanescobcon;

import com.temenos.buildcontrol.BUILDCONTROLType;
import com.temenos.buildcontrolresults.BUILDCONTROLRESULTSType;
import java.util.List;
import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.Response;
import javax.xml.ws.ResponseWrapper;

@WebService(name="T24WebServicesImpl", targetNamespace="http://temenos.com/WSBanescoBCON")
@XmlSeeAlso({com.temenos.buildcontrolresults.ObjectFactory.class, com.temenos.buildcontrol.ObjectFactory.class, ObjectFactory.class, net.java.dev.jaxb.array.ObjectFactory.class})
public abstract interface T24WebServicesImpl
{
  @WebMethod(operationName="CreateBconPhysicUnit")
  @RequestWrapper(localName="CreateBconPhysicUnit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateBconPhysicUnit")
  @ResponseWrapper(localName="CreateBconPhysicUnitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse")
  public abstract Response<CreateBconPhysicUnitResponse> createBconPhysicUnitAsync(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="BUILDCONTROLType", targetNamespace="") TransactionId paramTransactionId);
  
  @WebMethod(operationName="CreateBconPhysicUnit")
  @RequestWrapper(localName="CreateBconPhysicUnit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateBconPhysicUnit")
  @ResponseWrapper(localName="CreateBconPhysicUnitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse")
  public abstract Future<?> createBconPhysicUnitAsync(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="BUILDCONTROLType", targetNamespace="") TransactionId paramTransactionId, @WebParam(name="asyncHandler", targetNamespace="") AsyncHandler<CreateBconPhysicUnitResponse> paramAsyncHandler);
  
  @WebMethod(operationName="CreateBconPhysicUnit")
  @RequestWrapper(localName="CreateBconPhysicUnit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateBconPhysicUnit")
  @ResponseWrapper(localName="CreateBconPhysicUnitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse")
  @Action(input="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/CreateBconPhysicUnitRequest", output="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/CreateBconPhysicUnitResponse")
  public abstract void createBconPhysicUnit(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="BUILDCONTROLType", targetNamespace="") TransactionId paramTransactionId, @WebParam(name="Status", targetNamespace="", mode=WebParam.Mode.OUT) Holder<Status> paramHolder, @WebParam(name="BUILDCONTROLType", targetNamespace="", mode=WebParam.Mode.OUT) Holder<BUILDCONTROLType> paramHolder1);
  
  @WebMethod(operationName="ViewtheResultsofaBCONunit")
  @RequestWrapper(localName="ViewtheResultsofaBCONunit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.ViewtheResultsofaBCONunit")
  @ResponseWrapper(localName="ViewtheResultsofaBCONunitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse")
  public abstract Response<ViewtheResultsofaBCONunitResponse> viewtheResultsofaBCONunitAsync(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="BUILDCONTROLRESULTSType", targetNamespace="") EnquiryInput paramEnquiryInput);
  
  @WebMethod(operationName="ViewtheResultsofaBCONunit")
  @RequestWrapper(localName="ViewtheResultsofaBCONunit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.ViewtheResultsofaBCONunit")
  @ResponseWrapper(localName="ViewtheResultsofaBCONunitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse")
  public abstract Future<?> viewtheResultsofaBCONunitAsync(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="BUILDCONTROLRESULTSType", targetNamespace="") EnquiryInput paramEnquiryInput, @WebParam(name="asyncHandler", targetNamespace="") AsyncHandler<ViewtheResultsofaBCONunitResponse> paramAsyncHandler);
  
  @WebMethod(operationName="ViewtheResultsofaBCONunit")
  @RequestWrapper(localName="ViewtheResultsofaBCONunit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.ViewtheResultsofaBCONunit")
  @ResponseWrapper(localName="ViewtheResultsofaBCONunitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse")
  @Action(input="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/ViewtheResultsofaBCONunitRequest", output="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/ViewtheResultsofaBCONunitResponse")
  public abstract void viewtheResultsofaBCONunit(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="BUILDCONTROLRESULTSType", targetNamespace="") EnquiryInput paramEnquiryInput, @WebParam(name="Status", targetNamespace="", mode=WebParam.Mode.OUT) Holder<Status> paramHolder, @WebParam(name="BUILDCONTROLRESULTSType", targetNamespace="", mode=WebParam.Mode.OUT) Holder<List<BUILDCONTROLRESULTSType>> paramHolder1);
  
  @WebMethod(operationName="CreateT24BconUnit")
  @RequestWrapper(localName="CreateT24BconUnit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateT24BconUnit")
  @ResponseWrapper(localName="CreateT24BconUnitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateT24BconUnitResponse")
  public abstract Response<CreateT24BconUnitResponse> createT24BconUnitAsync(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="OfsFunction", targetNamespace="") OfsFunction paramOfsFunction, @WebParam(name="BUILDCONTROLType", targetNamespace="") BUILDCONTROLType paramBUILDCONTROLType);
  
  @WebMethod(operationName="CreateT24BconUnit")
  @RequestWrapper(localName="CreateT24BconUnit", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateT24BconUnit")
  @ResponseWrapper(localName="CreateT24BconUnitResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateT24BconUnitResponse")
  @Action(input="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/CreateT24BconUnitRequest", output="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/CreateT24BconUnitResponse")
  public abstract void createT24BconUnit(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="OfsFunction", targetNamespace="") OfsFunction paramOfsFunction, @WebParam(name="BUILDCONTROLType", targetNamespace="", mode=WebParam.Mode.INOUT) Holder<BUILDCONTROLType> paramHolder, @WebParam(name="Status", targetNamespace="", mode=WebParam.Mode.OUT) Holder<Status> paramHolder1);
  
  @WebMethod(operationName="CreateT24BconUnit_Validate")
  @RequestWrapper(localName="CreateT24BconUnit_Validate", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateT24BconUnitValidate")
  @ResponseWrapper(localName="CreateT24BconUnit_ValidateResponse", targetNamespace="http://temenos.com/WSBanescoBCON", className="com.temenos.wsbanescobcon.CreateT24BconUnitValidateResponse")
  @Action(input="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/CreateT24BconUnit_ValidateRequest", output="http://temenos.com/WSBanescoBCON/T24WebServicesImpl/CreateT24BconUnit_ValidateResponse")
  public abstract void createT24BconUnitValidate(@WebParam(name="WebRequestCommon", targetNamespace="") WebRequestCommon paramWebRequestCommon, @WebParam(name="OfsFunction", targetNamespace="") OfsFunction paramOfsFunction, @WebParam(name="BUILDCONTROLType", targetNamespace="", mode=WebParam.Mode.INOUT) Holder<BUILDCONTROLType> paramHolder, @WebParam(name="Status", targetNamespace="", mode=WebParam.Mode.OUT) Holder<Status> paramHolder1);
}
