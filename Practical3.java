public class Practical3 {
    public static void main(String[] args) {

        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt;
        int unboxedInt = wrapperInt;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxedInt);

        String strNum = "123";
        int parsedInt = Integer.parseInt(strNum);
        System.out.println("Parsed int from String: " + parsedInt);

        Integer obj1 = 100;
        Integer obj2 = 100;
        System.out.println("Wrapper comparison (==): " + (obj1 == obj2));
        System.out.println("Wrapper comparison (equals): " + obj1.equals(obj2));

        String s1 = "Hello";
        s1.concat(" World");
        System.out.println("String after concat: " + s1);

        String s2 = s1.concat(" World");
        System.out.println("New String: " + s2);

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("StringBuffer after append: " + sb);

        System.out.println("StringBuffer capacity: " + sb.capacity());
        sb.ensureCapacity(50);
        System.out.println("Updated capacity: " + sb.capacity());
    }
}
