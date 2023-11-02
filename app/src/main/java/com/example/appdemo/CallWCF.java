package com.example.appdemo;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import android.os.StrictMode;
import  org.ksoap2.serialization.SoapPrimitive;

public class CallWCF {
    static String ns = "http://tempuri.org/";//gg
    static String methodname ="Reg";
    static String methodname1 = "Login";
    static String methodname2 = "Logout";
    static String methodname3 = "UnReg";
    static String soapaction1 ="http://tempuri.org/IService/Login";
    static String soapaction = "http://tempuri.org/IService/Reg";
    static String soapaction2 = "http://tempuri.org/IService/Logout";
    static String soapaction3 = "http://tempuri.org/IService/UnReg";
    static String url = "http://192.168.0.4/HomeworkService/Service.svc";
    public String Reg(String id,String pw,String name)
    {
        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            SoapObject request = new SoapObject(ns, methodname);
            request.addProperty("id", id);
            request.addProperty("pw", pw);
            request.addProperty("name", name);

            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.dotNet = true;
            envelope.setOutputSoapObject(request);

            HttpTransportSE hts = new HttpTransportSE(url);
            hts.call(soapaction, envelope);

            SoapPrimitive result = (SoapPrimitive) envelope.getResponse();
            return String.valueOf(result);
        }
        catch (Exception e) {
            return "예외"+e.getMessage();
        }
    }
    public String Login(String id, String pw)
    {
        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            SoapObject request1 = new SoapObject(ns, methodname1);
            request1.addProperty("id", id);
            request1.addProperty("pw", pw);


            SoapSerializationEnvelope envelope1 = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope1.dotNet = true;
            envelope1.setOutputSoapObject(request1);

            HttpTransportSE hts = new HttpTransportSE(url);
            hts.call(soapaction1, envelope1);

            SoapPrimitive result1 = (SoapPrimitive) envelope1.getResponse();
            return String.valueOf(result1);
        }
        catch (Exception e) {
            return "예외"+e.getMessage();
        }
    }
    public String Logout(String id, String pw)
    {
        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            SoapObject request2 = new SoapObject(ns, methodname2);
            request2.addProperty("id", id);
            request2.addProperty("pw", pw);


            SoapSerializationEnvelope envelope2 = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope2.dotNet = true;
            envelope2.setOutputSoapObject(request2);

            HttpTransportSE hts = new HttpTransportSE(url);
            hts.call(soapaction2, envelope2);

            SoapPrimitive result1 = (SoapPrimitive) envelope2.getResponse();
            return String.valueOf(result1);
        }
        catch (Exception e) {
            return "예외"+e.getMessage();
        }
    }
    public String UnReg(String id, String pw)
    {
        StrictMode.ThreadPolicy policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        try {
            SoapObject request1 = new SoapObject(ns, methodname3);
            request1.addProperty("id", id);
            request1.addProperty("pw", pw);


            SoapSerializationEnvelope envelope1 = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope1.dotNet = true;
            envelope1.setOutputSoapObject(request1);

            HttpTransportSE hts = new HttpTransportSE(url);
            hts.call(soapaction3, envelope1);

            SoapPrimitive result1 = (SoapPrimitive) envelope1.getResponse();
            return String.valueOf(result1);
        }
        catch (Exception e) {
            return "예외"+e.getMessage();
        }
    }



}