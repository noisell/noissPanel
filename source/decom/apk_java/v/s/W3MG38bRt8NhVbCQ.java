package v.s;

import android.database.sqlite.SQLiteException;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class W3MG38bRt8NhVbCQ {
    public static final String[] gIIiyi2ddlMDR0 = {"UPDATE", "DELETE", "INSERT"};
    public final Object D5P1xCAyuvgF;
    public final AtomicBoolean Ee8d2j4S9Vm5yGuR = new AtomicBoolean(false);
    public final String[] JXn4Qf7zpnLjP5;
    public final wm29dOL0HZT4SW65 b1EoSIRjJHO5;
    public final WorkDatabase_Impl dDIMxZXP1V8HdM;
    public final YqOiSVb2wSv9Lq63qb gmNWMfvn6zlEj;
    public final Object hjneShqpF9Tis4;
    public volatile IvGcaSCdlPOakpJ6v ibVTtJUNfrGYbW;
    public final oxDJvY4rcWCrlE pyu8ovAipBTLYAiKab;
    public final LinkedHashMap vekpFI4d1Nc4fakF;
    public final HashMap w9sT1Swbhx3hs;
    public volatile boolean xDyLpEZyrcKVe0;

    public W3MG38bRt8NhVbCQ(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.dDIMxZXP1V8HdM = workDatabase_Impl;
        this.w9sT1Swbhx3hs = map;
        this.b1EoSIRjJHO5 = new wm29dOL0HZT4SW65(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        this.pyu8ovAipBTLYAiKab = new oxDJvY4rcWCrlE();
        this.D5P1xCAyuvgF = new Object();
        this.hjneShqpF9Tis4 = new Object();
        this.vekpFI4d1Nc4fakF = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.vekpFI4d1Nc4fakF.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) this.w9sT1Swbhx3hs.get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.JXn4Qf7zpnLjP5 = strArr2;
        for (Map.Entry entry : this.w9sT1Swbhx3hs.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (this.vekpFI4d1Nc4fakF.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = this.vekpFI4d1Nc4fakF;
                Object obj = linkedHashMap.get(lowerCase3);
                if (obj == null && !linkedHashMap.containsKey(lowerCase3)) {
                    throw new NoSuchElementException("Key " + ((Object) lowerCase3) + " is missing in the map.");
                }
                linkedHashMap.put(lowerCase4, obj);
            }
        }
        this.gmNWMfvn6zlEj = new YqOiSVb2wSv9Lq63qb(4, this);
    }

    private static /* synthetic */ void trhts() {
    }

    public final boolean dDIMxZXP1V8HdM() {
        eyije75asyarHGHdxkfX eyije75asyarhghdxkfx = this.dDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
        if (!okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(eyije75asyarhghdxkfx != null ? Boolean.valueOf(eyije75asyarhghdxkfx.w9sT1Swbhx3hs.isOpen()) : null, Boolean.TRUE)) {
            return false;
        }
        if (!this.xDyLpEZyrcKVe0) {
            z4xRvJ1RJf5JDR z4xrvj1rjf5jdr = this.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF;
            if (z4xrvj1rjf5jdr == null) {
                z4xrvj1rjf5jdr = null;
            }
            z4xrvj1rjf5jdr.l1V0lQr6TbwNKqHfXNbb();
        }
        return this.xDyLpEZyrcKVe0;
    }

    public final void vekpFI4d1Nc4fakF(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx) {
        if (eyije75asyarhghdxkfx.EWUjsTERgdPbSw3NNlN()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock lock = this.dDIMxZXP1V8HdM.b1EoSIRjJHO5.readLock();
            lock.lock();
            try {
                synchronized (this.D5P1xCAyuvgF) {
                    try {
                        int[] iArrDDIMxZXP1V8HdM = this.b1EoSIRjJHO5.dDIMxZXP1V8HdM();
                        if (iArrDDIMxZXP1V8HdM != null) {
                            if (eyije75asyarhghdxkfx.vIJudZvPyTuNp()) {
                                eyije75asyarhghdxkfx.vekpFI4d1Nc4fakF();
                            } else {
                                eyije75asyarhghdxkfx.dDIMxZXP1V8HdM();
                            }
                            try {
                                int length = iArrDDIMxZXP1V8HdM.length;
                                int i = 0;
                                int i2 = 0;
                                while (i < length) {
                                    int i3 = iArrDDIMxZXP1V8HdM[i];
                                    int i4 = i2 + 1;
                                    if (i3 == 1) {
                                        w9sT1Swbhx3hs(eyije75asyarhghdxkfx, i2);
                                    } else if (i3 == 2) {
                                        String str = this.JXn4Qf7zpnLjP5[i2];
                                        String[] strArr = gIIiyi2ddlMDR0;
                                        for (int i5 = 0; i5 < 3; i5++) {
                                            String str2 = strArr[i5];
                                            StringBuilder sb = new StringBuilder("DROP TRIGGER IF EXISTS ");
                                            sb.append("`room_table_modification_trigger_" + str + '_' + str2 + '`');
                                            eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc(sb.toString());
                                        }
                                    }
                                    i++;
                                    i2 = i4;
                                }
                                eyije75asyarhghdxkfx.xfn2GJwmGqs7kWW();
                                eyije75asyarhghdxkfx.hjneShqpF9Tis4();
                            } catch (Throwable th) {
                                eyije75asyarhghdxkfx.hjneShqpF9Tis4();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lock.unlock();
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        } catch (SQLiteException | IllegalStateException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [char, int] */
    public final void w9sT1Swbhx3hs(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx, int i) {
        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.JXn4Qf7zpnLjP5[i];
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = gIIiyi2ddlMDR0[i2];
            StringBuilder sb = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`room_table_modification_trigger_" + str + ((char) (120 - 25)) + str2 + '`');
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i);
            sb.append(" AND invalidated = 0; END");
            eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc(sb.toString());
        }
    }
}
