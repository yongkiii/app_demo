package com.example.appdemo;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import android.os.StrictMode;
import  org.ksoap2.serialization.SoapPrimitive;

public class CallWCF {
    static String ns = "http://tempuri.org/";
    static String methodname ="Reg";
    static String soapaction = "http://tempuri.org/IService/Reg";
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


}