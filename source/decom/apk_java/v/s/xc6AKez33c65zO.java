package v.s;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class xc6AKez33c65zO {
    public static final char[] D5P1xCAyuvgF = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final int Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final String b1EoSIRjJHO5;
    public final String dDIMxZXP1V8HdM;
    public final String ibVTtJUNfrGYbW;
    public final boolean pyu8ovAipBTLYAiKab;
    public final String vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final List xDyLpEZyrcKVe0;

    public xc6AKez33c65zO(String str, String str2, String str3, String str4, int i, ArrayList arrayList, String str5, String str6) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = str2;
        this.vekpFI4d1Nc4fakF = str3;
        this.JXn4Qf7zpnLjP5 = str4;
        this.Ee8d2j4S9Vm5yGuR = i;
        this.xDyLpEZyrcKVe0 = arrayList;
        this.ibVTtJUNfrGYbW = str5;
        this.b1EoSIRjJHO5 = str6;
        this.pyu8ovAipBTLYAiKab = okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, "https");
    }

    private static /* synthetic */ void vlumjrw() {
    }

    public final String Ee8d2j4S9Vm5yGuR() {
        if (this.w9sT1Swbhx3hs.length() == 0) {
            return "";
        }
        int length = this.dDIMxZXP1V8HdM.length() + 3;
        String str = this.b1EoSIRjJHO5;
        return str.substring(length, yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR(length, str.length(), str, ":@"));
    }

    public final String JXn4Qf7zpnLjP5() {
        if (this.xDyLpEZyrcKVe0 == null) {
            return null;
        }
        String str = this.b1EoSIRjJHO5;
        int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str, '?', 0, 6) + 1;
        return str.substring(iJW3Lh9hxwLsO2ArTlH, yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(str, '#', iJW3Lh9hxwLsO2ArTlH, str.length()));
    }

    public final String dDIMxZXP1V8HdM() {
        if (this.vekpFI4d1Nc4fakF.length() == 0) {
            return "";
        }
        int length = this.dDIMxZXP1V8HdM.length() + 3;
        String str = this.b1EoSIRjJHO5;
        return str.substring(KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str, ':', length, 4) + 1, KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str, '@', 0, 6));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xc6AKez33c65zO) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(((xc6AKez33c65zO) obj).b1EoSIRjJHO5, this.b1EoSIRjJHO5);
    }

    public final int hashCode() {
        return this.b1EoSIRjJHO5.hashCode();
    }

    public final URI ibVTtJUNfrGYbW() {
        String strSubstring;
        JVe8d5JCsGlrBZvcax jVe8d5JCsGlrBZvcax = new JVe8d5JCsGlrBZvcax();
        String str = this.dDIMxZXP1V8HdM;
        jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM = str;
        jVe8d5JCsGlrBZvcax.w9sT1Swbhx3hs = Ee8d2j4S9Vm5yGuR();
        jVe8d5JCsGlrBZvcax.vekpFI4d1Nc4fakF = dDIMxZXP1V8HdM();
        jVe8d5JCsGlrBZvcax.JXn4Qf7zpnLjP5 = this.JXn4Qf7zpnLjP5;
        int i = 19 - 20;
        int i2 = str.equals("http") ? 80 : str.equals("https") ? 443 : i;
        int i3 = this.Ee8d2j4S9Vm5yGuR;
        if (i3 != i2) {
            i = i3;
        }
        jVe8d5JCsGlrBZvcax.Ee8d2j4S9Vm5yGuR = i;
        ArrayList arrayList = jVe8d5JCsGlrBZvcax.xDyLpEZyrcKVe0;
        arrayList.clear();
        arrayList.addAll(vekpFI4d1Nc4fakF());
        String strJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5();
        jVe8d5JCsGlrBZvcax.ibVTtJUNfrGYbW = strJXn4Qf7zpnLjP5 != null ? fEyMFFyOOvHURJ7To6L.Qrz92kRPw4GcghAc(fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(0, 0, 211, strJXn4Qf7zpnLjP5, " \"'<>#")) : null;
        if (this.ibVTtJUNfrGYbW == null) {
            strSubstring = null;
        } else {
            String str2 = this.b1EoSIRjJHO5;
            strSubstring = str2.substring(KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str2, '#', 0, 6) + 1);
        }
        jVe8d5JCsGlrBZvcax.b1EoSIRjJHO5 = strSubstring;
        String str3 = jVe8d5JCsGlrBZvcax.JXn4Qf7zpnLjP5;
        jVe8d5JCsGlrBZvcax.JXn4Qf7zpnLjP5 = str3 != null ? Pattern.compile("[\"<>^`{|}]").matcher(str3).replaceAll("") : null;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.set(i4, fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(0, 0, 227, (String) arrayList.get(i4), "[]"));
        }
        ArrayList arrayList2 = jVe8d5JCsGlrBZvcax.ibVTtJUNfrGYbW;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                String str4 = (String) arrayList2.get(i5);
                arrayList2.set(i5, str4 != null ? fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(0, 0, 240 - 45, str4, "\\^`{|}") : null);
            }
        }
        String str5 = jVe8d5JCsGlrBZvcax.b1EoSIRjJHO5;
        jVe8d5JCsGlrBZvcax.b1EoSIRjJHO5 = str5 != null ? fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(0, 0, 163, str5, " \"#<>\\^`{|}") : null;
        String string = jVe8d5JCsGlrBZvcax.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").matcher(string).replaceAll(""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.b1EoSIRjJHO5;
    }

    public final ArrayList vekpFI4d1Nc4fakF() {
        int length = this.dDIMxZXP1V8HdM.length() + 3;
        String str = this.b1EoSIRjJHO5;
        int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str, '/', length, 4);
        int iEe8d2j4S9Vm5yGuR = yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR(iJW3Lh9hxwLsO2ArTlH, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iJW3Lh9hxwLsO2ArTlH < iEe8d2j4S9Vm5yGuR) {
            int i = iJW3Lh9hxwLsO2ArTlH + 1;
            int iXDyLpEZyrcKVe0 = yrMnf4fyLGfIJbMg8IbG.xDyLpEZyrcKVe0(str, '/', i, iEe8d2j4S9Vm5yGuR);
            arrayList.add(str.substring(i, iXDyLpEZyrcKVe0));
            iJW3Lh9hxwLsO2ArTlH = iXDyLpEZyrcKVe0;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [char, int] */
    public final String w9sT1Swbhx3hs() {
        int length = this.dDIMxZXP1V8HdM.length() + 3;
        String str = this.b1EoSIRjJHO5;
        int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(str, 127 - 80, length, 4);
        return str.substring(iJW3Lh9hxwLsO2ArTlH, yrMnf4fyLGfIJbMg8IbG.Ee8d2j4S9Vm5yGuR(iJW3Lh9hxwLsO2ArTlH, str.length(), str, "?#"));
    }

    public final String xDyLpEZyrcKVe0() {
        JVe8d5JCsGlrBZvcax jVe8d5JCsGlrBZvcax;
        try {
            jVe8d5JCsGlrBZvcax = new JVe8d5JCsGlrBZvcax();
            jVe8d5JCsGlrBZvcax.vekpFI4d1Nc4fakF(this, "/...");
        } catch (IllegalArgumentException unused) {
            jVe8d5JCsGlrBZvcax = null;
        }
        jVe8d5JCsGlrBZvcax.getClass();
        jVe8d5JCsGlrBZvcax.w9sT1Swbhx3hs = fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        jVe8d5JCsGlrBZvcax.vekpFI4d1Nc4fakF = fEyMFFyOOvHURJ7To6L.ibVTtJUNfrGYbW(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return jVe8d5JCsGlrBZvcax.dDIMxZXP1V8HdM().b1EoSIRjJHO5;
    }
}
