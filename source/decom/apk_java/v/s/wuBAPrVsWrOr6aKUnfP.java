package v.s;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class wuBAPrVsWrOr6aKUnfP {
    public static final /* synthetic */ int dDIMxZXP1V8HdM = 0;

    static {
        wuBAPrVsWrOr6aKUnfP.class.getClassLoader();
    }

    public static Parcelable dDIMxZXP1V8HdM(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    private static /* synthetic */ void tqhpwgz() {
    }

    public static void w9sT1Swbhx3hs(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(Y9mRyRdkl5FOcwb66V6.xDyLpEZyrcKVe0("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
