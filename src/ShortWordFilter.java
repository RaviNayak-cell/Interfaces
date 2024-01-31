
public class ShortWordFilter implements InterfaceFilter{
    @Override
    public boolean accept(Object x) {
        String p = (String) x;
        return p.length() < 5;
    }
}