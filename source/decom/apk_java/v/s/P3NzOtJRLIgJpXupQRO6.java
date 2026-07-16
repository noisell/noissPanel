package v.s;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class P3NzOtJRLIgJpXupQRO6 extends OFtLBiBbrrTHWu {
    public final FragmentActivity Ee8d2j4S9Vm5yGuR;
    public final y376IWm9dQvh0JucoHX b1EoSIRjJHO5;
    public final o2YnR8TExesBGT2N ibVTtJUNfrGYbW;
    public final /* synthetic */ FragmentActivity pyu8ovAipBTLYAiKab;
    public final FragmentActivity xDyLpEZyrcKVe0;

    public P3NzOtJRLIgJpXupQRO6(FragmentActivity fragmentActivity) {
        this.pyu8ovAipBTLYAiKab = fragmentActivity;
        o2YnR8TExesBGT2N o2ynr8texesbgt2n = fragmentActivity.w9sT1Swbhx3hs;
        this.b1EoSIRjJHO5 = new y376IWm9dQvh0JucoHX();
        this.Ee8d2j4S9Vm5yGuR = fragmentActivity;
        this.xDyLpEZyrcKVe0 = fragmentActivity;
        if (o2ynr8texesbgt2n == null) {
            throw new NullPointerException("handler == null");
        }
        this.ibVTtJUNfrGYbW = o2ynr8texesbgt2n;
    }

    @Override // v.s.OFtLBiBbrrTHWu
    public final boolean H9XlUr4OeMJFiXK() {
        Window window = this.pyu8ovAipBTLYAiKab.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // v.s.OFtLBiBbrrTHWu
    public final View XiR1pIn5878vVWd(int i) {
        return this.pyu8ovAipBTLYAiKab.findViewById(i);
    }
}
