import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Work {

	private InFile in;
	private String results = "";

	public Work(InFile in) {
		this.in = in;
		this.results += in.getCache();
	}

	public String getResults() {
		return this.results;
	}

	public void printResults() {
		System.out.println(this.getResults());
	}

	public void out(String filename) {
		Writer writer = null;

		try {
			writer = new BufferedWriter(new FileWriter("./output/" + filename + ".out"));
			writer.write(this.results);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) try {
				writer.close();
			} catch (IOException ignore) {}
		}

	}

}