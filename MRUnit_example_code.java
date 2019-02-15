import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mrunit.mapreduce.MapDriver;
import org.junit.Before;
import org.junit.Test;
public class TestWordCount {
	MapDriver<LongWritable, Text, Text, IntWritable> mapDriver;

	@Before
	public void setUp() {
		WordMapper mapper = new WordMapper();
		mapDriver = new MapDriver<LongWritable, Text, Text, IntWritable>();
		mapDriver.setMapper(mapper);
	}

	@Test
	public void testMapper() {
		mapDriver.withInput(new LongWritable(1), new Text("cat dog"));
		mapDriver.withOutput(new Text("cat"), new IntWritable(1));
		mapDriver.withOutput(new Text("dog"), new IntWritable(1));
		mapDriver.runTest();
	}
}