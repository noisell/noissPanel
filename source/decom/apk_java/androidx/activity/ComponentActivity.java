package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.SavedStateHandleAttacher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import v.s.A1BaTVAMeIXMnh;
import v.s.D9RooUzwy6gf47M9NDX;
import v.s.JRdueaGIH5g8DVCPba;
import v.s.Jf9nGec8iqajtj;
import v.s.LwKU1ylBzPOu3hI45;
import v.s.NUzwZZsdsPRJ3fTR;
import v.s.Nb7UID66gn18B;
import v.s.OFMrQsTe5s1KYV0lq;
import v.s.OGI3jG3mkhPSTcSz;
import v.s.RpiSWFqg6frykGldgWGU;
import v.s.WKsCRCZJmHvmMVmS26jN;
import v.s.WhSJ01fPTInt0NpjnUKC;
import v.s.Xdb7JFhCToIIjDFJDI;
import v.s.XtLOeRoTc17KDsIUy;
import v.s.Xu6l0U3w5XcZ8Nkn;
import v.s.YqOiSVb2wSv9Lq63qb;
import v.s.YsldWmoYltIxr5OO5ErE;
import v.s.b4cYhu7FXFYkCPL;
import v.s.dNtntUMNZmBvzB;
import v.s.dVqgoa0SkAqEhJNiRgLu;
import v.s.eTeIZwLyooQrZ0ICI9i;
import v.s.fvBWJ8YGASft;
import v.s.hdTfMdJZjw4WRaUiIL8;
import v.s.hzCVl0f866ksvpzUUql;
import v.s.ixORkc0bHA5CXC4JrCM;
import v.s.jKoJvqOPSXt3Jpz6eED;
import v.s.lK1IHVVetx4U;
import v.s.okc5AGRjqrud84oM6d;
import v.s.oxDJvY4rcWCrlE;
import v.s.p9Dc9HHikKZdWDIj;
import v.s.r5XEUfod5GSCCwq6c;
import v.s.tiwWCjQGBV6U4NwhL;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements fvBWJ8YGASft {
    public static final /* synthetic */ int XiR1pIn5878vVWd = 0;
    public final AtomicInteger D5P1xCAyuvgF;
    public final RpiSWFqg6frykGldgWGU Ee8d2j4S9Vm5yGuR;
    public boolean J0zjQ7CAgohuxU20eCW6;
    public final p9Dc9HHikKZdWDIj JXn4Qf7zpnLjP5;
    public boolean MLSIo1htfMPWeB8V876L;
    public final CopyOnWriteArrayList Qrz92kRPw4GcghAc;
    public final WKsCRCZJmHvmMVmS26jN b1EoSIRjJHO5;
    public final CopyOnWriteArrayList gIIiyi2ddlMDR0;
    public final CopyOnWriteArrayList gmNWMfvn6zlEj;
    public final dVqgoa0SkAqEhJNiRgLu hjneShqpF9Tis4;
    public D9RooUzwy6gf47M9NDX ibVTtJUNfrGYbW;
    public final CopyOnWriteArrayList nQilHWaqS401ZtR;
    public final RpiSWFqg6frykGldgWGU pyu8ovAipBTLYAiKab;
    public final CopyOnWriteArrayList wotphlvK9sPbXJ;
    public Xu6l0U3w5XcZ8Nkn xDyLpEZyrcKVe0;
    public final LwKU1ylBzPOu3hI45 w9sT1Swbhx3hs = new LwKU1ylBzPOu3hI45();
    public final r5XEUfod5GSCCwq6c vekpFI4d1Nc4fakF = new r5XEUfod5GSCCwq6c(new hzCVl0f866ksvpzUUql(4, this));

    /* JADX WARN: Type inference failed for: r4v0, types: [v.s.hdTfMdJZjw4WRaUiIL8] */
    public ComponentActivity() {
        p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = new p9Dc9HHikKZdWDIj(this);
        this.JXn4Qf7zpnLjP5 = p9dc9hhikkzdwdij;
        RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = new RpiSWFqg6frykGldgWGU(this);
        this.Ee8d2j4S9Vm5yGuR = rpiSWFqg6frykGldgWGU;
        dNtntUMNZmBvzB dntntumnzmbvzb = null;
        this.ibVTtJUNfrGYbW = null;
        this.b1EoSIRjJHO5 = new WKsCRCZJmHvmMVmS26jN(this);
        this.pyu8ovAipBTLYAiKab = new RpiSWFqg6frykGldgWGU((hdTfMdJZjw4WRaUiIL8) new JRdueaGIH5g8DVCPba() { // from class: v.s.hdTfMdJZjw4WRaUiIL8
            private static /* synthetic */ void hkkob() {
            }

            @Override // v.s.JRdueaGIH5g8DVCPba
            public final Object w9sT1Swbhx3hs() {
                int i = ComponentActivity.XiR1pIn5878vVWd;
                this.w9sT1Swbhx3hs.reportFullyDrawn();
                return null;
            }
        });
        this.D5P1xCAyuvgF = new AtomicInteger();
        this.hjneShqpF9Tis4 = new dVqgoa0SkAqEhJNiRgLu(this);
        this.gmNWMfvn6zlEj = new CopyOnWriteArrayList();
        this.gIIiyi2ddlMDR0 = new CopyOnWriteArrayList();
        this.wotphlvK9sPbXJ = new CopyOnWriteArrayList();
        this.Qrz92kRPw4GcghAc = new CopyOnWriteArrayList();
        this.nQilHWaqS401ZtR = new CopyOnWriteArrayList();
        this.J0zjQ7CAgohuxU20eCW6 = false;
        this.MLSIo1htfMPWeB8V876L = false;
        p9dc9hhikkzdwdij.dDIMxZXP1V8HdM(new OGI3jG3mkhPSTcSz() { // from class: androidx.activity.ComponentActivity.2
            @Override // v.s.OGI3jG3mkhPSTcSz
            public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
                if (jf9nGec8iqajtj == Jf9nGec8iqajtj.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        p9dc9hhikkzdwdij.dDIMxZXP1V8HdM(new OGI3jG3mkhPSTcSz() { // from class: androidx.activity.ComponentActivity.3
            private static /* synthetic */ void twivx() {
            }

            @Override // v.s.OGI3jG3mkhPSTcSz
            public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
                if (jf9nGec8iqajtj == Jf9nGec8iqajtj.ON_DESTROY) {
                    ComponentActivity.this.w9sT1Swbhx3hs.w9sT1Swbhx3hs = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.dDIMxZXP1V8HdM().dDIMxZXP1V8HdM();
                    }
                    WKsCRCZJmHvmMVmS26jN wKsCRCZJmHvmMVmS26jN = ComponentActivity.this.b1EoSIRjJHO5;
                    ComponentActivity componentActivity = wKsCRCZJmHvmMVmS26jN.Ee8d2j4S9Vm5yGuR;
                    componentActivity.getWindow().getDecorView().removeCallbacks(wKsCRCZJmHvmMVmS26jN);
                    componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(wKsCRCZJmHvmMVmS26jN);
                }
            }
        });
        p9dc9hhikkzdwdij.dDIMxZXP1V8HdM(new OGI3jG3mkhPSTcSz() { // from class: androidx.activity.ComponentActivity.4
            private static /* synthetic */ void zzbn() {
            }

            @Override // v.s.OGI3jG3mkhPSTcSz
            public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.xDyLpEZyrcKVe0 == null) {
                    NUzwZZsdsPRJ3fTR nUzwZZsdsPRJ3fTR = (NUzwZZsdsPRJ3fTR) componentActivity.getLastNonConfigurationInstance();
                    if (nUzwZZsdsPRJ3fTR != null) {
                        componentActivity.xDyLpEZyrcKVe0 = nUzwZZsdsPRJ3fTR.dDIMxZXP1V8HdM;
                    }
                    if (componentActivity.xDyLpEZyrcKVe0 == null) {
                        componentActivity.xDyLpEZyrcKVe0 = new Xu6l0U3w5XcZ8Nkn();
                    }
                }
                componentActivity.JXn4Qf7zpnLjP5.xDyLpEZyrcKVe0(this);
            }
        });
        rpiSWFqg6frykGldgWGU.w9sT1Swbhx3hs();
        lK1IHVVetx4U lk1ihvvetx4u = p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF;
        if (lk1ihvvetx4u != lK1IHVVetx4U.vekpFI4d1Nc4fakF && lk1ihvvetx4u != lK1IHVVetx4U.JXn4Qf7zpnLjP5) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((Nb7UID66gn18B) rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF).dDIMxZXP1V8HdM.iterator();
        while (true) {
            YsldWmoYltIxr5OO5ErE ysldWmoYltIxr5OO5ErE = (YsldWmoYltIxr5OO5ErE) it;
            if (!ysldWmoYltIxr5OO5ErE.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ysldWmoYltIxr5OO5ErE.next();
            String str = (String) entry.getKey();
            dNtntUMNZmBvzB dntntumnzmbvzb2 = (dNtntUMNZmBvzB) entry.getValue();
            if (okc5AGRjqrud84oM6d.w9sT1Swbhx3hs(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                dntntumnzmbvzb = dntntumnzmbvzb2;
                break;
            }
        }
        if (dntntumnzmbvzb == null) {
            jKoJvqOPSXt3Jpz6eED jkojvqopsxt3jpz6eed = new jKoJvqOPSXt3Jpz6eED((Nb7UID66gn18B) rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF, this);
            ((Nb7UID66gn18B) rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs("androidx.lifecycle.internal.SavedStateHandlesProvider", jkojvqopsxt3jpz6eed);
            p9dc9hhikkzdwdij.dDIMxZXP1V8HdM(new SavedStateHandleAttacher(jkojvqopsxt3jpz6eed));
        }
        ((Nb7UID66gn18B) this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs("android:support:activity-result", new dNtntUMNZmBvzB() { // from class: v.s.lERWsoVkv2gM9j5
            private static /* synthetic */ void qjmn() {
            }

            @Override // v.s.dNtntUMNZmBvzB
            public final Bundle dDIMxZXP1V8HdM() {
                int i = ComponentActivity.XiR1pIn5878vVWd;
                Bundle bundle = new Bundle();
                dVqgoa0SkAqEhJNiRgLu dvqgoa0skaqehjnirglu = this.dDIMxZXP1V8HdM.hjneShqpF9Tis4;
                dvqgoa0skaqehjnirglu.getClass();
                HashMap map = dvqgoa0skaqehjnirglu.w9sT1Swbhx3hs;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(dvqgoa0skaqehjnirglu.JXn4Qf7zpnLjP5));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) dvqgoa0skaqehjnirglu.ibVTtJUNfrGYbW.clone());
                return bundle;
            }
        });
        ixORkc0bHA5CXC4JrCM ixorkc0bha5cxc4jrcm = new ixORkc0bHA5CXC4JrCM(this);
        LwKU1ylBzPOu3hI45 lwKU1ylBzPOu3hI45 = this.w9sT1Swbhx3hs;
        if (lwKU1ylBzPOu3hI45.w9sT1Swbhx3hs != null) {
            ixorkc0bha5cxc4jrcm.dDIMxZXP1V8HdM();
        }
        lwKU1ylBzPOu3hI45.dDIMxZXP1V8HdM.add(ixorkc0bha5cxc4jrcm);
    }

    public final eTeIZwLyooQrZ0ICI9i Ee8d2j4S9Vm5yGuR(A1BaTVAMeIXMnh a1BaTVAMeIXMnh, okc5AGRjqrud84oM6d okc5agrjqrud84om6d) {
        return this.hjneShqpF9Tis4.vekpFI4d1Nc4fakF("activity_rq#" + this.D5P1xCAyuvgF.getAndIncrement(), this, okc5agrjqrud84om6d, a1BaTVAMeIXMnh);
    }

    public final void JXn4Qf7zpnLjP5() {
        getWindow().getDecorView().setTag(2131099757, this);
        getWindow().getDecorView().setTag(2131099760, this);
        getWindow().getDecorView().setTag(2131099759, this);
        getWindow().getDecorView().setTag(2131099758, this);
        getWindow().getDecorView().setTag(2131099732, this);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        JXn4Qf7zpnLjP5();
        this.b1EoSIRjJHO5.dDIMxZXP1V8HdM(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // v.s.fvBWJ8YGASft
    public final Xu6l0U3w5XcZ8Nkn dDIMxZXP1V8HdM() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.xDyLpEZyrcKVe0 == null) {
            NUzwZZsdsPRJ3fTR nUzwZZsdsPRJ3fTR = (NUzwZZsdsPRJ3fTR) getLastNonConfigurationInstance();
            if (nUzwZZsdsPRJ3fTR != null) {
                this.xDyLpEZyrcKVe0 = nUzwZZsdsPRJ3fTR.dDIMxZXP1V8HdM;
            }
            if (this.xDyLpEZyrcKVe0 == null) {
                this.xDyLpEZyrcKVe0 = new Xu6l0U3w5XcZ8Nkn();
            }
        }
        return this.xDyLpEZyrcKVe0;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.hjneShqpF9Tis4.dDIMxZXP1V8HdM(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.ibVTtJUNfrGYbW == null) {
            this.ibVTtJUNfrGYbW = new D9RooUzwy6gf47M9NDX(new YqOiSVb2wSv9Lq63qb(0, this));
            this.JXn4Qf7zpnLjP5.dDIMxZXP1V8HdM(new OGI3jG3mkhPSTcSz() { // from class: androidx.activity.ComponentActivity.6
                @Override // v.s.OGI3jG3mkhPSTcSz
                public final void dDIMxZXP1V8HdM(Xdb7JFhCToIIjDFJDI xdb7JFhCToIIjDFJDI, Jf9nGec8iqajtj jf9nGec8iqajtj) {
                    if (jf9nGec8iqajtj != Jf9nGec8iqajtj.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                        return;
                    }
                    D9RooUzwy6gf47M9NDX d9RooUzwy6gf47M9NDX = ComponentActivity.this.ibVTtJUNfrGYbW;
                    d9RooUzwy6gf47M9NDX.Ee8d2j4S9Vm5yGuR = b4cYhu7FXFYkCPL.dDIMxZXP1V8HdM((ComponentActivity) xdb7JFhCToIIjDFJDI);
                    OnBackInvokedDispatcher onBackInvokedDispatcher = (OnBackInvokedDispatcher) d9RooUzwy6gf47M9NDX.Ee8d2j4S9Vm5yGuR;
                    OnBackInvokedCallback onBackInvokedCallback = (OnBackInvokedCallback) d9RooUzwy6gf47M9NDX.JXn4Qf7zpnLjP5;
                    if (onBackInvokedDispatcher == null || onBackInvokedCallback == null || !d9RooUzwy6gf47M9NDX.dDIMxZXP1V8HdM) {
                        return;
                    }
                    tiwWCjQGBV6U4NwhL.dDIMxZXP1V8HdM.vekpFI4d1Nc4fakF(onBackInvokedDispatcher, onBackInvokedCallback);
                    d9RooUzwy6gf47M9NDX.dDIMxZXP1V8HdM = false;
                }
            });
        }
        this.ibVTtJUNfrGYbW.w9sT1Swbhx3hs();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.gmNWMfvn6zlEj.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = this.Ee8d2j4S9Vm5yGuR;
        if (!rpiSWFqg6frykGldgWGU.dDIMxZXP1V8HdM) {
            rpiSWFqg6frykGldgWGU.w9sT1Swbhx3hs();
        }
        p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = ((ComponentActivity) rpiSWFqg6frykGldgWGU.w9sT1Swbhx3hs).JXn4Qf7zpnLjP5;
        if (p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF.compareTo(lK1IHVVetx4U.Ee8d2j4S9Vm5yGuR) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF).toString());
        }
        Nb7UID66gn18B nb7UID66gn18B = (Nb7UID66gn18B) rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF;
        if (!nb7UID66gn18B.w9sT1Swbhx3hs) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (nb7UID66gn18B.JXn4Qf7zpnLjP5) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        nb7UID66gn18B.vekpFI4d1Nc4fakF = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        nb7UID66gn18B.JXn4Qf7zpnLjP5 = true;
        LwKU1ylBzPOu3hI45 lwKU1ylBzPOu3hI45 = this.w9sT1Swbhx3hs;
        lwKU1ylBzPOu3hI45.w9sT1Swbhx3hs = this;
        Iterator it = lwKU1ylBzPOu3hI45.dDIMxZXP1V8HdM.iterator();
        while (it.hasNext()) {
            ((ixORkc0bHA5CXC4JrCM) it.next()).dDIMxZXP1V8HdM();
        }
        super.onCreate(bundle);
        WhSJ01fPTInt0NpjnUKC.w9sT1Swbhx3hs(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.J0zjQ7CAgohuxU20eCW6) {
            return;
        }
        Iterator it = this.Qrz92kRPw4GcghAc.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.wotphlvK9sPbXJ.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.MLSIo1htfMPWeB8V876L) {
            return;
        }
        Iterator it = this.nQilHWaqS401ZtR.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.vekpFI4d1Nc4fakF.vekpFI4d1Nc4fakF).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.hjneShqpF9Tis4.dDIMxZXP1V8HdM(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        NUzwZZsdsPRJ3fTR nUzwZZsdsPRJ3fTR;
        Xu6l0U3w5XcZ8Nkn xu6l0U3w5XcZ8Nkn = this.xDyLpEZyrcKVe0;
        if (xu6l0U3w5XcZ8Nkn == null && (nUzwZZsdsPRJ3fTR = (NUzwZZsdsPRJ3fTR) getLastNonConfigurationInstance()) != null) {
            xu6l0U3w5XcZ8Nkn = nUzwZZsdsPRJ3fTR.dDIMxZXP1V8HdM;
        }
        if (xu6l0U3w5XcZ8Nkn == null) {
            return null;
        }
        NUzwZZsdsPRJ3fTR nUzwZZsdsPRJ3fTR2 = new NUzwZZsdsPRJ3fTR();
        nUzwZZsdsPRJ3fTR2.dDIMxZXP1V8HdM = xu6l0U3w5XcZ8Nkn;
        return nUzwZZsdsPRJ3fTR2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        p9Dc9HHikKZdWDIj p9dc9hhikkzdwdij = this.JXn4Qf7zpnLjP5;
        if (p9dc9hhikkzdwdij != null) {
            p9dc9hhikkzdwdij.vekpFI4d1Nc4fakF("setCurrentState");
            p9dc9hhikkzdwdij.Ee8d2j4S9Vm5yGuR(lK1IHVVetx4U.JXn4Qf7zpnLjP5);
        }
        super.onSaveInstanceState(bundle);
        Nb7UID66gn18B nb7UID66gn18B = (Nb7UID66gn18B) this.Ee8d2j4S9Vm5yGuR.vekpFI4d1Nc4fakF;
        nb7UID66gn18B.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = nb7UID66gn18B.vekpFI4d1Nc4fakF;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        oxDJvY4rcWCrlE oxdjvy4rcwcrle = nb7UID66gn18B.dDIMxZXP1V8HdM;
        oxdjvy4rcwcrle.getClass();
        XtLOeRoTc17KDsIUy xtLOeRoTc17KDsIUy = new XtLOeRoTc17KDsIUy(oxdjvy4rcwcrle);
        oxdjvy4rcwcrle.JXn4Qf7zpnLjP5.put(xtLOeRoTc17KDsIUy, Boolean.FALSE);
        while (xtLOeRoTc17KDsIUy.hasNext()) {
            Map.Entry entry = (Map.Entry) xtLOeRoTc17KDsIUy.next();
            bundle2.putBundle((String) entry.getKey(), ((dNtntUMNZmBvzB) entry.getValue()).dDIMxZXP1V8HdM());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.gIIiyi2ddlMDR0.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (OFMrQsTe5s1KYV0lq.hjneShqpF9Tis4()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            RpiSWFqg6frykGldgWGU rpiSWFqg6frykGldgWGU = this.pyu8ovAipBTLYAiKab;
            synchronized (rpiSWFqg6frykGldgWGU.w9sT1Swbhx3hs) {
                try {
                    rpiSWFqg6frykGldgWGU.dDIMxZXP1V8HdM = true;
                    ArrayList arrayList = (ArrayList) rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((JRdueaGIH5g8DVCPba) obj).w9sT1Swbhx3hs();
                    }
                    ((ArrayList) rpiSWFqg6frykGldgWGU.vekpFI4d1Nc4fakF).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        JXn4Qf7zpnLjP5();
        this.b1EoSIRjJHO5.dDIMxZXP1V8HdM(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // androidx.core.app.ComponentActivity, v.s.Xdb7JFhCToIIjDFJDI
    public final p9Dc9HHikKZdWDIj w9sT1Swbhx3hs() {
        return this.JXn4Qf7zpnLjP5;
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        JXn4Qf7zpnLjP5();
        this.b1EoSIRjJHO5.dDIMxZXP1V8HdM(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.J0zjQ7CAgohuxU20eCW6 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.J0zjQ7CAgohuxU20eCW6 = false;
            Iterator it = this.Qrz92kRPw4GcghAc.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        } catch (Throwable th) {
            this.J0zjQ7CAgohuxU20eCW6 = false;
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.MLSIo1htfMPWeB8V876L = (-81) + 82;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.MLSIo1htfMPWeB8V876L = false;
            Iterator it = this.nQilHWaqS401ZtR.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        } catch (Throwable th) {
            this.MLSIo1htfMPWeB8V876L = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        JXn4Qf7zpnLjP5();
        this.b1EoSIRjJHO5.dDIMxZXP1V8HdM(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
