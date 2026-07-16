package v.s;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class nyZDwrpXoi7nqMd extends xfn2GJwmGqs7kWW {
    public final String Ee8d2j4S9Vm5yGuR;
    public final PendingIntent JXn4Qf7zpnLjP5;
    public final int vekpFI4d1Nc4fakF;
    public final int w9sT1Swbhx3hs;
    public static final nyZDwrpXoi7nqMd xDyLpEZyrcKVe0 = new nyZDwrpXoi7nqMd(0);
    public static final Parcelable.Creator<nyZDwrpXoi7nqMd> CREATOR = new hV4VTKNUdeHN(11);

    public nyZDwrpXoi7nqMd(int i, int i2, PendingIntent pendingIntent, String str) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = i2;
        this.JXn4Qf7zpnLjP5 = pendingIntent;
        this.Ee8d2j4S9Vm5yGuR = str;
    }

    public static String dDIMxZXP1V8HdM(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return Y9mRyRdkl5FOcwb66V6.b1EoSIRjJHO5("UNKNOWN_ERROR_CODE(", ")", i);
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nyZDwrpXoi7nqMd)) {
            return false;
        }
        nyZDwrpXoi7nqMd nyzdwrpxoi7nqmd = (nyZDwrpXoi7nqMd) obj;
        return this.vekpFI4d1Nc4fakF == nyzdwrpxoi7nqmd.vekpFI4d1Nc4fakF && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.JXn4Qf7zpnLjP5, nyzdwrpxoi7nqmd.JXn4Qf7zpnLjP5) && OFtLBiBbrrTHWu.gIIiyi2ddlMDR0(this.Ee8d2j4S9Vm5yGuR, nyzdwrpxoi7nqmd.Ee8d2j4S9Vm5yGuR);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.vekpFI4d1Nc4fakF), this.JXn4Qf7zpnLjP5, this.Ee8d2j4S9Vm5yGuR});
    }

    public final String toString() {
        IXBvAqS2fpdIRK iXBvAqS2fpdIRK = new IXBvAqS2fpdIRK(this);
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(dDIMxZXP1V8HdM(this.vekpFI4d1Nc4fakF), "statusCode");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.JXn4Qf7zpnLjP5, "resolution");
        iXBvAqS2fpdIRK.dDIMxZXP1V8HdM(this.Ee8d2j4S9Vm5yGuR, "message");
        return iXBvAqS2fpdIRK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iMLSIo1htfMPWeB8V876L = RIZfHbqXpth8r2yN4.MLSIo1htfMPWeB8V876L(parcel, 20293);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 1, 4);
        parcel.writeInt(this.w9sT1Swbhx3hs);
        RIZfHbqXpth8r2yN4.H9XlUr4OeMJFiXK(parcel, 2, 4);
        parcel.writeInt(this.vekpFI4d1Nc4fakF);
        RIZfHbqXpth8r2yN4.Qrz92kRPw4GcghAc(parcel, 3, this.JXn4Qf7zpnLjP5, i);
        RIZfHbqXpth8r2yN4.nQilHWaqS401ZtR(parcel, 4, this.Ee8d2j4S9Vm5yGuR);
        RIZfHbqXpth8r2yN4.XiR1pIn5878vVWd(parcel, iMLSIo1htfMPWeB8V876L);
    }

    public nyZDwrpXoi7nqMd(int i) {
        this(1, i, null, null);
    }

    public nyZDwrpXoi7nqMd(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}
