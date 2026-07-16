package v.s;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class lll4zYzNgPu62V implements JcWCvQYUtgV2xmu1, iybiobD0qqQIasTkIw {
    public final qlHclLGph5RUFd Ee8d2j4S9Vm5yGuR;
    public final Map JXn4Qf7zpnLjP5;
    public final boolean dDIMxZXP1V8HdM = true;
    public final Map vekpFI4d1Nc4fakF;
    public final JsonWriter w9sT1Swbhx3hs;
    public final boolean xDyLpEZyrcKVe0;

    public lll4zYzNgPu62V(BufferedWriter bufferedWriter, HashMap map, HashMap map2, Xyz5nManK5eXi9DtYVSh xyz5nManK5eXi9DtYVSh, boolean z) {
        this.w9sT1Swbhx3hs = new JsonWriter(bufferedWriter);
        this.vekpFI4d1Nc4fakF = map;
        this.JXn4Qf7zpnLjP5 = map2;
        this.Ee8d2j4S9Vm5yGuR = xyz5nManK5eXi9DtYVSh;
        this.xDyLpEZyrcKVe0 = z;
    }

    @Override // v.s.JcWCvQYUtgV2xmu1
    public final JcWCvQYUtgV2xmu1 Ee8d2j4S9Vm5yGuR(edKoiDMpklbRUBLq edkoidmpklbrublq, long j) throws IOException {
        String str = edkoidmpklbrublq.dDIMxZXP1V8HdM;
        b1EoSIRjJHO5();
        JsonWriter jsonWriter = this.w9sT1Swbhx3hs;
        jsonWriter.name(str);
        b1EoSIRjJHO5();
        jsonWriter.value(j);
        return this;
    }

    @Override // v.s.iybiobD0qqQIasTkIw
    public final iybiobD0qqQIasTkIw JXn4Qf7zpnLjP5(boolean z) throws IOException {
        b1EoSIRjJHO5();
        this.w9sT1Swbhx3hs.value(z);
        return this;
    }

    public final void b1EoSIRjJHO5() {
        if (!this.dDIMxZXP1V8HdM) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // v.s.JcWCvQYUtgV2xmu1
    public final JcWCvQYUtgV2xmu1 dDIMxZXP1V8HdM(edKoiDMpklbRUBLq edkoidmpklbrublq, int i) throws IOException {
        String str = edkoidmpklbrublq.dDIMxZXP1V8HdM;
        b1EoSIRjJHO5();
        JsonWriter jsonWriter = this.w9sT1Swbhx3hs;
        jsonWriter.name(str);
        b1EoSIRjJHO5();
        jsonWriter.value(i);
        return this;
    }

    public final lll4zYzNgPu62V ibVTtJUNfrGYbW(Object obj, String str) throws IOException {
        boolean z = this.xDyLpEZyrcKVe0;
        JsonWriter jsonWriter = this.w9sT1Swbhx3hs;
        if (z) {
            if (obj == null) {
                return this;
            }
            b1EoSIRjJHO5();
            jsonWriter.name(str);
            xDyLpEZyrcKVe0(obj);
            return this;
        }
        b1EoSIRjJHO5();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        xDyLpEZyrcKVe0(obj);
        return this;
    }

    @Override // v.s.iybiobD0qqQIasTkIw
    public final iybiobD0qqQIasTkIw vekpFI4d1Nc4fakF(String str) throws IOException {
        b1EoSIRjJHO5();
        this.w9sT1Swbhx3hs.value(str);
        return this;
    }

    @Override // v.s.JcWCvQYUtgV2xmu1
    public final JcWCvQYUtgV2xmu1 w9sT1Swbhx3hs(edKoiDMpklbRUBLq edkoidmpklbrublq, Object obj) throws IOException {
        ibVTtJUNfrGYbW(obj, edkoidmpklbrublq.dDIMxZXP1V8HdM);
        return this;
    }

    public final lll4zYzNgPu62V xDyLpEZyrcKVe0(Object obj) throws IOException {
        JsonWriter jsonWriter = this.w9sT1Swbhx3hs;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    xDyLpEZyrcKVe0(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        ibVTtJUNfrGYbW(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new O4K5KpahtuR0(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            qlHclLGph5RUFd qlhcllgph5rufd = (qlHclLGph5RUFd) this.vekpFI4d1Nc4fakF.get(obj.getClass());
            if (qlhcllgph5rufd != null) {
                jsonWriter.beginObject();
                qlhcllgph5rufd.dDIMxZXP1V8HdM(obj, this);
                jsonWriter.endObject();
                return this;
            }
            PnYB8dVhB84fPn pnYB8dVhB84fPn = (PnYB8dVhB84fPn) this.JXn4Qf7zpnLjP5.get(obj.getClass());
            if (pnYB8dVhB84fPn != null) {
                pnYB8dVhB84fPn.dDIMxZXP1V8HdM(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                b1EoSIRjJHO5();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.Ee8d2j4S9Vm5yGuR.dDIMxZXP1V8HdM(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            b1EoSIRjJHO5();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                b1EoSIRjJHO5();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                xDyLpEZyrcKVe0(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                xDyLpEZyrcKVe0(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }
}
