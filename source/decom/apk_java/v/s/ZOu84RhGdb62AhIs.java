package v.s;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class ZOu84RhGdb62AhIs extends xfn2GJwmGqs7kWW {
    public static final Parcelable.Creator<ZOu84RhGdb62AhIs> CREATOR = new hV4VTKNUdeHN(14);
    public final long JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final String w9sT1Swbhx3hs;

    public ZOu84RhGdb62AhIs() {
        this.w9sT1Swbhx3hs = "CLIENT_TELEMETRY";
        this.JXn4Qf7zpnLjP5 = 1L;
        this.vekpFI4d1Nc4fakF = -1;
    }

    public final long dDIMxZXP1V8HdM() {
        long j = this.JXn4Qf7zpnLjP5;
        return j == -1 ? this.vekpFI4d1Nc4fakF : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ZOu84RhGdb62AhIs) {
            ZOu84RhGdb62AhIs zOu84RhGdb62AhIs = (ZOu84RhGdb62AhIs) obj;
            String str = zOu84RhGdb62AhIs.w9sT1Swbhx3hs;
            String str2 = this.w9sT1Swbhx3hs;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && dDIMxZXP1V8HdM() == zOu84RhGdb62AhIs.dDIMxZXP1V8HdM()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w9sT1Swbhx3hs, Long.valueOf(dDIMxZXP1V8HdM())});
    }

    public final String toString() {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = new IXBvAqS2fpdIRK(this);
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.w9sT1Swbhx3hs, "name");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(Long.valueOf(dDIMxZXP1V8HdM()), "version");
        return iXBvAqS2fpdIRK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20293);
        RIZfHbqXpth8r2yN4.nQilHWaqS401ZtR(parcel, 1, this.w9sT1Swbhx3hs);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 2, 4);
        parcel.writeInt(this.vekpFI4d1Nc4fakF);
        long jDDIMxZXP1V8HdM = dDIMxZXP1V8HdM();
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 3, 8);
        parcel.writeLong(jDDIMxZXP1V8HdM);
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    public ZOu84RhGdb62AhIs(int i, long j, String str) {
        this.w9sT1Swbhx3hs = str;
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = j;
    }
}
