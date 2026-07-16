package v.s;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class FB4dmIQs9E10R implements pARxL2hv3Xoc {
    public final RZKLDkRu6ZWDxTDL71X vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ FB4dmIQs9E10R(RZKLDkRu6ZWDxTDL71X rZKLDkRu6ZWDxTDL71X, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = rZKLDkRu6ZWDxTDL71X;
    }

    private static /* synthetic */ void bzmycb() {
    }

    @Override // v.s.RZKLDkRu6ZWDxTDL71X
    public final Object get() {
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                String packageName = ((Context) this.vekpFI4d1Nc4fakF.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new gOGZ1ZK6M3bWo9(Integer.valueOf(gOGZ1ZK6M3bWo9.Ee8d2j4S9Vm5yGuR).intValue(), (Context) this.vekpFI4d1Nc4fakF.get(), "com.google.android.datatransport.events");
        }
    }
}
