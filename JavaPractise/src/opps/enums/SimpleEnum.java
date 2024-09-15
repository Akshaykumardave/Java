package opps.enums;

enum Size {
    SMALL, MEDIUM, LARGE, XL
}

public class SimpleEnum {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);

        System.out.println(Size.SMALL.ordinal());

        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));

        System.out.println(Size.SMALL.name());
        System.out.println(Size.valueOf("SMALL"));

        Size[] enumArr = Size.values();
        for (Size enumItem : enumArr) {
            System.out.println(enumItem);
        }

    }

}
