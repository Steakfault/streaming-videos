import java.util.ArrayList;

/**
 * Created by Yarillo on 23/02/2017.
 *
 * @author      Team SteakFault
 * @version     0.1
 * @since       2017/02/23
 */

public class OutFile {
    protected ArrayList videos = new ArrayList< ArrayList<Integer> >();
    private int[] linking;
    private int nCacheServers;

    private int addCache(int id) {
        ArrayList cacheServer = new ArrayList();
        this.videos.add(cacheServer);
        return this.videos.size() - 1;
    }

    public Boolean addVideo(int cacheID, int videoID) {
        if (this.linking.length <= cacheID){
            return false;
        }
        //todo
        if (this.linking[cacheID] == -1){
            this.linking[cacheID] = addCache(cacheID);
        }

        ArrayList sublist = (ArrayList)this.videos.get(this.linking[cacheID]);
        sublist.add(videoID);
        return true;
    }

    public OutFile(String filename, int cacheServers) {
        String fs;
        this.nCacheServers = cacheServers;
        this.linking = new int[cacheServers];
        for (int i = 0; i < this.linking.length; i++) {
            this.linking[i] = -1;
        }

        this.addVideo(0, 1);
        this.addVideo(7, 8);
        this.addVideo(7, 19);
        System.out.println(this.videos);
    }


}
