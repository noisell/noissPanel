package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import v.s.IXBvAqS2fpdIRK;
import v.s.OFtLBiBbrrTHWu;
import v.s.RIZfHbqXpth8r2yN4;
import v.s.Y9mRyRdkl5FOcwb66V6;
import v.s.hV4VTKNUdeHN;
import v.s.nyZDwrpXoi7nqMd;
import v.s.xfn2GJwmGqs7kWW;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Status extends xfn2GJwmGqs7kWW implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new hV4VTKNUdeHN(12);
    public final PendingIntent Ee8d2j4S9Vm5yGuR;
    public final String JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public final nyZDwrpXoi7nqMd xDyLpEZyrcKVe0;

    public Status(int i, int i2, String str, PendingIntent pendingIntent, nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = str;
        this.Ee8d2j4S9Vm5yGuR = pendingIntent;
        this.xDyLpEZyrcKVe0 = nyzdwrpxoi7nqmd;
    }

    private static /* synthetic */ void xidcd() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.w9sT1Swbhx3hs == status.w9sT1Swbhx3hs && this.vekpFI4d1Nc4fakF == status.vekpFI4d1Nc4fakF && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.JXn4Qf7zpnLjP5, status.JXn4Qf7zpnLjP5) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.Ee8d2j4S9Vm5yGuR, status.Ee8d2j4S9Vm5yGuR) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.xDyLpEZyrcKVe0, status.xDyLpEZyrcKVe0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.w9sT1Swbhx3hs), Integer.valueOf(this.vekpFI4d1Nc4fakF), this.JXn4Qf7zpnLjP5, this.Ee8d2j4S9Vm5yGuR, this.xDyLpEZyrcKVe0});
    }

    public final String toString() {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = new IXBvAqS2fpdIRK(this);
        String strXDyLpEZyrcKVe0 = this.JXn4Qf7zpnLjP5;
        if (strXDyLpEZyrcKVe0 == null) {
            int i = this.vekpFI4d1Nc4fakF;
            switch (i) {
                case -1:
                    strXDyLpEZyrcKVe0 = "SUCCESS_CACHE";
                    break;
                case 0:
                    strXDyLpEZyrcKVe0 = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strXDyLpEZyrcKVe0 = Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("unknown status code: ", i);
                    break;
                case 2:
                    strXDyLpEZyrcKVe0 = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    strXDyLpEZyrcKVe0 = "SERVICE_DISABLED";
                    break;
                case 4:
                    strXDyLpEZyrcKVe0 = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    strXDyLpEZyrcKVe0 = "INVALID_ACCOUNT";
                    break;
                case 6:
                    strXDyLpEZyrcKVe0 = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    strXDyLpEZyrcKVe0 = "NETWORK_ERROR";
                    break;
                case 8:
                    strXDyLpEZyrcKVe0 = "INTERNAL_ERROR";
                    break;
                case 10:
                    strXDyLpEZyrcKVe0 = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strXDyLpEZyrcKVe0 = "ERROR";
                    break;
                case 14:
                    strXDyLpEZyrcKVe0 = "INTERRUPTED";
                    break;
                case 15:
                    strXDyLpEZyrcKVe0 = "TIMEOUT";
                    break;
                case 16:
                    strXDyLpEZyrcKVe0 = "CANCELED";
                    break;
                case 17:
                    strXDyLpEZyrcKVe0 = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strXDyLpEZyrcKVe0 = "DEAD_CLIENT";
                    break;
                case 19:
                    strXDyLpEZyrcKVe0 = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strXDyLpEZyrcKVe0 = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strXDyLpEZyrcKVe0 = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strXDyLpEZyrcKVe0 = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(strXDyLpEZyrcKVe0, "statusCode");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.Ee8d2j4S9Vm5yGuR, "resolution");
        return iXBvAqS2fpdIRK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20203 + 90);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 1, 4);
        parcel.writeInt(this.vekpFI4d1Nc4fakF);
        RIZfHbqXpth8r2yN4.nQilHWaqS401ZtR(parcel, 2, this.JXn4Qf7zpnLjP5);
        RIZfHbqXpth8r2yN4.Qrz92kRPw4GcghAc(parcel, 3, this.Ee8d2j4S9Vm5yGuR, i);
        RIZfHbqXpth8r2yN4.Qrz92kRPw4GcghAc(parcel, 4, this.xDyLpEZyrcKVe0, i);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 1000, 4);
        parcel.writeInt(this.w9sT1Swbhx3hs);
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    public Status(String str, int i) {
        this(1, i, str, null, null);
    }
}
