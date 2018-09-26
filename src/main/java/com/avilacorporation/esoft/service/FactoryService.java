package com.avilacorporation.esoft.service;

import com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse;
import com.temenos.wsbanescobcon.CreateT24BconUnitResponse;
import com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse;
import javax.xml.ws.Response;


public class FactoryService
{
  public FactoryService() {}
  
  public static Response<CreateT24BconUnitResponse> CreateT24BconUnit(String ip, String username, String password, String buildControlType, String releasePath, String company)
  {
    BconService physicUnitService = new BconService();
    return physicUnitService.createT24(ip, username, password, buildControlType, releasePath, company);
  }
  
  public static Response<CreateBconPhysicUnitResponse> CreateBconPhysicUnit(String ip, String username, String password, String transactionId, String company) {
    BconService physicUnitService = new BconService();
    return physicUnitService.createPhysicUnit(ip, username, password, transactionId, company);
  }
  
  public static Response<ViewtheResultsofaBCONunitResponse> ViewtheResultsofaBCONunit(String ip, String username, String password, String company, String columName, String criteriaValue, String operand) {
    BconService physicUnitService = new BconService();
    return physicUnitService.viewtheResultsofaBCONunit(ip, username, password, company, columName, criteriaValue, operand);
  }
}