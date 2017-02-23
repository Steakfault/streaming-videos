import java.util.ArrayList;

/**
 *  ​ Represents a group of users connecting to the Internet in the same geographical area
 */

public class Endpoint {

  // ID referencing the endpoint
  private int id;

  // List of cache servers
  private ArrayList<Cache> caches;


  // Constructor
  public Endpoint(int id)
  {
    this.id = id;
    this.caches = new ArrayList<Cache>();
  }

  public int getId()
  {
    return this.id;
  }

  public ArrayList<Cache> getCaches()
  {
    return this.caches;
  }

}
