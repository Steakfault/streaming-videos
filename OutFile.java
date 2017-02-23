import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * @author      Team SteakFault
 * @version     0.1
 * @since       2017/02/23
 */

public class OutFile {
    protected ArrayList videos = new ArrayList< ArrayList<Integer> >();
	private int[] linking;
    private int nCacheServers;
    private int usedCacheServers;

    private int addCache(int id) {
        ArrayList cacheServer = new ArrayList();
        this.videos.add(cacheServer);
        this.usedCacheServers = this.usedCacheServers + 1;
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

    public OutFile(int cacheServers) {
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

	public Boolean writeTo(String path) {
		Writer writer = null;
		String fs = String.format("%d\n", this.usedCacheServers);

		for (int i = 0; i < this.linking.length; i++) {
			if (this.linking[i] != -1){
				fs = fs + String.format("%d", i);
				ArrayList sublist = (ArrayList)this.videos.get(this.linking[i]);
				for (int j = 0; j < sublist.size(); j++) {
					fs = fs + String.format(" %d", sublist.get(j));
				}
				fs = fs + "\n";
			}
		}

		try {
			writer = new BufferedWriter(new FileWriter(path));
			writer.write(fs);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) try {
				writer.close();
			} catch (IOException ignore) {}
		}
		return true;
	}
}
