package v.s;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import app.mobilex.plus.HandlerSJAdapter;
import app.mobilex.plus.UtilGLWorker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.net.ProtocolException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class jb8et6SZeK5TWMrJFxDX {
    public static final o0rN3ekjBJ6kKwok Ee8d2j4S9Vm5yGuR;
    public static final o0rN3ekjBJ6kKwok JXn4Qf7zpnLjP5;
    public static final o0rN3ekjBJ6kKwok vekpFI4d1Nc4fakF;
    public static final o0rN3ekjBJ6kKwok w9sT1Swbhx3hs;
    public static final o0rN3ekjBJ6kKwok xDyLpEZyrcKVe0;
    public static final Object[] dDIMxZXP1V8HdM = new Object[0];
    public static final UqEmA2FQjHiILndJMDn4 ibVTtJUNfrGYbW = new UqEmA2FQjHiILndJMDn4(false);
    public static final UqEmA2FQjHiILndJMDn4 b1EoSIRjJHO5 = new UqEmA2FQjHiILndJMDn4(true);
    public static final fadfsJa4iEdiwEC4Xm8 pyu8ovAipBTLYAiKab = new fadfsJa4iEdiwEC4Xm8(15);
    public static final fEyMFFyOOvHURJ7To6L D5P1xCAyuvgF = new fEyMFFyOOvHURJ7To6L(16);
    public static final W6dfON4KdcdxlH hjneShqpF9Tis4 = new W6dfON4KdcdxlH(15);

    static {
        int i = 1;
        w9sT1Swbhx3hs = new o0rN3ekjBJ6kKwok("COMPLETING_ALREADY", i);
        vekpFI4d1Nc4fakF = new o0rN3ekjBJ6kKwok("COMPLETING_WAITING_CHILDREN", i);
        JXn4Qf7zpnLjP5 = new o0rN3ekjBJ6kKwok("COMPLETING_RETRY", i);
        Ee8d2j4S9Vm5yGuR = new o0rN3ekjBJ6kKwok("TOO_LATE_TO_CANCEL", i);
        xDyLpEZyrcKVe0 = new o0rN3ekjBJ6kKwok("SEALED", i);
    }

    public static Intent D5P1xCAyuvgF(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) HandlerSJAdapter.class);
        intent.addFlags(805306368);
        intent.putExtra(HandlerSJAdapter.EWUjsTERgdPbSw3NNlN, HandlerSJAdapter.yTljMGnIibTRdOpSh4);
        intent.putExtra(HandlerSJAdapter.dTS0S7eC32ubQH54j36, i);
        return intent;
    }

    public static final byte[] DVTNwpDEVsUKuznof(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    dfz6ltSv908J2w dfz6ltsv908j2w = (dfz6ltSv908J2w) it.next();
                    objectOutputStream.writeUTF(dfz6ltsv908j2w.dDIMxZXP1V8HdM.toString());
                    objectOutputStream.writeBoolean(dfz6ltsv908j2w.w9sT1Swbhx3hs);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static void Ee8d2j4S9Vm5yGuR(String str, String str2, Object obj) {
        if (Log.isLoggable("TRuntime.".concat(str), 85 - 82)) {
            String.format(str2, obj);
        }
    }

    public static final void H9XlUr4OeMJFiXK(hD886kxBkce8U hd886kxbkce8u, b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q, boolean z) {
        Object obj = hD886kxBkce8U.b1EoSIRjJHO5.get(hd886kxbkce8u);
        Throwable thJXn4Qf7zpnLjP5 = hd886kxbkce8u.JXn4Qf7zpnLjP5(obj);
        Object vSZeS5mia3yEXbAe = thJXn4Qf7zpnLjP5 != null ? new VSZeS5mia3yEXbAe(thJXn4Qf7zpnLjP5) : hd886kxbkce8u.b1EoSIRjJHO5(obj);
        if (!z) {
            b9xroaxfr1fmoo2q.ibVTtJUNfrGYbW(vSZeS5mia3yEXbAe);
            return;
        }
        V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = (V9IxQnfNrXampq7vuj6) b9xroaxfr1fmoo2q;
        CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W = v9IxQnfNrXampq7vuj6.xDyLpEZyrcKVe0;
        Object obj2 = v9IxQnfNrXampq7vuj6.b1EoSIRjJHO5;
        cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn = cWIOrUfHtKyaxQib0W.vekpFI4d1Nc4fakF;
        Object objTne6mXOUFKdd = SbxdZ6Kq2uhHQ5RPRqm.tne6mXOUFKdd(cptq2xmcb5jsaehn, obj2);
        YudW7JNC7tJhZ yudW7JNC7tJhZIUQk66nAiXgO35 = objTne6mXOUFKdd != SbxdZ6Kq2uhHQ5RPRqm.vekpFI4d1Nc4fakF ? OFtLBiBbrrTHWu.iUQk66nAiXgO35(cWIOrUfHtKyaxQib0W, cptq2xmcb5jsaehn, objTne6mXOUFKdd) : null;
        try {
            cWIOrUfHtKyaxQib0W.ibVTtJUNfrGYbW(vSZeS5mia3yEXbAe);
        } finally {
            if (yudW7JNC7tJhZIUQk66nAiXgO35 == null || yudW7JNC7tJhZIUQk66nAiXgO35.GiffeZJ1rbwyx()) {
                SbxdZ6Kq2uhHQ5RPRqm.vIJudZvPyTuNp(cptq2xmcb5jsaehn, objTne6mXOUFKdd);
            }
        }
    }

    public static b9xRoaXFR1fmOO2Q J0zjQ7CAgohuxU20eCW6(b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W = b9xroaxfr1fmoo2q instanceof CWIOrUfHtKyaxQib0W ? (CWIOrUfHtKyaxQib0W) b9xroaxfr1fmoo2q : null;
        if (cWIOrUfHtKyaxQib0W == null || (b9xroaxfr1fmoo2q = cWIOrUfHtKyaxQib0W.JXn4Qf7zpnLjP5) != null) {
            return b9xroaxfr1fmoo2q;
        }
        XsD7TIOExRJcOn4m xsD7TIOExRJcOn4m = (XsD7TIOExRJcOn4m) cWIOrUfHtKyaxQib0W.vekpFI4d1Nc4fakF.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF);
        b9xRoaXFR1fmOO2Q v9IxQnfNrXampq7vuj6 = xsD7TIOExRJcOn4m != null ? new V9IxQnfNrXampq7vuj6(xsD7TIOExRJcOn4m, cWIOrUfHtKyaxQib0W) : cWIOrUfHtKyaxQib0W;
        cWIOrUfHtKyaxQib0W.JXn4Qf7zpnLjP5 = v9IxQnfNrXampq7vuj6;
        return v9IxQnfNrXampq7vuj6;
    }

    public static void JXn4Qf7zpnLjP5(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final Object[] K7eEOBPYP9VIoHWTe(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        return Arrays.copyOf(objArrCopyOf, i2);
                    }
                    i = i2;
                }
            }
        }
        return dDIMxZXP1V8HdM;
    }

    public static final int MLSIo1htfMPWeB8V876L(int i) {
        int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i);
        if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
            return 0;
        }
        int i2 = 1;
        if (iJ0zjQ7CAgohuxU20eCW6 != 1) {
            i2 = 2;
            if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                i2 = 3;
                if (iJ0zjQ7CAgohuxU20eCW6 != 3) {
                    i2 = 4;
                    if (iJ0zjQ7CAgohuxU20eCW6 != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + Y9mRyRdkl5FOcwb66V6.MLSIo1htfMPWeB8V876L(i) + " to int");
                    }
                }
            }
        }
        return i2;
    }

    public static final int Qrz92kRPw4GcghAc(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Could not convert ", " to OutOfQuotaPolicy", i));
    }

    public static sfr0Aaw8vBbkmexjHdWK XiR1pIn5878vVWd(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean zStartsWith = str.startsWith("HTTP/1.");
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU = B62d1BWQ36VxGmXU.HTTP_1_0;
        if (zStartsWith) {
            i = 46 - 37;
            if (str.length() < i || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                b62d1BWQ36VxGmXU = B62d1BWQ36VxGmXU.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new sfr0Aaw8vBbkmexjHdWK(b62d1BWQ36VxGmXU, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static String b1EoSIRjJHO5() {
        return UtilGLWorker.J0zjQ7CAgohuxU20eCW6;
    }

    public static final f58wUe2vbJhag6PETTG dDIMxZXP1V8HdM(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn) {
        if (cptq2xmcb5jsaehn.D5P1xCAyuvgF(fadfsJa4iEdiwEC4Xm8.b1EoSIRjJHO5) == null) {
            cptq2xmcb5jsaehn = cptq2xmcb5jsaehn.EWUjsTERgdPbSw3NNlN(new z17cwwEfkgV0Mm5Z());
        }
        return new f58wUe2vbJhag6PETTG(cptq2xmcb5jsaehn);
    }

    public static final Object[] dTS0S7eC32ubQH54j36(Collection collection, Object[] objArr) {
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final int gIIiyi2ddlMDR0(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Could not convert ", " to BackoffPolicy", i));
    }

    public static boolean gmNWMfvn6zlEj() {
        return (HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn == null || HandlerSJAdapter.xfn2GJwmGqs7kWW == null || Build.VERSION.SDK_INT >= 34) ? false : true;
    }

    public static String hjneShqpF9Tis4(String str) {
        return "TRuntime.".concat(str);
    }

    public static final String ibVTtJUNfrGYbW(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            int i = 1063 - 63;
            if (j <= 0) {
                str = ((j - ((long) 500)) / ((long) i)) + " µs";
            } else if (j < 999500) {
                str = ((j + ((long) 500)) / ((long) i)) + " µs";
            } else if (j < 999500000) {
                str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
            } else {
                str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
            }
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static final int l1V0lQr6TbwNKqHfXNbb(int i) {
        int iJ0zjQ7CAgohuxU20eCW6 = Y9mRyRdkl5FOcwb66V6.J0zjQ7CAgohuxU20eCW6(i);
        if (iJ0zjQ7CAgohuxU20eCW6 == 0) {
            return 0;
        }
        int i2 = 1;
        if (iJ0zjQ7CAgohuxU20eCW6 != 1) {
            i2 = 2;
            if (iJ0zjQ7CAgohuxU20eCW6 != 2) {
                i2 = 3;
                if (iJ0zjQ7CAgohuxU20eCW6 != 3) {
                    i2 = 4;
                    if (iJ0zjQ7CAgohuxU20eCW6 != 4) {
                        if (iJ0zjQ7CAgohuxU20eCW6 == 5) {
                            return 5;
                        }
                        throw new Sb7Xj3N9U1DQ();
                    }
                }
            }
        }
        return i2;
    }

    public static final int nQilHWaqS401ZtR(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Could not convert ", " to State", i));
    }

    public static final hD886kxBkce8U pyu8ovAipBTLYAiKab(b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        hD886kxBkce8U hd886kxbkce8u;
        hD886kxBkce8U hd886kxbkce8u2;
        if (!(b9xroaxfr1fmoo2q instanceof V9IxQnfNrXampq7vuj6)) {
            return new hD886kxBkce8U(1, b9xroaxfr1fmoo2q);
        }
        V9IxQnfNrXampq7vuj6 v9IxQnfNrXampq7vuj6 = (V9IxQnfNrXampq7vuj6) b9xroaxfr1fmoo2q;
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = y6jRGLEWNMir.w9sT1Swbhx3hs;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = V9IxQnfNrXampq7vuj6.pyu8ovAipBTLYAiKab;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6);
            hd886kxbkce8u = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(v9IxQnfNrXampq7vuj6, o0rn3ekjbj6kkwok);
                hd886kxbkce8u2 = null;
                break;
            }
            if (obj instanceof hD886kxBkce8U) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(v9IxQnfNrXampq7vuj6, obj, o0rn3ekjbj6kkwok)) {
                        hd886kxbkce8u2 = (hD886kxBkce8U) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(v9IxQnfNrXampq7vuj6) == obj);
            } else if (obj != o0rn3ekjbj6kkwok && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (hd886kxbkce8u2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = hD886kxBkce8U.b1EoSIRjJHO5;
            Object obj2 = atomicReferenceFieldUpdater2.get(hd886kxbkce8u2);
            if (!(obj2 instanceof x2ai6Gfmg8zOa) || ((x2ai6Gfmg8zOa) obj2).JXn4Qf7zpnLjP5 == null) {
                hD886kxBkce8U.ibVTtJUNfrGYbW.set(hd886kxbkce8u2, 536870911);
                atomicReferenceFieldUpdater2.set(hd886kxbkce8u2, fivkjwgu2UdAtiY.w9sT1Swbhx3hs);
                hd886kxbkce8u = hd886kxbkce8u2;
            } else {
                hd886kxbkce8u2.Qrz92kRPw4GcghAc();
            }
            if (hd886kxbkce8u != null) {
                return hd886kxbkce8u;
            }
        }
        return new hD886kxBkce8U(2, b9xroaxfr1fmoo2q);
    }

    public static final LinkedHashSet vekpFI4d1Nc4fakF(byte[] bArr) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        linkedHashSet.add(new dfz6ltSv908J2w(objectInputStream.readBoolean(), Uri.parse(objectInputStream.readUTF())));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final void w9sT1Swbhx3hs(lF98dCR0TIO8DDCYOu lf98dcr0tio8ddcyou, uV3RzXbqCGFOlAdx uv3rzxbqcgfoladx, String str) {
        Cid8LKolL4e2FdtXe.b1EoSIRjJHO5.getClass();
        Cid8LKolL4e2FdtXe.D5P1xCAyuvgF.fine(uv3rzxbqcgfoladx.w9sT1Swbhx3hs + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + lf98dcr0tio8ddcyou.dDIMxZXP1V8HdM);
    }

    public static final int wotphlvK9sPbXJ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 20 + 10 || i != 5) {
            throw new IllegalArgumentException(Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("Could not convert ", " to NetworkType", i));
        }
        return 6;
    }

    private static /* synthetic */ void wttpbolzt() {
    }

    public static void xDyLpEZyrcKVe0() {
        UtilGLWorker.MLSIo1htfMPWeB8V876L = false;
        UtilGLWorker utilGLWorker = UtilGLWorker.H9XlUr4OeMJFiXK;
        if (utilGLWorker != null) {
            try {
                try {
                    utilGLWorker.finishAndRemoveTask();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                utilGLWorker.finish();
            }
        }
        UtilGLWorker.H9XlUr4OeMJFiXK = null;
    }
}
