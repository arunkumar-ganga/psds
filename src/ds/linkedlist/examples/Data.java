package ds.linkedlist.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by arun.kumarg on 23/07/16.
 */
public class Data {

  private String country;
  //private String destCountry;
  private int srctotal;

  private int tarTotal;


  public int getSrctotal() {
    return srctotal;
  }

  public int getTarTotal() {
    return tarTotal;
  }

  public void setTarTotal(int tarTotal) {
    this.tarTotal = tarTotal;
  }

  public void setSrctotal(int srctotal) {
    this.srctotal = srctotal;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Data data = (Data) o;

    if (country != null ? !country.equals(data.country) : data.country != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return country != null ? country.hashCode() : 0;
  }

  public void merge(Data other){
    this.tarTotal = this.tarTotal == 0 ? other.tarTotal : this.tarTotal;
    this.srctotal = this.srctotal == 0 ? other.srctotal : this.srctotal;
  }

  @Override
  public String toString() {
    return "Data{" +
           "country='" + country + '\'' +
           ", srctotal=" + srctotal +
           ", tarTotal=" + tarTotal +
           '}';
  }
}


