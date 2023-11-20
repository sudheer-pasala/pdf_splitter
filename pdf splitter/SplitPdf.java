import org.apache.pdfbox.multipdf.Splitter;   
import org.apache.pdfbox.pdmodel.PDDocument;  
import java.io.File;   
import java.io.IOException;   
import java.util.List;   
import java.util.Iterator;  
  
public class SplitsPdfDemo {  
      
    public static void main(String[] args)throws IOException {  
                  
        //Loading an existing PDF document  
          File file = new File("//eclipse-workspace/blanck.pdf");  
          PDDocument document = PDDocument.load(file);   
  
    // Create a Splitter object  
          Splitter splitter = new Splitter();  
  
    //splitting the pages of a PDF document  
          List<PDDocument>Pages = splitter.split(document);  
  
    //Creating an iterator object  
          Iterator<PDDocument>iterator = Pages.listIterator();  
  
    //saving splits as individual PDF document  
    inti = 1;  
    while(iterator.hasNext()) {  
             PDDocument pd = iterator.next();  
    pd.save("/eclipse-workspace/blanck"+ i++ +".pdf");  
          }  
          System.out.println("Multiple PDF files are created successfully.");  
    document.close();  
    }  
}  