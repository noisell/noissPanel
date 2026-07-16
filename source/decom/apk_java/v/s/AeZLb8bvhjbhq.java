package v.s;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class AeZLb8bvhjbhq implements Map.Entry, buUjKwCmuWSvVXs {
    public final int vekpFI4d1Nc4fakF;
    public final lmS3EL5eXtpmSti w9sT1Swbhx3hs;

    public AeZLb8bvhjbhq(lmS3EL5eXtpmSti lms3el5extpmsti, int i) {
        this.w9sT1Swbhx3hs = lms3el5extpmsti;
        this.vekpFI4d1Nc4fakF = i;
    }

    private static /* synthetic */ void jsvfs() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(entry.getKey(), getKey()) && okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.w9sT1Swbhx3hs.w9sT1Swbhx3hs[this.vekpFI4d1Nc4fakF];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.w9sT1Swbhx3hs.vekpFI4d1Nc4fakF[this.vekpFI4d1Nc4fakF];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        lmS3EL5eXtpmSti lms3el5extpmsti = this.w9sT1Swbhx3hs;
        lms3el5extpmsti.w9sT1Swbhx3hs();
        Object[] objArr = lms3el5extpmsti.vekpFI4d1Nc4fakF;
        if (objArr == null) {
            int length = lms3el5extpmsti.w9sT1Swbhx3hs.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            lms3el5extpmsti.vekpFI4d1Nc4fakF = objArr;
        }
        int i = this.vekpFI4d1Nc4fakF;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
