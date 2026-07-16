package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.SbxdZ6Kq2uhHQ5RPRqm;
import v.s.hV4VTKNUdeHN;
import v.s.xfn2GJwmGqs7kWW;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Scope extends xfn2GJwmGqs7kWW implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new hV4VTKNUdeHN(9);
    public final String vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;

    public Scope(String str, int i) {
        SbxdZ6Kq2uhHQ5RPRqm.xDyLpEZyrcKVe0(str, "scopeUri must not be null or empty");
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = str;
    }

    private static /* synthetic */ void kpwbwx() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.vekpFI4d1Nc4fakF.equals(((Scope) obj).vekpFI4d1Nc4fakF);
    }

    public final int hashCode() {
        return this.vekpFI4d1Nc4fakF.hashCode();
    }

    public final String toString() {
        return this.vekpFI4d1Nc4fakF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20293);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 1, 4);
        parcel.writeInt(this.w9sT1Swbhx3hs);
        RIZfHbqXpth8r2yN4.nQilHWaqS401ZtR(parcel, 2, this.vekpFI4d1Nc4fakF);
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }
}
