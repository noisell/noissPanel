package v.s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class VnDsNIgXNCQywv8lGh extends SbxdZ6Kq2uhHQ5RPRqm {
    public static void A1BaTVAMeIXMnh(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static String MSGkxvPxRYNqC(byte[] bArr, deLJ4Z0aL3hcJ3O1 delj4z0al3hcj3o1) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) delj4z0al3hcj3o1.pyu8ovAipBTLYAiKab(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String VEkRsTDS6a9oHWI(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            FZ1sl4mHq4J0hOEYC.dDIMxZXP1V8HdM(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static void euF5Udt5Rqv3Qmea(Object[] objArr, o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok) {
        Arrays.fill(objArr, 0, objArr.length, o0rn3ekjbj6kkwok);
    }

    public static void hV4VTKNUdeHN(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static List jdOQeRk37T35X5xKW1P(byte[] bArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Requested element count ", " is less than zero.", i).toString());
        }
        if (i != 0) {
            int i2 = 0;
            if (i < bArr.length) {
                if (i == 1) {
                    return Collections.singletonList(Byte.valueOf(bArr[0]));
                }
                ArrayList arrayList = new ArrayList(i);
                int length = bArr.length;
                int i3 = 0;
                while (i2 < length) {
                    arrayList.add(Byte.valueOf(bArr[i2]));
                    i3++;
                    if (i3 == i) {
                        break;
                    }
                    i2++;
                }
                return arrayList;
            }
            int length2 = bArr.length;
            if (length2 != 0) {
                if (length2 == 1) {
                    return Collections.singletonList(Byte.valueOf(bArr[0]));
                }
                ArrayList arrayList2 = new ArrayList(bArr.length);
                int length3 = bArr.length;
                while (i2 < length3) {
                    arrayList2.add(Byte.valueOf(bArr[i2]));
                    i2++;
                }
                return arrayList2;
            }
        }
        return qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
    }

    public static void k84rwRrqzhrNQ1CdNQ9(byte[] bArr, byte[] bArr2, int i, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static ArrayList qfTrc75xwRVMl85vh(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
