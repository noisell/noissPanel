package v.s;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class h5bWEMI2dN1jRNFWXg7 {
    public final iniVyKd0OGb2raI4 Ee8d2j4S9Vm5yGuR;
    public final D9RooUzwy6gf47M9NDX JXn4Qf7zpnLjP5;
    public final int b1EoSIRjJHO5;
    public final VdAulbq7zlVjr545h dDIMxZXP1V8HdM;
    public final int ibVTtJUNfrGYbW;
    public int pyu8ovAipBTLYAiKab;
    public final int vekpFI4d1Nc4fakF;
    public final ArrayList w9sT1Swbhx3hs;
    public final int xDyLpEZyrcKVe0;

    public h5bWEMI2dN1jRNFWXg7(VdAulbq7zlVjr545h vdAulbq7zlVjr545h, ArrayList arrayList, int i, D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX, iniVyKd0OGb2raI4 inivykd0ogb2rai4, int i2, int i3, int i4) {
        this.dDIMxZXP1V8HdM = vdAulbq7zlVjr545h;
        this.w9sT1Swbhx3hs = arrayList;
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = d9RooUzwy6gf47M9NDX;
        this.Ee8d2j4S9Vm5yGuR = inivykd0ogb2rai4;
        this.xDyLpEZyrcKVe0 = i2;
        this.ibVTtJUNfrGYbW = i3;
        this.b1EoSIRjJHO5 = i4;
    }

    private static /* synthetic */ void bdvgqqa() {
    }

    public static h5bWEMI2dN1jRNFWXg7 dDIMxZXP1V8HdM(h5bWEMI2dN1jRNFWXg7 h5bwemi2dn1jrnfwxg7, int i, D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX, iniVyKd0OGb2raI4 inivykd0ogb2rai4, int i2) {
        if ((i2 & 1) != 0) {
            i = h5bwemi2dn1jrnfwxg7.vekpFI4d1Nc4fakF;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            d9RooUzwy6gf47M9NDX = h5bwemi2dn1jrnfwxg7.JXn4Qf7zpnLjP5;
        }
        D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX2 = d9RooUzwy6gf47M9NDX;
        if ((i2 & 4) != 0) {
            inivykd0ogb2rai4 = h5bwemi2dn1jrnfwxg7.Ee8d2j4S9Vm5yGuR;
        }
        int i4 = h5bwemi2dn1jrnfwxg7.xDyLpEZyrcKVe0;
        int i5 = h5bwemi2dn1jrnfwxg7.ibVTtJUNfrGYbW;
        int i6 = h5bwemi2dn1jrnfwxg7.b1EoSIRjJHO5;
        return new h5bWEMI2dN1jRNFWXg7(h5bwemi2dn1jrnfwxg7.dDIMxZXP1V8HdM, h5bwemi2dn1jrnfwxg7.w9sT1Swbhx3hs, i3, d9RooUzwy6gf47M9NDX2, inivykd0ogb2rai4, i4, i5, i6);
    }

    public final Box5SCj0ZNnLNdOqQxT w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        ArrayList arrayList = this.w9sT1Swbhx3hs;
        int size = arrayList.size();
        int i = this.vekpFI4d1Nc4fakF;
        if (i >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.pyu8ovAipBTLYAiKab++;
        D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX = this.JXn4Qf7zpnLjP5;
        if (d9RooUzwy6gf47M9NDX != null) {
            eDfRIe8Yxow8 edfrie8yxow8 = (eDfRIe8Yxow8) d9RooUzwy6gf47M9NDX.vekpFI4d1Nc4fakF;
            xc6AKez33c65zO xc6akez33c65zo = (xc6AKez33c65zO) inivykd0ogb2rai4.vekpFI4d1Nc4fakF;
            xc6AKez33c65zO xc6akez33c65zo2 = ((VEkRsTDS6a9oHWI) edfrie8yxow8.Ee8d2j4S9Vm5yGuR).b1EoSIRjJHO5;
            if (xc6akez33c65zo.Ee8d2j4S9Vm5yGuR != xc6akez33c65zo2.Ee8d2j4S9Vm5yGuR || !okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(xc6akez33c65zo.JXn4Qf7zpnLjP5, xc6akez33c65zo2.JXn4Qf7zpnLjP5)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must retain the same host and port").toString());
            }
            if (this.pyu8ovAipBTLYAiKab != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i2 = i + 1;
        h5bWEMI2dN1jRNFWXg7 h5bwemi2dn1jrnfwxg7DDIMxZXP1V8HdM = dDIMxZXP1V8HdM(this, i2, null, inivykd0ogb2rai4, 58);
        yzLUrS855q0WL0X9r yzlurs855q0wl0x9r = (yzLUrS855q0WL0X9r) arrayList.get(i);
        Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM = yzlurs855q0wl0x9r.dDIMxZXP1V8HdM(h5bwemi2dn1jrnfwxg7DDIMxZXP1V8HdM);
        if (box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM == null) {
            throw new NullPointerException("interceptor " + yzlurs855q0wl0x9r + " returned null");
        }
        if (d9RooUzwy6gf47M9NDX != null && i2 < arrayList.size() && h5bwemi2dn1jrnfwxg7DDIMxZXP1V8HdM.pyu8ovAipBTLYAiKab != 1) {
            throw new IllegalStateException(("network interceptor " + yzlurs855q0wl0x9r + " must call proceed() exactly once").toString());
        }
        if (box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM.b1EoSIRjJHO5 != null) {
            return box5SCj0ZNnLNdOqQxTDDIMxZXP1V8HdM;
        }
        throw new IllegalStateException(("interceptor " + yzlurs855q0wl0x9r + " returned a response with no body").toString());
    }
}
