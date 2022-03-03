package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value_sol;

import java.util.Objects;

// java 14 부터는 record 클래스 사용하면 바로 끝
// record 는 setter는 없지만, 빌더를 통해 chaining도 가능하게 변경 가능
//public  record TelephoneNumber(String areaCode, String number) {
//}

public class TelephoneNumber {

    private final String areaCode;

    private final String number;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String areaCode() {
        return areaCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return Objects.equals(areaCode, that.areaCode) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    public String number() {
        return number;
    }
}
