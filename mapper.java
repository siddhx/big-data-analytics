import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text; //a hadoop data type
import org.apache.hadoop.mapreduce.Mapper;

//parameterized 
public class WordMapper extends Mapper<LongWritable, Text, Text,
IntWritable> {

	@Override //this is an annotation
	public void map(LongWritable key, Text value, Context context)
		throws IOException, InterruptedException {
	
		String line = value.toString();
	
		for (String word : line.split("\\W+")) {
			if (word.length() > 0) {

				context.write(new Text(word), new IntWritable(1));
			}
		}
	}
}