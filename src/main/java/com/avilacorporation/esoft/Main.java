package com.avilacorporation.esoft;

import com.avilacorporation.esoft.service.FactoryService;
import com.temenos.buildcontrolresults.BUILDCONTROLRESULTSType;
import com.temenos.buildcontrolresults.BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType;
import com.temenos.buildcontrolresults.BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType;
import com.temenos.wsbanescobcon.CreateBconPhysicUnitResponse;
import com.temenos.wsbanescobcon.CreateT24BconUnitResponse;
import com.temenos.wsbanescobcon.ViewtheResultsofaBCONunitResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.Response;

/**
 *
 * @author Isaac Arismendi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
           /* 
           Response<ViewtheResultsofaBCONunitResponse> viewtheResultsofaBCONunitResponse = FactoryService.ViewtheResultsofaBCONunit("172.16.27.40:85", "CCHARVEST", "123456789", "PA0019999", "@ID", "BSAP001-PACS00690356.20180731", "EQ");
                                                                                                                                           //  ip,       username,    password,   company,columName, criteriaValue,               operand
            if ((((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getMessages() != null) && (((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getMessages().size() > 0)) {
                      System.out.println(((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getSuccessIndicator().value() + " - " + ((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getMessages());
                    } else {
                      ListIterator<BUILDCONTROLRESULTSType> itr = ((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getBUILDCONTROLRESULTSType().listIterator();
                 while (itr.hasNext()){
                       ListIterator<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType> datos = itr.next().getGBUILDCONTROLRESULTSDetailType().getMBUILDCONTROLRESULTSDetailType().listIterator();
                       while (datos.hasNext()){
                            MBUILDCONTROLRESULTSDetailType dat = datos.next();
                            if(dat.getID() != null && !dat.getID().getValue().isEmpty()){
                              System.out.println("ID " + dat.getID().getValue() );    
                            }
                            if(dat.getACTIVITY() != null && !dat.getACTIVITY().getValue().isEmpty()){
                              System.out.println("ACTIVITY " + dat.getACTIVITY().getValue() );    
                            }
                            if(dat.getHDRLIT() != null && !dat.getHDRLIT().getValue().isEmpty()){
                              System.out.println("HDRLIT " + dat.getHDRLIT().getValue() );    
                            }
                            if(dat.getPackageName() != null && !dat.getPackageName().getValue().isEmpty()){
                              System.out.println("PACKAGENAME " + dat.getPackageName().getValue() );    
                            }
                            if(dat.getProcessInfo() != null && !dat.getProcessInfo().getValue().isEmpty()){
                              System.out.println("PROCESSINFO " + dat.getProcessInfo().getValue() );    
                            }
                            System.out.println("--------------------------------------------------");  
                      }
                 }
            }*/
            
          //INICIAR COMENTARIOS AQUI PARA PRUEBAS
           //System.out.println("ARGUMENTOS " + args[0] +" "+ args[1] +" "+ args[2] +" "+ args[3] +" "+ args[4] +" "+ args[5] +" "+ args[6] +" "+ args[7] +" "+ args[8] +" "+ args[9]);
            String ip = args[1];
            String username = args[2];
            String password = args[3];
            String company = args[7];
            switch (args[0]) {
                case "-t":
                    String buildControlType = args[4];
                    String releasePath = args[5]; 
                    Response<CreateT24BconUnitResponse> createT24BconUnitResponse = FactoryService.CreateT24BconUnit(ip, username, password, buildControlType, releasePath, company);

                    if ((((CreateT24BconUnitResponse)createT24BconUnitResponse.get()).getStatus().getMessages() != null) && (((CreateT24BconUnitResponse)createT24BconUnitResponse.get()).getStatus().getMessages().size() > 0)) {
                      System.out.println(((CreateT24BconUnitResponse)createT24BconUnitResponse.get()).getStatus().getSuccessIndicator().value() + " - " + ((CreateT24BconUnitResponse)createT24BconUnitResponse.get()).getStatus().getMessages());
                    } else {
                      System.out.println(((CreateT24BconUnitResponse)createT24BconUnitResponse.get()).getStatus().getSuccessIndicator().value());
                    }
                    
                    break;

                case "-p":
                    String transactionId = args[6];
                    Response<CreateBconPhysicUnitResponse> createBconPhysicUnitResponse = FactoryService.CreateBconPhysicUnit(ip, username, password, transactionId, company);

                    if ((((CreateBconPhysicUnitResponse)createBconPhysicUnitResponse.get()).getStatus().getMessages() != null) && (((CreateBconPhysicUnitResponse)createBconPhysicUnitResponse.get()).getStatus().getMessages().size() > 0)) {
                      System.out.println(((CreateBconPhysicUnitResponse)createBconPhysicUnitResponse.get()).getStatus().getSuccessIndicator().value() + " - " + ((CreateBconPhysicUnitResponse)createBconPhysicUnitResponse.get()).getStatus().getMessages());
                    } else {
                      System.out.println(((CreateBconPhysicUnitResponse)createBconPhysicUnitResponse.get()).getStatus().getSuccessIndicator().value());
                    }
                    break;
                
                case "-r":
                    String columName = args[8];
                    String criteriaValue = args[9];
                    String operand = args[10];
                    
            
                    Response<ViewtheResultsofaBCONunitResponse> viewtheResultsofaBCONunitResponse = FactoryService.ViewtheResultsofaBCONunit(ip, username, password, company, columName, criteriaValue, operand);
           
                    if ((((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getMessages() != null) && (((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getMessages().size() > 0)) {
                      System.out.println(((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getSuccessIndicator().value() + " - " + ((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getMessages());
                    } else {
                      System.out.println(((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getStatus().getSuccessIndicator().value());
                    
                      ListIterator<BUILDCONTROLRESULTSType> itr = ((ViewtheResultsofaBCONunitResponse)viewtheResultsofaBCONunitResponse.get()).getBUILDCONTROLRESULTSType().listIterator();
                        while (itr.hasNext()){
                              ListIterator<BUILDCONTROLRESULTSType.GBUILDCONTROLRESULTSDetailType.MBUILDCONTROLRESULTSDetailType> datos = itr.next().getGBUILDCONTROLRESULTSDetailType().getMBUILDCONTROLRESULTSDetailType().listIterator();
                              while (datos.hasNext()){
                                   MBUILDCONTROLRESULTSDetailType dat = datos.next();
                                   if(dat.getID() != null && !dat.getID().getValue().isEmpty()){
                                     System.out.println("ID " + dat.getID().getValue() );    
                                   }
                                   if(dat.getACTIVITY() != null && !dat.getACTIVITY().getValue().isEmpty()){
                                     System.out.println("ACTIVITY " + dat.getACTIVITY().getValue() );    
                                   }
                                   if(dat.getHDRLIT() != null && !dat.getHDRLIT().getValue().isEmpty()){
                                     System.out.println("HDRLIT " + dat.getHDRLIT().getValue() );    
                                   }
                                   if(dat.getPackageName() != null && !dat.getPackageName().getValue().isEmpty()){
                                     System.out.println("PACKAGENAME " + dat.getPackageName().getValue() );    
                                   }
                                   if(dat.getProcessInfo() != null && !dat.getProcessInfo().getValue().isEmpty()){
                                     System.out.println("PROCESSINFO " + dat.getProcessInfo().getValue() );    
                                   }
                                     
                             }
                        }
                    }
                    
                    break;    
                    
                    
                    
                    
            }  //FINALIZAR COMENTARIO AQUI PARA PRUEBAS
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Cantidad parámetros incorrectos. " + e);
    }
    catch (InterruptedException ex)
    {
          System.out.println("error uno " + ex.getMessage());
    }
    catch (ExecutionException ex)
    {
      System.out.println("error dos " + ex.getMessage());
    }
    finally {}
  }
    }


