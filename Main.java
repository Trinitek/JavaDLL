
import com.sun.jna.Native;

public class Main {

    public static void main(String args[]) {
        
        TestLibrary lib = (TestLibrary) Native.loadLibrary("library", TestLibrary.class);
        
        System.out.println(lib.getHelloString());
        
        lib.talk();
        
    }

}

