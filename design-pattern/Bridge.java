import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Bridge {
    
    abstract class Binatang {
        abstract String getName();
    }

    /**
     * BinatangDarat
     */
    public interface BinatangDarat {
    
        
    }
    public interface BinatangAir {
    
        
    }

    /**
     * Anjing
     */
    public class Anjing extends Binatang implements BinatangDarat {

        @Override
        String getName() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getName'");
        }
    
        
    }
    public class Hiu extends Binatang implements BinatangAir {

        @Override
        String getName() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getName'");
        }
    
        
    }
    
    
    public static boolean isDarat(Binatang binatang) {
        return binatang instanceof BinatangDarat;





        
    }

    /**
     * BridgeApp
     */
    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        Anjing anjing =   bridge.new Anjing();
        boolean isDarat = anjing instanceof BinatangDarat;
        System.out.println(isDarat);

        Hiu hiu = bridge.new Hiu();
        boolean isAir = hiu instanceof BinatangAir;
        System.out.println(isAir);
    }
}