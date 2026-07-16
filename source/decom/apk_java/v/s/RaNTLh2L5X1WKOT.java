package v.s;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class RaNTLh2L5X1WKOT implements Parcelable {
    public static final Parcelable.Creator<RaNTLh2L5X1WKOT> CREATOR = new hV4VTKNUdeHN(3);
    public final Bundle D5P1xCAyuvgF;
    public final int Ee8d2j4S9Vm5yGuR;
    public final boolean JXn4Qf7zpnLjP5;
    public final boolean b1EoSIRjJHO5;
    public HpS8WYFILXNWmicJ1zE gIIiyi2ddlMDR0;
    public Bundle gmNWMfvn6zlEj;
    public final boolean hjneShqpF9Tis4;
    public final String ibVTtJUNfrGYbW;
    public final boolean pyu8ovAipBTLYAiKab;
    public final int vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;
    public final int xDyLpEZyrcKVe0;

    public RaNTLh2L5X1WKOT(HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE) {
        this.w9sT1Swbhx3hs = hpS8WYFILXNWmicJ1zE.getClass().getName();
        this.vekpFI4d1Nc4fakF = hpS8WYFILXNWmicJ1zE.JXn4Qf7zpnLjP5;
        this.JXn4Qf7zpnLjP5 = hpS8WYFILXNWmicJ1zE.gmNWMfvn6zlEj;
        this.Ee8d2j4S9Vm5yGuR = hpS8WYFILXNWmicJ1zE.K7eEOBPYP9VIoHWTe;
        this.xDyLpEZyrcKVe0 = hpS8WYFILXNWmicJ1zE.dTS0S7eC32ubQH54j36;
        this.ibVTtJUNfrGYbW = hpS8WYFILXNWmicJ1zE.EWUjsTERgdPbSw3NNlN;
        this.b1EoSIRjJHO5 = hpS8WYFILXNWmicJ1zE.rCHnHJBAlOpNI5;
        this.pyu8ovAipBTLYAiKab = hpS8WYFILXNWmicJ1zE.vIJudZvPyTuNp;
        this.D5P1xCAyuvgF = hpS8WYFILXNWmicJ1zE.xDyLpEZyrcKVe0;
        this.hjneShqpF9Tis4 = hpS8WYFILXNWmicJ1zE.yTljMGnIibTRdOpSh4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w9sT1Swbhx3hs);
        parcel.writeInt(this.vekpFI4d1Nc4fakF);
        parcel.writeInt(this.JXn4Qf7zpnLjP5 ? 1 : 0);
        parcel.writeInt(this.Ee8d2j4S9Vm5yGuR);
        parcel.writeInt(this.xDyLpEZyrcKVe0);
        parcel.writeString(this.ibVTtJUNfrGYbW);
        parcel.writeInt(this.b1EoSIRjJHO5 ? 1 : 0);
        parcel.writeInt(this.pyu8ovAipBTLYAiKab ? 1 : 0);
        parcel.writeBundle(this.D5P1xCAyuvgF);
        parcel.writeInt(this.hjneShqpF9Tis4 ? 1 : 0);
        parcel.writeBundle(this.gmNWMfvn6zlEj);
    }

    public RaNTLh2L5X1WKOT(Parcel parcel) {
        this.w9sT1Swbhx3hs = parcel.readString();
        this.vekpFI4d1Nc4fakF = parcel.readInt();
        this.JXn4Qf7zpnLjP5 = parcel.readInt() != 0;
        this.Ee8d2j4S9Vm5yGuR = parcel.readInt();
        this.xDyLpEZyrcKVe0 = parcel.readInt();
        this.ibVTtJUNfrGYbW = parcel.readString();
        this.b1EoSIRjJHO5 = parcel.readInt() != 0;
        this.pyu8ovAipBTLYAiKab = parcel.readInt() != 0;
        this.D5P1xCAyuvgF = parcel.readBundle();
        this.hjneShqpF9Tis4 = parcel.readInt() != 0;
        this.gmNWMfvn6zlEj = parcel.readBundle();
    }
}
