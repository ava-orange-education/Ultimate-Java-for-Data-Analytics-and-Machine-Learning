import edu.stanford.nlp.pipeline.*;
import edu.stanford.nlp.ling.*;

import java.util.*;

public class POSTaggingExample {
    public static void main(String[] args) {
        String text = "This is a simple sentence.";

        // set up pipeline properties
        Properties props = new Properties();
        // set the list of annotators to run
        props.setProperty("annotators", "tokenize,ssplit,pos");
        // build pipeline
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);
        // create a document object
        CoreDocument doc = new CoreDocument(text);
        // annotate the document
        pipeline.annotate(doc);
        
        // view results
        for (CoreLabel tok : doc.tokens()) {
            System.out.println(String.format("Token: %s, POS: %s", tok.word(), tok.tag()));
        }
    }
}
