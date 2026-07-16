package v.s;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class zanAuj2ot0jORaEjW implements Parcelable {
    public static final Parcelable.Creator<zanAuj2ot0jORaEjW> CREATOR = new hV4VTKNUdeHN(1);
    public final CharSequence D5P1xCAyuvgF;
    public final String Ee8d2j4S9Vm5yGuR;
    public final int JXn4Qf7zpnLjP5;
    public final CharSequence b1EoSIRjJHO5;
    public final boolean gIIiyi2ddlMDR0;
    public final ArrayList gmNWMfvn6zlEj;
    public final ArrayList hjneShqpF9Tis4;
    public final int ibVTtJUNfrGYbW;
    public final int pyu8ovAipBTLYAiKab;
    public final int vekpFI4d1Nc4fakF;
    public final int[] w9sT1Swbhx3hs;
    public final int xDyLpEZyrcKVe0;

    public zanAuj2ot0jORaEjW(s6GzzATP8xbv7YKDDrkn s6gzzatp8xbv7ykddrkn) {
        int size = s6gzzatp8xbv7ykddrkn.w9sT1Swbhx3hs.size();
        this.w9sT1Swbhx3hs = new int[size * 6];
        if (!s6gzzatp8xbv7ykddrkn.pyu8ovAipBTLYAiKab) {
            throw new IllegalStateException("Not on back stack");
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bDLizfK87pPvhTehh1Z bdlizfk87ppvhtehh1z = (bDLizfK87pPvhTehh1Z) s6gzzatp8xbv7ykddrkn.w9sT1Swbhx3hs.get(i2);
            int[] iArr = this.w9sT1Swbhx3hs;
            int i3 = i + 1;
            iArr[i] = bdlizfk87ppvhtehh1z.dDIMxZXP1V8HdM;
            int i4 = i + 2;
            HpS8WYFILXNWmicJ1zE hpS8WYFILXNWmicJ1zE = bdlizfk87ppvhtehh1z.w9sT1Swbhx3hs;
            iArr[i3] = hpS8WYFILXNWmicJ1zE != null ? hpS8WYFILXNWmicJ1zE.JXn4Qf7zpnLjP5 : -1;
            iArr[i4] = bdlizfk87ppvhtehh1z.vekpFI4d1Nc4fakF;
            iArr[i + 3] = bdlizfk87ppvhtehh1z.JXn4Qf7zpnLjP5;
            int i5 = i + 5;
            iArr[i + 4] = bdlizfk87ppvhtehh1z.Ee8d2j4S9Vm5yGuR;
            i += 6;
            iArr[i5] = bdlizfk87ppvhtehh1z.xDyLpEZyrcKVe0;
        }
        this.vekpFI4d1Nc4fakF = s6gzzatp8xbv7ykddrkn.ibVTtJUNfrGYbW;
        this.JXn4Qf7zpnLjP5 = s6gzzatp8xbv7ykddrkn.b1EoSIRjJHO5;
        this.Ee8d2j4S9Vm5yGuR = s6gzzatp8xbv7ykddrkn.D5P1xCAyuvgF;
        this.xDyLpEZyrcKVe0 = s6gzzatp8xbv7ykddrkn.gmNWMfvn6zlEj;
        this.ibVTtJUNfrGYbW = s6gzzatp8xbv7ykddrkn.gIIiyi2ddlMDR0;
        this.b1EoSIRjJHO5 = s6gzzatp8xbv7ykddrkn.wotphlvK9sPbXJ;
        this.pyu8ovAipBTLYAiKab = s6gzzatp8xbv7ykddrkn.Qrz92kRPw4GcghAc;
        this.D5P1xCAyuvgF = s6gzzatp8xbv7ykddrkn.nQilHWaqS401ZtR;
        this.hjneShqpF9Tis4 = s6gzzatp8xbv7ykddrkn.J0zjQ7CAgohuxU20eCW6;
        this.gmNWMfvn6zlEj = s6gzzatp8xbv7ykddrkn.MLSIo1htfMPWeB8V876L;
        this.gIIiyi2ddlMDR0 = s6gzzatp8xbv7ykddrkn.XiR1pIn5878vVWd;
    }

    private static /* synthetic */ void rakf() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.w9sT1Swbhx3hs);
        parcel.writeInt(this.vekpFI4d1Nc4fakF);
        parcel.writeInt(this.JXn4Qf7zpnLjP5);
        parcel.writeString(this.Ee8d2j4S9Vm5yGuR);
        parcel.writeInt(this.xDyLpEZyrcKVe0);
        parcel.writeInt(this.ibVTtJUNfrGYbW);
        TextUtils.writeToParcel(this.b1EoSIRjJHO5, parcel, 0);
        parcel.writeInt(this.pyu8ovAipBTLYAiKab);
        TextUtils.writeToParcel(this.D5P1xCAyuvgF, parcel, 0);
        parcel.writeStringList(this.hjneShqpF9Tis4);
        parcel.writeStringList(this.gmNWMfvn6zlEj);
        parcel.writeInt(this.gIIiyi2ddlMDR0 ? 1 : 0);
    }

    public zanAuj2ot0jORaEjW(Parcel parcel) {
        this.w9sT1Swbhx3hs = parcel.createIntArray();
        this.vekpFI4d1Nc4fakF = parcel.readInt();
        this.JXn4Qf7zpnLjP5 = parcel.readInt();
        this.Ee8d2j4S9Vm5yGuR = parcel.readString();
        this.xDyLpEZyrcKVe0 = parcel.readInt();
        this.ibVTtJUNfrGYbW = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.b1EoSIRjJHO5 = (CharSequence) creator.createFromParcel(parcel);
        this.pyu8ovAipBTLYAiKab = parcel.readInt();
        this.D5P1xCAyuvgF = (CharSequence) creator.createFromParcel(parcel);
        this.hjneShqpF9Tis4 = parcel.createStringArrayList();
        this.gmNWMfvn6zlEj = parcel.createStringArrayList();
        this.gIIiyi2ddlMDR0 = parcel.readInt() != 0;
    }
}
