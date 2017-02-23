/**
 * Represents a cache server
 */

public class Cache
{
  // ID referencing the cache
  private int id;

  // Size of the cache server in megabytes
  private int size;


  // Constructor
  public Cache(int id, int size)
  {
    this.id = id;
    this.size = size;
  }

  public int getId()
  {
    return this.id;
  }

  public int getSize()
  {
    return this.size;
  }

}
