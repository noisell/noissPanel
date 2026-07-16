package v.s;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class sfr0Aaw8vBbkmexjHdWK {
    public Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public Object vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;

    public /* synthetic */ sfr0Aaw8vBbkmexjHdWK() {
        this.dDIMxZXP1V8HdM = 0;
    }

    private static /* synthetic */ void jfceiljfmd() {
    }

    public static void w9sT1Swbhx3hs(String str) {
        if (BS2kx9eAoOyDiNGAFlFk.A1BaTVAMeIXMnh(str, ":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = okc5AGRjqrud84oM6d.xDyLpEZyrcKVe0(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[LOOP:3: B:11:0x0028->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x006c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public void Ee8d2j4S9Vm5yGuR(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx, int i, int i2) throws IOException {
        Set set;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        ?? r7;
        Integer num;
        int i3;
        int iIntValue;
        int iIntValue2;
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = (r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5;
        cEBaU8QnH2devCCLv3V cebau8qnh2devcclv3v = (cEBaU8QnH2devCCLv3V) this.vekpFI4d1Nc4fakF;
        if (cebau8qnh2devcclv3v != null) {
            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c2 = cebau8qnh2devcclv3v.JXn4Qf7zpnLjP5;
            r5xeufod5gsccwq6c2.getClass();
            ?? r3 = (-9) + 10;
            if (i == i2) {
                iterable = qkzRt1s9DJNNYwsqt.w9sT1Swbhx3hs;
            } else {
                ?? r4 = i2 > i ? r3 : 0;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i;
                while (true) {
                    if (r4 != 0) {
                        if (iIntValue3 < i2) {
                            treeMap = (TreeMap) ((LinkedHashMap) r5xeufod5gsccwq6c2.vekpFI4d1Nc4fakF).get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (r4 != 0) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        r7 = 0;
                                        break;
                                    }
                                    num = (Integer) it.next();
                                    if (r4 != 0) {
                                        i3 = iIntValue3 + 1;
                                        iIntValue = num.intValue();
                                        if (i3 <= iIntValue && iIntValue <= i2) {
                                            arrayList.add(treeMap.get(num));
                                            iIntValue3 = num.intValue();
                                            r7 = r3;
                                            break;
                                        }
                                    } else {
                                        iIntValue2 = num.intValue();
                                        if (i2 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            arrayList.add(treeMap.get(num));
                                            iIntValue3 = num.intValue();
                                            r7 = r3;
                                            break;
                                            break;
                                        }
                                    }
                                }
                                if (r7 == 0) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i2) {
                        treeMap = (TreeMap) ((LinkedHashMap) r5xeufod5gsccwq6c2.vekpFI4d1Nc4fakF).get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (r4 != 0) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    r7 = 0;
                                    break;
                                    break;
                                }
                                num = (Integer) it.next();
                                if (r4 != 0) {
                                    i3 = iIntValue3 + 1;
                                    iIntValue = num.intValue();
                                    if (i3 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    iIntValue2 = num.intValue();
                                    if (i2 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (r7 == 0) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                ygw2lLTDaECI24gLm1 ygw2lltdaeci24glm1 = new ygw2lLTDaECI24gLm1();
                Cursor cursorRCHnHJBAlOpNI5 = eyije75asyarhghdxkfx.rCHnHJBAlOpNI5("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (cursorRCHnHJBAlOpNI5.moveToNext()) {
                    try {
                        ygw2lltdaeci24glm1.add(cursorRCHnHJBAlOpNI5.getString(0));
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorRCHnHJBAlOpNI5, th);
                            throw th2;
                        }
                    }
                }
                cursorRCHnHJBAlOpNI5.close();
                if (ygw2lltdaeci24glm1.xDyLpEZyrcKVe0 != null) {
                    throw new IllegalStateException();
                }
                ygw2lltdaeci24glm1.Ee8d2j4S9Vm5yGuR();
                ygw2lltdaeci24glm1.Ee8d2j4S9Vm5yGuR = r3;
                if (ygw2lltdaeci24glm1.JXn4Qf7zpnLjP5 <= 0) {
                    ygw2lltdaeci24glm1 = ygw2lLTDaECI24gLm1.b1EoSIRjJHO5;
                }
                Iterator it2 = ygw2lltdaeci24glm1.iterator();
                while (true) {
                    wPQW0HxMw42V0Fv0tT wpqw0hxmw42v0fv0tt = (wPQW0HxMw42V0Fv0tT) it2;
                    if (!wpqw0hxmw42v0fv0tt.hasNext()) {
                        break;
                    }
                    String str = (String) wpqw0hxmw42v0fv0tt.next();
                    if (str.startsWith("room_fts_content_sync_")) {
                        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    ((G3FkI4yU8rMPR) it3.next()).dDIMxZXP1V8HdM(eyije75asyarhghdxkfx);
                }
                WO16ah7oTpx6o3e3a wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb = r5XEUfod5GSCCwq6c.l1V0lQr6TbwNKqHfXNbb(eyije75asyarhghdxkfx);
                if (!wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb.w9sT1Swbhx3hs) {
                    throw new IllegalStateException("Migration didn't properly handle: " + wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb.dDIMxZXP1V8HdM);
                }
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                return;
            }
        }
        cEBaU8QnH2devCCLv3V cebau8qnh2devcclv3v2 = (cEBaU8QnH2devCCLv3V) this.vekpFI4d1Nc4fakF;
        if (cebau8qnh2devcclv3v2 != null) {
            if (!((i <= i2 || !cebau8qnh2devcclv3v2.D5P1xCAyuvgF) && cebau8qnh2devcclv3v2.pyu8ovAipBTLYAiKab && ((set = cebau8qnh2devcclv3v2.hjneShqpF9Tis4) == null || !set.contains(Integer.valueOf(i))))) {
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS `Dependency`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS `WorkSpec`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS `WorkTag`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS `SystemIdInfo`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS `WorkName`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS `WorkProgress`");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
                List list = workDatabase_Impl.xDyLpEZyrcKVe0;
                if (list != null) {
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((cfMxtqMAcYzBzliR) workDatabase_Impl.xDyLpEZyrcKVe0.get(i4)).getClass();
                    }
                }
                r5XEUfod5GSCCwq6c.b1EoSIRjJHO5(eyije75asyarhghdxkfx);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void JXn4Qf7zpnLjP5(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx) throws IOException {
        Cursor cursorRCHnHJBAlOpNI5 = eyije75asyarhghdxkfx.rCHnHJBAlOpNI5("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorRCHnHJBAlOpNI5.moveToFirst() && cursorRCHnHJBAlOpNI5.getInt(0) != 0;
            cursorRCHnHJBAlOpNI5.close();
            if (z) {
                Cursor cursorO2DHNSIGZlgPja7eqLgn = eyije75asyarhghdxkfx.O2DHNSIGZlgPja7eqLgn(new o0rN3ekjBJ6kKwok("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 0));
                try {
                    String string = cursorO2DHNSIGZlgPja7eqLgn.moveToFirst() ? cursorO2DHNSIGZlgPja7eqLgn.getString(0) : null;
                    cursorO2DHNSIGZlgPja7eqLgn.close();
                    if (!"7d73d21f1bd82c9e5268b6dcf9fde2cb".equals(string) && !"3071c8717539de5d5353f4c8cd59a032".equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: " + string);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorO2DHNSIGZlgPja7eqLgn, th);
                        throw th2;
                    }
                }
            } else {
                WO16ah7oTpx6o3e3a wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb = r5XEUfod5GSCCwq6c.l1V0lQr6TbwNKqHfXNbb(eyije75asyarhghdxkfx);
                if (!wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb.w9sT1Swbhx3hs) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb.dDIMxZXP1V8HdM);
                }
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
            }
            r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = (r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5;
            ((WorkDatabase_Impl) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM = eyije75asyarhghdxkfx;
            eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("PRAGMA foreign_keys = ON");
            W3MG38bRt8NhVbCQ w3MG38bRt8NhVbCQ = ((WorkDatabase_Impl) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).JXn4Qf7zpnLjP5;
            synchronized (w3MG38bRt8NhVbCQ.hjneShqpF9Tis4) {
                if (!w3MG38bRt8NhVbCQ.xDyLpEZyrcKVe0) {
                    eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("PRAGMA temp_store = MEMORY;");
                    eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("PRAGMA recursive_triggers='ON';");
                    eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                    w3MG38bRt8NhVbCQ.vekpFI4d1Nc4fakF(eyije75asyarhghdxkfx);
                    w3MG38bRt8NhVbCQ.ibVTtJUNfrGYbW = eyije75asyarhghdxkfx.D5P1xCAyuvgF("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                    w3MG38bRt8NhVbCQ.xDyLpEZyrcKVe0 = true;
                }
            }
            List list = ((WorkDatabase_Impl) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).xDyLpEZyrcKVe0;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    cfMxtqMAcYzBzliR cfmxtqmacyzbzlir = (cfMxtqMAcYzBzliR) ((WorkDatabase_Impl) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF).xDyLpEZyrcKVe0.get(i);
                    cfmxtqmacyzbzlir.getClass();
                    eyije75asyarhghdxkfx.dDIMxZXP1V8HdM();
                    try {
                        StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                        cfmxtqmacyzbzlir.dDIMxZXP1V8HdM.getClass();
                        sb.append(System.currentTimeMillis() - XtJqC8N6YdCYF0qbv.dDIMxZXP1V8HdM);
                        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                        eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc(sb.toString());
                        eyije75asyarhghdxkfx.xfn2GJwmGqs7kWW();
                        eyije75asyarhghdxkfx.hjneShqpF9Tis4();
                    } catch (Throwable th3) {
                        eyije75asyarhghdxkfx.hjneShqpF9Tis4();
                        throw th3;
                    }
                }
            }
            this.vekpFI4d1Nc4fakF = null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorRCHnHJBAlOpNI5, th4);
                throw th5;
            }
        }
    }

    public l3fPij8CYcI7xO dDIMxZXP1V8HdM() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        String str = (String) this.vekpFI4d1Nc4fakF;
        return new l3fPij8CYcI7xO(this.w9sT1Swbhx3hs, ((Long) this.JXn4Qf7zpnLjP5).longValue(), str);
    }

    public String toString() {
        switch (this.dDIMxZXP1V8HdM) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((B62d1BWQ36VxGmXU) this.JXn4Qf7zpnLjP5) == B62d1BWQ36VxGmXU.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.w9sT1Swbhx3hs);
                sb.append(' ');
                sb.append((String) this.vekpFI4d1Nc4fakF);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void vekpFI4d1Nc4fakF(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx) throws IOException {
        r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = (r5XEUfod5GSCCwq6c) this.JXn4Qf7zpnLjP5;
        Cursor cursorRCHnHJBAlOpNI5 = eyije75asyarhghdxkfx.rCHnHJBAlOpNI5("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            int i = (cursorRCHnHJBAlOpNI5.moveToFirst() && cursorRCHnHJBAlOpNI5.getInt(0) == 0) ? 55 - 54 : 0;
            cursorRCHnHJBAlOpNI5.close();
            r5XEUfod5GSCCwq6c.b1EoSIRjJHO5(eyije75asyarhghdxkfx);
            if (i == 0) {
                WO16ah7oTpx6o3e3a wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb = r5XEUfod5GSCCwq6c.l1V0lQr6TbwNKqHfXNbb(eyije75asyarhghdxkfx);
                if (!wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb.w9sT1Swbhx3hs) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + wO16ah7oTpx6o3e3aL1V0lQr6TbwNKqHfXNbb.dDIMxZXP1V8HdM);
                }
            }
            eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            eyije75asyarhghdxkfx.Qrz92kRPw4GcghAc("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
            List list = workDatabase_Impl.xDyLpEZyrcKVe0;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((cfMxtqMAcYzBzliR) workDatabase_Impl.xDyLpEZyrcKVe0.get(i2)).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorRCHnHJBAlOpNI5, th);
                throw th2;
            }
        }
    }

    public sfr0Aaw8vBbkmexjHdWK(B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU, int i, String str) {
        this.dDIMxZXP1V8HdM = 2;
        this.JXn4Qf7zpnLjP5 = b62d1BWQ36VxGmXU;
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = str;
    }

    public sfr0Aaw8vBbkmexjHdWK(cEBaU8QnH2devCCLv3V cebau8qnh2devcclv3v, r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c) {
        this.dDIMxZXP1V8HdM = 1;
        this.dDIMxZXP1V8HdM = 1;
        this.w9sT1Swbhx3hs = 20;
        this.vekpFI4d1Nc4fakF = cebau8qnh2devcclv3v;
        this.JXn4Qf7zpnLjP5 = r5xeufod5gsccwq6c;
    }
}
