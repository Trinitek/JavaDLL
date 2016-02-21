
import com.sun.jna.Library;

public interface TestLibrary extends Library {
    public String getHelloString();
    public void talk();
}
