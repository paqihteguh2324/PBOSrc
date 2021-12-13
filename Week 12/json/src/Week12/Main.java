package Week12;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args){
        JSONParser jp = new JSONParser();

        try {
            Object object = jp.parse(new FileReader("D:\\Semester 3\\PBO\\Week 12\\json\\src\\Week12\\barang.json"));
            JSONObject jso = (JSONObject) object;

            JSONObject status = (JSONObject) jso.get("status");
            JSONObject servicePackage = (JSONObject) jso.get("servicePackage");
            JSONObject city = (JSONObject) jso.get("city");
            JSONObject status1 = (JSONObject) jso.get("status1");
            JSONObject servicePackage1 = (JSONObject) jso.get("servicePackage1");
            JSONObject city1 = (JSONObject) jso.get("city1");

            List<Object> cd = new ArrayList<Object>();
            cd.add(status.get("code"));
            cd.add(status1.get("code1"));
            List<String> des = new ArrayList<String>();
            des.add((String) status.get("description"));
            des.add((String) status1.get("description1"));
            List<String> serv = new ArrayList<String>();
            serv.add((String) servicePackage.get("service"));
            serv.add((String) servicePackage1.get("service1"));
            List<Long> val = new ArrayList<Long>();
            val.add((Long) servicePackage.get("value"));
            val.add((Long) servicePackage1.get("value1"));
            List<String> ori = new ArrayList<String>();
            ori.add((String) city.get("origin"));
            ori.add((String) city1.get("origin1"));
            List<String> dest = new ArrayList<String>();
            dest.add((String) city.get("destination"));
            dest.add((String) city1.get("destination1"));
            List<Long> wei = new ArrayList<Long>();
            wei.add((Long) jso.get("weight"));
            wei.add((Long) jso.get("weight1"));
            List<Long> quan = new ArrayList<Long>();
            quan.add((Long) jso.get("quantity"));
            quan.add((Long) jso.get("quantity1"));
            List<Long> price = new ArrayList<Long>();
            price.add((Long) jso.get("priceItem"));
            price.add((Long) jso.get("priceItem1"));
            List<String> product = new ArrayList<String>();
            product.add((String) jso.get("productName"));
            product.add((String) jso.get("productName1"));



            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            Object rowData[][] = { {product.get(0), quan.get(0), wei.get(0), ori.get(0),
                    dest.get(0), serv.get(0), val.get(0), price.get(0)},
                    {product.get(1), quan.get(1), wei.get(1), ori.get(1),
                            dest.get(1), serv.get(1), val.get(1), price.get(1)}};

            Object columnNames[] = { "ProductName", "Quantity", "Weight", "Origin", "Destination",
                    "Service", "Value", "Total"};
            JTable table = new JTable( rowData, columnNames);

            JScrollPane scrollPane = new JScrollPane(table);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.setSize(400, 500);
            frame.setVisible(true);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
