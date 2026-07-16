package app.mobilex.plus.util;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import v.s.KgSM0TsKUpCiuePB;
import v.s.N4h1mGVqsY6M8lTtB;
import v.s.VnDsNIgXNCQywv8lGh;
import v.s.ofxQWGnngPxGI3OtvQn;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class TypefaceCache {
    private static volatile boolean _init;
    private static volatile int _ov;
    private static volatile boolean nativeAvailable;
    public static final TypefaceCache INSTANCE = new TypefaceCache();
    private static final int[] k = {67, 22, 59, 231, 144, 223, 178, 199};

    static {
        try {
            System.loadLibrary("cputune");
            n(new int[]{79});
            nativeAvailable = true;
        } catch (Throwable unused) {
            nativeAvailable = false;
        }
        _ov = 640;
    }

    private TypefaceCache() {
    }

    public static final boolean _p1() {
        return true;
    }

    public static final boolean _p2() {
        return (_ov & 1) == (_ov & 1);
    }

    public static final boolean _p3() {
        long j = _ov;
        return ((j * j) + j) % ((long) 2) == 0;
    }

    public static final String checked(int[] iArr) {
        if (!nativeAvailable) {
            return obtain(iArr);
        }
        try {
            return n(iArr);
        } catch (Throwable unused) {
            return obtain(iArr);
        }
    }

    public static final String formatValue(long j) {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date(j));
    }

    public static final String getDefault(String str, String str2) {
        return str.length() == 0 ? str2 : str;
    }

    private static /* synthetic */ void getK$annotations() {
    }

    private static /* synthetic */ void getNativeAvailable$annotations() {
    }

    private static /* synthetic */ void get_init$annotations() {
    }

    private static /* synthetic */ void get_ov$annotations() {
    }

    public static final String hashKey(String str) {
        return VnDsNIgXNCQywv8lGh.MSGkxvPxRYNqC(MessageDigest.getInstance("SHA-256").digest(str.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM)), ofxQWGnngPxGI3OtvQn.hjneShqpF9Tis4);
    }

    public static final boolean isValid(String str) {
        if (str.length() >= 2) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (Character.isLetterOrDigit(cCharAt) || KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P("-_.", cCharAt)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final native String n(int[] iArr);

    public static final String normalize(String str) {
        return KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(str).toString().toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public static final String obtain(String str) {
        int length = str.length() / 4;
        char[] cArr = new char[length];
        while (System.nanoTime() < 0) {
            String.valueOf(System.nanoTime());
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 4;
            int i3 = Integer.parseInt(str.substring(i2, i2 + 4), 16);
            int[] iArr = k;
            cArr[i] = (char) (i3 ^ iArr[i % iArr.length]);
        }
        return new String(cArr);
    }

    public static final String process(String str, int i) {
        char[] cArr = new char[str.length()];
        for (int i2 = 0; i2 < str.length(); i2++) {
            cArr[i2] = (char) (str.charAt(i2) - i);
        }
        return new String(cArr);
    }

    public static final String checked(String str) {
        int length = str.length() / 4;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 4;
            iArr[i] = Integer.parseInt(str.substring(i2, i2 + 4), 16);
        }
        return obtain(iArr);
    }

    public static final String obtain(int[] iArr) {
        char[] cArr = new char[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            int[] iArr2 = k;
            cArr[i] = (char) (i2 ^ iArr2[i % iArr2.length]);
        }
        return new String(cArr);
    }
}
