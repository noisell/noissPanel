package v.s;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class S4NwUM5fV12C6gDO implements Map.Entry {
    public S4NwUM5fV12C6gDO Ee8d2j4S9Vm5yGuR;
    public S4NwUM5fV12C6gDO JXn4Qf7zpnLjP5;
    public final Object vekpFI4d1Nc4fakF;
    public final Object w9sT1Swbhx3hs;

    public S4NwUM5fV12C6gDO(Object obj, Object obj2) {
        this.w9sT1Swbhx3hs = obj;
        this.vekpFI4d1Nc4fakF = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof S4NwUM5fV12C6gDO)) {
            return false;
        }
        S4NwUM5fV12C6gDO s4NwUM5fV12C6gDO = (S4NwUM5fV12C6gDO) obj;
        return this.w9sT1Swbhx3hs.equals(s4NwUM5fV12C6gDO.w9sT1Swbhx3hs) && this.vekpFI4d1Nc4fakF.equals(s4NwUM5fV12C6gDO.vekpFI4d1Nc4fakF);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.w9sT1Swbhx3hs;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.vekpFI4d1Nc4fakF;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.w9sT1Swbhx3hs.hashCode() ^ this.vekpFI4d1Nc4fakF.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.w9sT1Swbhx3hs + "=" + this.vekpFI4d1Nc4fakF;
    }
}
