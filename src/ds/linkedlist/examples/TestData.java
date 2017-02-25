package ds.linkedlist.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by arun.kumarg on 23/07/16.
 */
public class TestData {
  List<Data> d1 = new ArrayList<Data>();
  List<Data> d2 = new ArrayList<Data>();

  public void generate(){

    Data  a  = new Data();
    a.setCountry("AA");
    a.setSrctotal(201);

    Data  b  = new Data();
    b.setCountry("BB");
    b.setSrctotal(202);

    Data  c  = new Data();
    c.setCountry("CC");
    c.setSrctotal(203);

    d1.add(a);
    d1.add(b);
    d1.add(c);


    Data  e = new Data();
    e.setCountry("AA");
    e.setTarTotal(204);

    Data  f  = new Data();
    f.setCountry("BB");
    f.setTarTotal(205);

    Data  g  = new Data();
    g.setCountry("DD");
    g.setTarTotal(206);

    d2.add(e);
    d2.add(f);
    d2.add(g);

  }

  public HashMap<String,Data> processData1(){
    HashMap<String,Data> completeData = new HashMap<String, Data>();

    for(Data data : d1){
      completeData.put(data.getCountry(),data);
    }

    for(Data data: d2){
      if(completeData.get(data.getCountry()) == null){
        completeData.put(data.getCountry(),data);
      }else{
        completeData.get(data.getCountry()).merge(data);
      }
    }

    return completeData;

  }

  public static void main(String[] args) {

    TestData testData = new TestData();

    testData.generate();
    HashMap<String,Data> result1 = testData.processData1();

    for (Map.Entry<String, Data> entry : result1.entrySet())
    {
      System.out.println(entry.getKey() + "/" + entry.getValue());
    }



  }

}
