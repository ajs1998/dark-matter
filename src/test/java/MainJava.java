
@SuppressWarnings(value = "deprecation")
public class MainJava {

    private static final int staticField1 = 123;
    private final String field2;
    private final String field3;

    public MainJava(String field2) {
        this.field2 = field2;
        this.field3 = "\tA string with\nescaped characters";
    }

    @Deprecated
    public String function(int param1, String param2) {
        System.out.println(this.field2);
        int unused = Math.floorMod(1, 2);
        int localVariable = 4;
        int reassigned = 5;
        reassigned--;

        StringBuilder sb = new StringBuilder();
        sb.append(localVariable);
        sb.append(reassigned);
        sb.append(param1);
        sb.append(param2);
        return sb.toString();
    }

    /**
     * Javadocs
     *
     * @param args the args
     */
    public static void main(String[] args) {
        System.out.println(staticField1);
        System.out.println("Hello, world!");
    }

}
