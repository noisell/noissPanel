package v.s;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class fpLUurEzh4fb4JIu1w4 extends CgRuV3aTXvbroqumKwMi {
    public int D5P1xCAyuvgF;
    public final Parcel Ee8d2j4S9Vm5yGuR;
    public final SparseIntArray JXn4Qf7zpnLjP5;
    public final String b1EoSIRjJHO5;
    public int hjneShqpF9Tis4;
    public final int ibVTtJUNfrGYbW;
    public int pyu8ovAipBTLYAiKab;
    public final int xDyLpEZyrcKVe0;

    public fpLUurEzh4fb4JIu1w4(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new Sn2d19yOBfyV0rw(), new Sn2d19yOBfyV0rw(), new Sn2d19yOBfyV0rw());
    }

    @Override // v.s.CgRuV3aTXvbroqumKwMi
    public final boolean Ee8d2j4S9Vm5yGuR(int i) {
        while (this.D5P1xCAyuvgF < this.ibVTtJUNfrGYbW) {
            int i2 = this.hjneShqpF9Tis4;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.D5P1xCAyuvgF;
            Parcel parcel = this.Ee8d2j4S9Vm5yGuR;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.hjneShqpF9Tis4 = parcel.readInt();
            this.D5P1xCAyuvgF += i4;
        }
        return this.hjneShqpF9Tis4 == i;
    }

    @Override // v.s.CgRuV3aTXvbroqumKwMi
    public final void b1EoSIRjJHO5(int i) {
        int i2 = this.pyu8ovAipBTLYAiKab;
        SparseIntArray sparseIntArray = this.JXn4Qf7zpnLjP5;
        Parcel parcel = this.Ee8d2j4S9Vm5yGuR;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.pyu8ovAipBTLYAiKab = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    @Override // v.s.CgRuV3aTXvbroqumKwMi
    public final fpLUurEzh4fb4JIu1w4 dDIMxZXP1V8HdM() {
        Parcel parcel = this.Ee8d2j4S9Vm5yGuR;
        int iDataPosition = parcel.dataPosition();
        int i = this.D5P1xCAyuvgF;
        if (i == this.xDyLpEZyrcKVe0) {
            i = this.ibVTtJUNfrGYbW;
        }
        return new fpLUurEzh4fb4JIu1w4(parcel, iDataPosition, i, Y9mRyRdkl5FOcwb66V6.D5P1xCAyuvgF(new StringBuilder(), this.b1EoSIRjJHO5, "  "), this.dDIMxZXP1V8HdM, this.w9sT1Swbhx3hs, this.vekpFI4d1Nc4fakF);
    }

    public fpLUurEzh4fb4JIu1w4(Parcel parcel, int i, int i2, String str, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw2, Sn2d19yOBfyV0rw sn2d19yOBfyV0rw3) {
        super(sn2d19yOBfyV0rw, sn2d19yOBfyV0rw2, sn2d19yOBfyV0rw3);
        this.JXn4Qf7zpnLjP5 = new SparseIntArray();
        this.pyu8ovAipBTLYAiKab = -1;
        this.hjneShqpF9Tis4 = -1;
        this.Ee8d2j4S9Vm5yGuR = parcel;
        this.xDyLpEZyrcKVe0 = i;
        this.ibVTtJUNfrGYbW = i2;
        this.D5P1xCAyuvgF = i;
        this.b1EoSIRjJHO5 = str;
    }
}
