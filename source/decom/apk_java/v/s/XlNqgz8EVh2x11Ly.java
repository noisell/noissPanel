package v.s;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class XlNqgz8EVh2x11Ly {
    public final SharedPreferences dDIMxZXP1V8HdM;

    public XlNqgz8EVh2x11Ly(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.dDIMxZXP1V8HdM = sharedPreferences;
        File file = new File(VS9k6A1FKWQnfGMy.vekpFI4d1Nc4fakF(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    public synchronized String Ee8d2j4S9Vm5yGuR(String str) {
        for (Map.Entry<String, ?> entry : this.dDIMxZXP1V8HdM.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized String JXn4Qf7zpnLjP5(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public synchronized void b1EoSIRjJHO5(long j, String str) {
        String strJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(j);
        if (this.dDIMxZXP1V8HdM.getString("last-used-date", "").equals(strJXn4Qf7zpnLjP5)) {
            String strEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(strJXn4Qf7zpnLjP5);
            if (strEe8d2j4S9Vm5yGuR == null) {
                return;
            }
            if (strEe8d2j4S9Vm5yGuR.equals(str)) {
                return;
            }
            pyu8ovAipBTLYAiKab(str, strJXn4Qf7zpnLjP5);
            return;
        }
        long j2 = this.dDIMxZXP1V8HdM.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            dDIMxZXP1V8HdM();
            j2 = this.dDIMxZXP1V8HdM.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.dDIMxZXP1V8HdM.getStringSet(str, new HashSet()));
        hashSet.add(strJXn4Qf7zpnLjP5);
        this.dDIMxZXP1V8HdM.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strJXn4Qf7zpnLjP5).commit();
    }

    public synchronized void dDIMxZXP1V8HdM() {
        try {
            long j = this.dDIMxZXP1V8HdM.getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : this.dDIMxZXP1V8HdM.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.dDIMxZXP1V8HdM.getStringSet(key, new HashSet()));
            hashSet.remove(str);
            this.dDIMxZXP1V8HdM.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean ibVTtJUNfrGYbW(long j) {
        if (!this.dDIMxZXP1V8HdM.contains("fire-global")) {
            this.dDIMxZXP1V8HdM.edit().putLong("fire-global", j).commit();
            return true;
        }
        long j2 = this.dDIMxZXP1V8HdM.getLong("fire-global", -1L);
        synchronized (this) {
            if (JXn4Qf7zpnLjP5(j2).equals(JXn4Qf7zpnLjP5(j))) {
                return false;
            }
            this.dDIMxZXP1V8HdM.edit().putLong("fire-global", j).commit();
            return true;
        }
    }

    public synchronized void pyu8ovAipBTLYAiKab(String str, String str2) {
        xDyLpEZyrcKVe0(str2);
        HashSet hashSet = new HashSet(this.dDIMxZXP1V8HdM.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.dDIMxZXP1V8HdM.edit().putStringSet(str, hashSet).commit();
    }

    public synchronized ArrayList vekpFI4d1Nc4fakF() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.dDIMxZXP1V8HdM.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(JXn4Qf7zpnLjP5(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new Zv2dAO3G6ktqC(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.dDIMxZXP1V8HdM.edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized void w9sT1Swbhx3hs() {
        try {
            SharedPreferences.Editor editorEdit = this.dDIMxZXP1V8HdM.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.dDIMxZXP1V8HdM.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strJXn4Qf7zpnLjP5 = JXn4Qf7zpnLjP5(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strJXn4Qf7zpnLjP5)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strJXn4Qf7zpnLjP5);
                        i++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void xDyLpEZyrcKVe0(String str) {
        try {
            String strEe8d2j4S9Vm5yGuR = Ee8d2j4S9Vm5yGuR(str);
            if (strEe8d2j4S9Vm5yGuR == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.dDIMxZXP1V8HdM.getStringSet(strEe8d2j4S9Vm5yGuR, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.dDIMxZXP1V8HdM.edit().remove(strEe8d2j4S9Vm5yGuR).commit();
            } else {
                this.dDIMxZXP1V8HdM.edit().putStringSet(strEe8d2j4S9Vm5yGuR, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public XlNqgz8EVh2x11Ly(Context context, String str) {
        this.dDIMxZXP1V8HdM = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }
}
