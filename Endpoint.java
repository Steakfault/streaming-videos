import java.util.ArrayList;

/**
 *  ​ Represents a group of users connecting to the Internet in the same geographical area
 */

public class Endpoint {

  // ID referencing the endpoint
  private int id;

  // Latency to the data center
  private int dataLatency;

  // List of cache servers
  private ArrayList<Cache> caches;

  // List of latencies for each cache server
  private ArrayList<Integer> cacheLatencies;



  // Constructor
  public Endpoint(int id)
  {
    this.id = id;
    this.caches = new ArrayList<Cache>();
  }

  // Adds a cache and a latency to each respective list
  public void addCache(Cache c, int l)
  {
    this.caches.add(c);
    this.cacheLatencies.add(l);
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
