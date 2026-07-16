package v.s;

import android.database.Cursor;
import java.io.IOException;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class AfMRrsvrH15XfvJ2iD2 {
    public final Set JXn4Qf7zpnLjP5;
    public final String dDIMxZXP1V8HdM;
    public final Set vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public AfMRrsvrH15XfvJ2iD2(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.dDIMxZXP1V8HdM = str;
        this.w9sT1Swbhx3hs = map;
        this.vekpFI4d1Nc4fakF = abstractSet;
        this.JXn4Qf7zpnLjP5 = abstractSet2;
    }

    public static final AfMRrsvrH15XfvJ2iD2 dDIMxZXP1V8HdM(eyije75asyarHGHdxkfX eyije75asyarhghdxkfx, String str) throws IOException {
        Map map;
        Cursor cursorRCHnHJBAlOpNI5 = eyije75asyarhghdxkfx.rCHnHJBAlOpNI5("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorRCHnHJBAlOpNI5.getColumnCount() <= 0) {
                map = jB7suWpUqheaHlr52SG.w9sT1Swbhx3hs;
                cursorRCHnHJBAlOpNI5.close();
            } else {
                int columnIndex = cursorRCHnHJBAlOpNI5.getColumnIndex("name");
                int columnIndex2 = cursorRCHnHJBAlOpNI5.getColumnIndex("type");
                int columnIndex3 = cursorRCHnHJBAlOpNI5.getColumnIndex("notnull");
                int columnIndex4 = cursorRCHnHJBAlOpNI5.getColumnIndex("pk");
                int columnIndex5 = cursorRCHnHJBAlOpNI5.getColumnIndex("dflt_value");
                lmS3EL5eXtpmSti lms3el5extpmsti = new lmS3EL5eXtpmSti();
                while (cursorRCHnHJBAlOpNI5.moveToNext()) {
                    String string = cursorRCHnHJBAlOpNI5.getString(columnIndex);
                    lms3el5extpmsti.put(string, new kqr9a6cdIajJ19jP(string, cursorRCHnHJBAlOpNI5.getString(columnIndex2), cursorRCHnHJBAlOpNI5.getInt(columnIndex3) != 0, cursorRCHnHJBAlOpNI5.getInt(columnIndex4), cursorRCHnHJBAlOpNI5.getString(columnIndex5), 2));
                }
                lms3el5extpmsti.w9sT1Swbhx3hs();
                lms3el5extpmsti.gIIiyi2ddlMDR0 = true;
                map = lms3el5extpmsti.pyu8ovAipBTLYAiKab > 0 ? lms3el5extpmsti : lmS3EL5eXtpmSti.wotphlvK9sPbXJ;
                cursorRCHnHJBAlOpNI5.close();
            }
            Cursor cursorRCHnHJBAlOpNI6 = eyije75asyarhghdxkfx.rCHnHJBAlOpNI5("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = cursorRCHnHJBAlOpNI6.getColumnIndex("id");
                int columnIndex7 = cursorRCHnHJBAlOpNI6.getColumnIndex("seq");
                int columnIndex8 = cursorRCHnHJBAlOpNI6.getColumnIndex("table");
                int columnIndex9 = cursorRCHnHJBAlOpNI6.getColumnIndex("on_delete");
                int columnIndex10 = cursorRCHnHJBAlOpNI6.getColumnIndex("on_update");
                List listXiR1pIn5878vVWd = gA5gCwTK0qjTIn.XiR1pIn5878vVWd(cursorRCHnHJBAlOpNI6);
                cursorRCHnHJBAlOpNI6.moveToPosition(-1);
                tml08hF58ijcjYIUpM tml08hf58ijcjyiupm = new tml08hF58ijcjYIUpM();
                while (cursorRCHnHJBAlOpNI6.moveToNext()) {
                    if (cursorRCHnHJBAlOpNI6.getInt(columnIndex7) == 0) {
                        int i = cursorRCHnHJBAlOpNI6.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : listXiR1pIn5878vVWd) {
                            int i3 = columnIndex7;
                            List list = listXiR1pIn5878vVWd;
                            if (((tDlqCGNnTg3Ni) obj).w9sT1Swbhx3hs == i) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i3;
                            listXiR1pIn5878vVWd = list;
                        }
                        int i4 = columnIndex7;
                        List list2 = listXiR1pIn5878vVWd;
                        int i5 = 0;
                        for (int size = arrayList3.size(); i5 < size; size = size) {
                            Object obj2 = arrayList3.get(i5);
                            i5++;
                            tDlqCGNnTg3Ni tdlqcgnntg3ni = (tDlqCGNnTg3Ni) obj2;
                            arrayList.add(tdlqcgnntg3ni.JXn4Qf7zpnLjP5);
                            arrayList2.add(tdlqcgnntg3ni.Ee8d2j4S9Vm5yGuR);
                        }
                        tml08hf58ijcjyiupm.add(new aiWeEbZVIIpMHm(cursorRCHnHJBAlOpNI6.getString(columnIndex8), cursorRCHnHJBAlOpNI6.getString(columnIndex9), cursorRCHnHJBAlOpNI6.getString(columnIndex10), arrayList, arrayList2));
                        columnIndex6 = i2;
                        columnIndex7 = i4;
                        listXiR1pIn5878vVWd = list2;
                    }
                }
                tml08hF58ijcjYIUpM tml08hf58ijcjyiupmDDIMxZXP1V8HdM = gA5gCwTK0qjTIn.dDIMxZXP1V8HdM(tml08hf58ijcjyiupm);
                cursorRCHnHJBAlOpNI6.close();
                Cursor cursorRCHnHJBAlOpNI7 = eyije75asyarhghdxkfx.rCHnHJBAlOpNI5("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = cursorRCHnHJBAlOpNI7.getColumnIndex("name");
                    int columnIndex12 = cursorRCHnHJBAlOpNI7.getColumnIndex("origin");
                    int columnIndex13 = cursorRCHnHJBAlOpNI7.getColumnIndex("unique");
                    tml08hF58ijcjYIUpM tml08hf58ijcjyiupmDDIMxZXP1V8HdM2 = null;
                    if (columnIndex11 == -1 || columnIndex12 == -1 || columnIndex13 == -1) {
                        cursorRCHnHJBAlOpNI7.close();
                    } else {
                        tml08hF58ijcjYIUpM tml08hf58ijcjyiupm2 = new tml08hF58ijcjYIUpM();
                        while (cursorRCHnHJBAlOpNI7.moveToNext()) {
                            if ("c".equals(cursorRCHnHJBAlOpNI7.getString(columnIndex12))) {
                                TrEY4Uc0Kd3sdQC trEY4Uc0Kd3sdQCH9XlUr4OeMJFiXK = gA5gCwTK0qjTIn.H9XlUr4OeMJFiXK(eyije75asyarhghdxkfx, cursorRCHnHJBAlOpNI7.getString(columnIndex11), cursorRCHnHJBAlOpNI7.getInt(columnIndex13) == 1);
                                if (trEY4Uc0Kd3sdQCH9XlUr4OeMJFiXK == null) {
                                    cursorRCHnHJBAlOpNI7.close();
                                } else {
                                    tml08hf58ijcjyiupm2.add(trEY4Uc0Kd3sdQCH9XlUr4OeMJFiXK);
                                }
                            }
                        }
                        tml08hf58ijcjyiupmDDIMxZXP1V8HdM2 = gA5gCwTK0qjTIn.dDIMxZXP1V8HdM(tml08hf58ijcjyiupm2);
                        cursorRCHnHJBAlOpNI7.close();
                    }
                    return new AfMRrsvrH15XfvJ2iD2(str, map, tml08hf58ijcjyiupmDDIMxZXP1V8HdM, tml08hf58ijcjyiupmDDIMxZXP1V8HdM2);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorRCHnHJBAlOpNI7, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorRCHnHJBAlOpNI6, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(cursorRCHnHJBAlOpNI5, th5);
                throw th6;
            }
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfMRrsvrH15XfvJ2iD2)) {
            return false;
        }
        AfMRrsvrH15XfvJ2iD2 afMRrsvrH15XfvJ2iD2 = (AfMRrsvrH15XfvJ2iD2) obj;
        if (!this.dDIMxZXP1V8HdM.equals(afMRrsvrH15XfvJ2iD2.dDIMxZXP1V8HdM) || !this.w9sT1Swbhx3hs.equals(afMRrsvrH15XfvJ2iD2.w9sT1Swbhx3hs) || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(this.vekpFI4d1Nc4fakF, afMRrsvrH15XfvJ2iD2.vekpFI4d1Nc4fakF)) {
            return false;
        }
        Set set2 = this.JXn4Qf7zpnLjP5;
        if (set2 == null || (set = afMRrsvrH15XfvJ2iD2.JXn4Qf7zpnLjP5) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.vekpFI4d1Nc4fakF.hashCode() + ((this.w9sT1Swbhx3hs.hashCode() + (this.dDIMxZXP1V8HdM.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.dDIMxZXP1V8HdM + "', columns=" + this.w9sT1Swbhx3hs + ", foreignKeys=" + this.vekpFI4d1Nc4fakF + ", indices=" + this.JXn4Qf7zpnLjP5 + '}';
    }
}
