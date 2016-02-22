
import com.sun.jna.Library;
import com.sun.jna.Native;

public class Main {

    public interface TestLibrary extends Library {
        public String getHelloString();
        public void talk();
    }

    public static void main(String args[]) {
        
        TestLibrary lib = (TestLibrary) Native.loadLibrary("library", Main.TestLibrary.class);
        
        System.out.print(lib.getHelloString());
        
        lib.talk();
        
    }

}

