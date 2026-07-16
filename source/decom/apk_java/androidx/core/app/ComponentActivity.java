package androidx.core.app;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v.s.OFMrQsTe5s1KYV0lq;
import v.s.WhSJ01fPTInt0NpjnUKC;
import v.s.Xdb7JFhCToIIjDFJDI;
import v.s.Yz1USB4jlmvFxN4ddip;
import v.s.lK1IHVVetx4U;
import v.s.p9Dc9HHikKZdWDIj;
import v.s.tg6EjdKQH74QUty;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ComponentActivity extends Activity implements Xdb7JFhCToIIjDFJDI {
    public final p9Dc9HHikKZdWDIj dDIMxZXP1V8HdM = new p9Dc9HHikKZdWDIj(this);

    private static /* synthetic */ void wrbymyp() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zBooleanValue;
        View decorView = getWindow().getDecorView();
        if (decorView != null && OFMrQsTe5s1KYV0lq.b1EoSIRjJHO5(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z = false;
        if (window.hasFeature((-33) + 41)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 14 + 68 && actionBar != null) {
                if (!OFMrQsTe5s1KYV0lq.JXn4Qf7zpnLjP5) {
                    try {
                        OFMrQsTe5s1KYV0lq.Ee8d2j4S9Vm5yGuR = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    OFMrQsTe5s1KYV0lq.JXn4Qf7zpnLjP5 = true;
                }
                Method method = OFMrQsTe5s1KYV0lq.Ee8d2j4S9Vm5yGuR;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke == null) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else {
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i = tg6EjdKQH74QUty.dDIMxZXP1V8HdM;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = Yz1USB4jlmvFxN4ddip.JXn4Qf7zpnLjP5;
            Yz1USB4jlmvFxN4ddip yz1USB4jlmvFxN4ddip = (Yz1USB4jlmvFxN4ddip) decorView2.getTag(2131099749);
            if (yz1USB4jlmvFxN4ddip == null) {
                yz1USB4jlmvFxN4ddip = new Yz1USB4jlmvFxN4ddip();
                yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM = null;
                yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs = null;
                yz1USB4jlmvFxN4ddip.vekpFI4d1Nc4fakF = null;
                decorView2.setTag(2131099749, yz1USB4jlmvFxN4ddip);
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = Yz1USB4jlmvFxN4ddip.JXn4Qf7zpnLjP5;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM == null) {
                                yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = Yz1USB4jlmvFxN4ddip.JXn4Qf7zpnLjP5;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            View viewDDIMxZXP1V8HdM = yz1USB4jlmvFxN4ddip.dDIMxZXP1V8HdM(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewDDIMxZXP1V8HdM != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs == null) {
                        yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs = new SparseArray();
                    }
                    yz1USB4jlmvFxN4ddip.w9sT1Swbhx3hs.put(keyCode, new WeakReference(viewDDIMxZXP1V8HdM));
                }
            }
            if (viewDDIMxZXP1V8HdM != null) {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return keyEvent.dispatch(this, decorView2 != null ? decorView2.getKeyDispatcherState() : null, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !OFMrQsTe5s1KYV0lq.b1EoSIRjJHO5(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WhSJ01fPTInt0NpjnUKC.w9sT1Swbhx3hs(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = this.dDIMxZXP1V8HdM;
        p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF("markState");
        p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF("setCurrentState");
        p9dc9hhikkzdwdij.Ee8d2j4S9Vm5yGuR(lK1IHVVetx4U.JXn4Qf7zpnLjP5);
        super.onSaveInstanceState(bundle);
    }

    public p9Dc9HHikKZdWDIj w9sT1Swbhx3hs() {
        return this.dDIMxZXP1V8HdM;
    }
}
